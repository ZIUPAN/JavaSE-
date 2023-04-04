package javase.day07;

public class Exercise {
    public static void main(String[] args) {
        Person p = new Person(18);
    }
}
class Person {
    int age = 10;
    static String nationality = "美国";

    public Person(int age) {
        this.age = age;
    }


    public Person() {
    }

    public Person(String nationality) {
        Person.nationality = nationality;
    }
}
