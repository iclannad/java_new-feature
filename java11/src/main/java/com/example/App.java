package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Consumer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        // java10不支持lambda的var类型
        Consumer<String> test10 = (String s) -> System.out.println(s);
        test10.accept("AAAA");

        // java11后开始支持用于lambda形参局部变量语法
        Consumer<String> test11 = (var s) -> System.out.println(s);
        test11.accept("AAAA");

        // 针对String类的增强
        String str = "ABCD";
        System.out.println(str.isBlank());  // 判空，包含空格
        System.out.println(str.repeat(2)); // 复制字符串并拼接
        System.out.println(str.strip());    // 字符创收尾去除空格

        String str2 = "A\nB\nC\nD";
        str2.lines().forEach(System.out::println);

        // 全新http api
        var httpClient = HttpClient.newHttpClient();
        var httpRequest = HttpRequest.newBuilder(new URI("https://www.baidu.com")).GET().build();
        HttpResponse<String> send = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(send.body());

    }
}
