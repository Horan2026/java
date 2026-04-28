package test2;

import java.util.Scanner;
public class TenSum{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("请输入第" + i + "个数字:");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("和为：" + sum);
    }
}
