package test2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("请输入正整数n");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result =jiecheng(n);

        System.out.println(n + "!=" + result);

        sc.close();
    }
    public static int jiecheng(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        else if (n < 0) {
            return 0;
        }
        else  return n*jiecheng(n-1);

    }
}
