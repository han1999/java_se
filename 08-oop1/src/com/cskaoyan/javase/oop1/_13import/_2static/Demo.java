package com.cskaoyan.javase.oop1._13import._2static;

/**
 * @description: 静态导入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Arrays;
import static java.lang.System.out;
import static java.lang.Math.PI;
import static com.cskaoyan.javase.oop1._13import._2static.Test.打印;

/**
 * 静态导入指的是import static 包名.静态的成员
 * import后面直接加全限定类名,表示导入一个class
 * import static + 静态成员 表示导入一个类的静态成员(变量,方法)
 *
 * 静态导入了解即可,实际开发中很少使用
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //int[] ints = _1new int[3];
        //Non-static method 'toString()' cannot be referenced from a static context
        //因为这里的toString()用的是Object类当中继承下来的普通成员方法toString()
        //System.out.println(toString(ints));

        //System.out.println("hello world");
        out.println("hello world!");
        out.println(PI);

        //纯属娱乐
        打印(1);
    }
}
