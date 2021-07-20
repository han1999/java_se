package com.cskaoyan.javase.exception._2catch;

/**
 * @description: 捕获异常,自己处理
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在java当中捕获异常,处理异常,需要使用try...catch代码块
 * 语法:
 *      try {
 *      //可能出现异常的，正常的代码逻辑
 * } catch(要捕捉的异常对象) {
 *      //每一个catch分支对应一个异常处理器
 *      //在catch分支中处理具体类型的代码异常
 * }
 * 以上单分支的try..catch,是最基本的异常处理方式,它会捕获程序中产生的异常,然后做相应的处理
 * 逐一解释:
 *      1,try代码块当中用来装"可能出现异常的，正常的代码逻辑"
 *      2,catch代码块也称之为"异常处理器",它用来捕获try代码块当中可能产生的异常,捕获成功后,会执行代码块中代码
 *      3,try..catch两个代码块结构都属于局部位置,在其中定义变量都属于局部变量
 *      4,catch小括号当中写需要捕获的异常对象,并且该对象可能在代码块中使用
 *          所以它的语法是:  要捕获异常的类型(类名) 异常对象名
 *      5,当异常被捕获然后在异常处理器处理后,就不会抛给JVM了,程序就不会终止执行了,程序仍然能够正常运行
 *
 * 注意事项:
 *      1,try当中的代码产生的异常必须和catch当中写的异常能够匹配上,不然不会执行catch代码块中的代码
 *          那么程序仍然对异常做默认处理,终止程序,打印报错信息
 *      什么叫匹配上?必须是完全一样吗?
 *          不是必须完全一样,1,可以是同种类型对象,2,也可以是子类对象
 *          但是我们最好根据不同的异常,做不同的处理,尽量不要在catch当中写一个大而宽泛的父类异常
 *
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("before");
        try {
            //System.out.println(10/0);
            int[] arr;
            arr = null;
            System.out.println(arr.length);
        }catch (Throwable e){
            System.out.println("try代码块中发生了算术异常,被我逮住了");
        }
        System.out.println("after");
    }
}
