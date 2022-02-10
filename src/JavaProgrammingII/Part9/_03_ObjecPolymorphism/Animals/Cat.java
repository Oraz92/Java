package JavaProgrammingII.Part9._03_ObjecPolymorphism.Animals;

public class Cat extends Animal implements NoiseCapable {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    @Override
    public void makeNoise() {
        purr();
    }

    public void purr() {
        System.out.println(super.getName() + " purrs");
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
