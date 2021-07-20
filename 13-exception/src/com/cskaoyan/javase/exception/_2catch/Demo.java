package com.cskaoyan.javase.exception._2catch;

/**
 * @description: 捕获异常, 自己处理
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
 *      2，try代码块当中会产生几个异常？
 *          try代码块当中运行到会产生异常的代码行,后面的代码都不会继续运行了
 *          所以try当中无论可能产生多少个异常,最终都只可能产生一个异常
 *
 *      3,我们在一个catch分支当中,可以同时处理多个异常
 *          语法:
 *          catch(要捕捉的异常类型1 | 要捕捉的异常对类型2 | 要捕捉的异常类型3 对象名...){
 *          }
 *          注意: 每个分隔符"|"之间写的都是异常的类型,最后才需要写一个对象名
 *                "|"不是逻辑运算符或,更不能用短路的
 * 注意事项:
 *      - try...catch会显著的影响代码结构，严重影响代码可读性
 *   - 所以应该把尽量少的代码放入try中，最好是产生异常的那一行代码
 * - 如果catch不能匹配异常对象，那么不会执行catch代码块中的内容
 * - 只有当try代码块中产生了异常，catch才有机会执行，没有异常不执行，不匹配也不执行
 * - 当实在不清楚异常的种类时，可以使用Exception接收（但实际上这是偷懒程序员的借口）
 * - **try代码块中某个位置产生了异常，那么try中的代码就不继续执行了**
 *   - 也就是说try当中要么不产生异常，要么**只会产生一个异常**
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("before");
        int[] arr;
        try {
            //System.out.println(10/0);
            //System.out.println("try after");
            arr = null;
            //System.out.println(arr.length);
            arr = new int[3];
            //System.out.println(arr[3]);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("try代码块中发生了异常,被我逮住了");
        }
        System.out.println("after");
    }
}
