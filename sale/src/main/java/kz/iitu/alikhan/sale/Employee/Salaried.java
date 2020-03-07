package kz.iitu.alikhan.sale.Employee;


import org.springframework.stereotype.Component;


public class Salaried implements Employee {
    private String name;
    private int id;
    private int salary;
    private int hourseWorked;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHourseWorked(int hourseWorked) {
        this.hourseWorked = hourseWorked;
    }

    @Override
    public void setSales(int sales) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public int getHourse() {
        return hourseWorked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHourseWorked() {
        return hourseWorked;
    }

    @Override
    public String toString() {
        return "Salaried{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", hourseWorked=" + hourseWorked +
                '}';
    }
}
