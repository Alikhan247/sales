package kz.iitu.alikhan.sale.Employee;


import org.springframework.stereotype.Component;

public class Hourly implements Employee {
    private int id;

    private String name;
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
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public int getHourse() {
        return salary;
    }
}
