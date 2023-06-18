package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println(grade(90));
        System.out.println(grade(50));

        String str = """
                java13全新的文本块，方便拼接文本信息
                
                下面还有内容
                """;
        System.out.println(str);

        // 空指针异常改进
        String a = "a";
        String b = null;
        int length = a.length() + b.length();
        System.out.println(length);

        // 记录类型
        Account account = new Account("xie", "123");
        System.out.println(account.toString());

    }

    /**
     * 传入分数（范围0-100）返回对应的等级
     * 100-90：优秀
     * 70-90：良好
     * 60-70：及格
     * 00-60：不及格
     *
     * @param score
     * @return
     */
    public static String grade1(int score) {
        score /= 10;
        return switch (score) {
            case 10, 9 -> "优秀";
            case 8, 7 -> "良好";
            case 6 -> "及格";
            default -> {
                System.out.println("default处理其它逻辑");
                yield "不及格"; // yield 引入新的关键字
            }
        };
    }

    /**
     * 传入分数（范围0-100）返回对应的等级
     * 100-90：优秀
     * 70-90：良好
     * 60-70：及格
     * 00-60：不及格
     *
     * @param score
     * @return
     */
    public static String grade(int score) {
        score /= 10;
        String grade;
        switch (score) {
            case 10:
            case 9:
                grade = "优秀";
                break;
            case 8:
            case 7:
                grade = "良好";
                break;
            case 6:
                grade = "及格";
                break;
            default:
                grade = "不及格";
                break;
        }
        return grade;
    }
}
