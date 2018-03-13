package tech.wetech.dubbo.web.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tech.wetech.dubbo.api.demo.service.DemoService;

/**
 * 测试rpc连接controller
 * @author cjbi
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        String hello = demoService.hello("dubbo");
        model.addAttribute("hello", hello);
        return "demo/hello";
    }

}
