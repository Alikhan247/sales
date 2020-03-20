package kz.iitu.alikhan.sale.service;

import kz.iitu.alikhan.sale.Employee.Employee;
import kz.iitu.alikhan.sale.repository.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EmplyeeService {

    private EmployeeDataRepository employeeDataRepository;
    private ApplicationEventPublisher eventPublisher;



    //Dao was replaced by repository for the employee table
    @Autowired
    public EmplyeeService(EmployeeDataRepository employeeDataRepository){
        this.employeeDataRepository = employeeDataRepository;
    }

    public void updateEmployeesSalary(){
       employeeDataRepository.addSalaryIncrease();
    }

    public void showAllEmployees(){
        System.out.println();
        System.out.println("Employees list: ");
        for (Employee employee: employeeDataRepository.findAll()) {
            System.out.println(employee.toString());
        }
        System.out.println();
    }
}
