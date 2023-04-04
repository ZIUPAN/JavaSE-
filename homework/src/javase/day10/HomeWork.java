package javase.day10;

public class HomeWork {
    public static void main(String[] args) {

        GrandFather gSon = new Son();
        gSon.test();
        System.out.println(gSon.a);

        System.out.println("-------------------------");

        Father fSon = new Son();
        fSon.test();
        System.out.println(fSon.a);
        System.out.println("-------------------------");

        Son son = new Son();
        son.test();
        System.out.println(son.a);



    }
}

class GrandFather{
    int gA;
    int a = 150;

    public GrandFather() {
    }

    public GrandFather(int gA) {
        this.gA = gA;
    }

    public GrandFather(int gA, int a) {
        this.gA = gA;
        this.a = a;
    }

    protected void test(){
//        System.out.println(gA);
        System.out.println(a);
    }
}

class Father extends GrandFather{
    int fA;
    int a = 550;

    public Father() {
    }

    public Father(int fA) {
        this.fA = fA;
    }

    public Father(int fA, int a) {
        this.fA = fA;
        this.a = a;
    }

    @Override
    protected void test() {
//        System.out.println(fA);
        System.out.println(a);
    }
}

class Son extends Father{
    int sA;
    int a = 100;

    public Son() {
    }

    @Override
    public void test() {
        System.out.println(a);
    }
}

class Student{
   void test() throws CloneNotSupportedException {
        clone();
    }
}
