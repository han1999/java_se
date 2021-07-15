package com.cskaoyan.javase.oop3._0abstract._1basic;

/**
 * @description: 抽象类的使用特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 *
 * 抽象类的命名: 抽象类也是一个class,所以它的命名首先要遵守大驼峰命名规范,其次很多程序员都喜欢在一个抽象类的前面
 *      加上一个"Abstract",以示区分,表示它是一个抽象类
 *
 * 接下来，我们重点来研究一个抽象类的特点和使用
 * 我们从下面两个角度分析
 * 抽象类的成员:
 * 成员变量:
 *      抽象类当中可以定义普通类当中都能定义的成员变量,包括成员变量,静态成员变量,全局常量等等
 *      这一点抽象类和普通类没有区别
 *
 * 成员方法:
 *      1,普通成员方法: 抽象类当中是可以定义普通成员方法的
 *      抽象类无法创建自身的对象,那么它当中成员方法是无法直接自己使用的,但是可以给子类继承,并在子类中使用
 *      如果你有这样的需求:
 *          需要添加一个方法给所有子类作为一个默认实现,那么抽象类中也是可以添成员方法. 这样子类可以选择直接继承使用这个方法,还可以选择继承后重写该方法,这样选择的权利在子类手里
 *
 *      2,静态成员方法: 抽象类当中是可以定义静态成员方法的
 *          你可以使用抽象类类名点去调用该静态方法,或者用子类类名点去调用也可以
 *          当然,一般很少在抽象类当中定义静态方法
 *
 *      3,抽象类当中是否可以没有抽象方法?
 *          从语法上来说是可以的,但是这样做没有太大意义,普遍来说抽象类就应该有抽象方法
 *       有些程序员会把一个普通类声明为抽象,然后让它不能创建对象,这种做法是不太合适的
 *       抽象类应该作为继承层次的顶层父类,作为一个抽象概念,不建议这么使用
 *       如果有这种需求,建议私有化构造方法
 *
 *      4,抽象方法: 显然抽象类是可以定义抽象方法的
 *          抽象方法: 在父类中声明一个抽象方法,那么继承它的(普通)子类必须实现该方法,所以抽象方法在抽象类当中起到占位作用.子类必须要强制实现它
 *          继承抽象类的子类如果是一个普通类,就必须实现父类当中的全部抽象方法,但是子类如果是一个抽象类,那就无需实现(或者想实现谁就实现谁)
 *
 *      5,思考: abstract关键字在修饰方法时,能否和private、static、final混用？
 *      a，private：私有方法无法被重写，显然抽象方法不重写没有意义，所以不能使用
 *      抽象方法被定义出来就是为了重写的，所以它的权限不仅不要严格，更应该要宽松，普遍应该使用public
 *
 *      b，static：静态方法不能被重写，所以也不能使用
 *      c，final：final方法不能被重写，所以也不难使用
 *
 *  以上总结：抽象类的成员方法只比普通类多一个抽象方法，并且该抽象方法如果不想写是可以不写的
 *
 * 构造方法
 * 思考： 抽象类当中有没有构造方法？
 * 首先抽象类不能创建对象，但是它是有构造方法的
 *
 * 它不能创建对象，要构造方法干嘛？
 * 虽然它自己用不了，但是它有子类，子类对象初始化时，是可以使用这些构造器进行父类属性赋值的
 *
 * 构造代码块和静态代码块：
 *      都是可以有的
 *
 * 这里我说一句话，请大家判断正误：
 *  Java当中的每一个类都一定有构造器（包括普通类和抽象类） 这句话是正确的
 *
 * 抽象类的子类(特点):
 *  抽象类的子类有两种：
 *      1，普通类，必须实现抽象类中的所有抽象方法
 *      2，抽象类，可以允许不实现抽象方法，或者实现某几个都是可以的
 *
 *  思考：
 *      1，我能不能随便找一个类，直接加上abstract声明
 *          不考虑创建对象或者使用对象等等，这是可以的
 *          因为普通类中有的成员，抽象类当中都有
 *
 *      2，抽象类能不能继承一个普通类呢？
 *          语法是可以的，但是一般很少这么用
 *          因为普通类中有的成员，抽象类当中都有
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*AbstractPerson.testStatic();
        Student.testStatic();
        Student s = new Student();
        s.testMember();*/
        Student s = new Student(1, 2, 3);
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(s.age);
    }
}

abstract class AbstractPerson  {
    //在抽象类当中定义成员变量
    int a;
    public int b = 10;
    static int c = 20;
    static final int D = 30;

    //定义普通成员方法
    public void testMember() {
        System.out.println("我是普通成员方法");
    }

    //定义静态成员方法
    public static void testStatic() {
        System.out.println("我是静态成员方法");
    }

    //定义一个抽象方法
    //Illegal combination of modifiers: 'abstract' and 'private'
    //Illegal combination of modifiers: 'abstract' and 'static'
    //Illegal combination of modifiers: 'final' and 'abstract'
    public abstract void testAbstract();
    public abstract void testAbstract2();

    //定义构造方法
    public AbstractPerson() {
    }
    public AbstractPerson(int a, int b) {
        this.a = a;
        this.b = b;
    }


    //定义代码块
    {}
    static {}
}

//Class 'Student' must either be declared abstract or implement abstract method 'testAbstract()' in 'AbstractPerson'
//实现子类的抽象方法
class Student extends AbstractPerson {
    int age;
    @Override
    public void testAbstract() {
        System.out.println("Student实现抽象方法");
    }

    @Override
    public void testAbstract2() {
        System.out.println("Student实现抽象方法2");
    }

    public Student() {
    }

    public Student(int a, int b, int age) {
        super(a, b);
        this.age = age;
    }
}

abstract class Teacher extends AbstractPerson {
    //alt + insert

}
class A{
    int a;
    public void test(){}
}