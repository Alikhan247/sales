package kz.iitu.alikhan.sale.event.handlers;

import kz.iitu.alikhan.sale.event.UserCreateEvent;
import kz.iitu.alikhan.sale.event.UserUpdateEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserUpdateHandler implements ApplicationListener<UserUpdateEvent> {

    @Override
    public void onApplicationEvent(UserUpdateEvent userUpdateEvent) {
        System.out.println("UserUpdateHandler.onApplicationEvent");
        System.out.println("Updated user info: " + userUpdateEvent.getUser().getName());
        System.out.println("Updated user salary now: " + userUpdateEvent.getUser().getFixedSalary());
    }
}
