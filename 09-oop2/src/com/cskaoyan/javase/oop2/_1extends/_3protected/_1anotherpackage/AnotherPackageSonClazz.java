package com.cskaoyan.javase.oop2._1extends._3protected._1anotherpackage;

import com.cskaoyan.javase.oop2._1extends._3protected._0onepackage.CurrentClazz;
import com.cskaoyan.javase.oop2._1extends._3protected._0onepackage.SamePackageSonClazz;

/**
 * @description: 不同包下的子类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 不同包下的子类中可以访问父类当中的protected成员
 *
 * 子类中访问父类protected成员的方式:
 * 1,直接创建父类对象,然后用父类对象名访问该protected成员
 * 2,直接创建子类自身对象,然后用子类引用访问该protected成员
 * 3,创建该子类"兄弟类"的对象,然后访问该protected成员
 *
 * 以上,总结:
 *      对于父类的protected普通成员,在不同包的子类当中,只有创建自身子类对象
 *      然后用该对象去访问父类中继承过来的protected成员
 *      只有这样才能够访问到
 *
 *      其他的方式,比如说,直接访问父类自己的protected(创建父类对象)
 *          或者访问"兄弟姐妹"继承过来的protected
 *          等等方式都是不行的
 *
 *
 *
 */
public class AnotherPackageSonClazz extends CurrentClazz {
    public static void main(String[] args) {
        //System.out.println(CurrentClazz.);
        //System.out.println(CurrentClazz.protectedVar);

        //方式一: 创建父类对象访问 不能访问
        CurrentClazz cc = new CurrentClazz();
        //cc.protec

        //方式二: 创建子类自身对象 能够访问
        AnotherPackageSonClazz apsc = new AnotherPackageSonClazz();
        System.out.println(apsc.protectedVarMember);

        //方式三: 创建"兄弟"对象 不能够访问的
        SamePackageSonClazz spsc = new SamePackageSonClazz();
        //spsc.

        //方式四: 父类引用指向子类对象
        CurrentClazz cc2 = new AnotherPackageSonClazz();
        //cc2.protectedVarMember
    }
}
