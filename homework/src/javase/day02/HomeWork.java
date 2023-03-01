package javase.day02;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);

        //调用calculateGrade方法
        //calculateGrade(in);

        //调用scannerDemo方法
        //scannerDemo(in);

        //调用calculateOdd方法
        //calculateOdd(in);

        //调用calculateOdd方法
        //triangle(in);

        //调用multiply方法
        //multiply(in);

        //调用oddOrEven方法
        //System.out.println(oddOrEven(in));

        //调用specificSymbol方法
        //specificSymbol(in);

        //调用primeNumber方法
        primeNumber(in);
    }

    //题目一
    public static void calculateGrade(Scanner in)
    {
        System.out.println("请分别输入数学、语文、英语成绩：");
        double mathGrade = in.nextDouble();
        double language = in.nextDouble();
        double english = in.nextDouble();

        // 计算平均分
        double avergae = (mathGrade+language+english)/3;
        System.out.println("平均分为："+avergae);
        //计算最低分
        //利用三目运算符
        double minTemp = (mathGrade<language)?mathGrade:language;
        double minGrade = (minTemp<english)?minTemp:english;
        System.out.println("最低分为："+minGrade);
        //计算三科的总分
        double totalGrade = (mathGrade+language+english);
        System.out.println("总分为："+totalGrade);
    }

    //题目二
    public static void scannerDemo(Scanner in)
    {
        //接收三种数字类型
        System.out.println("请分别输入int类型、String类型、double类型的数据：");
        String intStr = in.nextLine();
        String stringType = in.nextLine();
        String doubleStr = in.nextLine();

        int intType = Integer.parseInt(intStr);
        double doubleType = Double.parseDouble(doubleStr);

        //求和
        System.out.println(intType+doubleType);

        //拼接字符串
        System.out.println(intType+doubleType+stringType);
    }

    //题目四
    //方法一
    public static void calculateOdd(Scanner in)
    {
        System.out.println("请输入n：");
        int number = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i+=2) {
            sum+=i;
        }
        System.out.println("奇数的和为："+sum);
    }

    //方法二
    public static void triangle(Scanner in)
    {
        System.out.println("请输入行数：");
        int number = in.nextInt();
        for (int j = number; j >=1; j--) {
            for (int i = 0; i <j; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //方法三
    public static void multiply(Scanner in)
    {
        //输入n
        System.out.println("请输入n：");
        int number = in.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+(i*j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //方法四
    public static String oddOrEven(Scanner in)
    {
        System.out.println("请输入一个int数字");
        int number = in.nextInt();
        if (number%2==0)
        {
            return "偶数";
        }
        return "奇数";
    }

    //方法五
    public static void specificSymbol(Scanner in)
    {
        System.out.println("请输入行数：");
        int numberRow = in.nextInt();
        System.out.println("请输入列数：");
        int numberColumn = in.nextInt();
        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //方法六
    /*
    素数又叫质数，质数是指在大于1的自然数中，除了1和它本身以外，不能被其他自然数整除的数。
    最小的质数是2，它也是唯一的偶数质数，最前面的质数依次排列为：2、3、5、7、11、13、17、19、23、29、31等。

    *思路（百度）：
    * 其实只要把循环一直从2尝试到根号x就可以，不难发现，
    * 一个数的两个因数中，毕然有一个小于等于根号x，一个大于等于根号x，
    * 例如100的因数有：1和100，2和50，4和25，5和20，10和10.
    * 所以只要从2尝试到根号x，如果都没有被整除，就是素数，否则就不是。
     */
    public static void primeNumber(Scanner in)
    {
        System.out.println("请输入n：");
        int x = in.nextInt();
        int j=0;
        for(j=2;j<=Math.sqrt(x);j++){
            if(x%j==0){
                break;
            }
        }
        if(j>Math.sqrt(x)){
            System.out.println("是素数");
        }else{
            System.out.println("不是素数");
        }
    }
}
