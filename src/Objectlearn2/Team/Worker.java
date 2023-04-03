package Objectlearn2.Team;

public class Worker {
    protected String name;
    protected int number;
    protected double salary;


    public Worker(String name,int number,double salary){
        setName(name);
        setNumber(number);
        setSalary(salary);
    }
    public Worker(){
    }

    public void intro(){
        System.out.println("Name:"+name+" "+"Number:"+number);
    }

    public void showSalary(){
        System.out.println("Salary:"+salary);
    }
    public void showWork(){
        System.out.println("Work Data");
        System.out.println("Number"+number);
        System.out.println("Salary:"+salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
