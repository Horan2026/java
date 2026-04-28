package test2;

public class Turtle {
    public static void main(String[] args) {
        //乌龟走四米退一米
        int road = 100;
        int miles = 0;
        int hours = 0;
        while (miles < road) {
            miles +=4;
            hours++;
            miles -=1;
        }
        System.out.println(hours);
    }
}
