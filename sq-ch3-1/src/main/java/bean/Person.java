package bean;

public class Person {
    private String name;
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParrot() {
        return this.parrot.getName();
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
