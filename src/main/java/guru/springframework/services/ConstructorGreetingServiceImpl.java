package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {


    public static final String HELLO_GURUS = "Hello Gurus!!! - i was injected by constuctor";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
