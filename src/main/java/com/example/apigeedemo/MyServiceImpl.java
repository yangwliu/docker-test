package com.example.apigeedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Service("myService")
public class MyServiceImpl implements MyService{

    @Autowired
    public MyRepository myRepository;
    @Autowired
    public SpringContextHolder springContextHolder;

    public int getResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println("here is service");
        int result = (int) MyReflect.reflect(springContextHolder.getBean("myService"), MyServiceImpl.class, "add");
        return result;
    }

    public int add() {
        System.out.println("here is service add");
        return myRepository.add();
    }
}
