package test4;

class staff{
    String name;
    int age;
    String id;
    double salary;
    int year;
    public staff(String name, int age, String id, double salary, int year){
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.year = year;
    }
    double salaryUp(){
        return salary*1.1;
    }
}
class manager extends staff{
    public manager(String name, int age, String id, double salary, int year){
        super(name, age, id, salary, year);
    }
    @Override
    public double salaryUp(){
        return salary*1.2;
    }
}
public class S4_5 {
    public static void main(String[] args) {
        staff s1 = new staff("张三", 18, "123456", 5000, 2010);
        staff s2 = new manager("李四", 20, "654321", 8000, 2015);
        System.out.println("员工姓名：" + s1.name);
        System.out.println(s1.name + "'s salary is " + s1.salary);
        System.out.println(s1.name + "'s salary after increase is " + s1.salaryUp());
        System.out.println("\n");
        System.out.println("员工姓名：" + s2.name);
        System.out.println(s2.name + "'s salary is " + s2.salary);
        System.out.println(s2.name + "'s salary after increase is " + s2.salaryUp());
    }
}
