package com.cskaoyan.javase.object._6clone;

/**
 * @description: 深度克隆练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 深度克隆练习
 * - 现在有三个类 FirstLevel 、SecondLevel 、ThirdLevel
 * - FirstLevel 类有三个属性
 *     int firstIntValue;
 *     double firstDoubleValue;
 *     SecondLevel second;
 *
 * - SecondLevel 类有三个属性
 *     int secondIntValue;
 *     double secondDoubleValue;
 *     ThirdLevel third;
 *
 * - ThirdLevel 类有两个属性
 *     int thirdIntValue;
 *     double thirdDoubleValue;
 *
 */
public class Demo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        FirstLevel first = new FirstLevel(1, 2, new SecondLevel(10, 20, new ThirdLevel(100, 200)));
        FirstLevel cloneFirst = first.clone();
        System.out.println(cloneFirst == first);


        System.out.println(cloneFirst.second);
        System.out.println(first.second);

        System.out.println(cloneFirst.second.third);
        System.out.println(first.second.third);
    }
}

class FirstLevel implements Cloneable {
    int firstIntValue;
    double firstDoubleValue;
    SecondLevel second;

    public FirstLevel() {
    }

    public FirstLevel(int firstIntValue, double firstDoubleValue, SecondLevel second) {
        this.firstIntValue = firstIntValue;
        this.firstDoubleValue = firstDoubleValue;
        this.second = second;
    }

    @Override
    protected FirstLevel clone() throws CloneNotSupportedException {
        FirstLevel cloneFirst = (FirstLevel) super.clone();
        SecondLevel cloneSecond = cloneFirst.second.clone();
        cloneFirst.second = cloneSecond;
        return cloneFirst;
    }
}

class SecondLevel implements Cloneable{
    int secondIntValue;
    double secondDoubleValue;
    ThirdLevel third;

    public SecondLevel() {
    }

    public SecondLevel(int secondIntValue, double secondDoubleValue, ThirdLevel third) {
        this.secondIntValue = secondIntValue;
        this.secondDoubleValue = secondDoubleValue;
        this.third = third;
    }

    @Override
    protected SecondLevel clone() throws CloneNotSupportedException {
        SecondLevel cloneSecond = (SecondLevel) super.clone();
        cloneSecond.third = cloneSecond.third.clone();
        return cloneSecond;
    }
}

class ThirdLevel implements Cloneable{
    int thirdIntValue;
    double thirdDoubleValue;

    public ThirdLevel() {
    }

    public ThirdLevel(int thirdIntValue, double thirdDoubleValue) {
        this.thirdIntValue = thirdIntValue;
        this.thirdDoubleValue = thirdDoubleValue;
    }

    @Override
    protected ThirdLevel clone() throws CloneNotSupportedException {
        return ((ThirdLevel) super.clone());
    }
}