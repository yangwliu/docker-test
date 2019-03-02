package com.example.apigeedemo;

import java.lang.reflect.InvocationTargetException;

public interface MyService {

    public int getResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;

    public int add();
}
