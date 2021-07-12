package com.cskaoyan.javase.oop1._13import._0onepackage;

/**
 * @description: import关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在java当中,同包下的类可以直接使用它,无需经过其它步骤
 * 如果同包下,和非同包下都有同名类时,不做任何操作,访问的肯定是同包下Student
 *
 * 同包下,类名是不可能重复的,所以编译器是能够精确的找到一个类的
 * 但是不同包下,类名重复是很正常的,这个时候不做额外操作,编译器是找不到该类的
 * 这个时候就需要进行导包的操作
 * 导包的语法:
 *      import + 类的全限定类名;
 * 这样就能使用不同包的类了
 *
 * 注意事项:
 *      1,java.lang包是java语言的核心类所在的包,每个java文件都隐式的导入了该包下的类
 *          不是不导包,而是隐式导包,无需程序员手动导入
 *      2,假如同包下和不同包下,有两个同名的类,都需要使用
 *          这个时候就需要使用全限定类名去访问一个类,另一个可以导包(或者直接默认使用同包)
 *          这种需求开发中不算罕见
 *
 *      3,import在导入类时,具有智能化的导入形式
 *          import + 包名.*
 *          该形式会自动的根据需求,导入该包下的class
 *          该形式只有在必须导包,不导包就会报错的情况下,才会导入一个class去使用
 *          如果同包下已经有同名类,该智能导入不会生效
 *
 *      4,编译单元: 在java当中,以一个java文件为一个编译单元,在同一个编译单元内不存在同名类
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Student.study();
    }
}
//'Student' is already defined in this compilation unit
//class Student{
//    public static void study(){
//        System.out.println("Student");
//    }
//}
