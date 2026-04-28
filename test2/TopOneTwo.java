package test2;

import java.util.Scanner;

public class TopOneTwo {
    public static void main(String[] args) {
    students s = new students();
    s.info();
    }
}

class students{
    void info(){
        System.out.println("输入学生个数");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("请输入第" + (i+1) + "个学生的姓名");
            name[i] = sc.next();
            System.out.println("请输入第" + (i+1) + "个学生的成绩");
            score[i] = sc.nextInt();
        }
        int first = 0;
        int second = -1;
        for (int i = 1; i < n; i++){
            if (score[i] > score[first]){
                first = i;
            }
        }
        for (int i = 0; i < n; i++){
            if (i != first) {
                if (second ==-1 || score[i] > score[second]) {
                    second = i;
                }
            }
        }
        System.out.println("成绩排名");
        System.out.println("第一名:" + name[first] + "-" + score[first] + "分");

        if (second != -1){
            System.out.println("第二名:" + name[second] + "-" + score[second] + "分");
        }
        else{
            System.out.println("没有第二名");
        }
        sc.close();
    }
}
