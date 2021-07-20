package com.cskaoyan.javase.exception._1default;

/**
 * @description: 异常默认处理机制
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 首先明确两点:
 *      1,异常的默认处理指的是当程序发现异常,不写任何异常处理相关的代码,程序的默认处理机制
 *      2,异常的默认处理机制指的是运行时异常,编译时异常需要程序员手动处理它,没有默认机制
 *
 *  在方法当中产生运行时异常,默认会往上抛出,直到抛给jvm,jvm的默认处理是:
 *      在控制台打印异常的信息,还会终止程序执行
 *
 *  - 如果错误产生在main方法中
 *   - 当我们的代码执行到错误行数之前，代码是正常执行的
 *   - 当我们的代码执行到错误行数时，JVM会终止程序的执行，抛出一个该异常信息封装成的对象
 *   - 将该对象中的异常信息，打印到控制台上，告诉程序员发生了什么问题
 *   - 发生错误之后的语句，都不执行了
 * - 如果错误产生在main方法当中的另一个方法中
 *   - 当程序执行到该方法的错误行数时，JVM会终止程序的执行
 *     - 向上给方法的调用者抛出一个该异常信息封装成的对象
 *   - 一直向上抛出，直到抛给main方法，main方法最终抛给JVM
 *   - 发生异常之前的语句正常执行，但是之后的语句都不执行了
 *
 *显然默认的异常处理机制会导致程序终止报错,很多时候不是我们想要的,我们需要学习手动的异常处理方式
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("before");
        test();
        System.out.println("after");
    }

    private static void test() {
        System.out.println("before");
        test2();
        System.out.println("after");
    }

    private static void test2() {
        System.out.println("before");
        test3();
        System.out.println("after");
    }

    private static void test3() {
        System.out.println("before");
        System.out.println(10 / 0);
        System.out.println("after");
    }
}
