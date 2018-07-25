package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {


    public static final String HELLO_GURUS = "Hello Gurus!!! - i was injected by setter";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
