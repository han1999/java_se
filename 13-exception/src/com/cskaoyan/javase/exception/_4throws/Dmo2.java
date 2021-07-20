package com.cskaoyan.javase.exception._4throws;

/**
 * @description: 方法重写过程中异常列表问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.security.acl.AclNotFoundException;

/**
 * 方法重写当中子类的异常列表的重写原则:
 *      子类重写的方法不能比父类方法抛出更多的异常
 * 思考:
 *      子类方法声明中声明抛出更多的运行时异常,叫不叫更多?
 *      不叫更多,显然只有抛出更多的编译时异常,才叫抛出更多
 *
 * 如果父类方法没有抛出异常,
 *      那么子类可以抛出所有的运行时异常,包括RuntimeException,但是不能抛出任何一个编译时异常
 * 如果父类方法抛出运行时异常或者RuntimeException.
 *      那么子类方法和上一条一样
 * 如果父类方法抛出了某一个编译时异常,
 *      那么子类方法可以抛出所有运行时异常,还有和父类相同的编译时异常
 *      不能抛出不同的,也不能抛出Exception
 * 如果父类方法直接抛出Exception,
 *      那么子类可以随便玩,为所欲为
 *
 * 1,为什么子类不能抛出更多的(编译时)异常?
 *      多态
 *      编译器看父类方法没有异常,但是jvm运行子类方法时却有了编译时异常,这显然是不合理的
 * 2,无需强行记忆,没必要记得那么准确，只需要知道子类方法不能抛出更多的编译时异常即可
 *
 */
public class Dmo2 {
}

class Father {
    public void test() throws Exception {

    }
}

class Son extends Father {
    @Override
    public void test() throws AclNotFoundException,RuntimeException{
    }
}