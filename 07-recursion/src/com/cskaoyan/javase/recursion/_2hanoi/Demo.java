package com.cskaoyan.javase.recursion._2hanoi;

/**
 * @description: 汉诺塔问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 相传在古印度的圣庙中，有一种被称之为汉诺塔（也叫河内塔，Hanoi）的游戏
 * 简单来说：有三个塔1，2，3，塔1上有 N 个（N>1）穿孔圆盘，大盘在下，小盘在上
 * 要求按下列规则将所有圆盘移至塔3：
 * 	1，每次只能移动一个圆盘
 * 	2，大盘一定在小盘之下
 * 提示：可将圆盘临时置于塔2，也可以将塔1的圆盘重新移回塔1，但都必须遵循上述两条规则
 * 问：当塔1上有N（N>=1）个圆盘时，最少要移动多少次？（注意是最少）
 *
 * 总结一下规律:
 *  要想使用塔1上的盘子全部移到塔3,肯定有一步是把塔1上最大的盘子移到塔3,
 *      这个时候塔3肯定是空的,所以塔1上除了最大的盘子外的所有盘子,肯定在塔2上
 *
 * 于是,不难得出结论，要想塔1的盘子全部移到塔3，无非三步
 * 1. 步骤1：将塔1上，除了最大的那个盘子外的所有盘子，移到塔2上，塔3没有任何盘子
 *    - 注意，这个时候塔2的盘子必然是从上到下，从小到大的，这个过程要借助塔3做中转
 * 2. 步骤2：将塔1上的最大的那个盘子，移到空的塔3上
 * 3. 将塔2中的盘子都挪到塔3上，这个过程要借助塔1中转
 *
 * 假设将N个盘子的汉诺塔问题解决至少需要f(N)步
 * 那么解决f(N)的汉诺塔问题,就可以分解成三步
 * 1,将N-1个盘子从塔1挪到塔2,借助空的塔3
 * 2,将最大的盘子从塔1挪到塔3
 * 3,将N-1个盘子从塔2挪到塔3,借助空的塔1
 *
 * 于是分解后需要的步数是:
 * 1,f(N-1)
 * 2,1步
 * 3,f(N-1)
 *
 * 于是得出结论: f(N) = f(N-1) + 1 + f(N-1)
 * 递归体就是: f(N) = f(N-1) + 1 + f(N-1)
 * 递归的出口是:当N=1时,f(N)= 1
 *
 * 通过给定的式子f(N) = f(N-1) + 1 + f(N-1),求通项公式
 * f(N) = 2f(N-1)+1
 * f(N)+1 = 2(f(N-1)+1)
 * f(N)+1 /(f(N-1)+1) = 2
 * --->
 * f(N)+ 1 = 2的n次方
 * f(N) = 2的n次方 -1
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(hanoi(10));
    }

    //求解决汉诺塔问题的最小步骤
    public static long hanoi(int n) {
        //写递归的出口
        if (n == 1) {
            return 1;
        }
        //递归体
        return hanoi(n - 1) + 1 + hanoi(n - 1);
    }
}
