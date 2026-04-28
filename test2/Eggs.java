package test2;

public class Eggs {
    public static void main(String[] args) {
        int eggs = 0;

        while(true){
            boolean match = (eggs % 2 == 1) &&
                        (eggs % 3 == 0) &&
                        (eggs % 4 == 1) &&
                        (eggs % 5 == 4) &&
                        (eggs % 6 == 3) &&
                        (eggs % 7 == 0) &&
                        (eggs % 8 == 1) &&
                        (eggs % 9 == 0);
            if(match){

                System.out.println(eggs);
                break;
            }
            eggs++;
        }
    }
}
