package com.example;

import lombok.extern.java.Log;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 */
// 如果注释掉lombok模块，该模块的注解在编译期间会报错
@Log
public class App {
    public static void main(String[] args) {
        // 测试模块功能
        log.info("hello java9");

        // 测试接口的私有方法
        Test test = () -> System.out.println("hello world");
        test.log();

        test.test();


        // 集合类,返回一个只读集合
        Map<String, Integer> map = Map.of("key1", 1, "key2", 2);
        log.info("map==" + map);

        Set<String> set = Set.of("11", "22", "33");
        log.info("set==" + set);

        List<String> list = List.of("11", "22", "33");
        log.info("list==" + list);
    }
}
