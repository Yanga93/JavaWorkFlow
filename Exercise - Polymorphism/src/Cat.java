public class Cat extends Animal {
    public Cat() {
        super(4);
        this.name = "Cat";
        this.noise = "Meow";
    }

    @Override
    public String toString() {
        return "An adorable kitten.";
    }
}
