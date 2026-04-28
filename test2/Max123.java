package test2;

import java.util.Scanner;

public class Max123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        method m = new method();
        m.max(a,b);

        System.out.println("请输入2个小数");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        m.max(x,y);

        System.out.println("请输入3个小数");
        double q = sc.nextDouble();
        double w = sc.nextDouble();
        double e = sc.nextDouble();
        m.max(q,w,e);
    }
}
class method{
    void max(int a, int b){
        if (a > b){
            System.out.println(a+"是最大值");
        }
        else {
            System.out.println(b+"是最大值");
        }
    }
    void max(double a, double b){
        if (a > b){
            System.out.println(a+"是最大值");
        }
        else {
            System.out.println(b+"是最大值");
        }
    }
    void max(double a, double b, double c){
        if (a > b && a > c){
            System.out.println(a+"是最大值");
        }
        else if (b > a && b > c){
            System.out.println(b+"是最大值");
        }
        else {
            System.out.println(c+"是最大值");
        }
    }
}
