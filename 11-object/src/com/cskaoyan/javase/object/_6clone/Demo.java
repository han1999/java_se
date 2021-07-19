package com.cskaoyan.javase.object._6clone;

/**
 * @description: clone方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * clone,克隆,生物学上的clone，是由物种A的体细胞经过无性繁殖，生成基因型完全一致的后代的过程
 *      java的中的克隆方法实际上也是差不多的,Object类当中clone方法,它的作用:
 *          1,得到了一个完全独立的对象
 *          2,得到的对象和原先的对象的成员变量取值应该是一致的
 *
 * clone方法的声明和方法体:
 *      protected native Object clone() throws CloneNotSupportedException;
 * 1,该方法的访问权限是protected,这就意味着克隆一个类的对象必须在该类当中完成,否者是没有权限
 *      换句话说,只有自己才能够克隆自己,这在很多情况下不能满足需要,所以需要重写该方法的访问权限,这个访问权限可以在子类中重写成public,如果是同包访问,也可以直接用protected
 *
 * 2,native表示它是一个本地方法,我们不关注它的实现
 * 3,Object表示方法的返回值是一个Object对象,实际使用中,我们可以重写它的返回值类型,改成具体的类型
 * 4,throws CloneNotSupportedException 表示方法异常的声明,明天再讲
 * 5,Object类当中clone方法实现,在多数情况下能够满足我们的需求,一般来说不需要重写它的实现
 *      只需要直接使用super关键字去调用父类实现即可
 *
 *
 * 使用clone方法的步骤:
 * 1,需要考虑clone方法的访问权限:protected
 *      如果需要重写,就要重写它的访问权限
 * 2,CloneNotSupportedException克隆不支持异常,该异常是当你克隆了一个没有实现Cloneable接口的类时,会抛出该异常
 * 每当克隆一个类的对象,那么这个类就必须实现接口Cloneable
 *
 * 3,解决上述两个问题,就可以开始克隆了
 *
 *
 * clone方法当中需要注意的事项:
 *      1,Cloneable接口,该接口是一个空接口,在java当中,把这种接口称之为"标记接口"
 *          Cloneable接口和clone方法之间就是用instanceof去判断的
 *          一个类必须实现Cloneable接口才能通过检查,才能够进行clone操作
 *      2,clone和new对象是同种级别的创建对象的方式,它们之间创建对象没有任何关系
 *          new对象会调用类的构造器
 *          clone是依赖于本地方法创建对象,不会调用构造器
 *      3,clone方法多数情况下使用Object类的默认实现就足够了,如果有特殊需求,也是可以重写的
 *          它的重写也有规范需要遵守:
 *   对于任何对象 x，表达式：
 * ​		1，x.clone() != x 为 true（克隆后必须是独立的对象,这一条是必须的）
 * ​		2，x.clone().getClass() == x.getClass() 为true (克隆后的类型不能发生变化)
 * ​		3，x.clone().equals(x) 为true（一般情况下为true，但这并不是必须要满足的要求）
 *          只有当你使用成员变量的取值,重写equals时,该条才为true
 *
 *      4,当对象当中存在引用数据类型的成员变量时,克隆会发生什么变化呢?
 *
 *      浅拷贝和深拷贝(浅克隆深克隆):
 *      浅克隆: 克隆成员变量时,只会克隆成员变量本身,如果是引用数据类型,就克隆它的引用,于是克隆后的两个对象当中的成员变量引用共用了同一个对象
 *      Object类当中的clone方法的默认实现就是浅克隆的
 *
 *      深克隆: 浅克隆得到的两个对象不是完全独立的,所以需要进行深克隆,得到两个完全真正独立的对象
 *          深度克隆的流程:
 *          1,深度克隆是在浅克隆的基础上进行的,浅克隆仍然是有必要的
 *          2,把该类成员变量引用所指向的对象克隆一份
 *          3,把克隆后该成员变量引用指向克隆后的对象
 *          4,以上完成深度克隆
 *
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*Student s = new Student(18,100);
        Student cloneStu = s.clone();
        System.out.println(s);
        System.out.println(cloneStu);
        System.out.println(s == cloneStu);
        System.out.println(s.equals(cloneStu));*/

        Student s = new Student(18, 100, new Cat(100));
        Student cloneStu = s.clone();
        System.out.println(cloneStu == s);

        s.age = 28;
        System.out.println(cloneStu.age);

        s.c.price = 1000;
        System.out.println(cloneStu.c.price);

        System.out.println(s.c);
        System.out.println(cloneStu.c);
    }
}
class Student implements Cloneable{
    int age;
    double score;

    Cat c;

    public Student() {
    }

    public Student(int age, double score, Cat c) {
        this.age = age;
        this.score = score;
        this.c = c;
    }

    public Student(int age, double score) {
        System.out.println("age score双参数构造器执行");
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return Double.compare(student.score, score) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    //重写方法的访问权限
    //方法的返回值就是一个Student对象
    @Override
    protected Student clone() throws CloneNotSupportedException {
        //父类方法返回值是Object对象,需要强转它
        //return ((Student) super.clone());
        //1,深度克隆是在浅克隆基础上完成的,所以仍然需要调用父类Object类当中的clone方法
        Student cloneStu = (Student) super.clone();
        //2,克隆一份Cat对象
        //c.clone()和cloneStu.c.clone()是一样的
        Cat cloneCat = cloneStu.c.clone();
        //3,把克隆后的引用指向克隆后的Cat对象
        cloneStu.c = cloneCat;
        return cloneStu;
    }
}
interface My extends MyCloneable{}
interface MyCloneable extends Cloneable{
}
class Cat implements Cloneable{
    double price;

    public Cat() {
    }

    public Cat(double price) {
        this.price = price;
    }

    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return ((Cat) super.clone());
    }
}