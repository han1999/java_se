package com.cskaoyan.javase.oop3._2inner._1member._1basic;

/**
 * @description: 成员内部类的成员访问特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在研究成员内部类的访问特点之前,先明确两个问题:
 *      1,成员内部类和外围类是好兄弟,它们之间的成员访问,不受权限限制,包括private
 *      2,成员内部类对象的创建依赖于外围类对象
 *          思考:
 *              1,在成员内部类的成员方法中,有没有外围类对象?
 *              肯定有,因为普通成员方法隐含this传参指向自身内部类对象,如果内部类对象都存在了,那么一定存在外围类对象
 *              所以在成员内部类的成员方法中,既有内部类对象也有外围类对象 ---> 可以直接利用该对象访问成员
 *
 *              2,在外围类的成员方法中,有没有成员内部类对象?
 *              没有,内部类依赖于外围类,外围类不依赖于内部类
 *              这里只有外围类自身对象,没有内部类对象
 *              所以在外围类的成员方法中,想要访问内部类成员,应该先创建对象
 *
 *
 * > 成员内部类的访问特点
 * > - 成员内部类内部访问外围类
 *      成员内部类的成员方法中已经有外围类对象了,所以可以直接访问外围类成员,并且不受访问权限限制
 *      如果成员内部类和外围类的成员出现同名情况,怎么区分?
 *      1,如果普通成员变量同名
 *      外围类对象和内部类对象分别用以下引用指向: 内部类对象用this指向,外围类对象用外围类类名.this指向
 *      用这些引用区分即可
 *      2,如果静态成员变量同名,咋办?
 *      成员内部类当中是没有静态成员变量的,所以它不可能同名
 *      3,如果全局常量同名,咋把?
 *      用类名区分
 *
 * > - 外围类访问成员内部类成员
 * > - 外部类访问成员内部类成员
 * > - 成员内部类访问外部类成员（了解）
 *
 *
 */
public class Demo {
}

class EnclosedClazz {
    int a;
    private int b = 10;
    static final int C = 20;
    static int d = 30;

    public void enclosedTest(){
    }
    class MemberInnerClazz {
        int a;
        private int b = 10;
        static final int C = 20;
        public void innerTest(int a){
            //请访问三个a
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(EnclosedClazz.this.a);
            System.out.println(MemberInnerClazz.C);
            System.out.println(EnclosedClazz.C);
        }

    }

}
