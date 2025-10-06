package zoo;

import java.util.ArrayList;
import java.util.List;


public class ZooDemo {
    public static void main(String[] args) {
        // Create instances
        Animal simba   = new Lion("Simba");
        Animal dumbo   = new Elephant("Dumbo");
        Animal george  = new Monkey("George");

        // Polymorphic collection
        List<Animal> zoo = new ArrayList<>();
        zoo.add(simba);
        zoo.add(dumbo);
        zoo.add(george);

        System.out.println("=== Polymorphic Zoo: Single sound ===");
        for (Animal a : zoo) {
            a.makeSound(); // dynamic dispatch to the concrete class
        }

        System.out.println("\n=== Polymorphic Zoo: Repeated sound (overloaded) ===");
        for (Animal a : zoo) {
            System.out.println("Repeating sound for " + a.getName() + " (3 times):");
            a.makeSound(3); // overloaded version in Animal, still calls each subclass's sound
        }

        System.out.println("\n=== Edge cases for overloaded method ===");
        simba.makeSound(0);   // non-positive → silent
        dumbo.makeSound(-2);  // non-positive → silent
    }
}
