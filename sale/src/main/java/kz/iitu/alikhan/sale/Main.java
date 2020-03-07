package kz.iitu.alikhan.sale;

import kz.iitu.alikhan.sale.Employee.SalariedCommission;
import kz.iitu.alikhan.sale.controller.SalariedController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        SalariedController salariedController
                = context.getBean("salariedController", SalariedController.class);

        salariedController.showMenu();

        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == 1){
            salariedController.showAllEmployees();
        } else if (sc.nextInt() == 2){
            System.out.println("Enter an id:");
            salariedController.updateEmployee(sc.nextInt());
        }

    }
}
