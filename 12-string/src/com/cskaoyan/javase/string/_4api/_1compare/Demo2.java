package com.cskaoyan.javase.string._4api._1compare;

/**
 * @description: Comparator接口实现自然排序
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Arrays;
import java.util.Comparator;

/**
 * > 一个类实现了Comparable接口，往往需要同时重写equals方法，这会增加一些思考量
 * > 并且也不是什么时候都能够去随心所欲的修改源码，或者实现一个接口
 * > 假如仅仅只是做一次比较，那么用匿名内部类或者lambda表达式
 * > 去使用带Comparator比较器的sort方法（Arrays和Conlections中都有该方法）会比较好
 * 比较器表示传入的比较规则,对于数组或者集合对象的类没有实现Comparable接口的需求
 *
 * - Comparator接口中的compare方法表示一种排序规则，方法会返回一个int值
 *   - 该sort方法逐个比较容器中的每两个对象
 *     - 方法返回负数表示排序中，表示对象越小,越处在前面的位置
 *     - 方法返回正数表示排序中，表示对象越大,越处在后面的位置
 *   - 最终的效果和Comparable接口一样，但是这种方式需要直接改实体类代码，更灵活
 *
 *  还可以使用匿名内部类和lambda表达式
 *
 *  自然排序的作用:
 *      在开发中,很多时候需要操作各种数据,最基本的需要把用户查询到的数据按照一定的顺序展示在页面中,这里就存在一个排序的过程
 *      开发中对数据做排序普遍有两种做法:
 *      1,最常用的,最常见的,当你把数据从数据库中取出来时,直接使用SQL语句进行排序(90%以上的情况都使用它)
 *      2,不太常见的,可以使用自然排序对从数据库中读取出来的无序的数据进行排序,这种在开发中也是会使用的
 *          比如数据库设计不合理,使用SQL语句排序有性能缺陷时
 *          偷懒不想改sql语句,查询的数据量也不大时,可以考虑使用自然排序
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        Phone p = new Phone(100, 1000, "小米");
        Phone p1 = new Phone(200, 1000, "OPPO");
        Phone p2 = new Phone(300, 1000, "诺基亚");
        Phone p3 = new Phone(200, 2000, "红米");
        Phone p4 = new Phone(200, 2000, "苹果");
        Phone p5 = new Phone(300, 3000, "锤子");
        Phone p6 = new Phone(300, 3000, "珠穆朗玛峰手机");
        Phone p7 = new Phone(100, 3000, "三星");
        Phone p8 = new Phone(300, 3000, "华为");
        Phone[] arr = {p, p1, p2, p3, p4, p5, p6, p7, p8};
        System.out.println("排序前: " + Arrays.toString(arr));
        //Arrays.sort(arr, new MyRuler());
        /*
        匿名内部类:
        Arrays.sort(arr, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                //比较的规则: 价钱从小到大
                return ((int) (o1.price - o2.price));
            }
        });*/
        //lambda表达式, 比较规则: 牌子越长,越厉害,牌子越长,排在前面
        //Arrays.sort(arr, (o1, o2) -> o2.brand.length() - o1.brand.length());

        //Arrays.sort(arr,(o1,o2) -> myCompare(o1, o2));
        Arrays.sort(arr, Demo2::myCompare);
        System.out.println("排序后: " + Arrays.toString(arr));
    }

    //复杂的比较规则: 先比价格,价格越低越在前面,如果价格相同,比较重量,重量越轻越在前面,最后比较品牌的长度,长度越长,越在前面
    public static int myCompare(Phone p1, Phone p2) {
        if (p1.price != p2.price) return ((int) (p1.price - p2.price)); //价格不相同,给出比较的大小
        //价钱相同,比较重量
        if (p1.weight != p2.weight) return p1.weight - p2.weight;
        //如果重量还相同,比较品牌长度
        if (p1.brand.length() != p2.brand.length()) return p2.brand.length() - p1.brand.length();
        //如果程序能够运行到这里,成员变量取值都一样
        return 0;
    }
}

//朴素的做法,手写一个比较器的实现类对象
class MyRuler implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        //比较的规则: 越重越强
        //手机越重,越在排序的前面
        return o2.weight - o1.weight;
    }
}


class Phone {
    int weight; //g
    double price;
    String brand;

    public Phone() {
    }

    public Phone(int weight, double price, String brand) {
        this.weight = weight;
        this.price = price;
        this.brand = brand;
    }

    //@Override
    //public String toString() {
    //    return "brand = " + brand;
    //}


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Phone{");
        sb.append("weight=").append(weight);
        sb.append(", price=").append(price);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
