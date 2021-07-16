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
 *      3,如果全局常量同名,咋办?
 *      用类名区分
 *
 * > - 外围类访问成员内部类成员
 *      大前提: 不受访问权限限制
 *      1，在外围类的成员方法中访问成员内部类成员
 *          必须先创建成员内部类对象,因为已经存在外围类对象,所以创建对象的语法是(直接创建):
 *      成员内部类类名 对象名  =  new 成员内部类类名();
 *      然后使用对象名点访问成员即可
 *      如果出现同名成员,用内部类对象名点访问的就是内部类成员,否者就是自身外围类的成员
 *
 *      2,在外围类的静态成员方法中访问内部类成员
 *          静态方法中没有this,就是没有外围类对象,所以必须先创建外围类对象,然后才能在外围类对象的基础上创建成员内部类对象
 *          语法:
 *          成员内部类类名 对象名 = new 外围类类名().new 成员内部类类名();
 *        创建对象后,直接对象名点访问成员即可
 *        使用谁的对象名访问的就是谁的成员
 *        如果出现同名,对象名即可区分
 *
 * > - 外部类访问成员内部类成员
 *      思考: 在外部类中,在它的成员方法或者静态方法中访问成员内部类,有没有区别?
 *          没有区别
 *      思考2: 外部类访问内部类受不受访问权限限制?
 *          受,首先在创建类对象时就受限制,其次即便能够创建对象,如果类中成员没有权限访问,仍然不能访问
 *
 *      在外部类当中想要访问成员内部类成员,必须先创建外围类对象,然后再创建成员内部类对象
 *      这里创建对象和在外围类静态方法中创建对象是有区别的,区别在于必须要指出该内部类属于谁
 *      语法:
 *          外围类类名.成员内部类类名 对象名 = new 外围类类名().new 成员内部类类名();
 *      以上创建对象全过程都受权限限制,并且利用对象名访问成员时也要受权限限制
 *
 * > - 成员内部类访问外部类成员（了解）
 *  这里和两个普通类之间的访问没有区别,仍然需要创建对象,受权限限制
 *
 *
 *
 */
public class Demo {
    private int a = 10;
    public static void main(String[] args) {
        //先创建外围类对象,再创建内部类对象
      EnclosedClazz.MemberInnerClazz ecic =  new EnclosedClazz().new MemberInnerClazz();
        //System.out.println(ecic.b);
    }
    public void test(){

    }
}

class EnclosedClazz {
    int a;
    private int b = 10;
    static final int C = 20;
    static int d = 30;

    public void enclosedTest() {
        //思考: 这里存不存在内部类对象? 答: 不存在
        //既然不存在就创建它
        //成员内部类对象依赖于外围类对象而创建
        //这里存在外围类对象,所以可以直接创建内部类对象
        //this.new MemberInnerClazz();
        MemberInnerClazz mic = new MemberInnerClazz();
        System.out.println(mic.a);
        System.out.println(mic.b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void enclosedStaticTest() {
        //1,创建外围类对象
        EnclosedClazz ec = new EnclosedClazz();
        //2,在外围类对象的基础上,创建内部类对象
        MemberInnerClazz mic = ec.new MemberInnerClazz();
        //3,上述步骤二合一,链式调用
        MemberInnerClazz mic2 = new EnclosedClazz().new MemberInnerClazz();
    }


     class MemberInnerClazz {
        int a;
        private int b = 10;
        static final int C = 20;

        public void innerTest(int a) {
            //请访问三个a
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(EnclosedClazz.this.a);
            System.out.println(MemberInnerClazz.C);
            System.out.println(EnclosedClazz.C);

            Demo d = new Demo();
            d.test();
            //d.a
        }

    }

}
