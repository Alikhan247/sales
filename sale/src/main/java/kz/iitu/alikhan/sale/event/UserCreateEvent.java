package kz.iitu.alikhan.sale.event;


import kz.iitu.alikhan.sale.Employee.Employee;
import org.springframework.context.ApplicationEvent;

public class UserCreateEvent extends ApplicationEvent {

    private Employee employee;

    public UserCreateEvent(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }

    public Employee getUser() {
        return employee;
    }
}
