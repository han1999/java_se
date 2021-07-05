/**
 * @description: 我的第一行代码: 你好世界!
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 本class目的: 怎么运行从Git上下载下来的代码?
 *      1,根据class右上角的提示setup SDK,直接选择8或者指定你的jdk8安装目录
 *      2,然后按住ctrl + alt + shift + s 打开project structure
 *          或者左上角 file --> project structure
 *      3,查看其中的project选项页
 *          然后将project language level 设置为8
 *          project compiler output目录要设置出来:
 *          建议设置为
 *          当前目录/out
 *      5,设置文件夹权限.查看其中Modules选项页:
 *          将src目录设置为蓝色的Sources权限
 *          其余不要乱动
 *
 *      6,以上,就可以运行代码了
 *
 *  补做:
 *      设置module
 *      这个可以不做,不会影响代码运行,但是最好也设置一下
 *      同样在project structure当中的Modules选项页
 *      点击加号,然后import module
 *      选择具体的课程的module,比如test/basic等等
 *      然后直接下一步 下一步 完成添加
 *      最后不要忘记修改src目录权限
 *
 *     注意src目录的权限只能属于某一个module,不能同时属于两个,会报错!
 *
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println("你好，中国！");
        //xxxx
        //Translation的快捷键CTRL + shift + Y

        //快捷键
        //alt + 回车
        //ctrl + alt + L
        int a = 12;
        int b = 30;
        System.out.println(a + b - 12);

        //多行注释
        /**
         * 浮点数的表示方式：
         * 1，符号位
         * 2，阶码（指数位）
         * 3，尾数（小数位）
         * 因为浮点数的表示中存在指数位，所以浮点数可以表示特别大和特别小的数
         * 任何浮点数包括float都比long类型表示范围大的多得多
         *
         * 浮点数的尾数可以看成是科学计数法中的有效数字，因为尾数的位数是有限的
         * 所以浮点数的有效位数也是有限的
         * 所以浮点数的表示具有精度问题
         *
         *
         *
         */
    }
}
