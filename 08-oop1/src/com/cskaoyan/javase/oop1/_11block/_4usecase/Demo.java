package com.cskaoyan.javase.oop1._11block._4usecase;

/**
 * @description: 代码块的使用场景
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 构造代码块使用场景：
 *   - 不想让对象共享一个属性（static），但是还需要对象的某个属性具有相同初始值。
 *   - 比如公司新来了一批员工，他们的初始薪资一样，但是后面会根据表现调薪
 *     - 这个时候如果用static，显然不合适，因为调薪是针对个人的
 *     - 使用普通的成员变量定义薪资，然后用构造代码块给变量赋值
 *
 * - 静态代码块的经典使用场景：
 *   - 复杂的静态变量初始化
 *   - JDBC的驱动加载（Java EE学）
 *
 */
public class Demo {
}
