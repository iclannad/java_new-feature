package com.example;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    // instanceof判断成立后，会自动强转为指定类型，简化手动转换的步骤
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {   // 在比较完成后面，直接写变量名，而这个变量名就是类型转换之后的
            return student.name.equals(this.name);  // 下面直接用，语法糖
        }
        return false;
    }
}
