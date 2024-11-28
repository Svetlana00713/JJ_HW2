package org.example;

import java.lang.reflect.Method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> stringClass = Class.forName("java.lang.String");

        Method[] methods = stringClass.getDeclaredMethods();

        for(Method method : methods) {
            System.out.println(method.getName());
        }
    }
}