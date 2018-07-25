package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectorControllerTest {

    ConstructorInjectorController constructorInjectorController;

    @Before
    public void setUp() throws Exception {
        constructorInjectorController = new ConstructorInjectorController(new GreetingServiceImpl());
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectorController.sayHello());
    }
}