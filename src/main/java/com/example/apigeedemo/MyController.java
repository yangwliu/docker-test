package com.example.apigeedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;

@RestController
public class MyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

    @Autowired
    private PropertyConfig propertyConfig;
    @Autowired
    private MyServiceImpl myService;

    @RequestMapping(value = "/v1/hello")
    public String helloWorld(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        LOGGER.info("abcd!");
        return "Hello world";
    }

    @RequestMapping(value = "/v1")
    public String hello(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        return "Hello!";
    }

    @RequestMapping(value = "/hello")
    public String getHello() {

        LOGGER.info(propertyConfig.getHost());
        return propertyConfig.getHost();
    }

    @RequestMapping(value = "/reflect")
    public int reflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return myService.getResult();
    }
}
