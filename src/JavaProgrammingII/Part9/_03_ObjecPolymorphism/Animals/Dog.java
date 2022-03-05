package JavaProgrammingII.Part9._03_ObjecPolymorphism.Animals;

public class  Dog extends Animal implements NoiseCapable {


    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    @Override
    public void makeNoise() {
        bark();
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " eats");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " sleeps");
    }
}
