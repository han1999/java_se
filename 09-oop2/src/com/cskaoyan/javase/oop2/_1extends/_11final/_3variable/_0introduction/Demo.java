package com.cskaoyan.javase.oop2._1extends._11final._3variable._0introduction;

/**
 * @description: final修饰变量总览
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * final修饰变量表示最终的变量,最后的变量,不可更改的变量,实际上就是表示一个常量
 * 常量的分类:
 *      1,字面值常量,1,2,3,"hello"
 *      2,自定义常量: 在java当中,自定义常量指的就是用final修饰的变量
 *
 * 注意事项:
 *      1,命名规范: 自定义常量的命名,单词的字母要全部大写,每个单词之间用"_"连接
 *      2，final修饰变量仅仅只是表示该变量的取值不会发生改变，成为一个常量，但是对于该变量内存位置，生命周期，使用规则等等是不会发生改变的
 *      比如：
 *          a，final修饰局部变量，该变量值不可变，但是仍然在栈帧中，仍然随着方法同生共死
 *          b，final修饰成员变量，成员变量的取值不可变，但是它仍在堆上的对象中
 *          c，final修饰静态成员变量，取值不可变，仍然是类加载时初始化赋值完毕，仍然类名点访问
 *
 *      3，final修饰一个基本数据类型变量，表示该变量的取值不可变了
 *          那么final修饰引用数据类型呢？
 *          final修饰引用数据类型修饰的是它的引用，表示引用当中地址值不可变了，意味着引用所指向的对象不可变了
 *          但是引用所指向对象的成员变量的取值（对象的状态）仍然是可以改变的
 *
 */
public class Demo {
}
