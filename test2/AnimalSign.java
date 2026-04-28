package test2;

import java.util.Scanner;
public class AnimalSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的出生年份：");
        int year = sc.nextInt();
        switch (year%12){
            case 0:
                System.out.println("你属猴");
                break;
            case 1:
                System.out.println("你属鸡");
                break;
            case 2:
                System.out.println("你属狗");
                break;
            case 3:
                System.out.println("你属猪");
                break;
            case 4:
                System.out.println("你属鼠");
                break;
            case 5:
                System.out.println("你属牛");
                break;
            case 6:
                System.out.println("你属虎");
                break;
            case 7:
                System.out.println("你属兔");
                break;
            case 8:
                System.out.println("你属龙");
                break;
                case 9:
                System.out.println("你属蛇");
                break;
                case 10:
                System.out.println("你属马");
                break;
                case 11:
                System.out.println("你属羊");
                break;
        }
    }
}
