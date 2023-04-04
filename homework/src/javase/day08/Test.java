package javase.day08;

import javase.day08.student.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

//        int num = ScannerUtils.intNum();
//        System.out.println(num);
//
//        String character = ScannerUtils.character();
//        System.out.println(character);
//
//        Person person = ScannerUtils.person();
//        //System.out.println(person);

//        for (int i = 0; i < 11; i++) {
//            Student student = new Student();
//        }

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入姓名");
            String name = in.nextLine();
            System.out.println("请输入性别");
            String gender = in.nextLine();
            System.out.println("请输入工资");
            double salary = in.nextDouble();
            in.nextLine();
            Staff staff = new Staff(name,gender,salary);
            staff.calculate();
            staff.printInfo();
        }
    }
}
