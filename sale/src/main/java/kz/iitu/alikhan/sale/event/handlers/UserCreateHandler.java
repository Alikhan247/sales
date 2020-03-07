package kz.iitu.alikhan.sale.event.handlers;

import kz.iitu.alikhan.sale.event.UserCreateEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreateHandler implements ApplicationListener<UserCreateEvent> {

    @Override
    public void onApplicationEvent(UserCreateEvent userCreateEvent) {
        System.out.println("UserCreateHandler.onApplicationEvent");
        System.out.println("Created user info: " + userCreateEvent.getUser().getName());
    }
}
