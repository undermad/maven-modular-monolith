package library;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

    public String greet() {
        return "Hello Modular Monolith";
    }
}