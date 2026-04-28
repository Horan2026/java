package test2;

public class CircleSum {
    public static void main(String[] args) {
        double sum = 1;
        double sum1 = 1;
        //for
        for (int i = 2; i <= 20; i++) {
            if(i % 2 == 0){
                sum += 1.0 /fac(i);
            }
            else {
                sum -= 1.0 /fac(i);
            }
        }

        //do-while
        int j = 2;
        do{;
            if ( j % 2 == 0){
                sum1 += 1.0 /fac(j);
            }
            else {
                sum1 -= 1.0 /fac(j);
            }
            j++;
        }while(j <= 20);

        System.out.println(sum);
        System.out.println(sum1);
    }
    public static int fac(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        else if (n < 0) {
            return 0;
        }
        else  return n*fac(n-1);

    }
}
