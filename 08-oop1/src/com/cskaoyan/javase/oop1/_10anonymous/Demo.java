package com.cskaoyan.javase.oop1._10anonymous;

/**
 * @description: 匿名对象
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 匿名: 也叫佚名,表示没有名字
 * 匿名对象: 没有名字的对象,对于一个对象来说,它的名字就是它的引用
 *      所以在java当中,匿名对象指那些在创建对象时就没有引用指向的对象
 *
 * 匿名对象的作用:
 *      1,作为方法的实参传入
 *      2,作为方法的返回值返回
 *
 * 匿名对象的优点:
 *      1,代码简洁,无需用引用指向
 *      方便省事快捷
 *
 *      2,并且当一个对象没有任何引用指向时,它属于垃圾,
 *      这就意味着它在使用完毕后,立刻就要等待GC回收它
 *      所以理论上这种使用方式内存使用率更高
 *
 * 匿名对象的缺点:
 *      普通对象可以使用多次,但是匿名对象只能用一次
 *      如果有多次使用对象的需求,还是直接用引用接收对象更好
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //Student s = new Student();
        //匿名对象
        //new Student();

        //常规的传入方法的实参方式
        //Student s = new Student();
        //test(s);

        //匿名对象的方式传入实参
        test(new Student());


    }

    public static void test(Student s){
        s.eat();
    }

    public static Student test(){
        return new Student();
    }
}
class Student{
    public void eat(){
        System.out.println("吃吃喝喝玩玩");
    }
}
