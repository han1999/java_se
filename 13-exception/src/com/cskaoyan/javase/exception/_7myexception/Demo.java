package com.cskaoyan.javase.exception._7myexception;

/**
 * @description: 自定义异常
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在jdk当中提供了很多异常供我们使用，但是总有不能满足我们需求的时候，所以我们需要自定义异常
 * 1，怎么得到一个自定义异常？
 * 语法：定义一个类然后让它继承RuntimeException就得到了一个运行时异常
 *       定义一个类然后让它继承Exception就得到了一个编译时异常
 * 自定义异常无需加任何成员变量和方法，建议加上构造方法
 *
 * 2，自定义异常有什么作用？
 * 如果是JDK当中自带的异常，那是开发者去描述源码中出现异常的情况，使用这些异常具有一定的干扰性
 * 相反，如果使用自定义异常，因为源码中不可能抛出它，那么我们这个自定义异常就能精准快速的定位问题
 *      并且自定义异常还可以做针对性的处理，这些都是源码中的异常所做不到的事情
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*try {
            judgeObjectNum(10);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            judgeObjectNumChecked(-1);
        } catch (ObjectNumException e) {
            e.printStackTrace();
        }
    }

    public static void judgeObjectNum(int num) {
        if (num > 1){
            throw new ObjectNumRuntimeException("海王同学");
        }else if (num < 0){
            throw new ObjectNumRuntimeException("不对");
        }
        else {
            System.out.println("正常人");
        }
    }

    public static void judgeObjectNumChecked(int num) throws ObjectNumException {
        if (num > 1){
            throw new ObjectNumException("海王同学");
        }else if (num < 0){
            throw new ObjectNumException("不对");
        }
        else {
            System.out.println("正常人");
        }
    }
}

//自定义的运行时异常
class ObjectNumRuntimeException extends RuntimeException {
    public ObjectNumRuntimeException() {
        super();
    }

    public ObjectNumRuntimeException(String message) {
        super(message);
    }
}

//自定义的编译时异常
class ObjectNumException extends Exception {
    public ObjectNumException() {
        super();
    }

    public ObjectNumException(String message) {
        super(message);
    }
}
