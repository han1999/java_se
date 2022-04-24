package com.cskaoyan.javase.file._3api;

import java.io.File;
import java.io.FileFilter;

/**
 * @description: 带过滤器的listFiles方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo3 {
    public static void main(String[] args) {
        File f = new File("C:\\test");
        //File[] files = f.listFiles(new MyFilter());

        //使用匿名内部类
        /*File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //过滤规则2: 想听歌
                return pathname.isFile() && pathname.getName().endsWith(".mp3");
            }
        });*/
        //使用lambda表达式
        //过滤规则3: 找到奥特曼相关的文件夹
        //File[] files = f.listFiles(target -> target.isDirectory() && target.getName().contains("奥特曼"));
        File[] files = f.listFiles(Demo3::myFilterRuler);
        for (File file : files) {
            System.out.println(file);
        }
    }

    //过滤规则4: 看视频,听歌,文件名字超过4个长度
    public static boolean myFilterRuler(File f){
        if (f.isFile() && f.getName().endsWith(".mp4")) return true;
        if (f.isFile() && f.getName().endsWith(".mp3")) return true;
        System.out.println(f.getName());
        if (f.getName().length() > 4) return true;
        return false;
    }
}

//可以手写FileFilter的实现子类对象
class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        //给出过滤规则1： 想看学习相关的视频 首先它是一个文件，再判断是否是视频文件，最后再判断文件的名字是否带有学习
        return pathname.isFile() && pathname.getName().endsWith(".mp4") && pathname.getName().contains("学习");
    }
}