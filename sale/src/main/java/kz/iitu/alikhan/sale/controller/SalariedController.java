package kz.iitu.alikhan.sale.controller;

import kz.iitu.alikhan.sale.service.EmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalariedController {
    private EmplyeeService emplyeeService;

    @Autowired
    public SalariedController(EmplyeeService emplyeeService){
        this.emplyeeService = emplyeeService;
    }


    public void showMenu(){
        System.out.println("Welcome!");
        System.out.println("Select an option:");
        System.out.println("1) list all users in the base");
        System.out.println("2) update user");
        System.out.println("3) add a bill");
    }

    public void showAllEmployees(){
        emplyeeService.showAllEmployees();
    }

    public void updateEmployee(){
        emplyeeService.updateEmployeesSalary();
    }


}
