package com.cskaoyan.javase.oop1._9static._4notice;

/**
 * @description: static的注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 一个类中，静态方法无法直接调用非静态的方法和属性，也不能使用this，super关键字
 *   - 经典错误：Non-static field/method xxx cannot be referenced from a static context
 *   - 原因：静态方法调用的时候，可能还没有对象，直接访问属于对象的成员变量和成员方法显然不合适
 *
 * - 反过来，一个非静态的方法，可以访问静态的成员
 *   - 因为有对象的时候，一定有静态成员
 *   - 建议采用这种访问形式的时候，使用类名.变量名的形式访问，以示区别，增加代码可读性
 *
 * - 只存在静态成员变量，不存在“静态局部变量”
 *   - 局部变量只有在调用的时候才有意义
 *   - 而静态变量在类加载时就初始化，就存在了
 *   - 如果我一直不调用这个方法，这个“静态局部变量”就一直占着空间，没有意义
 * - 静态方法是类所有，那么静态方法的局部变量就也是类所有，为什么静态方法中也不能有静态局部变量？
 *   - 局部变量一定是方法所有
 *   - 静态方法也是方法，不调用其中的局部变量也没意义
 *
 * - 静态成员变量不建议用构造方法赋值
 * - 普遍来说，访问静态成员，都建议加上类名去访问，提升代码可读性
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //Modifier 'static' not allowed here
        //Modifier 'public' not allowed here
        int a = 10;
    }
}

class A {
    static int a;
    int b;

    public void test() {
        System.out.println(A.a);
        System.out.println(this.b);
    }
}