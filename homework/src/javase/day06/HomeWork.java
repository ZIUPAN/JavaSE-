package javase.day06;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] arrs1 = {1,2,8,4,3};
        //sort(arrs);
        int[] arrs2 = {5,5,5,6,10,11};
        merge(arrs1,arrs2);


    }

    // 排序题
    public static void sort(int[] arrs)
    {
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length-i-1; j++) {
                if (arrs[j]>arrs[j+1])
                {
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrs));
    }

    // 合并数组
    //分析：这是一个二维数组，长度为3，但是每个一维数组长度不同，所以需要动态初始化，并且是格式二，灵活的方式
    public static void merge(int[] arrs1,int[] arrs2)
    {
        int lenth = arrs1.length;
        lenth += arrs2.length;
        int[] newInts = new int[lenth];
        // 先填入arrs1的值
        for (int i = 0; i < arrs1.length; i++) {
            newInts[i] = arrs1[i];
        }
        // 再反向填入arrs2的值
        for (int j = arrs2.length-1; j >= 0; j--) {
            newInts[arrs1.length+j] = arrs2[j];
        }
        System.out.println(Arrays.toString(newInts));
    }
}
