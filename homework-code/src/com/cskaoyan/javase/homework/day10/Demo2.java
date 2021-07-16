package com.cskaoyan.javase.homework.day10;

import jdk.nashorn.internal.objects.NativeNumber;

/**
 * @description: 方法重写中返回值兼容问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 基本数据类型和void必须保持一致
 * 引用数据类型,父类方法返回父类,子类方法可以返回子类
 *      当然一般情况,最好还是保持相同
 *
 */
public class Demo2 {
}
class Father{
    public A1 test(){
        return null;
    }
}
class Son extends Father{
    @Override
    public A1Son test() {
        return null;
    }
}
class A1{}
class A1Son extends A1{}
