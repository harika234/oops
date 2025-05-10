package ZooManagementSystem;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        System.out.println("This is a " + lion.getAnimalName());
        lion.makeSound();

        System.out.println("This is a " + elephant.getAnimalName());
        elephant.makeSound();

        System.out.println("This is a " + monkey.getAnimalName());
        monkey.makeSound();
    }
}
