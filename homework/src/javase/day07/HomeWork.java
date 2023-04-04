package javase.day07;

import java.security.PublicKey;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//
//            System.out.println("请输入密码：");
//            int passWord = in.nextInt();
//            System.out.println("请输入账户余额");
//            double accountBalance = in.nextDouble();
//            System.out.println("请输入年限");
//            int year = in.nextInt();
//            Account account = new Account(passWord, accountBalance, year);
//            System.out.println("属性：");
//            account.printInfo();
//            System.out.println("计算后余额为：");
//            account.countRate();
//        }

//        Teacher teacher = new Teacher("长风", 18, "男性", 007);
//        teacher.print();
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("输入名字");
            String name = in.nextLine();
            System.out.println("输入id");
            int stuId = in.nextInt();
            // 消除键盘录入吞字情况
            in.nextLine();
            System.out.println("输入性别");
            String gender = in.nextLine();
            System.out.println("输入年龄");
            int age = in.nextInt();
            System.out.println("输入分数");
            double score = in.nextDouble();
            Student student = new Student(name,stuId,gender,age,score);
            students[i] = student;
            // 消除键盘录入吞字情况
            in.nextLine();
        }

        printStu(students);
        getAverage(students);
    }

    public static void printStu(Student[] students)
    {
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
    }

    public static void getAverage(Student[] students)
    {
        double result =0;
        for (int i = 0; i < students.length; i++) {
            result += students[i].getScore();
        }
        System.out.println(result / students.length);
    }
}

class Account {
    // 静态成员变量
    static int nextId = 10001;
    int id;
    int passWord;
    double accountBalance;
    double rate = 3.0 / 1000;
    // 年限
    int year;

    // 构造函数
    public Account(int passWord, double accountBalance, int year) {
        this.id = Account.nextId;
        // 静态成员变量是属于类的，而非对象，类似于全局变量
        Account.nextId++;
        this.passWord = passWord;
        this.accountBalance = accountBalance;
        this.year = year;
    }

    // 方法一：打印账户自身所有属性
    public void printInfo() {
        System.out.println("id为" + this.id + ",密码为" + this.passWord + ",账户余额为"
                + this.accountBalance + ",利率为" + this.rate);
    }

    // 方法二：计算余额
    public void countRate() {
        System.out.println("合计后的余额为：" + (this.accountBalance + this.rate * this.year * this.accountBalance));
    }
}

class Teacher{
    String name;
    int age;
    String gender;
    int teacherId;

    // 无参构造器
    public Teacher() {
    }

    // name单参构造器
    public Teacher(String name) {
        this.name = name;
    }

    // name和teacherId双参构造方法
    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    // name，age和gender的三参构造器
    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // name，age，gender和teacherId的四参构造器（要求用this调用已存在的三参构造器）
    public Teacher(String name, int age, String gender, int teacherId) {
        this(name,age,gender);
        this.teacherId = teacherId;
    }

    public void print()
    {
        System.out.println("名字为"+this.name+",年龄为"+this.age+",性别为"+this.gender+",id为"+this.teacherId);
    }
}

class Student{
    String name;
    int stuid;
    String gender;
    int age;
    double score;

    public Student(String name, int stuid, String gender, int age, double score) {
        this.name = name;
        this.stuid = stuid;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public void print()
    {
        System.out.println("名字为"+this.name+"，性别为"
                +this.gender+"，年龄为"+this.age+"，分数为"+this.score);
    }

    public double getScore()
    {
        return this.score;
    }
}
