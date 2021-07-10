package com.cskaoyan.javase.oop1._7idea;

/**
 * @description: 奇思妙想
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 构造方法必须和类名一模一样吗？
 *  必须,因为语法就是这样的,它是写死的
 *
 * 因为构造方法的这个特点,要求大家一定要遵守命名规范
 *
 *
 * 普通方法在命名时，允许和类名一样吗？
 *  语法上允许这么做,但是实际上最好不要这么做
 *  和类名保持一致应该是构造方法的专利
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //创建teacher对象
        //teacher teacher = new teacher();
        //Demo();
    }

    //Method name 'Demo' is the same as its class name
    //public static void Demo(){
    //}
}

//为什么一直强调类名应该大驼峰书写?
//class teacher{
//    public teacher() {
//    }
//}