package zoo;

/** Monkey overrides the abstract makeSound() with a monkey-specific sound. */
public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Ooh-ooh, aah-aah!");
    }
}
