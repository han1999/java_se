package com.cskaoyan.javase.array._4operation._1getmax;

/**
 * @description: 获取数组元素中的最值
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 怎么获取数组元素中的最值?
 *  先假设某个元素是最值,然后遍历数组,逐一比较,最终得到数组当中的最值
 *  一般都假设第一个元素
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 213, 234, 435, 54, 2, 435, 64, 55644, 3242, 42};
        System.out.println(getMaxValueByIntArray(arr));
        System.out.println(getMinValueByIntArray(arr));
    }

    //获取数组元素中的最大值
    public static int getMaxValueByIntArray(int[] arr) {
        //先假设第一个元素是最大值
        int maxValue = arr[0];
        //增强for循环遍历数组 iter
        for (int a : arr) {
            if (a > maxValue) {
                maxValue = a;
            }
        }
        return maxValue;
    }

    //获取数组元素的最小值
    public static int getMinValueByIntArray(int[] arr){
        //先假设第一个元素是最小值
        int minValue = arr[0];
        //用for循环遍历数组 arr.fori
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
