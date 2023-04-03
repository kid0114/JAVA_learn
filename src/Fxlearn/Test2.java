/*内部类
        1).什么是内部类

        将一个类A定义在另一个类B里面，里面的那个类A就称为内部类，B则称为外部类。

        2).什么是成员内部类

        定义在类中方法外的类。

        定义格式：

class 外部类 {
    class 内部类{

    }

} */
/*
3).内部类使用场景

        在描述事物时，若一个事物内部还包含其他事物，就可以使用内部类这种结构。比如，汽车类 Car 中包含发动机 类 Engine ，这时， Engine 就可以使用内部类来描述，定义在成员位置。

        4).内部类访问特点

        内部类可以直接访问外部类的成员，包括私有成员。

        外部类要访问内部类的成员，必须要建立内部类的对象。

        内部类可以声明为static的，但此时就不能再使用外层封装类的非static的成员变量；

        非static的内部类中的成员不能声明为static的，只有在顶层类或static的内部类中才可声明static成员；

        创建内部类对象格式：

        外部类名.内部类名 对象名 = new 外部类型().new 内部类型()；

        代码演示：
public class Person {
    private  boolean live = true;
    class Heart {
        public void jump() {
            // 直接访问外部类成员
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        // 创建外部类对象
        Person p  = new Person();
        // 创建内部类对象
        Heart heart = p.new Heart();
        // 调用内部类方法
        heart.jump();
        // 调用外部类方法
        p.setLive(false);
        // 调用内部类方法
        heart.jump();
    }
}

内部类仍然是一个独立的类，在编译之后会内部类会被编译成独立的.class文件，但是前面冠以外部类的类名 和$符号 。 比如，Person$Heart.class。

        3.匿名内部类
        1).匿名内部类概述

        匿名内部类是内部类的简化写法。它的本质是一个 带具体实现的 父类或者父接口的 匿名的 子类对象。开发中，最常用到的内部类就是匿名内部类了。以接口举例，当你使用一个接口时，似乎得做如下几步操作，

        1. 定义子类

        2. 重写接口中的方法

        3. 创建子类对象

        4. 调用重写后的方法

        我们的目的，最终只是为了调用方法，那么能不能简化一下，把以上四步合成一步呢？匿名内部类就是做这样的快捷方式。

        2).匿名内部类前提

        匿名内部类必须继承一个父类或者实现一个父接口。

        格式：

        new 父类名或者接口名(){
// 方法重写
@Override
public void method() {
        // 执行语句
        }
        };

        3).匿名内部类使用

//定义接口
public interface FlyAble{
    void fly();
}

//创建测试类
/*
public class InnerDemo {

    public static void main(String[] args) {

    1.等号右边:是匿名内部类，定义并创建该接口的子类对象
    2.等号左边:是多态赋值,接口类型引用指向子类对象

        FlyAble  f = new FlyAble(){
            public void fly() {
                System.out.println("我飞了~~~");
            }
        };

        //调用 fly方法,执行重写后的方法
        f.fly();
    }
}
        */