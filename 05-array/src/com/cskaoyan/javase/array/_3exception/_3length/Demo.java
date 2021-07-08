package com.cskaoyan.javase.array._3exception._3length;

/**
 * @description: 数组长度为0
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 数组长度为0和数组是null以及数组未初始化，有啥区别？
 *
 * 数组长度为0和数组是null可以认为都是经过了初始化的数组,是可以进行操作的(但是可能会出错)
 * 数组未初始化是不能使用,无法进行任何操作
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {};
        int[] arr2 = null;
        int[] arr3;
        //System.out.println(arr[0]);

        System.out.println(arr);
        System.out.println(arr2);
        //System.out.println(arr3);
    }

    //长度为0的数组的使用场景
    //需求: 一个方法,方法的结果可能是1个int值,还可以是2个,还可以是0个
    public static int[] method(int a) {
        //声明一个结果数组
        int[] result;
        if (a > 0) {
            //方法返回一个int数
            result = new int[]{1};
            return result;
        } else if (a == 0) {
            //方法返回两个int数
            result = new int[]{1, 2};
            return result;
        }else {
            //方法返回0个数,方法的返回值是空的
            //1,返回为null的数组
            //return null;
            //2,返回长度为0的数组
            return new int[]{};
        }
    }
}
