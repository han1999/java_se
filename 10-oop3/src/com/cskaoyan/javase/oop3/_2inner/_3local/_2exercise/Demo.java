package com.cskaoyan.javase.oop3._2inner._3local._2exercise;

/**
 * @description: 局部内部类的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 局部内部类的经典使用:
 *      1,用局部内部类创建方法的实参对象
 *      2,用局部内部类创建方法返回值的对象
 *
 *  以上两种情况是局部内部类非常典型的使用场景
 *      优点:
 *          1,绝对封装,绝对隐藏,对外部不可见
 *          2,代码要稍微简洁一点点(不多)
 *              后续匿名内部类和lambda都会更进一步简化代码
 *              匿名内部类和lambda表达式是特殊的,简化的局部内部类
 *      缺点:
 *          仅在方法内部生效,如果有多处使用该对象的需求,那么就会让代码变得更麻烦,得不偿失
 *
 *  总结: 局部内部类适合在需要隐藏类实现且仅在方法内部使用的场景
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //method(new A());
        //这里调用method方法时,我希望不仅仅直接使用A对象,而是希望传入它的子类对象,然后重写test方法
        //method(new ASon());
        //使用局部内部类隐藏该A的子类,实现功能
        /*class ASon extends A{
            @Override
            public void test() {
                System.out.println("我是局部内部类,我隐藏了自己");
            }
        }
        method(new ASon());*/
        method().test();
    }
    public static void method(A a){
        a.test();
    }

    public static AbstractA method(){
        //该方法需要返回抽象类的子类对象
        //使用局部内部类隐藏该子类
        class AbstractASon extends AbstractA{
            @Override
            void test() {
                System.out.println("我是局部内部类的写法");
            }
        }
        return new AbstractASon();
    }
}
class A{
    public void test(){
        System.out.println("A");
    }
}
//朴素的办法,最古老的办法
class ASon extends A{
    @Override
    public void test() {
        System.out.println("ASon");
    }
}
abstract class AbstractA{
    abstract void test();
}
//朴素的办法,最古老的办法
class AbstractASon extends AbstractA{
    @Override
    void test() {
        System.out.println("我是朴素的做法");
    }
}