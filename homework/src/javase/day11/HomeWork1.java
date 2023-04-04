package javase.day11;

public class HomeWork1 {
    public static void main(String[] args) {

    }
}

class Demo{

    final int a;
    final int b;
    final int c;

    // 方法一：用显示赋值给静态成员变量赋值
//    final static int A = 1;
//    final static int B = 2;

    final static int A;
    final static int B;
    // 方法二：用静态代码块给静态成员变量赋值
    static {
        A = 50;
        B = 60;
    }

    // 方法三：通过构造代码块给成员变量赋值
    {
        a = 1;
        b = 3;
        c = 5;
    }

    // 方法二：通过显示赋值给成员变量赋值
//    final int a = 1;
//    final int b = 2;
//    final int c = 3;

    // 方法一：利用构造器给成员变量赋值
//    public Demo(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    //



}
