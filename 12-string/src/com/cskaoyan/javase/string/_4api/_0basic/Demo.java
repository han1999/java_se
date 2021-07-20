package com.cskaoyan.javase.string._4api._0basic;

/**
 * @description: 常用API的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * > String是开发中最常见的需要操作的对象，没有之一
 * > String天天见，所以我们要对String的操作至少有个脸熟，大概知道String类能做什么
 * > 以下方法不要求都背住，但是应该能够了解有这些方法，并可以在实际开发中随着使用而熟记
 *
 */
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "hello";
        System.out.println(s.length());
        //获取字符串对象代表字符序列中，指定位置的字符
        //char charAt(int index)
        //把字符串String --> char类型字符就是使用这个方法
        String s2 = "a";
        char a = s2.charAt(0);
        System.out.println(a);

        ////在当前字符串对象中查找指定的字符，如果找到就返回字符，首次出现的位置，如果没找到返回-1
        ////也可以填字符
        //int indexOf(int ch)
        String s1 = "hello world!";
        System.out.println(s1.indexOf(97));
        ////指定从当前字符串对象的指定位置开始，查找首次出现的指定字符的位置，(如果没找到返回-1)
        ////可以填入字符
        //int indexOf(int ch,int fromIndex)
        //
        ////查找当前字符串中，目标字符串首次出现的位置(如果包含)，找不到，返回-1
        ////这里的位置是指目标字符串的第一个字符,在当前字符串对象中的位置
        //int indexOf(String str)
        System.out.println(s1.indexOf("world"));
        ////指定，从当前字符串对象的指定位置开始,查找首次出现的指定字符串的位置(如果没找到返回-1)
        ////这里的位置是指目标字符串的第一个字符,在当前字符串对象中的位置
        //int indexOf(String str,int fromIndex)
        System.out.println(s1.indexOf("h",5));

        ////返回字符串，该字符串只包含当前字符串中，从指定位置开始(包含指定位置字符)到结束的那部分字符串
        //String substring(int start)
        String s3 = "我爱你中国!";
        System.out.println(s3.substring(3));
        ////返回字符串，只包含当前字符串中，从start位置开始(包含)，到end(不包含)指定的位置的字符串
        //String substring(int start,int end)
        System.out.println(s3.substring(0,6));

        //在java的源代码当中,涉及到数组的区间问题,一律是左闭右开的[) 包括左边不包括右边
        //左闭是为了照顾下标是从0开始的,右开是为了照顾数组的长度,右边可以写数组的长度



        ////获取一个用来表示字符串对象字符序列的，字节数组
        //byte[] getBytes()
        String s4 = "我爱你";
        byte[] bytes = s4.getBytes();
        System.out.println(Arrays.toString(bytes));
        //在默认情况下,默认编码集的情况下,用三个字节表示一个中文字符,默认的编码集是UTF-8
        //编码集GBK,指本地编码集,它用两个字节表示一个中文字符
        byte[] gbks = s4.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));


        ////获取的是用来表示字符串对象字符序列的，字符数组
        //char[] toCharArray() 该方法得到的是一个新的char数组,不是原本String当中的value数组
        String s5 = "我是张三";
        char[] chars = s5.toCharArray();
        System.out.println(Arrays.toString(chars));
        ////使用指定字符集，将字符编码成字节序列，并将结果存储到一个新的 byte 数组中
        //getBytes(String charsetName)
        //
        ////将字符从此字符串复制到目标字符数组
        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] dst = new char[10];
        String s6 = "我的手机真好看!";
        //src是source的缩写,表示源头的意思,在方法中表示方法调用者字符串对象
        //dst是destination的缩写,表示目标和目的的意思,在方法中表示方法所需要复制的目标字符数组
        //dstBegin表示从目标数组的哪一个下标开始复制
        //常用的还有target/aim
        s6.getChars(2,7,dst,5);
        System.out.println(Arrays.toString(dst));


        ////把字符数组转换成字符串
        //static String valueOf(char[] chs)
        ////把各种基本数据类型和对象转换成字符串
        //static String valueOf(int i/double...)
        ////把字符串全部转化为小写
        //String toLowerCase()
        ////把字符串全部转换为大写
        //String toUpperCase()
        ////字符串拼接，作用等价于 + 实现的字符串拼接
        //String concat(String str)

        String s7 = "我是你爸爸";
        System.out.println(s7.toLowerCase());
        System.out.println(s7.toUpperCase());


        //// 在新的字符串中，用新(new)字符，替换旧(old)字符
        //String replace(char old,char new)
        ////在新的字符串中，用新的字符串(new), 替换旧(old)字符串
        //String replace(String old,String new)

        String s8 = "abc asdh askhd ad";
        //去除字符串当中的所有空格
        System.out.println(s8.replace(" ", ""));
    }
}
