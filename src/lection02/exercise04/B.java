package lection02.exercise04;

public class B extends A {
    public static int answer = 42;
    public static String getClassName() {
        return "Name of class: B";
    }
    @Override
    public String callMethod() {
        return "Method of class: B";
    }
}
