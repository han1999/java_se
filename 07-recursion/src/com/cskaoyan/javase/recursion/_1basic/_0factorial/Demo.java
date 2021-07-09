package com.cskaoyan.javase.recursion._1basic._0factorial;

/**
 * @description: 递归的思想
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * factorial
 * 引例：
 * ​	使用递归计算N（N>=1）的阶乘
 *
 * N! = N * (N-1) * (N-2) * ... *1
 * 递归的思想(分解问题,简化问题)
 * 1. 把一个复杂的大规模的问题，分解成若干相似的小规模的子问题
 * 2. 当子问题规模足够小的时候，就可以直接得到小规模问题的解
 * 3. 然后把所有的小规模的子问题的解，组合起来
 * 4. 最终得到大规模问题的解
 *
 * 怎么分解问题,并且能够找到递归体?
 * 假设N的阶乘是f(N)
 * N! = N * (N-1)!
 * (N-1)! = (N-1)*(N-2)!
 * ...
 * 2! = 2 * 1!
 * 1! = 1
 * 于是:
 * 递归体: f(N) = N * f(N-1)
 * 递归的出口: 当N=1时,f(N)=1
 *
 * 以上,总结一下递归的优缺点:
 *      优点:
 *      1,代码简洁优雅
 *      2,并且思考难度很低,递归的思想符合人类解决问题的习惯
 *
 *      缺点:
 *      1,递归很危险,很容易导致栈溢出
 *      2,递归过程中,频繁的方法进栈出栈,非常浪费时间,并且还要占用栈内存空间
 *          所以递归时空复杂度都是不优越
 *
 *   以上,递归虽然代码优雅好想,但是递归的缺点也是很明显的,所以正常开发中尽量避免使用递归,除非迫不得已
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int n) {
        //递归,递归,要先写出口
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
