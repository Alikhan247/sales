package kz.iitu.alikhan.sale.service;

import kz.iitu.alikhan.sale.Dao.SalaryDao;
import kz.iitu.alikhan.sale.Employee.Salaried;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalariedService {
    private SalaryDao salaryDao;


    @Autowired
    public SalariedService(SalaryDao salaryDao){
        this.salaryDao = salaryDao;
    }

    public void showAllEmployees(){
        List<Salaried> employees = salaryDao.getAll();
        System.out.println();
        System.out.println("Employees list: ");
        for (Salaried employee: employees) {
            System.out.println(employee.toString());
        }
        System.out.println();

    }
}
