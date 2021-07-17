package com.cskaoyan.javase.oop3._3anonymous._3usecase;

/**
 * @description: 匿名内部类的使用场景
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 作为方法的实际参数
 *   - 学习多态的时候我们曾经讲过，可以将父类作为形式参数，而将子类作为实际参数在方法调用的时候传入
 *   - 匿名内部类的匿名对象就是一个子类匿名对象，所以，可以使用匿名内部类改进以前的做法
 * - 在方法体中，作为方法的返回值
 *   - 方法体中，return 返回值只会执行一次，如果方法返回一个接口类型的对象，我们也可以使用匿名内部类
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        test(new IA() {
            @Override
            public void method() {
                System.out.println("我很高端");
            }
        });
    }
    public static void test(IA a){
        a.method();
    }
}
interface IA{
    void method();
}
