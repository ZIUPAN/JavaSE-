package javase.day08;

/**
 * 问题1: 思考注释1下面的代码能否放开?会不会报错?
 * 问题2: 思考控制台输出的顺序,提供必要的文字说明解释代码为何如此执行。
 * 问题3: Homework building和Homework constructor会不会输出,为什么?
 */

public class HomeWork {
    static Student s = new Student();

    {
        System.out.println("Homework building");
        s = null;
    }


    public static void main(String[] args) {
        System.out.println("main");
        // 注释1
        //System.out.println(s.age);
        Person p = new Person("刘备");
        System.out.println(p.name);
    }

    public HomeWork() {
        System.out.println("Homework constructor");
    }
}

class Person{
    {
        name = "赵云";
        System.out.println("Person building");
    }
    int age;
    String name = "曹操";
    static Student s = new Student();

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("年龄为："+age+"，名字为："+name);
    }

    public Person(String name) {
        System.out.println("Person constructor");
        this.name = name;
    }
}

class Student{
    int age = 10;
    {
        System.out.println("Student building");
        age = 20;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(){
        System.out.println("Student constructor");
    }
}


