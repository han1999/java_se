package com.cskaoyan.javase.exception._2catch;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 需求：单独处理除0异常，但是空指针和下标越界异常一起处理
 *
 */
public class Demo3 {
    public static void main(String[] args) {
        try {

        }catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println();
            //'catch' branch identical to 'ArithmeticException' branch
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
