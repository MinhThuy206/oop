package animal;

public class Dog extends Animal{
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    public Dog(String name) {
        super(name);
    }
}
