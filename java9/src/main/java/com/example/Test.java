package com.example;

public interface Test {

    // 一般抽象方法
    void log();

    // java8提供
    default void test() {
        System.out.println("我是test方法的默认实现");
        this.inner();
    }

    // java9中，接口再次得到强化，现在接口中可以存在私有方法了。
    private void inner() {// 声明一个私有方法
        System.out.println("我是接口中的私有方法");
    }
}
