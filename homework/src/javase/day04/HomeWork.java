package javase.day04;

import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("请输入数组的长度：");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        String[] arr = new String[len];
        //double[] arr = new double[len];
        for (int i = 0; i <len ; i++)
        {
            System.out.println("请输入第"+(i+1)+"个数据元素");
//            arr[i] = in.nextDouble();
            arr[i] = in.nextLine();
        }

        //调用divisionMethod方法
        //divisionMethod(arr);

        //调用排序算法
        //songContext(arr);

        //调用计算平均成绩方法
        //averageStudent(arr);

        // 调用遍历数组元素方法
        traverse1(arr);
        traverse2(arr);
        traverse3(arr);
    }

    //题目一 数组基础练习——除以首元素、
    public static void divisionMethod(double[] arr)
    {
        //定义一个临时变量存储第一个元素
        double temp = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i]/temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 题目二 歌唱比赛
    public static void songContext(double[] arr)
    {
        // 冒泡排序
        for (int i = 0; i <arr.length-1 ; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 计算最终分数
        double result = 0;
        for (int i = 1; i < arr.length-1; i++) {
            result += arr[i];
        }
        result = result/8;
        System.out.println("最终分数为：");
        System.out.println(result);
    }

    //题目三
    //1
    public static void averageStudent(double[] arr)
    {
        double grade = 0;
        for (double v : arr) {
            grade += v;
        }
        System.out.println("平均成绩为："+grade / arr.length);
    }

    //2
    public static void traverse1(String[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
            while (i==arr.length-1)
            {
                System.out.print("\b\b");
                break;
            }
        }
        System.out.println("]");
    }

    public static void traverse2(String[] arr)
    {
        // 增强for
        System.out.print("[");
        label:
        for (String s : arr) {
            while (s.equals(arr[arr.length-1]))
            {
                System.out.print(s);
                break label;
            }
            System.out.print(s+", ");
        }
        System.out.println("]");
    }

    public static void traverse3(String[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

}
