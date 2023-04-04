package javase.day08.student;

public class Student {
    static int count = 0;

//    public Student() throws Exception {
//        count++;
//        System.out.println("创建第"+count+"个对象！");
//        if (count==10)
//        {
//            System.out.println("最多只能new10个！");
//            throw new Exception();
//        }
//    }


    public Student() {
        count++;
        if (count>=10)
        {

        }
    }

//    private Student(){
//
//    }
}
