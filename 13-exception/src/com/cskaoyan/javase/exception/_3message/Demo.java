package com.cskaoyan.javase.exception._3message;

/**
 * @description: 通过异常对象获取异常的信息
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 要想使用异常的成员方法,首先需要异常的对象,怎么获取异常对象?
 *      1,使用try...catch捕获异常对象
 *      2,使用异常类的构造器创建对象
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*try {
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            ////获取异常信息，返回字符串。打印的实际上是异常产生的原因
            //（不使用）String getMessage()
            System.out.println(ae.getMessage());

            ////获取异常类名和异常信息，返回字符串。 打印的是异常产生的原因和所在类
            //（不使用）String toString()
            System.out.println(ae.toString());

            ////获取异常类名和异常信息，以及异常出现在程序中的位置
            //（推荐使用）void printStackTrace()
            ae.printStackTrace();

            //日志的打印和管理有相应的框架辅助
            ////使用IO流，将异常内容保存在日志文件中，以便查阅，早已过时，了解即可
            //（过时的日志处理方式）printStackTrace(PrintStream s)
        }*/

        /*ArithmeticException ae = new ArithmeticException();
        ae.printStackTrace();
        ArithmeticException ae2 = new ArithmeticException("我是马化腾");
        ae2.printStackTrace();*/

        //快捷键生成try...catch
        //alt + ctrl + t 表示生成包裹选中代码的一些结构,包括try..catch if for
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("hello world");
    }
}
