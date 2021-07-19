package com.cskaoyan.javase.object._4hashcode;

/**
 * @description: hashCode方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 方法的声明:
 *      public native int hashCode();
 * 该方法的返回值是一个int整数,并且该方法是一个本地方法
 * 作用:
 *      1,返回该对象的哈希码值。
 *      2,支持此方法是为了提高哈希表（例如 java.util.Hashtable 提供的哈希表）的性能。
 *          哈希表简单理解就是key - value
 *          哈希表会通过计算一个对象的哈希值,然后通过哈希值把该对象作为哈希表的key
 *
 * Object类当中的hashCode方法是一个本地方法,
 *      文档中说的:
 *      实际上，由 Object 类定义的 hashCode 方法确实会针对不同的对象返回不同的整数。（这一般是通过将该对象的内部地址转换成一个整数来实现的，但是 JavaTM 编程语言不需要这种实现技巧。）
 *      所以Object类当中的hashCode方法是通过对象的地址去计算哈希值的,我们也经常把hashCode的值当成该对象的十进制地址值(近似的)
 *
 *      hashCode方法和equals方法往往是同对出现的,如果重写其中一个,那么都要重写.如果不重写,那么都不重写(如果都不重写,它们都是根据地址值去比较的)
 *      重写hashCode方法的常规协定:
 *      - 在 Java 应用程序执行期间，在对同一对象多次调用 hashCode 方法时，必须一致地返回相同的整数。
 *   - 前提是将对象进行 equals 比较时所用的信息没有被修改（哈希值是根据成员变量来计算的）
 *
 *   - 从某一应用程序的一次执行到同一应用程序的另一次执行，该整数无需保持一致
 * - 如果根据 equals(Object) 方法，两个对象是相等的
 *   - 那么对这两个对象中的每个对象调用 hashCode 方法都必须生成相同的整数结果。
 *   equals方法认为两个对象相等,那么它们的哈希值必须相等
 *
 * - 如果根据 equals(java.lang.Object) 方法，两个对象不相等
 *   - 那么对这两个对象中的任一对象上调用 hashCode 方法不要求一定生成不同的整数结果
 *   equals方法认为两个对象不相等时,那么它们的哈希值不要求一定不相等
 *
 *   - 但是，程序员应该意识到，为不相等的对象生成不同整数结果可以提高哈希表的性能。
 *   解决哈希冲突,能够提升哈希表的性能 ---> 要求我们设计更好的哈希算法 (相信光)
 *
 *  hashCode方法的重写要以equals方法的重写为主,当equals方法使用成员变量的取值重写,hashCode方法也要以成员变量的取值重写
 *  常规要求下,使用idea自动生成equals和hashCode方法能够满足需求
 *
 */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student(18,100);
        Student s2 = new Student(18,100);
        Student s3 = new Student(28,300);
        //Student s3 = s2;
        //System.out.println(s3.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}
class Student{
    int age;
    double score;

    public Student() {
    }

    public Student(int age, double score) {
        this.age = age;
        this.score = score;
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
}