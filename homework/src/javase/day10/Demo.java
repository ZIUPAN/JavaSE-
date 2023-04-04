package javase.day10;

public class Demo {
    public static void main(String[] args) {
        Son1 s = new Son1();
        System.out.println(s.num);
        Father3 fs = new Son1();
        System.out.println(fs.num);
        // Father f = new Father();
        Son1 s2 = new Son1(30);
        System.out.println(s2.num);

        Father3 fs2 = new Son1(30);
        System.out.println(fs2.num);
    }
}

class Father3 {
    int num = 10;
    public int getNum() {
        return num;
    }
    public Father3() {
        System.out.println(getNum());
    }
}
class Son1 extends Father3 {
    int num = 20;
    @Override
    public int getNum() {
        return num;
    }
    public Son1() {
        // super();
    }
    public Son1(int num) {
        this.num = num;
    }
}