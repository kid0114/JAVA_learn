package Objectlearn2;

public class testClass {
    public static void main() {
/*
        final finaldemo1 demo1=new finaldemo1(11,12);
        finaldemo1 demo2=new finaldemo1(12,13);
        //demo2.a=13;
        //demo2.s=15;
        finaldemo1 demo3=new finaldemo1(13,14);
       // demo1=demo2;
        demo3=demo2;
 *

 */
        abstractdemo1 demo=new abstractdemo1() {
            @Override
            public void showA() {
                System.out.println("A");
            }
        };
        //abstractdemo2 demo1=new abstractdemo2(10);
        /**
         * intfacedemo demo1=new intfacedemo() {
         *             @Override
         *             public int print() {
         *                 return 0;
         *             }
         *
         *             @Override
         *             public void showdemo1() {
         *                 helloworld();
         *             }
         *
         *             @Override
         *             public int helloworld() {
         *                 System.out.println("hello");
         *                 return 0;
         *             }
         *         };
         *         interfacedemo2 demo2=new interfacedemo2();
         *         demo1.showdemo1();
         *         demo2.showdemo1();
         */

        int a2 = StaticDemo.a;
        StaticDemo staticDemo=new StaticDemo(10);
         System.out.println(staticDemo.s);


    }

}
