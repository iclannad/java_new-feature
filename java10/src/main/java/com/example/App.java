package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        String s = "hello java10";
        // 自动推断类型，仅在编译期间，仅适合局部变量
        var s = "hello java10";
        System.out.println(s);

        for (var i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
