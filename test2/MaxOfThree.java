package test2;

import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个数字:");
        int a = sc.nextInt();

        System.out.print("请输入第二个数字:");
        int b = sc.nextInt();

        System.out.print("请输入第三个数字:");
        int c = sc.nextInt();

        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        //这个是ai提供的更好的算法
        int betterMax = Math.max((Math.max(a, b)), c);
        System.out.println("最大的数字是" + max);
        System.out.print("最大的数字是" + betterMax);
    }

}