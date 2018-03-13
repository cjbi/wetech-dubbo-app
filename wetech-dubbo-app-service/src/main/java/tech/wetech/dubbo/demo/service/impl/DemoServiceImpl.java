package tech.wetech.dubbo.demo.service.impl;

import org.springframework.stereotype.Service;
import tech.wetech.dubbo.api.demo.service.DemoService;
/**
 * @author cjbi
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
        return "hello," + name + "!";
    }
}
