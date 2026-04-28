package test1;

public class hello{
    public static void main(String[] args){
        System.out.print ("Hello!");
        Student1 zhang = new Student1();
        zhang.speak();
    }
}
class Student1{
    void speak(){
        System.out.print ("I am a student.");
    }
}
