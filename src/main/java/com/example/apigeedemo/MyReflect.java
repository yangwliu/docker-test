package com.example.apigeedemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyReflect {

    public static <T> int reflect(T instance, Class<T> clazz, String methodStr) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method = clazz.getDeclaredMethod(methodStr);
        return (int) method.invoke(instance);
    }
}
