package kz.iitu.alikhan.sale.Dao;

import kz.iitu.alikhan.sale.Employee.Salaried;
import kz.iitu.alikhan.sale.database.Database;
import kz.iitu.alikhan.sale.event.UserCreateEvent;
import kz.iitu.alikhan.sale.event.UserUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.swing.text.html.ListView;
import java.util.List;

@Component
public class SalaryDao implements ApplicationEventPublisherAware {
    //This entity


    //also DAO, SERVICE, CONTROLLER

    private ApplicationEventPublisher eventPublisher;
    private JdbcTemplate jdbcTemplate;

    private final String GET_ALL_EMPLOYEES = "SELECT * FROM employeeSalary";
    private final String GET_EMPLOYEE_BY_ID = "SELECT * FROM employeeSalary WHERE id =";
    private final String UPDATE_EMPLOYEES_SALARY = "UPDATE employeeSalary SET salary =";
    private final String DELETE_EMPLOYEE = "DELETE FROM employeeSalary WHERE id =";
    private final String CHANGE_EMPLOYEE_NAME = "UPDATE employeeSalary SET name = ";


    @Autowired
    public SalaryDao(Database database) {
        this.jdbcTemplate = new JdbcTemplate(database.getDataSource());
    }

    public void create(Salaried user) {
        this.eventPublisher.publishEvent(new UserCreateEvent(this, user));
    }

    public void updateSalary(int id) {
        this.eventPublisher.publishEvent(new UserUpdateEvent(this, getUserById(id).get(0)));
        jdbcTemplate.execute(UPDATE_EMPLOYEES_SALARY+"salary + (salary * 0.10) WHERE id ="+id);
    }

    public List<Salaried> getAll() {
        return jdbcTemplate.query(GET_ALL_EMPLOYEES, new SalariedMapper());
    }

    public List<Salaried> getUserById(int id) {
        return jdbcTemplate.query(GET_EMPLOYEE_BY_ID+id, new SalariedMapper());
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
