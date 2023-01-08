package animal;

public class Mammal extends Animal {
    private String name;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString()+
                "name='" + name + '\'' +
                '}';
    }
}
