package com.cskaoyan.javase.oop1._5constructor;

/**
 * @description: 构造器
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 引例
 * > 创建一个教师类，有课程和年龄两个属性，行为是可以上课
 * - 思考一下，我们给成员变量赋值的语句，是不是显得冗余？
 * - 怎么改进？
 * - 对象的属性，能不能"出厂"的时候就设定好呢？
 *
 * 我们思考以下方式:
 *      方式一: 显式赋值,直接在定义类时给出初始值
 *          这种方式虽然创建出来的对象,它的属性值不是默认值,但还是一个固定的值,该方法不够灵活
 *
 *       方式二: 使用构造器给成员变量赋值
 *
 * 使用构造器给成员变量赋值
 *      语法:
 *      [访问权限修饰符] 类名(参数){
 * 	        //方法体
 *      }
 *      注意事项:
 *      1,构造器也叫做构造方法,它不是一个普通的方法,它没有返回值类型,类名可以当成它的方法名
 *          它的名字固定为当前类的类名,必须保持完全一致
 *      2,构造器是不能直接去调用的,它也不是给程序员去调用的,它是由JVM在创建对象的过程中自动去调用的
 *          JVM调用构造方法是为了给成员变量赋值
 *      3,我们虽然不能直接调用构造方法,但是我们可以告诉JVM使用哪个构造器去创建对象
 *          指示JVM使用构造方法的语法:
 *              new 该类类名(实参);
 *          JVM会根据实参的数据类型去选择相应的构造方法
 *
 *      4,我们经常使用的new 类名()表示让JVM通过类的无参构造方法去创建对象.当一个类当中,没有任何构造方法提供时,默认会提供无参构造方法
 *
 *      5,构造方法也是方法,它们之间也是可以构成方法重载的,所以一个类中可以有多个构造方法
 *      而无参构造方法因为没有传参,所以无法赋值,所以想要能够给成员变量赋值,需要有参的构造方法
 *
 *      6,构造方法中同样隐含this传参,可以使用this去访问成员变量和方法
 *      一般来说构造器就是为了给成员变量赋值的,所以很少在构造器中调用成员方法
 *
 *      7,在java当中,如果一个类有任何一个构造方法,那么默认提供的无参构造就不会再提供了
 *      要求: 以后大家定义一个类,只要是这个类需要创建对象,建议先提供默认的无参构造方法(原因后面再讲)
 *      快捷键自动生成构造方法
 *      快捷键 alt + insert
 *      这种使用快捷键自动生成的构造方法,我们称之为"标准格式构造方法"
 *
 *      8,给成员变量赋值的方式多种多样,我们已经学过
 *          1,默认初始化,具有默认值
 *          2,显式赋值
 *      在以上两步中,默认初始化是永远的第一步,只要对象的结构存在于内存中,默认值就被赋值了
 *      现在我们又学习了构造器赋值
 *      构造器赋值是永远的最后一步,只要是标准格式书写的构造器,那么得到对象的属性取值一定是构造器中传入的实参的取值
 *      我们称之为"永远可以相信的构造器"
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*Teacher t1 = new Teacher();
        t1.age = 18;
        t1.course = "Java";

        Teacher t2 = new Teacher();
        t2.age = 28;
        t2.course = "C++";*/

        //使用age单参数构造器创建对象
        /*Teacher t1 = new Teacher(18);
        System.out.println(t1.age);
        Teacher t2 = new Teacher();*/

        Teacher t = new Teacher("Java", 18);
        System.out.println(t.course);
        System.out.println(t.age);

    }
}

class Teacher {
    //属性: 课程,年龄
    String course = "数学";
    int age = 48;

    //行为: 上课
    public void teach() {
        System.out.println("老师在上课!");
    }

    /*//默认无参构造方法
    public Teacher(){
    }

    //有参构造方法: 单独给age赋值
    public Teacher(int age){
        //方法当中需要给成员变量age赋值
        //构造方法中同样有this传参
        this.age = age;
    }*/

    public Teacher() {
    }

    public Teacher(int age) {
        this.age = age;
    }

    public Teacher(String course) {
        this.course = course;
    }

    public Teacher(String course, int age) {
        this.course = course;
        this.age = age;
    }
}