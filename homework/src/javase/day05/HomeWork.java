package javase.day05;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入数组长度：");
//        int len = in.nextInt();
//       // in.nextLine();
//        //String[] strings = new String[len];
//        int[] ints = new int[len];
//        for (int i = 0; i < len; i++) {
//            System.out.println("请输入第"+(i+1)+"个元素:");
//            //strings[i] = in.nextLine();
//            ints[i] = in.nextInt();
//        }

        //调用删除方法
        //delete(strings);

        //调用新增方法
        //create(ints);

        //
        System.out.println("请输入十进制数：");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        decimalism(num);
    }

    public static void method(int a, int b) {
        a = 20;
        b = 40;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.exit(0);
    }

    public static void delete(String[] arrs)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入想删除的元素：");
        String target = in.nextLine();
        int deleteNum = arrs.length;
        for (int i = 0; i < arrs.length; i++) {
            if(target.equals(arrs[i]))
            {
                arrs[i] = null;
                deleteNum--;
            }
        }
        String[] strings = new String[deleteNum];
        int subscript = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i]!=null)
            {
                strings[subscript] = arrs[i];
                subscript++;
            }
        }
        System.out.println(Arrays.toString(strings));
    }

    public static void variableParameter(int... arrs)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i]>=max)
            {
                max = arrs[i];
            }
        }
        System.out.println("最大元素为"+max);
    }

    public static void create(int[] arrs)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入想要新增的元素：");
        int target = in.nextInt();
        int len = arrs.length+1;
        int[] ints = new int[len];
        for (int i = 0; i < arrs.length; i++) {
            ints[i] = arrs[i];
        }
        ints[len-1] = target;
        System.out.println(Arrays.toString(ints));
    }

    // 第七题：转换进制
    public static void decimalism(int number)
    {
        int remainder = number%2;
        while (number==0)
        {
            return;
        }
        decimalism(number/2);
        System.out.print(remainder);
    }
}
