package com.example;

import lombok.extern.java.Log;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

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

        // 流优化
        Stream.of("A", "B", "B", "C")
                .filter(s -> s.equals("B")) // 过滤
                .distinct()     // 去从
                .forEach(System.out::println); // 打印

        Stream.ofNullable(null).forEach(System.out::println);
        // java8
//        Stream.iterate(0, i -> i + 1).limit(20).forEach(System.out::println);

        // java9
//        Stream.iterate(0, i -> i < 20, i -> i + 1).forEach(System.out::println);

        // takeWhile/dropWhile
        Stream.iterate(0, i -> i + 1).limit(20).dropWhile(i -> i < 10)
                .forEach(System.out::println);


        // Optional优化
        Optional.ofNullable(null).ifPresentOrElse(System.out::println, () -> log.info("被包装元素为空"));

        // 如果被包装的类不为null，返回自己，如果为null，那就返回supplier
        Optional.of(null).or(() -> Optional.of("AAA")).ifPresent(System.out::println);

    }
}
