package ZooManagementSystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(new Lion(), new Elephant(), new Monkey());
        for (Animal animal : animals) {
            System.out.println("This is a " + animal.getAnimalName());
            animal.makeSound();
        }
    }
}
