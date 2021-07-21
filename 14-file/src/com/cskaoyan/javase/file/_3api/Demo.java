package com.cskaoyan.javase.file._3api;

import java.io.File;
import java.io.IOException;

/**
 * @description: API的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        ////只负责创建文件，目录路径如果不存在，会报错而不是帮你创建
        //public boolean createNewFile()
        //不能用于创建文件夹
        /*File f = new File("e:\\1\\a.txt");
        //Unhandled exception: java.io.IOException
        System.out.println(f.createNewFile());
        //File f1 = new File("E:\\1\\1\\1.txt");
        //System.out.println(f1.createNewFile());
        File f2 = new File("E:\\bbb");
        System.out.println(f2.createNewFile());*/

        ////只负责创建目录，但只能创建单层目录，如果有多级目录不存在的话，创建失败
        //public boolean mkdir() make directory
        ////只负责创建目录，但可以创建多级目录，如果多级目录不存在，则帮你全部创建
        //public boolean mkdirs()
        //注意，在开发中，永远推荐使用mkdirs，因为它能够创建多级目录，也是只能创建文件夹目录的，不能创建文件
        /*File f = new File("E:\\5\\4\\3\\2\\1");
        System.out.println(f.mkdirs());
        File f2 = new File("E:\\1\\1.java");
        System.out.println(f2.mkdirs());*/


        //public boolean delete()
        /**
         * 注意事项：
         * 1，该方法是调用本地方法系统底层的方法去实现删除功能的，它的删除是真正的删除，而不是到回收站
         *      所以大家在做删除操作时要谨慎小心，不要误删东西
         * 2，该方法只能用于删除文件或者空的目录，如果目录非空是删除不掉的
         * 3，如果想要删除一个非空目录，这里可以很好的使用递归的思想
         *      递归删除的思路：
         *      想要删除它，必须先要获取目录下的所有文件或者文件夹
         *          如果是文件直接删除
         *          如果是空目录也直接删除
         *          如果是非空目录，再进去，做一次递归删除
         *      递归的出口：
         *          全是文件或者是空目录
         *      递归的递归体：
         *          如果目录非空，再次调用自身方法
         * 递归删除目录作为今晚的作业，再次强调一下，做题时，最好找一个目录做测试
         *      不要在C盘下测试，启动main方法要再看一下自己写的目录
         *
         */
        /*File f = new File("E:\\1\\1.java");
        System.out.println(f.delete());
        File f2 = new File("E:\\1\\1.txt");
        System.out.println(f2.delete());
        File f3 = new File("E:\\1\\bbb");
        System.out.println(f3.delete());*/


        //public boolean renameTo(File dest)
        /**
         * - 当源文件和修改之后的目标文件，在同一目录的时候，效果只是重命名
         * - 当源文件和修改之后的目标文件，不在同一目录的时候，效果是移动且重命名
         * - 当源文件和修改之后的目标文件，同目录同名时，方法返回true，实际没有效果
         * - 真正操作文件，应该使用（IO流操作）
         */
        /*File f = new File("E:\\3\\test.jpg");
        File f1 = new File("E:\\新垣结衣.jpg");
        System.out.println(f.renameTo(f1));*/


        ////获取File对象表示的抽象文件的绝对路径
        //public File getAbsolutePath()
        File f = new File("1.txt");
        System.out.println(f.getAbsolutePath());

        ////获取File对象表示的抽象路径名的字符串，简单来说，创建的时候给的是什么就输出什么
        //public String getPath()
        System.out.println(f.getPath());

        ////获取File对象表示的文件或者目录的文件名
        //public String getName()
        System.out.println(f.getName());


        ////返回由此抽象路径名表示的文件的所占硬盘空间大小，以字节为单位
        ////但是需要注意的是，这个方法只能获取文件的大小，不能获取目录大小
        //public long length()
        File f1 = new File("E:\\1\\a.txt");
        System.out.println(f1.length());
        File f2 = new File("E:\\1");
        System.out.println(f2.length());

        ////返回此File对象表示的文件的最后一次修改的时间
        //public long lastModified()
        System.out.println(f1.lastModified());

    }
}
