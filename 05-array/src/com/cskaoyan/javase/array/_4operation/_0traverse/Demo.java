package com.cskaoyan.javase.array._4operation._0traverse;

/**
 * @description: 数组的遍历
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 什么是数组的遍历? 把一个数组的元素从头到尾访问一遍,称之为遍历
 * 怎么去做数组的遍历呢?
 *      使用for循环去做数组的遍历
 *
 * 总结:
 *      写代码不可能是一下子就能够写得很完美的,需要不断地更新,不断地迭代,让代码趋于完善
 *
 */
public class Demo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1, 2, 3};
        //int[] arr2 = {123, 123, 123, 42, 34, 34, 5435, 4654, 6, 435, 2, 5234, 234, 23, 432, 4, 32, 6436, 436, 345};
        /*for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }*/
        /*for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }*/
        //arr = null;
        arr = new int[]{};
        System.out.println(traverseNewVersion5(arr));
    }

    public static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //改进一下：希望所有的元素都打印在一行，并且每个元素之间用逗号隔开
    public static void traverseNewVersion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //判断一下，如果是最后一个元素，就不给它加逗号
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                //循环应该结束
                break;
            }
            System.out.print(arr[i] + "，");
        }
        //System.out.print("\b");
    }

    //改进一下：用中括号包裹所有的元素，表示打印的是一个数组，比如[1,2,3]
    public static void traverseNewVersion2(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //判断一下，如果是最后一个元素，就不给它加逗号
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                //循环应该结束
                break;
            }
            System.out.print(arr[i] + "，");
        }
    }

    //改进一下: 使用程序能够应对用户的null的数组输入
    public static void traverseNewVersion3(int[] arr) {
        if (arr != null) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                //判断一下，如果是最后一个元素，就不给它加逗号
                if (i == arr.length - 1) {
                    System.out.print(arr[i] + "]");
                    //循环应该结束
                    break;
                }
                System.out.print(arr[i] + "，");
            }
        } else {
            //传入的是null数组
            //需要对用户作出友好提示然后结束程序
            System.out.println("您输入的数据有误,请重新输入!");
        }
    }

    //改进一下: 上述判断null的方式显著增加了代码层级,让代码变得更加不好读了.实际上我们完全可以判断数组为null,然后直接结束方法
    //这种判断方法传入的引用数据类型变量是否为null的方式,是很常见的
    public static boolean traverseNewVersion4(int[] arr) {
        //if (arr == null){
        //    System.out.println("您输入的数据有误,请重新输入!");
        //    return;
        //}
        if (arr == null) return nullArrParaMethod();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //判断一下，如果是最后一个元素，就不给它加逗号
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                //循环应该结束
                break;
            }
            System.out.print(arr[i] + "，");
        }
        return true;
    }

    //改进一下: 让方法能够接收长度为0的数组输入
    public static boolean traverseNewVersion5(int[] arr) {
        //if (arr == null){
        //    System.out.println("您输入的数据有误,请重新输入!");
        //    return;
        //}
        if (arr == null) return nullArrParaMethod();
        if (arr.length == 0) return lenth0ArrParaMethod();
            System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //判断一下，如果是最后一个元素，就不给它加逗号
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                //循环应该结束
                break;
            }
            System.out.print(arr[i] + "，");
        }
        return true;
    }

    public static boolean lenth0ArrParaMethod() {
        System.out.println("[]");
        return false;
    }

    public static boolean nullArrParaMethod() {
        System.out.println("您输入的数据有误,请重新输入!");
        return false;
    }

}