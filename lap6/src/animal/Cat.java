package animal;

public class Cat extends Mammal {
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }

}