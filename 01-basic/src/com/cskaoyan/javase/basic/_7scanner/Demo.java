package com.cskaoyan.javase.basic._7scanner;

import java.util.Scanner;

/**
 * @description: Scanner的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * Scanner当中的next、nextInt、nextDouble系列和nextLine方法是不能混用的,必须分别单独使用
 *
 * 编码值为0的字符是一个绝对空的字符，啥都没有，没有空格，没有换行
 *
 */
public class Demo {
    public static void main(String[] args) {
            /*//Scanner sc = _1new Scanner(System.in);
            //快捷键: 快速补全左边的数据类型接收
            //一: .var
            //二: ctrl + alt +V
            //建议写创建对象或者使用方法的语句从右往左写
            //以后我们会经常创建对象,也会经常的去使用方法
            Scanner sc = _1new Scanner(System.in);
            //Scanner sc2 = _1new Scanner(System.in);
            System.out.println("请输入一个int数值: ");
            int a = sc.nextInt();
            System.out.println(a);

            System.out.println("请输入一个字符串：");
            //sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(s2);*/


        //不要混用next系列和nextLine方法
        Scanner sc = new Scanner(System.in);
        //String s = sc.next();
        //System.out.println(s);

        //建议使用Scanner时忘记它有next系列的方法，永远使用nextLine，这样就会少很多困扰
        System.out.println("请输入一个数字：");
        String numStr = sc.nextLine();
        //数据类型的转换： 怎么把String字符串转换成各种数据类型，比如int
        //Integer.parseInt(String s)
        //Java提供了包装类，它把基本数据类型包装成引用数据类型，这样基本数据类型也可以成为对象了
        int num = Integer.parseInt(numStr);
        System.out.println(num);


        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        System.out.println(s);

    }
}
