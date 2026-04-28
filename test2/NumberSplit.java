package test2;

import java.util.Scanner;
public class NumberSplit {
    public static void main(String[] args) {
        //键盘输入一个三位数,输出个位十位百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println ("个位是" + ge);
        System.out.println ("十位是" + shi);
        System.out.println ("百位是" + bai);
    }
}
