package test2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("输入你想要的数字n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < a.length; i++){
        if (a[i] == n){
            System.out.println("找到数字n,下标是" + i);
        }
        else{
            System.out.println("没有找到数字n");
        }
        break;
        }
    }
}
