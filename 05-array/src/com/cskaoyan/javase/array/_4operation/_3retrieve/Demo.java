package com.cskaoyan.javase.array._4operation._3retrieve;

/**
 * @description: 数组元素的查找
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * CRUD工程师: java"高级"开发工程师,指的是做一些基本的增删改查业务的程序员
 * C: create,增加,创建
 * R: retrieve,搜索,检索
 * U: update,更新
 * D: delete,删除
 *
 *
 * 数组元素的查找规则:
 *      查找数组中某个元素,如果查找到了,返回它的下标,如果没找到,返回-1
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 12, 321, 3, 32, 4, 345, 45, 4565, 1, 23, 123, 1, 23423, 213};
        System.out.println(retrieveTargetValueLastByIntArray(arr, 1));
        System.out.println(retrieveTargetValueFirstByIntArray(arr, 1));
    }

    //查找元素,最后一次出现位置的下标
    public static int retrieveTargetValueLastByIntArray(int[] arr, int target) {
        //预先定义一个变量,用来存储要返回的下标,它应该有一个初始值,初始值是-1
        int targetIndex = -1;
        //遍历该数组
        for (int i = 0; i < arr.length; i++) {
            //逐一比对元素
            if (arr[i] == target) {
                //找到了目标元素
                targetIndex = i;
            }
        }
        //Variable 'targetIndex' might not have been initialized
        return targetIndex;
    }

    //查找元素,第一次出现位置的下标
    public static int retrieveTargetValueFirstByIntArray(int[] arr, int target) {
        //预先定义一个变量,用来存储要返回的下标,它应该有一个初始值,初始值是-1
        int targetIndex = -1;
        //遍历该数组
        for (int i = 0; i < arr.length; i++) {
            //逐一比对元素
            if (arr[i] == target) {
                //找到了目标元素
                targetIndex = i;
                //因为是要找第一次出现元素的下标,所以只要找到,直接结束循环
                break;
            }
        }
        //Variable 'targetIndex' might not have been initialized
        return targetIndex;
    }
}
