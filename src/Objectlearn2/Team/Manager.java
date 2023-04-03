package Objectlearn2.Team;
/*

1. Manager 类：
2. 属性：姓名，工号，薪资
3. 经理的薪资有两部分组成：基本工资 +奖金（基本工资的五分之一）
4. 构造方法：无参构造方法，满参构造方法
5. 成员方法：get/set 方法、intro 方法：打印姓名，工号信息、showSalary 方法：打印薪资信息、work 方法：打印工作信息
 */
public class Manager extends Worker{
    private double basicSalary;
    private double bonus;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int number, double salary) {
        super(name, number, salary);

        setBasicSalary(salary*5/6);
        setBonus(salary*6);
    }

    @Override
    public void showSalary() {
        super.showSalary();
        System.out.println("BasicSalary:"+getSalary()+" "+"Bonus:"+getBonus());
    }

}
