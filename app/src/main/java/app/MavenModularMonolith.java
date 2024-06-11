package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "app",
        "library",
        "module_a"
})
public class MavenModularMonolith {
    public static void main(String[] args) {
        SpringApplication.run(MavenModularMonolith.class, args);
    }
}

