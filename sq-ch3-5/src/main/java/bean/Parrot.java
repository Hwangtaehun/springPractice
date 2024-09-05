package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Parrot {

    private String name = "Koko";
    private final Person person;

    @Autowired
    public Parrot(Person person){
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}