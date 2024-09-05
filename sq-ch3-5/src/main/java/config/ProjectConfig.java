package config;

import bean.Parrot;
import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="beans")
public class ProjectConfig {
    @Bean
    public Parrot parrot(Person person) {
        Parrot p = new Parrot(person);
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person p = new Person(parrot);
        return p;
    }
}
