package kz.iitu.alikhan.sale.controller;

import kz.iitu.alikhan.sale.service.SalariedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalariedController {
    private SalariedService salariedService;

    @Autowired
    public SalariedController(SalariedService salariedService){
        this.salariedService = salariedService;
    }


    public void showMenu(){
        System.out.println("Welcome!");
        System.out.println("Select an option:");
        System.out.println("1) list all employees");
        System.out.println("2) update employees");
    }

    public void showAllEmployees(){
        salariedService.showAllEmployees();
    }

    public void updateEmployee(int id){
//        salariedService.showAllEmployees();
    }

}
