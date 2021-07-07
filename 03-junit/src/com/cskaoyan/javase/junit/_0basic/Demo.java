package com.cskaoyan.javase.junit._0basic;

/**
 * @description: Junit单元测试的简单实用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import org.junit.Test;

/**
 * 利用Junit单元测试可以在一个类中实现多个main方法的效果
 * 在JavaSE阶段,可以用junit单元测试做一些简单的测试和实验
 *
 * Junit怎么用?
 * 1,在一个类中,在类体中,写注解(annotation) @Test
 *  注解: 注解是和class同等级别的数据类型,你可以认为它就是一个类,@Test可以认为是在创建注解对象
 *  2,写完注解后,会报错,因为此时你的工程中没有junit依赖
 *   依赖: 一些三方的工具包或者写好的类库需要手动导入
 *    alt+回车 直接导入即可
 *
 * 3,导完依赖后,仍然会报错,这是很正常的
 *      因为你需要在@Test注解下面,写一个方法:
 *      public void 方法名(){
 *          //方法体
 *      }
 * 4,按照以上步骤就完成了Junit,就可以实现main方法的效果
 *
 * 注意事项:
 *    1,Junit单元测试的方法的格式是固定写死的,除了方法名,其它地方改不了
 *      这个方法必须是public修饰的
 *      这个方法必须没有返回值,必须是void
 *      这个方法必须没有参数,必须是空的
 *
 *    2,你最好不要在一个叫做Test的类中,使用Junit单元测试
 *    3,Junit测试类中最好不要写main方法
 *
 * 留一个思考:
 *      思考怎么在Junit单元测试中使用Scanner键盘录入?
 *
 *
 */
public class Demo {

    @Test
    public void method1() {
        System.out.println("hello world!");
    }

    @Test
    public void method2() {
        System.out.println("hello kitty!");
    }

    @Test
    public void method3() {
        System.out.println("hello 马化腾!");
    }
}
