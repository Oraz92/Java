package JavaProgrammingII.Part10.OtherUsefulTechniques.Human;

public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return this.name;
    }

    public int getWage() {
        return this.wage;
    }

    @Override
    public String toString() {
        return name + " " + wage;

    }

    @Override
    public int compareTo(Human human) {
        return human.getWage() - this.getWage();
    }
}
