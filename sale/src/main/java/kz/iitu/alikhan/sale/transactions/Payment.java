package kz.iitu.alikhan.sale.transactions;

import kz.iitu.alikhan.sale.Employee.Employee;

public class Payment {
    private Employee employee;

    public void calculateSalary(){
            System.out.println("Total payment for this employee is: ");
            System.out.println(employee.getFixedSalary() + employee.getFixedSalary() * 0.10);
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
