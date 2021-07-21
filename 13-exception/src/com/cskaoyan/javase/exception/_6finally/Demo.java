package com.cskaoyan.javase.exception._6finally;

/**
 * @description: finally关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * finally是一个关键字,但是它不能单独存在,它表示一个代码块,应该是finally{}格式的
 *      其次finally代码块也不能独立存在
 *      它必须写在try...catch代码块的后面或者try...代码块的后面
 * 最常见的,finally放在try..catch代码块的后面
 *      通过代码测试,我们发现finally代码块在任何情况下都能够正常执行
 *      所以利用finally代码块这种必然执行的特点
 *      finally代码块当中常常写一些无论程序怎么执行,都要执行的代码
 *      最常见的就是把系统资源释放的代码放入finally代码块当中,保证它能够一定执行
 *      比如在I/O当中,网络编程当中
 *
 * > 一些奇思妙想
 * - try代码块如果有return
 *   - 程序会先执行完finally代码块，回过头执行try中的return
 * - catch代码块中如果有return，并且catch正常捕获异常执行
 *   - 程序会先执行完finally代码块后，再回去执行catch中return，从catch代码块中结束方法
 * - finally代码中有return
 *   - 不会影响finally代码块执行
 * - 如果finally和catch中都有return
 *   - 程序会直接从finally代码块中的return结束方法
 * - 如果try中的异常不能正常捕获,但是finally中有return
 *   - **注意此时程序会跳过这个异常，不会抛出异常给JVM报错**
 * - try中的return语句return的是一个方法，但是这个方法又产生了异常
 *   - 自己测试一下
 *
 * 如果真的想让finally不执行，也不是没有办法的，直接退出虚拟机即可
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println("try之前");
        try {
            //System.out.println(10/0);
            //System.exit(0);
            System.out.println(arr.length);
            //System.out.println(10 / 10);
            //return;
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            //return;
        } finally {
            System.out.println("finally代码块执行了!");
            return;
        }
        //System.out.println("finally之后代码");


        /*StackOverflowError se = new StackOverflowError();
        try {
            throw se;
        } catch (Exception error) {
            error.printStackTrace();
        }finally {
            System.out.println("hello world");
            return;
        }*/
    }
}
