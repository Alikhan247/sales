package kz.iitu.alikhan.sale.event.handlers;

import kz.iitu.alikhan.sale.event.UserCreateEvent;
import org.springframework.context.ApplicationListener;

public class UserUpdateHandler implements ApplicationListener<UserCreateEvent> {
    @Override
    public void onApplicationEvent(UserCreateEvent userCreateEvent) {
        System.out.println("UserUpdateHandler.onApplicationEvent");
        System.out.println("Updated user info: " + userCreateEvent.getUser().getName());
    }

}
