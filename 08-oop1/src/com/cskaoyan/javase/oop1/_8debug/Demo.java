package com.cskaoyan.javase.oop1._8debug;

/**
 * @description: 包装类与debug模式
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 首先看一个经典的编译错误: Non-static field 'start' cannot be referenced from a static context
 * 说人话: 不要在一个静态的方法中去访问一个非static修饰的成员变量
 * 所以static方法应该只能够访问static修饰的成员变量
 *
 * Integer是int类型的包装类,包装类就是把基本数据类型数据封装在一个对象当中,使基本数据类型也成为对象
 * Integer.MAX_VALUE 是int类型的最大值
 *
 * 接下来分析程序,回答程序输出的结果:
 *      5
 *      6 --- 1
 *      7
 *     死循环 --- 2
 *     报错 --- 1
 *
 *- Integer.MAX_VALUE的二进制是0111 1111 1111 1111 1111 1111 1111 1111
 * - Integer.MIN_VALUE的二进制是 1000 0000 0000 0000 0000 0000 0000 0000
 *
 * 所以实际上程序会死循环,因为有符号数的最大值+1 往往得到它的最小值
 *
 * 包装类和它的基本数据类型的转换:
 *      由于Java自带"自动拆箱装箱"的机制,所以int和它的包装类可以完全的任意转换
 * 包装类的使用场景:
 *      由于基本数据类型不存在null这种说法,所以在一些需要null的场景时,可以使用包装类
 *
 *其它的包装类:
 *      byte ---> Byte
 *      short ---> Short
 *      int ----> Integer
 *      long ---> Long
 *
 *      float ---> Float
 *      double ---> Double
 *
 *      char ---> Character
 *      boolean ---> Boolean
 *      void ---> Void
 *
 * 使用Debug模式的细节:
 *      在查看比较深入代码时,如果希望能够跳转到之前看到的代码部分,可以使用快捷键
 *      ctrl + alt + 左右方向键
 *      表示跳转到鼠标光标前一次和后一次的位置
 *
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MAX_VALUE + 1); //128
        System.out.println(((byte) (Byte.MAX_VALUE + 1)));

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MAX_VALUE + 1);
        System.out.println(((short) (Short.MAX_VALUE + 1)));
        System.out.println(Short.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        //Numeric overflow in expression
        System.out.println(Long.MAX_VALUE + 1);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MAX_VALUE + 0);
        System.out.println(Character.MAX_VALUE + 1); //65536
        System.out.println(((char) (Character.MAX_VALUE + 1))); //绝对空字符


    }


    /*static int end = Integer.MAX_VALUE;
    static int start = end - 5;

    public static void main(String[] args) {
        int count = 0;
        for (int i = start; i < end; i++){
            count++;
        }
        System.out.println(count);
    }*/

    /*public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //arr = new int[]{};
        arr = null;
        System.out.println(retrieve(arr, 1));
    }

    public static Integer retrieve(int[] arr, int target) {
        //改进,使方法能够应对输入null数组
        if (arr == null) {
            System.out.println("请您输入正确的数组,而不是一个null数组!");
            //直接结束方法
            return null;
        }
        int targetIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                targetIndex = i;
                break;
            }
        }
        return targetIndex;
    }

    public static Integer getMaxValue(int[] arr) {
        if (arr == null){
            return null;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }*/
}
