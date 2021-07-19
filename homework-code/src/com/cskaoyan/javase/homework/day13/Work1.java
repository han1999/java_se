package com.cskaoyan.javase.homework.day13;

/**
 * @description: equals方法练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Work1 {
}
class Animal{
    int age;
    String name;
    double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (Double.compare(animal.price, price) != 0) return false;
        return name.equals(animal.name);
    }


    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //    Animal animal = (Animal) o;
    //    if (age != animal.age) return false;
    //    if (Double.compare(animal.price, price) != 0) return false;
    //    return name != null ? name.equals(animal.name) : animal.name == null;
    //}


}
