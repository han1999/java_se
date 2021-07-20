package com.cskaoyan.javase.exception._5throw;

/**
 * @description: throw关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在很多时候，我们不满于在方法声明中声明要抛出的异常的类型，我们想要直接在方法内部抛出异常,需要使用throw关键字
 * throw关键字的使用:
 *      它必须在方法体当中去使用,表示在方法的某行确定的抛出一个异常对象
 * 语法:
 *      throw 异常对象;
 * 异常对象怎么获取?
 *      使用构造器,可以使用无参的,也可以使用带String参数的
 *
 * 使用说明:
 *      1,当代码执行到throw行时,就会明确的一定的抛出一个异常对象
 *          如果你对这个throw语句做try..catch处理,那么它就不会被抛出方法外,但是这种做法显然很奇怪
 *          所以一般throw异常对象,都不会去try...catch它,而是希望它能够抛给方法的调用者
 *              a,如果该异常是运行时异常,那么无需做任何操作,它会自动抛出去
 *              b,如果该异常是编译时异常,那么应该配合throws关键字在方法声明抛出该异常
 *                  同样的,这个时候方法的调用者在调用它时,因为该方法可能抛出编译时异常,需要显式处理它
 *      2,方法中一旦使用throw在某行抛出一个异常,那么后面的代码都不可能执行了
 *           所以throw后面是不能写任何代码,这一点和return相似
 *           throw抛出异常在方法当中也可以替代return的作用
 *
 *      3,异常的对象当中只装了异常的相关信息,但是异常何时被抛出,怎么被处理都是程序员写代码去控制的
 *          不是由异常对象决定的
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*try {
            testThrow();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

        int[] arr = {1,2,3,4};
        //arr = new int[0];
        arr = null;
        try {
            System.out.println(getMax(arr));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("程序继续执行");
    }

    public static void testThrow() throws CloneNotSupportedException {
        /*try {
            throw new RuntimeException("我想抛出运行时异常");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }*/
        //throw new RuntimeException("我想抛出运行时异常");
        throw new CloneNotSupportedException("我想抛出编译时异常");
        //System.out.println();
    }

    //利用throw抛出异常,方法不会继续执行,相当于return的特点,所以在很多不太清楚返回什么值时,可以考虑抛出异常来结束方法
    //求数组当中的最大值
    public static int getMax(int[] arr){
        //如果方法传入的数组长度为0或者是null时,不太好给出一个返回值,这里可以抛出异常来终止方法,替代return
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("你给的数组不行,请换一个!");
        }

        int maxValue = arr[0];
        for (int a : arr) {
            if (a > maxValue){
                maxValue = a;
            }
        }
        return maxValue;
    }
}
