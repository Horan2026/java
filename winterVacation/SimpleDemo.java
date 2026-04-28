package winterVacation;

// 公共类名，需保存为 winterVacation.SimpleDemo.java（类名=文件名，大小写一致）
    public class SimpleDemo {
        // 程序唯一入口main方法
        public static void main(String[] args) {
            // 1. 定义不同类型的变量（整数、字符串、浮点数）
            String userName = "Java新手"; // 字符串变量，存储文本
            int age = 18;                 // 整数变量，存储整数
            double score = 98.5;          // 浮点变量，存储小数

            // 2. 算术运算（简单计算，直接输出结果）
            int sum = 10 + 20;            // 加法运算，结果赋值给sum
            double average = (90 + 98.5) / 2; // 混合运算，求平均值

            // 3. 控制台输出（拼接文本和变量，直观展示结果）
            System.out.println("我的名字：" + userName);
            System.out.println("我的年龄：" + age + "岁");
            System.out.println("10+20的结果：" + sum);
            System.out.println("两门成绩的平均分：" + average);
            System.out.println("程序运行完成！");
        }
    }
