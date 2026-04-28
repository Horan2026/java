package test4;

import java.util.Random;

interface Staff{
   int getSalary();
}
class member{
    protected static final int DUES = 1500;
    String name;
    public member(String name){
        this.name = name;
    }

    public static int getDUES() {
        return DUES;
    }
    public String getName(){
        return name;
    }
}
class partTimer extends member implements Staff{
    private int salary;
    public partTimer(String name){
        super(name);
        //随机生成工资
        Random random = new Random();
        salary = random.nextInt(2001) + 1000;
    }
    @Override
    public int getSalary() {
        return salary;
    }
    //计算净收入
    public int getNetSalary(){
        return salary - DUES;
    }
    public void displayInfo(){
        System.out.println("员工姓名：" + getName());
        System.out.println("员工工资：" + getSalary());
        System.out.println("员工净收入：" + getNetSalary());
        int netSalary = getNetSalary();
        if (netSalary < 0){
            System.out.println("加油干吧！");
        }
        System.out.println("\n");
    }
}
public class S4_3 {
        public static void main(String[] args) {
            partTimer p1 = new partTimer("张三");
            partTimer p2 = new partTimer("李四");
            p1.displayInfo();
            p2.displayInfo();
        }

}
