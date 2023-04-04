package javase.day09;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        Account account = new Account("ziupan","123456",150);
//        Account account = new Account();
//        account.setUserName("ziupan");
//        account.setPassWord("123456");
//        account.setCountBalance(99);

        randomNum num = new randomNum();
        num.setNum();
        num.guess();
    }
}

class Account{
    private String userName;
    private String passWord;
    private double countBalance;

    public Account(String userName, String passWord, double countBalance) {
        this.userName = userName;
        this.passWord = passWord;
        this.countBalance = countBalance;
    }

    public Account() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.length()<=4||userName.length()>=6)
        {
            System.out.println("用户名长度必须为4-6位！");
            this.userName = null;
        }
        else {
            this.userName = userName;
        }
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        if (passWord.length()!=6)
        {
            System.out.println("密码长度必须为6位！");
            this.passWord = null;
        }
        else {
            this.passWord = passWord;
        }
    }

    public double getCountBalance() {
        return countBalance;
    }

    public void setCountBalance(double countBalance) {
        if (countBalance<=100){
            System.out.println("余额小于100！");
            this.countBalance = 0;
        }
        else {
            this.countBalance = countBalance;
        }
    }
}

class Rectangle{
    private int length_l;
    private int length_s;

    public Rectangle(int length_l, int length_s) {
        this.length_l = length_l;
        this.length_s = length_s;
    }

    public int getLength_l() {
        return length_l;
    }

    public void setLength_l(int length_l) {
        this.length_l = length_l;
    }

    public int getLength_s() {
        return length_s;
    }

    public void setLength_s(int length_s) {
        this.length_s = length_s;
    }

    int getArea()
    {
       return this.length_l*this.length_s;
    }

    int getPerimeter()
    {
        return 2*(length_s+length_l);
    }
}

class Square{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int getArea()
    {
        return this.length*this.length;
    }

    int getPerimeter()
    {
        return 4*length;
    }
}

class animal{
    static String name;
    static int age;
    static boolean voice;

    public animal() {
    }
}

class dog extends animal{
    static String gender;

    public dog() {
    }

    public static void setColor(String color) {
        dog.gender = color;
    }

    void Guard()
    {
        System.out.println("bark");
    }
}

class cat extends animal{
    static String color;

    public cat() {
    }

    public static void setColor(String color) {
        cat.color = color;
    }

    void catchMouse()
    {
        System.out.println("抓老鼠");
    }
}

class randomNum{
    private int num;

    public randomNum() {
    }

    public void setNum() {
        Random random = new Random();
        this.num = random.nextInt(99)+1;
    }

    void guess()
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            int num = scanner.nextInt();
            if (num>this.num)
            {
                System.out.println("输入的数字太大");
                continue;
            }
            else if (num<this.num)
            {
                System.out.println("输入的数组太小");
                continue;
            }
            System.out.println("输入正确！");
            break;
        }
    }
}
