package ZooManagementSystem;

public class Lion extends Animal{


    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }
}
