package app.controller;

import library.Greeter;
import module_a.Flex;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/module")
public class ModularController {
    
    private final Greeter greeter;
    private final Flex flex;

    public ModularController(Greeter greeter, Flex flex) {
        this.greeter = greeter;
        this.flex = flex;
    }
    
    @GetMapping("/flex")
    public ResponseEntity<String> moduleGetter() {
        return ResponseEntity.ok(flex.flex() + " " + greeter.greet());
    }
}
