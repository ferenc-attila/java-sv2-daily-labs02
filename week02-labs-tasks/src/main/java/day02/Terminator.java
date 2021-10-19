package day02;

public class Terminator {

    private String name;
    private int age;

    public Terminator (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String greetingSomebody(String name) {
        return "Hello " + name + "! My name is " + this.name + ".";
    }
}
