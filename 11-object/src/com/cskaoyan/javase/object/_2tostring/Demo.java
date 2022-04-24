package com.cskaoyan.javase.object._2tostring;

/**
 * @description: toString()方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 方法的声明:
 *       public String toString()
 *  没什么需要注意的地方,该方法的返回值是一个字符串类型
 * 作用:
 *      1,返回该对象的字符串表示。通常，toString 方法会返回一个“以文本方式表示”此对象的字符串。
 *      2,结果应是一个简明但易于读懂的信息表达式。
 *      3,建议所有子类都重写此方法。换句话说,建议不要直接使用Object类当中的默认实现
 *
 * Object类当中toString方法:
 *      return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * getClass获取当前对象的运行时对象,getClass().getName()获取当前类型的全限定类名
 * hashCode()可以简单的理解成十进制的地址值
 * Integer.toHexString()将十进制的整数变成一个十六进制的字符串
 * Integer.toHexString(hashCode())得到了该对象的十六进制地址值
 *
 * 显然Object类当中的默认实现toString方法:
 *      全限定类名 + @ + 十六进制地址值
 * 所以当我们直接打印一个对象名/引用时,就会自动的去调用它的toString()方法,如果我们没有在类中重写toString方法
 *      就会去调用Object类的实现
 *
 * 以上,显然默认实现不能满足需求,我们更希望能够把对象转换成"成员变量表示"的字符串,所以需要我们在类中自己重写该方法
 *
 * 注意事项:
 *      1,当你打印一个对象名或者引用时,会调用该类的toString方法.除此之外,当对象参与字符串的拼接运算时,仍然会默认调用toString方法
 *      2,在debug模式中,它会在创建对象和使用对象的代码行后面打印对象的信息,这依赖于类的toString方法
 *      所以不要在toString方法中乱写,建议该方法只写打印的语句
 *      3,toString方法可以自动生成,alt+insert
 *      4,如果类中有引用数据类型的成员变量,直接再次调用它的toString方法即可
 *      当然需要重写该类的toString方法
 *      5,
 *      思考: 当对象参与字符串运算时,会自动调用toString方法,那么写与不写出该方法调用,哪个更合适呢??
 *      不要画蛇添足,自动调用toString方法可以避免空指针异常,如果你写上方法调用,就避免不了这个问题了
 *      //厉害呀！！！
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*Student s = new Student(18,99);
        System.out.println(s);
        //System.out.println(s + "6666");
        System.out.println(s.age);*/

        Student s = new Student(18, 100, null,"张三");
        System.out.println(s);
    }
}

class Student {
    int age;
    double score;
    Star s;
    String name;

    public Student() {
    }

    public Student(int age, double score) {
        this.age = age;
        this.score = score;
    }

    public Student(int age, double score, Star s) {
        this.age = age;
        this.score = score;
        this.s = s;
    }
    /* @Override
    public String toString() {
        //age = 999;
        return "age = " + this.age + "\tscore = " + this.score;
    }*/

    public Student(int age, double score, Star s, String name) {
        this.age = age;
        this.score = score;
        this.s = s;
        this.name = name;
    }

    //@Override
    //public String toString() {
    //    return "Student{" +
    //            "age=" + age +
    //            ", score=" + score +
    //            ",Star "+ s +
    //             "}}";
    //}

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", s=" + s +
                ", name='" + name + '\'' +
                '}';
    }
}
class Star{
    int age;

    public Star() {
    }

    public Star(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Star{" +
                "age=" + age +
                '}';
    }
}