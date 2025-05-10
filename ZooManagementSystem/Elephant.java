package ZooManagementSystem;

public class Elephant extends Animal {

    @Override
    public void eat() {
        System.out.println("Elephant eats grass.");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets!");
    }
}
