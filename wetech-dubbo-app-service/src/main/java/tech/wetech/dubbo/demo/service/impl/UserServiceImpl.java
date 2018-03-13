package tech.wetech.dubbo.demo.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.wetech.dubbo.api.demo.model.UserDto;
import tech.wetech.dubbo.demo.model.User;
import tech.wetech.dubbo.api.demo.service.UserService;
import tech.wetech.dubbo.demo.mapper.UserMapper;
import tech.wetech.dubbo.demo.model.UserExample;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试数据库增删改查
 * @author cjbi
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> findAll() {
        List<UserDto> list = new ArrayList<>();
        userMapper.selectByExample(new UserExample()).forEach(userRecord -> {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(userRecord, userDto);
            list.add(userDto);
        });
        return list;
    }

    @Override
    public UserDto findOne(Integer userId) {
        User userRecord = userMapper.selectByPrimaryKey(userId);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userRecord, userDto);
        return userDto;
    }

    @Override
    public int createUser(UserDto userDto) {
        User userRecord = new User();
        BeanUtils.copyProperties(userDto,userRecord);
        return userMapper.insertSelective(userRecord);
    }

    @Override
    public int updateUser(UserDto userDto) {
        User userRecord = new User();
        BeanUtils.copyProperties(userDto,userRecord);
        return userMapper.updateByPrimaryKeySelective(userRecord);
    }

    @Override
    public void deleteUser(Integer userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

}
