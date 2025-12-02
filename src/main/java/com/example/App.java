package com.example;

/**
 * Hello World Java应用程序
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("欢迎使用Java项目！");
        
        // 创建一个简单的对象来演示面向对象编程
        Greeter greeter = new Greeter("Java开发者");
        greeter.sayHello();
    }
}

/**
 * 问候者类
 */
class Greeter {
    private String name;
    
    public Greeter(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("你好, " + name + "!");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}