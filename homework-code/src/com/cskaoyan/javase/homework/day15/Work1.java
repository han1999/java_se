package com.cskaoyan.javase.homework.day15;

import java.util.Scanner;

/**
 * @description: 异常处理练习题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Work1 {
    public static void main(String[] args) {
        System.out.println(ScannerUtils.getInt());
    }


}

class ScannerUtils {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getInt() {

        System.out.println("请键盘输入一个int数字：");

        int num;
        while (true) {
            String numStr = SCANNER.nextLine();
            try {
                num = Integer.parseInt(numStr);
            } catch (NumberFormatException e) {
                System.out.println("输入有误，请重新输入：");
                continue;
            }
            break;
        }
        return num;


    }
}