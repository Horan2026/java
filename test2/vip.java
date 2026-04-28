package test2;

import java.util.Scanner;
public class vip {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("请输入用户名（长度不小于3）");
        String username = sc.next();
        if (username.length() < 3){
            System.out.println("输入有误，用户名长度不能小于3");
        }

        System.out.println("请输入密码");
        String password = sc.next();
        if (password.length() < 6){
            System.out.println("输入有误，密码长度不能小于6");
        }
        System.out.println("请再次输入密码");
        String password2 = sc.next();
        if (!password2.equals(password)){
           System.out.println ("输入有误，密码不一致");
        }
        else System.out.println ("注册成功");
    }
}
