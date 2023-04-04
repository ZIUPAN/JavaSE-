package javase.day06;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
       // sell();
        classes();
    }

    // 题目一
    public static void sell()
    {
        System.out.println("请输入每个季度的销售额：");
        int[][] sells = new int[4][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < sells.length; i++) {
            for (int j = 0; j < sells[i].length; j++) {
                System.out.println("输入：");
                sells[i][j] = in.nextInt();
            }
        }

        int month = 1;
        double average = 0;
        for (int i = 0; i < sells.length; i++) {
            System.out.println("第"+month+"季度平均销售额为：");
            for (int j = 0; j < sells[i].length; j++) {
                average+=sells[i][j];
            }
            average=average/3;
            System.out.println(average);
        }
    }

    // 题目二
    public static void classes()
    {
        // 👇一维数组需要初始化
//        int[] a = new int[3];
        // 👇二维数组的列为什么可以不用初始化？
        int[][] all = new int[3][];
//        for (int i = 0; i < all.length; i++) {
//            System.out.println(all[i]);
//        }
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("请输入各班班级人数：");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+"班人数为：");
            num = in.nextInt();
            int[] ints = new int[num];
            System.out.println("请输入"+(i+1)+"班每个人的成绩：");

            for (int j = 0; j < num; j++) {
                System.out.println("第"+(j+1)+"个人的成绩为：");
                int grade = in.nextInt();
                ints[j] = grade;
            }
            all[i] = ints;
        }

        // 计算每班的平均成绩
        for (int i = 0; i < all.length; i++) {
            double average = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;
            for (int j = 0; j < all[i].length; j++) {
                if (all[i][j]>max)
                {
                    max = all[i][j];
                }
                if (all[i][j]<min)
                {
                    min = all[i][j];
                }
                average += all[i][j];
            }
            System.out.println("第"+(i+1)+"班的平均成绩为："+average/all[i].length);
            System.out.println("最高成绩为："+max);
            System.out.println("最低成绩为："+min);
        }

    }
}
