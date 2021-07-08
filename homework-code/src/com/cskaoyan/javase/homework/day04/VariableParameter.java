package com.cskaoyan.javase.homework.day04;

/**
 * @description: 可变参数练习题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class VariableParameter {
    public static void main(String[] args) {
        System.out.println(getMaxValue(1, 2, 3, 324, 45, 999,23424,242435,342435));
    }

    public static int getMaxValue(int... values){
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max){
                max = values[i];
            }
        }
        return max;
    }
}
