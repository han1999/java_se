package com.cskaoyan.javase.homework.day11;

/**
 * 抽象类的练习题
 *
 */
public class Work1 {

}

abstract class Graphics {
    private int area;
    private int perimeter;

    //方式一: 提供必要的方法访问属性getter/setter方法
    /*public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }*/

    //方式二: 提供公共的访问方法,作为子类默认实现
    public void print() {
        System.out.println(area + perimeter);
    }

    abstract void draw();

    public Graphics() {
    }

    public Graphics(int area, int perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }
}
//子类可以自行定义并测试一下

