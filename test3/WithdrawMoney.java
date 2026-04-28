package test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WithdrawMoney {
    public static class Account{
        private int id;
        private String owner;
        private double balance;
        private int password;
        public Account(int id, String owner, double balance, int password){
            this.id = id;
            this.balance = balance;
            this.owner = owner;
            this.password =password;
        }

        public int getId(){
            return id;
        }

        public String getOwner(){
            return owner;
        }

        public double getBalance(){
            return balance;
        }

        public int getPassword(){
            return password;
        }

        public void setBalance(double balance){
            this.balance = balance;
        }
    }

    static class ATM{
        private List<Account> accountList = new ArrayList<>();
        private Account currentAccount;
        private Scanner sc = new Scanner(System.in);

        public ATM(){
            accountList.add(new Account(1, "张三", 1000.0, 123456));
            accountList.add(new Account(2, "李四", 2000.0, 654321));
            accountList.add(new Account(3,"王五",10000.0,111111) );

        }
        void login(){
            System.out.println("===== 欢迎使用ATM系统 =====");
            System.out.println("请输入账号：");
            int id = sc.nextInt();

            Account foundAccount = null;
            //find account
            for(Account account : accountList){
                if (account.getId() == id){
                    //验证密码
                    foundAccount = account;
                    //成功则进入菜单
                    break;
                }
            }

            if (foundAccount == null){
                System.out.println("账号不存在");
                return;
            }

            System.out.println("请输入密码：");
            int password = sc.nextInt();

            if (foundAccount.getPassword() != password){
                System.out.println("密码错误！");
                return;
            }

            currentAccount = foundAccount;
            System.out.println("登录成功！欢迎您，" + foundAccount.getOwner());
            showMenu();
        }
        void showMenu(){
            while(true){
                //显示选项
                System.out.println("\n=====操作菜单=====");
                System.out.println("1. 存款");
                System.out.println("2. 取款");
                System.out.println("3. 退出");
                System.out.print("请选择操作: ");

                int choice = sc.nextInt();
                //switch 处理用户选择
                switch (choice){
                    case 1:
                        deposit();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        System.out.println("退出ATM系统");
                        return;
                    default:
                        System.out.println("无效的选择，请重新选择");
                        break;
                }
            }
        }
        void deposit(){
            System.out.println("请输入存款金额：");
            double amount = sc.nextDouble();

            if (amount <= 0){
                System.out.println("存款金额必须大于0！");
                return;
            }

            currentAccount.setBalance(currentAccount.getBalance() + amount);
            System.out.println("存款成功！当前余额: " + currentAccount.getBalance());
        }

        void withdraw(){
            System.out.print("请输入取款金额: ");
            double amount = sc.nextDouble();

            if (amount <= 0){
                System.out.println("取款金额必须大于0！");
                return;
            }

            if (amount > currentAccount.getBalance()){
                System.out.println("余额不足！当前余额: " + currentAccount.getBalance());
                return;
            }

            currentAccount.setBalance(currentAccount.getBalance() - amount);
            System.out.println("取款成功！当前余额: " + currentAccount.getBalance());
        }
    }

    public static void main(String[] args){
        ATM atm = new ATM();
        atm.login();
    }
}


