package javase.day05;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HomeWork_Class {
    public static void main(String[] args) {
        //手机
        item item1 = new item();
        item1.name = "Samsung Galaxy";
        item1.price = 8000;
        item1.category = "手机类";
        item1.sell(5000);

        //家具
        item item2 = new item();
        item2.name = "Samsung Galaxy";
        item2.price = 8000;
        item2.category = "手机类";
        
        //洗发水
        item item3 = new item();
        item3.name = "Samsung Galaxy";
        item3.price = 8000;
        item3.category = "手机类";


    }
}

class item
{
    // 成员变量
    String name;
    double price;
    String category;

    // 成员方法
    public double sell(double money)
    {
        if (money>=price)
        {
            double remain = money-price;
            System.out.println(category+"商品被卖出");
            return remain;
        }
        System.out.println("金钱不足，购买失效");
        return -1;
    }
}
