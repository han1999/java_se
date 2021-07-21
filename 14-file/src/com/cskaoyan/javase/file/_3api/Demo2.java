package com.cskaoyan.javase.file._3api;

import java.io.File;

/**
 * @description: 高级获取功能
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo2 {
    public static void main(String[] args) {
        ////返回一个字符串数组，这些字符串包括，此抽象的路径名表示的目录中的所有文件和文件夹的名字
        ////如果File对象表示的是一个文件，则返回null
        ////只能获取当前目录的下一层，并不是获取所有层级
        ////如果是一个空目录，返回一个长度为0的数组，而不是null
        //public String[] list()

        //File f = new File("E:\\2");
        //String[] names = f.list();
        //for (String name : names) {
        //    System.out.println(name);
        //}

        //当目录不存在时，方法返回值是null
        //File f1 = new File("E:\\2\\2");
        //String[] list = f1.list();
        //for (String s : list) {
        //    System.out.println(s);
        //}

        //当对象不是表示目录，而是一个文件时，它的返回值也是null
        //File f2 = new File("E:\\2\\1.jpg");
        //String[] list1 = f2.list();
        //for (String s : list1) {
        //    System.out.println(s);
        //}

        //当对象表示一个空目录时，方法返回值是一个长度为0的String数组
        //File f3 = new File("E:\\2\\1.avi");
        //String[] list = f3.list();
        //for (String s : list) {
        //    System.out.println(s);
        //}


        ////返回指定File目录下的文件和文件夹的绝对路径形式的File对象数组
        ////如果File对象表示的是一个文件，则返回null
        ////只能获取当前目录的下一层，并不是获取所有层级
        ////如果是一个空目录，返回一个长度为0的数组，而不是null
        //public File[] listFiles()
        File f = new File("E:\\2");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.toString());
        }
    }
}
