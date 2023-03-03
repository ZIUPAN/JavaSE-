package javase.day04;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraversal {
    //这算全局变量嘛？如果是，他是存在栈，还是存在堆？
    int a = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int length = in.nextInt();
        int array[] = new int[length];
        System.out.println("请循环输入数组各元素：");

        for (int i = 0; i < length; i++)
        {
            System.out.println("第"+(i+1)+"个元素为：");
            array[i] = in.nextInt();
        }

        // 调用数组遍历方法
        traversal(array);

        //JDK自带数组遍历函数
        //该方法需要传入一个一维数组，返回值是一个遍历结果的字符串。
        //System.out.println(Arrays.toString(array));

        //调用数组逆序方法
        reverse(array);


        //快捷键：iter 使用增强for
        for (int i : array) {
            System.out.println(i);
        }
    }

    @Test public void test()
    {

    }

    public static void traversal(int[] array)
    {
        if (array.length==0||array==null)
        {
            System.out.println("输入不合法！");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // 数组的逆序实现
    public static void reverse(int[] array)
    {
        // 定义临时变量用于交换
        int temp = 0;
        for (int i = 0; i < array.length/2; i++)
        {
            temp = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }


}
