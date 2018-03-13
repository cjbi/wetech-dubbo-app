package tech.wetech.dubbo.api.demo.service;

import tech.wetech.dubbo.api.demo.model.UserDto;

import java.util.List;

/**
 * 测试数据库增删改查
 * @author cjbi
 */
public interface UserService {

    /**
     * 查询用户列表
     * @return
     */
    List<UserDto> findAll();

    /**
     * 查询用户
     * @param userId
     * @return
     */
    UserDto findOne(Integer userId);

    /**
     * 创建用户
     * @param userDto
     * @return
     */
    public int createUser(UserDto userDto);

    /**
     * 更新用户
     * @param userDto
     * @return
     */
    public int updateUser(UserDto userDto);

    /**
     * 删除用户
     * @param userId
     */
    void deleteUser(Integer userId);

}
