package Objectlearn2;

public class abstractdemo2 extends abstractdemo1{
    abstractdemo2(int a) {
        super(a);
    }

    @Override
    public void showA() {
        System.out.println(this.a);
    }
}
