package kz.iitu.alikhan.sale.transactions;

import kz.iitu.alikhan.sale.Employee.Employee;
import kz.iitu.alikhan.sale.Employee.Salaried;

public class Payment {
    private Employee employee;

    public void calculateSalary(){
        if (employee instanceof Salaried){
            System.out.println("Total payment for this employee is: ");
            System.out.println(employee.getSalary() + employee.getSalary() * 0.10);
        }
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
