package com.cskaoyan.javase.recursion._0introduction;

/**
 * @description: 递归的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 递归:
 * - 我们把方法在运行时调用自身的情况，称之为递归，又叫做递归调用
 *
 * 递归使用的注意事项:
 *      1,要想使用递归,必须调用自身方法
 *          这条调用自身方法的语句,我们称之为"递归体"
 *      2,递归要有出口,没有出口的递归只会栈溢出
 *          递归停止的条件,称之为"递归出口"
 *
 *      3,递归有了出口也不一定是绝对安全的,还需要考虑递归的次数(递归的深度)不能超过栈内存的大小
 *      不然仍然会栈溢出
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //System.out.println(sum(20000));

        /**
         * 分析一下sum方法的执行:
         * sum(10) = 10 + sum(9);
         * sum(9) = 9 + sum(8);
         * sum(8) = 8 + sum(7);
         * ....
         * 显然这个过程是没有办法自己停下来的,那么程序的执行会有以下结果:
         * 1,死循环
         * 2,程序报错,终止
         * 3,电脑炸了
         *
         * 我们运行程序,发现程序终止报错,报错StackOverflowError
         * StackOverflowError: 栈溢出错误
         * 栈溢出,是什么栈溢出? 指的是JVM栈溢出
         * 什么叫溢出? 溢出指的是内存空间不够用,导致程序崩溃
         *
         * Method 'sum()' recurses infinitely, and can only end by throwing an exception: StackOverflowError
         * 方法的调用是要占用栈内存空间的
         *  那么如果仅存在方法的进栈,而不存在方法的出栈
         * 那么终究会有一次方法进栈,栈内存不够用了
         * 这样程序就无法运行了
         * 只能抛出栈溢出错误,然后终止程序
         *
         * 思考:
         *      怎么在递归递归中避免栈溢出错误呢?
         * 需要让递归停下来,让方法栈帧可以出栈,这样就不会栈溢出了
         *
         * 我们把让递归停止下来的条件,称之为"递归的出口"
         *
         *
         */
    }

    //定义一个递归的方法
    public static int sum(int num) {
        //写一个递归的出口
        if (num == 0) {
            return 0;
        }

        //在方法当中去调用方法自身
        return num + sum(num - 1);
    }
}
