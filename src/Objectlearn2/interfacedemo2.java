package Objectlearn2;
public class interfacedemo2 implements intfacedemo {
    @Override
    public int print() {
        return 0;
    }

    @Override
    public void showdemo1() {
        helloworld();
    }

    @Override
    public int helloworld() {
        System.out.println("hello world");
        return 0;
    }
}
