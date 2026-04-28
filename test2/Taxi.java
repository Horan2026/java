package test2;

import  java.util.Scanner;
public class Taxi {
    public static void main(String[] args) {
        double money = 0;
        System.out.println("你坐了多远的车？");

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        if (n <= 2 && n > 0){
            money = n;
        }
        else if (n > 2&&n <= 9){
            money = n * 1.3;
        }
        else if (n > 9){
            money = n * 2;
        }
        System.out.printf("付"+ money +"块钱");
    }
}