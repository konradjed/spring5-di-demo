package guru.springframework.config;

import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService primaryGreetingService(GreetingServiceFactory factory){
        return factory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"de"})
    GreetingService primaryGermanGreetingService(GreetingServiceFactory factory){
        return factory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory factory){
        return factory.createGreetingService("es");
    }
}
