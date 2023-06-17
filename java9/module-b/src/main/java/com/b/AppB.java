package com.b;

import com.a.User;
import lombok.extern.java.Log;

import java.lang.reflect.Field;

/**
 * Hello world!
 */
@Log
public class AppB {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 使用module-a模块的User类
        User xie = User.builder().name("xie").age(19).build();
        log.info("user=" + xie);

        // java9反射:依赖的模块是无法直接反射操作的
        Class<User> userClass = User.class;
        Field field = userClass.getDeclaredField("name");
        field.setAccessible(true);  // 尝试修改访问权限
        log.info((String) field.get(xie));

    }
}
