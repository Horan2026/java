package test3;

import java.util.Scanner;

public class MonkeyAssistant {
    String name;
    int age;
    double weight;
    double temperature;
    String hobby;

    public MonkeyAssistant() {
        this.name = "小猴子";
        this.age = 1;
        this.weight = 10.0;
        this.temperature = 37.0;
        this.hobby = "玩耍";
    }
    public MonkeyAssistant(String name, int age, double weight, double temperature){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.temperature = temperature;
    }
    public static void main(String[] args){
        MonkeyAssistant assistant1 = new MonkeyAssistant();
        MonkeyAssistant assistant2 = new MonkeyAssistant("皮皮",2,48.0,0);
        assistant1.printDetails();
        System.out.println();
        assistant2.printDetails();

        assistant1.climbTree();
        assistant2.climbTree();

        //调用温度转化方法
        double fahrenheit = assistant1.celsiusToFahrenheit(assistant1.temperature);
        double celsius = assistant2.fahrenheitToCelsius(assistant2.temperature);
        System.out.println(assistant1.temperature + "°C" + " = " + fahrenheit + "°F");
        System.out.println(assistant2.temperature + "°F" + " = " + celsius + "°C");

    }
    void climbTree(){
        System.out.println("Monkey " +name+ " is climbing a tree.");
    }
    void printDetails(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Weight: " +weight);
        System.out.println("hobby:" + hobby);
    }

    void setTemperature(double temperature) {
        System.out.println("please input temperature");
        this.temperature = temperature;
    }
    double celsiusToFahrenheit(double celsius){
        System.out.println("please input a celsius temperature");
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextDouble();
        return celsius * 1.8 + 32;
    }
    int celsiusToFahrenheit(int celsius){
        System.out.println("please input a celsius temperature");
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextInt();
        return (int) (celsius * 1.8 + 32);
    }
    double fahrenheitToCelsius(double fahrenheit){
        System.out.println("please input a fahrenheit temperature");
        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextDouble();
        return (fahrenheit - 32) / 1.8;
    }
    int fahrenheitToCelsius(int fahrenheit){
        System.out.println("please input a fahrenheit temperature");
        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextInt();
        return (int) ((fahrenheit - 32) / 1.8);
    }

}
