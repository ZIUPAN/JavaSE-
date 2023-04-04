package javase.day08;

import java.util.Scanner;

public class ScannerUtils {

    // 构造方法
    private ScannerUtils() {
    }

    // 定义键盘录入字符串方法
    // 工具类不需要创建对象，所以方法都应该是static，归类所有！
    static String character()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        return in.nextLine();
    }

    // 定义键盘录入int整数方法
    static int intNum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个int整数：");
        return in.nextInt();
    }

    // 定义键盘录入Person对象的方法
    static Person person()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请录入一个Person对象的age属性：");
        int age = in.nextInt();

        System.out.println("请录入一个Person对象的name属性：");
        in.nextLine();
        String name = in.nextLine();
        Person person = new Person(age,name);
        return person;
    }
}
