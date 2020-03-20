package kz.iitu.alikhan.sale.repository;

import kz.iitu.alikhan.sale.Dao.Contract;
import kz.iitu.alikhan.sale.Employee.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeDataRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByEmplType(Enum emplType);

    @Transactional
    @Modifying
    @Query(value = Contract.UPDATE_EMPLOYEES_SALARY + "fixed_salary + (fixed_salary * 0.10) WHERE empl_type = 'SALARIED'", nativeQuery = true)


    void addSalaryIncrease();
}
