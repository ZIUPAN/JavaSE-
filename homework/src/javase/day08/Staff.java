package javase.day08;

public class Staff {
    String name;
    String gender;
    int id ;
    static int nextId=10000;
    double salary;

    public Staff(String name) {
        nextId++;
        this.id = nextId;
        this.name = name;
    }

    public Staff(String name, String gender) {
        nextId++;
        this.id = nextId;
        this.name = name;
        this.gender = gender;
    }

    public Staff(String name, String gender, double salary) {
        nextId++;
        this.id = nextId;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public void calculate()
    {
        this.salary-=2000;
    }

    public void printInfo()
    {
        System.out.println(this.gender);
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }
}
