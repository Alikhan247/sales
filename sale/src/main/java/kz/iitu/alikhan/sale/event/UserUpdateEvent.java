package kz.iitu.alikhan.sale.event;

import kz.iitu.alikhan.sale.Employee.Employee;
import org.springframework.context.ApplicationEvent;

public class UserUpdateEvent extends ApplicationEvent {

    private Employee employee;

    public UserUpdateEvent(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }

    public Employee getUser() {
        return employee;
    }

}
