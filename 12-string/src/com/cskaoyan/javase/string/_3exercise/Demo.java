package com.cskaoyan.javase.string._3exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        /*String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        String s3 = new String("hello");
        String s4 = "hello";
        System.out.println(s3 == s4); //false
        System.out.println(s3.equals(s4)); //true

        String s5 = "hello";
        String s6 = "hello";
        System.out.println(s5 == s6); //true
        System.out.println(s5.equals(s6)); //true*/


        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == (s1 + s2)); //false
        System.out.println(s3.equals(s1 + s2)); //true

        System.out.println(s3 == ("hello" + "world")); //true
        System.out.println(s3.equals("hello" + "world")); //true

        System.out.println( "helloworld" == "hello" + "world");
        System.out.println("afsdfa");
    }
}
