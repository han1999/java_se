package com.cskaoyan.javase.exception._6finally;

/**
 * @description: finally代码块的变形
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * try...catch变形
 * try...catch...finally
 * try...catch...
 * try...catch...catch...
 * try...catch...catch...finally
 * 以上都是常见形式
 * try...finally
 *      用于那些不想捕获异常，而希望能够抛出异常给上层处理的时候
 *      在finally代码块当中放一些必须要执行的代码
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test() throws Exception {
        try {
            //System.out.println(10/0);
            throw new Exception();
        } finally {
            System.out.println("这是必须要执行的代码！");
        }
    }
}
