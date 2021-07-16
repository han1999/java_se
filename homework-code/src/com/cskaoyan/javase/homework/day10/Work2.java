package com.cskaoyan.javase.homework.day10;

/**
 * @description: 多态语法的练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 最后，在测试类中，编写测试代码，要求进行如下测试：
 * 	1，编写测试方法，
 * 		要求该方法允许传入SouthPerson对象和NorthPerson对象，并在方法体中调用它们的eat()方法
 * 	2，用父类引用指向子类对象的方式创建SouthPerson对象，能否直接访问salary属性和swim()方法？
 * 		如果不能，应该怎么写代码让它能够正常调用？
 * 	不能直接调用,但是可以强转
 * 	3，用父类引用指向子类对象的方式创建NorthPerson对象，能否（直接或写代码）访问salary属性和swim()方法？
 * 		如果不能，将该对象引用强转为SouthPerson引用，能否成功？为什么？
 * 	不能调用,也不能强转
 *
 */
public class Work2 {
    public static void main(String[] args) {
        NorthPerson np = new NorthPerson();
        SouthPerson sp = new SouthPerson();
        test(np);
        test(sp);
        Person p = new NorthPerson();
    }
    public static void test(Person p){
        p.eat();
    }
}

abstract class Person {
    String name;
    int age;
    public abstract void eat();
}

class SouthPerson extends Person {
    double salary;
    @Override
    public void eat() {
        System.out.println("南方人吃米饭");
    }
    public void swim(){
        System.out.println("南方人会游泳");
    }
}

class NorthPerson extends Person {
    double height;
    @Override
    public void eat() {
        System.out.println("北方人吃馒头");
    }
    public void drink(){
        System.out.println("北方人特别能喝酒");
    }
}
