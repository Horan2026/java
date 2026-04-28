package test4;
// S4_2类不能被继承
final public class S4_2 {
    //a不让改了
    final int a = 10;
    //show方法不可以重写了
    final void show() {
        System.out.println("a=" + a);
    }
}

class Test /* extends S4_2*/{
    public static void main(String[] args) {
        S4_2 s = new S4_2();
        s.show();

        //a = 20;
        System.out.println("a=" + s.a);
        /*@Override
        * void show(){
        *
        * }*/
    }
}
