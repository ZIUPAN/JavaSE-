package javase.day03;

public class ArrayPreview {
    public static void main(String[] args) {
        // 静态初始化
        int[] array1 = new int[]{1,2,3};

        // 动态初始化
        int[] array2 = new int[3];

        //输出数组中的元素
        // 数组名.length获取数组元素
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
