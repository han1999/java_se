package com.cskaoyan.javase.junit._0basic;

/**
 * @description: 在Test类中写Junit单元测试
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在Test类中如果使用@Test注解会默认优先选择本身类作为这个注解类型
 * 这样就造成无法使用@Test注解的情况
 *
 * 为了在Test类中能够使用@Test注解,就必须完整地去告诉编译器我使用的Test到底是哪里的Test
 *
 * 所以这里需要给@Test加上包名,以示区分
 * 这种能够唯一的确定一个类,带上包名+类名的写法
 * 比如org.junit.Test
 * 我们称之为"全限定类名",它唯一确定一个类
 *
 *
 */
public class Test {
    @org.junit.Test
    public void method() {
        System.out.println("Hello World!");
    }
}
