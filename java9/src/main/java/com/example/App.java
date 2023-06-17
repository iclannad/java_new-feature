package com.example;

import lombok.extern.java.Log;

import java.util.logging.Logger;

/**
 * Hello world!
 */
// 如果注释掉lombok模块，该模块的注解在编译期间会报错
@Log
public class App {
    public static void main(String[] args) {
        log.info("hello java9");
    }
}
