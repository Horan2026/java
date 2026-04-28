package test3;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String position;
    private String department;
    private int attendanceCount;
    public static int totalAttendanceCount = 0;

    //主方法
    public static void main(String[] args) {
    Employee employee1 = new Employee(123456789,"John",21,"Programmer","IT",0);
    Employee employee2 = new Employee(1234567890,"Bay",24,"Designer","Marketing",0);

    //俩调用
    employee1.displayInfo();
    System.out.println(employee1.sign_in("John"));

    System.out.println();

    employee2.displayInfo();
    System.out.println(employee2.sign_in("Bay"));
    }

    //默认构造
    public Employee() {
        id = 0;
        name = "Unknown";
        age = 0;
        position = "Unknown";
        department = "Unknown";
    }
    //传参构造
    public Employee(int id, String name, int age, String position, String department, int attendanceCount){
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
        this.attendanceCount = attendanceCount;
    }
    public String sign_in(String name){
    this.attendanceCount++;
    this.totalAttendanceCount++;
        return  name + "已经签到，当前共有" + totalAttendanceCount +"人已签到。";
    }
    public void displayInfo(){
        System.out.println("员工编号：" + id);
        System.out.println("员工姓名：" + name);
        System.out.println("员工年龄：" + age);
        System.out.println("员工职位：" + position);
        System.out.println("员工部门：" + department);
    }
}
