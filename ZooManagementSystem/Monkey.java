package ZooManagementSystem;

public class Monkey extends Animal{


    @Override
    public void eat() {
        System.out.println("Monkey eats bananas.");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey chatters!");
    }
}
