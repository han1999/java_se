package com.cskaoyan.javase.file._2constructor;

/**
 * @description: File类的构造方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.io.File;

/**
 * > 首先，在使用File之前，再明确一下File类的定义
 * > File是文件和目录（文件夹）路径名的抽象表达形式F
 * - File类是对文件、目录的抽象表示，**并不代表这个文件和目录就一定存在**
 * - 创建File类对象的时候，编译器也不会去检查这个File对应的文件和目录是否存在
 * - 用一个file对象调用以下方法，可判断该目录文件是否存在
 *   public boolean exists()
 *
 */
public class Demo {
    public static void main(String[] args) {
        ////创建一个File对象，该方法一般使用绝对路径来创建对象，也可以使用相对路径
        //File (String pathname)
        //1，使用绝对路径创建文件
        File f = new File("E:\\1\\aaa");
        System.out.println(f.exists());
        File f1 = new File("E:\\1\\2");
        System.out.println(f1.exists());
        //2，瞎创建，瞎写路径，根本就不是路径
        File f2 = new File("hello world!");
        System.out.println(f2.exists());
        File f3 = new File("我爱你");
        System.out.println(f3.exists());
        //3，使用相对路径创建文件
        File f4 = new File("a.txt");
        System.out.println(f4.exists());
        File f5 = new File("14-file\\a.txt");
        System.out.println(f5.exists());
        File f6 = new File("..\\..\\28th");
        System.out.println(f6.exists());
        ////和第一种方式类似，只不过把一个路径劈成了两半
        ////普遍来说，parent路径表示一个绝对路径。child路径跟一个相对路径
        //File (String parent, Sting child)

        ////和第二种方式一样，只不过，子路径用一个File对象表示
        //File (File parent, String child)

    }
}
