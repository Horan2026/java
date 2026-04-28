package winterVacation;

import java.util.Scanner;//1导包，找到Scanner这个类


public class ScannerOne {
    public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);//2创建对象
    //提示
    System.out.println("请输入整数小数和字符串");

   //3接收数据，i就接收了键盘录入的数据
    int i = sc.nextInt ();//nextInt, nextDouble, nextBoolean, next, nextLine,etc.
    double b = sc.nextDouble();
    String c = sc.next();
   //输出刚刚控制台输入的数据
    System.out.println (i);
    System.out.println (b);
    System.out.println (c);
    }
}
