package cz.steman.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingSender {

    @Autowired
    private GreetingService greetingService;

    public void sendGreeting(String name) {
        System.out.println(greetingService.getGreeting(name));
    }
}
