package ZooManagementSystem;

public abstract class Animal {
    private String animalName; // New field

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }
    public abstract void eat();
    public abstract void makeSound();
}
