
// Superclass
class SuperClass {
    // Method in the superclass
    public void makeSound() {
        System.out.println("This is supper class called.");
    }
}

public class MethodOverriden extends SuperClass{
    public void makeSound() {
        System.out.println("Supper class is overridden by child class.");
    }
    public static void main(String[] args) {
        // Create an object of the subclass
        SuperClass obj = new MethodOverriden();
        
        // Call the overridden method
        obj.makeSound();  // Output: Dog barks
    }
}

