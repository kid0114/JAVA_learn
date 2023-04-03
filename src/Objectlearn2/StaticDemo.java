package Objectlearn2;

public class StaticDemo {
    static int a=10;
    int s=9;
    StaticDemo(int a){
        setA(a);
    }
    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        StaticDemo.a = a;
    }
}
