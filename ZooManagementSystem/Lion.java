package ZooManagementSystem;

public class Lion extends Animal{

    public Lion() {
        super("Lion");
    }
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }
}
