package JavaProgrammingI.Part7._03_LargerProgrammingExercises.BigYear;

import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;
    
    public Birds() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String nameInLatin) {
        this.birds.add(new Bird(name, nameInLatin));
    }


    public void printOne(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }

    public void printAll() {
        for (Bird bird: this.birds) {
            System.out.println(bird);
        }
    }

    public void observation(String birdName) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(birdName)) {
                bird.increaseObservation();
            }
        }
    }
}
