package cz.steman.greeting;

@FunctionalInterface
public interface GreetingService {

    String getGreeting(String name);
}
