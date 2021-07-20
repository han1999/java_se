package com.cskaoyan.javase.string._4api._1compare;

/**
 * @description: String类的比较功能
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Arrays;

/**
 * String类当中具有比较字符串对象功能的方法有两类：
 *      1，equals
 *      该方法用来比较两个字符串对象的内容，如果内容是相同的，就返回true，如果是不同的，就返回false
 *      该方法不会判断字符串对象的大小
 *
 *      2，int compareTo(String str)
 *         int compareToIgnoreCase(String str)
 *      以上两个方法可以用来判断字符串对象的大小，它们会通过不同的返回值去得到字符串的大小
 * compareTo方法如何判断字符串大小？
 *      当方法的返回值等于0时，表示两个比较的字符串内容是相同的，它们的大小关系是相等的
 *      当方法的返回值小于0时，表示前面的字符串比后面的字符串要小
 *      当方法的返回值大于0时，表示前面的字符串比后面的字符串要大
 *      显然，越处在编码集后面的字符，它们在做比较时，编码值之差就越可能是一个正数，所以在其它条件不变的情况下，
 *          我们可以认为在编码集后面的字符就越大
 *          这种顺序我们称之为“字典顺序”，越在字典顺序后面的字符就越大
 *
 *  Comparable接口
 * 一个类实现了Comparable接口，就可以对这个类的对象（容器或集合）进行排序
 * 称之为自然排序，其中的compareTo方法被称为它的自然比较方法
 * 对象自然排序的方法：
 *      首先需要一个装着对象的容器（数组或者集合）
 *      如果是数组，用Arrays.sort(Object[] arr)进行排序
 *      如果是集合，用Collections.sore(集合)进行排序
 *
 *  该sort方法会自动调用该类的compareTo方法，然后两两比较容器中的对象，然后越小的对象越会排在前面
 *  排序的顺序是从小到大的
 *
 *  在Java当中只要是实现了Comparable接口的类，都是可以用来进行自然排序的，包括自定义的类
 *  使用Comparable接口实现自然排序是有局限性的:
 *      1,首先它在做排序时,必须要求一个类是实现该接口,这就意味着需要修改代码,这在很多时候是不允许的
 *      2,除了compareTo方法，类中还有equals方法判断两个对象是否相等
 *           建议这两个方法同true同0，同false非0，这样从逻辑上更顺畅
 *  -       比如一个有序集合，compareTo认为不相等，equals方法认为相等，可能导致集合添加元素失败
 *          实际上，所有实现 Comparable 的 Java 核心类都具有与 equals 一致的自然排序
 *          两个方法都用成员变量的取值重写即可
 * -     3,没有办法使用lambda表达式
 *
 * 以上,使用Comparable接口实现自然排序,往往都是那些定义和设计比较完善的类,但是如果仅仅是对一个普通类做一下自然排序,使用这种方式就比较麻烦的
 *  推荐使用Comparator接口实现对象的自然排序
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*String s = "a";
        String s1 = "aaa";
        String s2 = "abc";
        String s3 = "bcd";
        String s4 = "bbb";
        String s5 = "bcde";
        String s6 = "abcd";
        //手动排序，从小到大： a，aaa，abc，abcd，bbb，bcd，bcde
        String[] arr = {s, s2, s3, s4, s1, s5, s6};
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));*/

        Student s = new Student(18, 100);
        Student s1 = new Student(20, 80);
        Student s2 = new Student(30, 50);
        Student s3 = new Student(10, 40);
        Student s4 = new Student(7, 20.1);
        Student s5 = new Student(2, 20.2);
        Student s6 = new Student(28, 20.0);
        Student s7 = new Student(30, 10);
        Student s8 = new Student(9, 30);
        Student[] arr = {s, s1, s2, s3, s3, s4, s5, s6, s7, s8};
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

    }
}

class Student implements Comparable<Student> {
    int age;
    double score;

    public Student() {
    }

    public Student(int age, double score) {
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "age = " + age;
    }

    //compareTo方法表示比较的规则,它是对象排序的核心
    //把分数从大到小排序,认为一个对象的score分数越高,它就越处在前面(分数越高,对象越小)
    //按年龄排序,从小到大排序
    @Override
    public int compareTo(Student o) {
        //return ((int) ((o.score - this.score) * 100));
        return age - o.age;
    }
}