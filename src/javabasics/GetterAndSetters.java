package javabasics;
public class GetterAndSetters {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name ::" + name);
    }
}
