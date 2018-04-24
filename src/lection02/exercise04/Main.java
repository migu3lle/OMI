package lection02.exercise04;

public class Main {
    public static void main(String args[]) {
        B b1 = new B();
        System.out.println(b1.answer);
        System.out.println(b1.getClassName());
        System.out.println(b1.callMethod());
        A b2 = new B();
        System.out.println(b2.answer);
        System.out.println(b2.getClassName());
        System.out.println(b2.callMethod());
    }
}