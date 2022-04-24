package com.cskaoyan.javase.oop2._0encapsulate._0introduction;

/**
 * @description: 封装的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/



/**
 * 所谓封装即是，隐藏对象中属性和一些实现细节，仅对外提供公共的访问方法
 * - 广义的说类也是一种封装，指将数据和基于数据的操作封装在一起
 * - 狭义的封装则是指借助访问权限控制符，将数据和数据操作(成员变量和成员方法)保护在内部的一种技术
 *   - 此时系统的其他部分只有通过在数据外面的被授权的操作才能够进行交互(私有的成员无法访问了,只有有权限的方法才能访问)
 *
 *  封装的好处:
 *   1,封装的目的是将类的使用者和设计者分开
 * - 2,在面向对象的编程中，用类来封装相关的数据和方法，保证了数据的安全和系统的严密性
 *
 * 思考:
 *      在我们之前写的代码中,我们没有用访问权限去控制成员变量的访问,会有什么问题?
 *          1,没有权限控制,成员可能被不应该访问的类去访问
 *          2,普通情况的访问和修改的形式过于简陋，没有办法做任何处理
 *                  可能用户会设置不合法的数据
 *                  希望用户能够看到应该看的内容
 *
 * 应对以上问题,需要作出一定的修改:
 *          1,既然没有权限控制,那就加上权限控制,直接全部私有化,但是这样外部正常情况下都不能访问这些私有成员了
 *          2,为了让那些能够被外界访问的成员被访问,所以需要提供访问的手段(访问的方法)
 *          3,为了让那些需要在外界修改的成员变量能够被修改,所以需要提供修改的手段(修改的方法)
 *          4,2和3当中修改方法和访问方法在java当中被称之为getter/setter方法
 *              它们是用来给私有化的成员变量访问/赋值用的
 *
 * 思考:
 *      为什么要好好的.私有化成员变量,然后又提供公共的getter/setter方法?
 *          1,私有化成员变量是为了实现封装,隐藏实现细节,对于那些绝对不需要给外界看的成员变量,我们不需要提供getter/setter方法,外界能否访问主动权在程序员手中
 *          2,私有化后,提供的getter/setter方法,我们是可以控制变量的访问和赋值的
 *          3,私有化后,提供getter/setter方法,把变量的赋值和访问分开了
 *
 * 注意事项:
 *      - 静态成员变量，基本和普通成员变量没有区别，但是要注意get、set方法也要是静态的
 *      //hx： 其实呢， 按照普通方法定义也行， 但是不符合逻辑， 语法上是没问题的， 而且idea自动生成的
 *      默认给静态成员变量的getter， setter方法都是public static修饰的。
 *
 * - 封装成员变量后，给成员变量赋值的方式改变了，我们今后基本只有这种方式了
 *   - 无参构造方法创建对象后，set方法逐一赋值
 *   - 有参构造
 *   - 对象名点的形式一般都是不可用的了
 */
public class Demo {
    public static void main(String[] args) {
        /*Student s = _1new Student("张三", 0, 18);
        System.out.println(s.getName());
        s.setAge(28);
        System.out.println(s.getAge());*/
        Student s = new Student();
        s.setAge(24);
//        s.setA("bg");
//        System.out.println("s.getA() = " + s.getA());
        System.out.println(s.getAge());
    }
}

class Student {
    private String name;
    private double score;
    private int age;
    private static String a;

    public static String getA() {
        return a;
    }

    public static void setA(String a) {
        Student.a = a;
    }

    //提供name的访问方法
    public String getName() {
        return this.name;
    }

    //需要修改年龄,提供修改age的方法
    public void setAge(int age) {
        //控制年龄的设置 1~125
        if (age < 1 || age > 125) {
            System.out.println("你不是人!");
            return;
        }
        this.age = age;
    }

    //提供访问age的方法
    public int getAge() {
        //需求: 不管别人怎么看,我永远18岁
        return 18;
    }

    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public Student() {
    }
}
