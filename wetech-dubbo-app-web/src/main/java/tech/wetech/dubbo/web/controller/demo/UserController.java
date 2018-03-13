package tech.wetech.dubbo.web.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tech.wetech.dubbo.api.demo.model.UserDto;
import tech.wetech.dubbo.api.demo.service.UserService;

import java.util.List;

/**
 * 测试数据库增删改查
 *
 * @author cjbi
 */
@Controller
@RequestMapping("demo/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<UserDto> useList = userService.findAll();
        model.addAttribute("userList", useList);
        return "demo/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createPage() {
        return "demo/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(UserDto userDto) {
        userService.createUser(userDto);
        return "redirect:/demo/user/list";
    }

    @RequestMapping(value = "/update/{userId}", method = RequestMethod.GET)
    public String updatePage(@PathVariable Integer userId, Model model) {
        UserDto userDto = userService.findOne(userId);
        model.addAttribute("user", userDto);
        return "/demo/update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(UserDto userDto) {
        userService.updateUser(userDto);
        return "redirect:/demo/user/list";
    }

    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer userId) {
        userService.deleteUser(userId);
        return "redirect:/demo/user/list";
    }

}
