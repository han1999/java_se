package com.cskaoyan.javase.exception._4throws;

/**
 * @description: throws关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * throws表示抛出的意思
 * throws关键字在方法的声明中使用,表示方法抛出异常的可能性
 * 语法:
 *      方法名(形参列表) throws 异常列表{
 *      }
 * 解释:
 *      1,异常列表表示方法可能产生的异常的种类,既然是可能产生,它就可能不止产生一种,所以可以写多个
 *             其次它仅仅表示可能性,不是真的要产生,所以它的格式是:
 *             异常类名1,异常类名2,异常类名3......
 *             无需写对象名
 *      2,当方法使用throws表示抛出运行时异常的可能性时,对方法的调用有没有影响?
 *             是没有影响的
 *        实际上使用throws在方法声明中抛出运行时异常是没有必要的,因为运行时异常不做任何处理就会自己抛出,无需你写出
 *      3,方法使用throws表示抛出编译时的可能性时,对方法的调用有无影响?
 *          有影响,必须在方法的调用处显式处理它,这是编译时异常的一大特点
 *      4,throws既然表示抛出异常的可能性,那么到底方法是否抛出异常,是由什么决定的?
 *          是由方法中代码的执行结果决定的
 *
 * 注意事项:
 *  运行时异常会自动向上抛出，不用我们手动throws
 *     我们只需要手动throws编译时异常
 * - 如果方法抛出一个编译时异常，可以在语法层面，强制要求方法调用者处理该异常
 *
 * - 异常列表可以是多个异常类，但是注意用逗号隔开
 * - 列表中出现的异常如果有父子关系，那么编译器只会强制要求处理父类
 *   - 所以尽量抛出同级别的异常
 *
 */
public class Demo implements Cloneable {
    public static void main(String[] args)  {
        testThrowsRuntime();
        /*try {
            testThrowsChecked();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/
        try {
            testThrowsChecked();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
    }

    public static void testThrowsRuntime() throws NullPointerException,ArrayIndexOutOfBoundsException,ArithmeticException{
        System.out.println("hello world!");
    }

    public static void testThrowsChecked() throws Exception {
        Demo d = new Demo();
        d.clone();
    }
}
