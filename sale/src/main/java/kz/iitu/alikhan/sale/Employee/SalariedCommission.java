package kz.iitu.alikhan.sale.Employee;

import org.springframework.stereotype.Component;

public class SalariedCommission implements Employee {

    private int id;
    private String name;
    private int salary;
    private int hourseWorked;
    private int sales;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHourseWorked(int hourseWorked) {
        this.hourseWorked = hourseWorked;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getHourseWorked() {
        return hourseWorked;
    }

    public int getSales() {
        return sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
