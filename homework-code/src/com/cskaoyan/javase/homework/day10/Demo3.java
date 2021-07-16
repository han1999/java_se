package com.cskaoyan.javase.homework.day10;

import java.lang.ref.PhantomReference;

/**
 * @description: 方法返回值
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo3 {
    public static void main(String[] args) {

    }

    public static Phone test() {
        return new PhoneSon();
    }

    public static AbstractPhone test2() {
        //只能返回抽象类的子类对象
        return new Phone2();
    }

    public static IPhone test3() {
        //只能返回接口实现类对象
        return new Phone3();
    }
}

class Phone {
}

class PhoneSon extends Phone {
}

abstract class AbstractPhone {
}

class Phone2 extends AbstractPhone {
}

interface IPhone {
}

class Phone3 implements IPhone {
}