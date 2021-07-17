package com.cskaoyan.javase.oop3._4lambda._1basic;

/**
 * @description: lambda表达式的简化
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * lambda表达式的简化
 *      1,lambda表达式简化的原则: 简化不能影响理解,不能让lambda表达式变得有歧义
 *      2,lambda表达式简化能够简化的前提: 功能接口中仅有一个抽象方法需要实现
 *
 * lambda表达式的语法:
 *      (形参列表) -> {
 *          //方法体
 *      }
 * 分别对各个结构进行简化:
 *      1,(形参列表) 这一块能不能简化?
 *      数据类型是不必要写的,可以简化,可以去掉
 *      特殊的,如果形参只有一个,那么()也是可以省略的
 *
 *      2,{
 *            //方法体
 *        }
 *        这个结构有没有省略的空间?
 *        如果方法重写的方法体只有一条语句,那么大括号是可以省略的
 *        特殊的,当有返回值的方法只有一条返回值语句时,可以省略return
 *
 *      3,-> lambda运算符是否可以去掉呢?
 *          1,用lambda表达式指向一个已经实现的方法,作为它的方法重写
 *          语法:
 *          (形参列表) -> 方法名(形参);
 *          该语法要求已实现的方法必须和抽象方法:
 *              1,返回值相同
 *              2,形参列表相同
 *          2,以上方法,将lambda表达式指向了一个已经实现的方法,它的语法仍然不是最简单的(方式1用的比较少)
 *          可以直接使用方式2,做最简单的lambda表达式
 *          语法:
 *          父类接口名 对象 = 方法的归属者::方法名
 *
 *          方法的归属者如何判定:
 *              成员方法属于对象
 *              静态方法属于类
 *
 * 以上就是lambda表达式简化的核心点
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        INoReturnTwoParam ip1 = (int a, int b) -> {
            System.out.println("两个数的和是: " + (a + b));
        };
        ip1.test(10, 20);
        System.out.println("-----------------------");
        //简化(形参列表): 因为方法只有一个,数据类型是固定的,数据类型是可以省略的
        INoReturnTwoParam ip2 = (a, b) -> {
            System.out.println("简化后两个数的和是: " + (a + b));
        };
        ip2.test(10, 20);
        System.out.println("----------------------");
        INoReturnOneParam ip3 = a -> {
            System.out.println("省略小括号 a = " + a);
        };
        ip3.test(999);
        System.out.println("-----------------------");
        INoReturnOneParam ip4 = a -> System.out.println("省略小括号,省略大括号 a = " + a);
        ip4.test(888);
        System.out.println("-----------------------");
        IHasReturnNoParam ip5 = () -> 0;
        System.out.println(ip5.test());
        System.out.println("------------------------");
        //我们在多数情况下,方法还是比较复杂的,这样lambda表达式就会相对比较复杂
        Person p1 = new Person(18, "张三");
        Person p2 = new Person(28, "李四");
        Person p3 = new Person(38, "王五");
        Person[] people = {p1, p2, p3};
        traverseArr(people);

        int m = 10;
        System.out.println("---------------------------");
        ITraverseArr ir = arr -> {
            //lambda表达式没有自己的作用域,共用方法的作用域
            //int m = 20;
            for (Object o : arr) {
                if (o instanceof Person) {
                    Person p = (Person) o;
                    p.print();
                }
            }
        };
        ir.traverse(people);
        System.out.println("------------------------");
        //用lambda表达式指向一个已经实现的方法,作为方法重写,用来解决lambda表达式层级过多的问题
        ITraverseArr ir2 = arr -> traverseArr(arr);
        ir2.traverse(people);
        System.out.println("-----------------------");
        ITraverseArr ir3 = Demo::traverseArr;
        ir3.traverse(people);

        //lambda表达式不仅可以指向我们自定义的方法,还可以指向已经存在的jdk当中的方法
        System.out.println("-----------------------");
        INoReturnOneParam ip6 = a -> {
            System.out.println(a);
        };
        ip6.test(18);
        INoReturnOneParam ip7 = System.out::println;
        ip7.test(99);
        System.out.println("----------------------");
        Demo d = new Demo();
        INoReturnNoParam ip8 = d::test;
        ip8.test();
    }

    public void test(){
        System.out.println("hello world!");
    }

    public static void traverseArr(Object[] arr) {
        for (Object o : arr) {
            if (o instanceof Person) {
                Person p = (Person) o;
                p.print();
            }
        }
    }
}

//该功能接口用来实现遍历对象数组的方法
@FunctionalInterface
interface ITraverseArr {
    void traverse(Object[] arr);
}

//无返回值无参数的功能接口
@FunctionalInterface
interface INoReturnNoParam {
    void test();
}

//无返回值有一个参数的功能接口
@FunctionalInterface
interface INoReturnOneParam {
    void test(int a);
}

//无返回值两个参数的功能接口
@FunctionalInterface
interface INoReturnTwoParam {
    void test(int a, int b);
}

//有返回值无参数的功能接口
@FunctionalInterface
interface IHasReturnNoParam {
    int test();
}

//有返回值一个参数的功能接口
@FunctionalInterface
interface IHasReturnOneParam {
    int method(int a);
}

//有返回值两个参数的功能接口
@FunctionalInterface
interface IHasReturnTwoParam {
    int test(int a, int b);
}

class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //打印对象的属性值
    public void print() {
        System.out.println("age = " + age + "\tname = " + name);
    }
}