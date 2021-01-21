package com.atguigu.java1;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        ClassLoader classLoader = null;
        try {
            classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);
    
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);
    
            ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
            System.out.println(classLoader2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
