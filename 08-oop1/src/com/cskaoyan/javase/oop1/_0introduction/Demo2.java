package com.cskaoyan.javase.oop1._0introduction;

/**
 * @description: 如何定义对象的模板--类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 *
 * 定义学生类
 *     分析学生类中的属性和行为，根据学生类的属性和行为来定义学生类。
 * 创建学生类对象，给属性赋值，并调用成员方法
 *
 * 类定义的语法:
 * [各种修饰符] class 类名{
 * }
 * 各种修饰符是全部可以省略的,可以完全不写任何修饰符
 * 一个Java文件中,只能定义一个public修饰的类,并且这个类的类名也要和java文件的名字一样
 * 但是非public修饰的类,可以随意定义在一个java文件中,不限制个数
 * 非public修饰的类,和public修饰的类属于同包的关系,同包下不能定义同名的class
 * 约定:
 *      在正常的java开发中,比较少见在一个java文件中定义多个class
 *      但是为了上课方便,我们会频繁的在一个类中定义多个class
 *      我们一般把Demo类当成一个测试的类
 *
 * 类的命名要遵循大驼峰式的规范,并且最好见名知意
 *
 * 在一个类中,怎么描述对象的属性和行为的共性呢?
 * 语法:
 *      在一个类中,我们使用"成员变量"来描述对象的共性属性特征
 *      在一个类中,我们使用"成员方法"来描述对象的行为共性特征
 *
 * 什么叫成员变量?
 *      类比于局部变量是定义在方法等局部位置的变量,于是成员变量就是指定义在成员位置的变量
 *      成员位置: 指的是在类体中,除开方法等局部位置的位置
 *      语法:
 *          [各种修饰符] 数据类型 变量名;
 *      注: 修饰符我们还没有学习,所以这里我们直接省略掉
 *
 * 什么叫成员方法?
 *      定义在成员位置方法,称之为成员方法.我们今天学习的成员方法,应该称之为普通成员方法
 *      它没有static修饰
 *      语法:
 *          [访问权限修饰符] 返回值类型 方法名(形参列表){
 *              //方法体
 *          }
 *      访问权限修饰符是可以省略的,这里先默认是public
 *
 *  以上,我们定义完一个类,那么这个类就是创建Student对象的模板
 *  创建对象的语法:
 *      类名 对象名 = _1new 类名();
 *  创建对象的位置:
 *      在权限允许的位置,可以用上述语法创建对象
 *      一般来说,我们都是在方法中创建对象,比如main方法
 *  对象创建后,访问成员变量和方法的语法:
 *      (访问权限允许的情况下)直接用对象名点访问
 *
 * > 注意事项
 * - **类可以嵌套定义叫做内部类**，但是现在不要这么做，一个Java文件中定义多个class应该并列而不是包含
 * - 一个Java文件中的多个class是同包（文件夹）关系
 * - 一个类当中，应该开门见山的定义成员变量，而后再写成员方法
 * - 类中没有的属性和行为，对象是不可能有的，类是模板，模板中有才能创建出来
 * - 使用new关键字就会创建新的对象，两条new语句创建的对象是完全独立的
 *
 */

//测试类
public class Demo2 {
    public static void main(String[] args) {
        //局部位置
        //要想使用Student类中定义的成员变量和方法,必须要创建它的对象,不能直接使用
        //类名 对象名 = _1new 类名();
        Student s = new Student();
        System.out.println(s.age); //0
        System.out.println(s.name); //null
        s.sleep();
        s.study();
        s.age = 18;
        s.name = "张三";
        System.out.println(s.age); //18
        System.out.println(s.name); //张三

        //com.cskaoyan.javase.oop1._0introduction.Student@1540e19d
        //全限定类名+十六进制的地址值
        System.out.println(s);

        Student s2 = new Student();
        System.out.println(s2);

        //class B{}

    }
    //成员位置
    /*public static void test(){
    }*/

    //class A{}
}

class Student {
    //定义成员变量描述全体学生对象的共性属性特征
    //学号,姓名,年龄
    int stuId;
    String name;
    int age;

    //定义成员方法描述全体学生对象的共性行为
    //睡觉,学习
    public void sleep() {
        System.out.println("我除了学习,就是睡觉(多数时间在学习!)");
    }

    public void study() {
        System.out.println("你是怎么睡得着的?");
    }
}
