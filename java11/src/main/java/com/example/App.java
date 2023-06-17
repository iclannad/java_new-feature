package com.example;

import java.util.function.Consumer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // java10不支持lambda的var类型
        Consumer<String> test10 = (String s)-> System.out.println(s);
        test10.accept("AAAA");

        // java11后开始支持用于lambda形参局部变量语法
        Consumer<String> test11 = (var s)-> System.out.println(s);
        test11.accept("AAAA");

    }
}
