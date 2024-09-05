package config;

import bean.Parrot;
import bean.Person;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {
    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
