package org.example.util;

import java.lang.reflect.Method;

public class ReflectionUtil {
    public static void inspectObject(Object obj) {
        Class<?> clazz = obj.getClass();
        System.out.println("Class Name: " + clazz.getName());

        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
        }
    }
}
