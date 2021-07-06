package com.cskaoyan.javase.method._4usecase;

/**
 * @description: 方法的使用场景
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/


/**
 * 方法的使用场景1:
 *      在需要复用代码时,使用方法,需要重复去完成一个功能
 *
 * 方法的使用场景2:
 *      很多时候我们会在一个方法中写大量的代码去实现某个功能，但是一个方法中代码过多会导致结构臃肿
 *
 * - 所以很多时候，即便是不需要复用代码，也可以考虑提取出新的方法
 *   - **优化代码结构**
 *   - 使程序变得更简短而清晰
 *
 *
 * 小知识点:
 *      1,提取方法的快捷键
 *      ctrl+alt+m 快速提取方法
 *
 *      2,假如我们在写程序时,需要在一个方法当中去调用另一个方法
 *          我们可以直接在方法中,写出想要的方法的调用
 *          然后代码爆红,用万能快捷键alt+回车,快速生成方法
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //很多代码
        int sumValue = sum(10, 20);
        //很多代码

        test();


        //需要写一个方法method,用来实现某个功能
        method();

       double a =  test4(18);
    }

    private static double test4(int i) {
        return 0;
    }

    public static void method() {
    }


    public static void test() {
        int a = 10;
        int b = 20;
        int result = a * b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
