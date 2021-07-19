package com.cskaoyan.javase.object._3equals;

/**
 * @description: equals方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * equals: 是相等的意思
 * 方法的声明:
 * public boolean equals(Object obj)
 * 方法的返回值是布尔类型,所以该方法是用来判断方法的调用者对象和方法传入的参数对象是否相等
 *      如果相等返回true,如果不相等就返回false
 *
 * 如何判断两个对象相等?
 *
 * 1,Object当中的equals默认实现认为的对象相等:
 *      方法体: return (this == obj);
 * 该方法是通过引用的地址值判断对象相等的,换句话说,只有当两个引用所指向的对象就是同一个对象时,对象才相等
 * 自己和自己比才相等,这个条件是比较苛刻的
 *
 * 2,我们认为的对象相等:
 *      1,如果两个对象不是同种类型的对象,那么它们没有可比性,直接判断不相等,直接不比较
 *      2,如果两个对象是同种类型的对象,这个时候它们的行为是一样的
 *           如果它们的成员变量的取值再相等的话,它们的对象就应该是相等的
 * 所以,为了实现我们所认为的对象相等,需要自己在类中重写equals方法,并且是根据成员变量的取值来决定对象,来重写equals方法
 *
 * 关于重写equals方法,是有规定的,称之为"equals方法的常规协定":
 * - 自反性：对于任何非空引用值 x，x.equals(x) 都应返回 true
 * 自己和自己比,应该是相等的,返回true
 *
 * - 排他性：当比对的不是同种类型的对象或者是一个null时，默认返回false
 *
 *
 * - 对称性：对于任何非空引用值 x 和 y，当且仅当 y.equals(x) 返回 true 时，x.equals(y) 才应返回 true
 *  x=y所以y=x
 *
 * - 传递性：对于任何非空引用值 x、y 和 z，如果 x.equals(y) 返回 true，并且 y.equals(z) 返回 true
 *   - 那么x.equals(z) 应返回 true
 *   x = y ,y = z --> x = z
 *
 * - 一致性：对于任何非空引用值 x 和 y，多次调用 x.equals(y) 始终返回 true 或始终返回 false
 *   - 前提是对象上equals 比较中所用的信息没有被修改
 *   equals方法所用比较的信息如果没有修改,那么比较的结果应该是不会改变的
 *
 * 思考:
 *      如果用成员变量的取值来重写equals方法,能不能满足传递性,一致性,对称性呢?
 *      是可以满足的
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(18, 100);
        Student s2 = new Student(18, 100);
        System.out.println(s1.equals(s2));
    }
}

class Student {
    int age;
    double score;

    public Student() {
    }

    public Student(int age, double score) {
        this.age = age;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        //自反性
        //如果是同一个对象进行比较,直接返回true
        if (obj == this) return true;

        //排它性
        //怎么判断传入的对象和当前对象不是同一个类型的对象呢?
        //instanceof
        //getClass
        if (obj == null || this.getClass() != obj.getClass()) {
            //不能使用非短路或,因为后面继续走会空指针异常,必须使用短路或
            //不是同种类型对象
            return false;
        }
        //当程序运行到这里,obj肯定不是null,并且它的类型和当前对象的类型一定是一样的



    }
}
