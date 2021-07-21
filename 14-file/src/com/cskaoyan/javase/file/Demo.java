package com.cskaoyan.javase.file;

import java.io.File;

/**
 * @description: test
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        String s = System.setProperty("user.dir", "e:\\");
        System.out.println(System.getProperty("user.dir"));
        File f = new File("1");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
        System.out.println(f.mkdirs());

        File f1 = new File("e:\\1");
        System.out.println(f1.exists());
    }
}
