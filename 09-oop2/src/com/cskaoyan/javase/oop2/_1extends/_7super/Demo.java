package com.cskaoyan.javase.oop2._1extends._7super;

/**
 * @description: super关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * super关键字表示一个引用,指向子类对象当中那片父类的成员区域
 * 于是super可以近似的看成指向了一个父类对象
 * 所以super可以用来在子类的成员方法中,去调用父类的方法,访问父类的成员变量
 * 或者调用父类的构造器
 *
 * 以上,this和super的使用实际上并无多大区别,无非就是一个指向自身对象, 一个指向父类对象
 * 说一下两个区别:
 *      1,this指向当前对象,表示的是在类自身当中,所以它不受访问权限限制
 *          但是super表示在子类中指向父类对象,受访问权限限制
 *
 *      2,super有自己比较独特的用途,比如说父子类当中出现了同名的成员
 *          此时,在子类中如果直接访问该同名成员,结果肯定是子类成员
 *          这时,如果想要访问父类的同名成员,就需要使用super关键字
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Son s = new Son();
        s.test(300);
    }
}
class Father{
    private int fatherVar;
    int a = 200;
}
class Son extends Father{
   private int sonVar;
   int a = 100;
    public void test(int a){
        //System.out.println(super.fatherVar);
        System.out.println(a); //因为就近原则,a肯定是局部变量的a
        //想要访问自身成员a
        System.out.println(this.a);
        //想要访问父类成员a
        System.out.println(super.a);
    }
}