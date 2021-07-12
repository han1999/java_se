package com.cskaoyan.javase.oop1._12package;
/**
 * @description: package关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * package关键字的作用:
 *      一个java文件当中的所有类,都属于同包的关系
 *      这个使用package关键字声明该java文件下的所有class都属于同包的关系
 *
 *      语法: package 包名;
 *      包名如果有多级,用"."隔开
 *
 * 注意事项:
 *      1,我们使用IDEA开发,多数情况下,不需要注意package关键字,因为它是自动生成的
 *          但是很多时候代码不是我们自己写的,而是各种从网上download来的
 *          这个时候包名因为不同,所以会报错
 *          这种报错,推荐大家直接删除package声明语句,然后alt+回车 报错的位置
 *
 *      2,package声明语句的位置是有要求的,必须放在有效代码的第一行(注释不算有效代码)
 *          建议放在真正意义上的第一行
 *
 *      3,如果该java文件直接放在src目录下(没有包),这个时候就无需package关键字
 *
 */
//Missing package statement: 'com.cskaoyan.javase.oop1._12package'
public class Demo {
}
