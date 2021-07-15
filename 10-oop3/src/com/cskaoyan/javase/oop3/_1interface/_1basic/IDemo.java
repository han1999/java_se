package com.cskaoyan.javase.oop3._1interface._1basic;

/**
 * @description: 接口Demo
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 以后常见的接口样式
 * 接口的实现类样式,很多程序员喜欢在接口所在的包下直接新建一个包叫"impl"
 * 然后在这个包下,写接口的实现类,并命名为"接口名+Impl"
 *
 */
public interface IDemo {
    void add();

    int delete();

    boolean retrieve();
}
