package test2;

import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("请输入年月");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        boolean b = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        if ((year%4==0 && year%100!=0 )|| year%400==0) {
            if (b) {
                System.out.println(year +"年"+ month + "月" + "有31天");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(year +"年"+ month + "月" + "有30天");
            } else {
                System.out.println(year +"年"+ month + "月" + "有29天");
            }
        }
            else{
                if (b) {
                    System.out.println(year +"年"+ month + "月" + "有31天");
                }
            else if (month==4||month==6||month==9||month==11){
                        System.out.println(year +"年"+ month + "月" + "有30天");
                    }
                else {
                    System.out.println(year +"年"+ month + "月" + "有28天");

                }

            }
    }
}
