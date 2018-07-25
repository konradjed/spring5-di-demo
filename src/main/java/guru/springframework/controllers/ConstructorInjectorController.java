package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class ConstructorInjectorController {

    private GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
