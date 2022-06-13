package interfaceLearn;

interface Doggy {
    String name = "GOLDY";
    void printName();
}

class PetAnimal implements Doggy {
    public void printName() {
        System.out.println("Name of the dog::" + name);
    }
}

public class Animals {
    public static void main(String[] args) {
        PetAnimal petAnimalObject = new PetAnimal();
        petAnimalObject.printName();
    }
}