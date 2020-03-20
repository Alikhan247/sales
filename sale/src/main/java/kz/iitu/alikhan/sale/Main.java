package kz.iitu.alikhan.sale;

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
        int input = sc.nextInt();
        if (input == 1){
            salariedController.showAllEmployees();
        } else if (input == 2){
            salariedController.updateEmployee();
        }

    }
}
