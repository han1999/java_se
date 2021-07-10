package com.cskaoyan.javase.oop1._9static._2compare;

/**
 * @description: 静态成员和普通成员比较
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 比较静态成员变量和普通成员变量
 * 从以下四个角度
 * - 所属不同
 *  普通成员变量： 属于对象的
 *  静态成员变量： 属于类的，属于全体对象共享
 *
 * - 在内存中的位置不同
 * 普通成员变量： 堆上的对象中
 * 静态成员变量: (不用过于考究位置)反正不在某个对象中，也不属于某个对象，而是被共享
 *
 * - 在内存中出现时间不同
 * 普通成员变量： 必须要创建对象
 * 静态成员变量： 不依赖于创建对象，只需要进行类加载就存在
 *
 * - 调用方式不同
 * 普通成员变量： 对象名点
 * 静态成员变量： 类名点，但是也可以使用对象名点（不推荐）
 *
 * 成员方法的区别也类似
 *
 */
public class Demo {
    public static void main(String[] args) {

    }
}
