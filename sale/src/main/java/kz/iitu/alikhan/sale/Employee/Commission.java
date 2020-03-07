package kz.iitu.alikhan.sale.Employee;

import org.springframework.stereotype.Component;

public class Commission implements Employee {
    private int id;
    private String name;
    private int sales;
    private int hourseWorked;


    public void setHourseWorked(int hourseWorked) {
        this.hourseWorked = hourseWorked;
    }

    public int getHourseWorked() {
        return hourseWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(int salary) {

    }

    public void setSales(int sales) {
        this.sales = sales;
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
        return 0;
    }

    @Override
    public int getHourse() {
        return hourseWorked;
    }

}
