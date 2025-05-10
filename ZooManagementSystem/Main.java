package ZooManagementSystem;

public class Main {
    public static void main(String[] args) {
        Animal animal;

        animal = new Lion();
        animal.eat();
        animal.makeSound();

        animal = new Elephant();
        animal.eat();
        animal.makeSound();

        animal = new Monkey();
        animal.eat();
        animal.makeSound();
    }
}
