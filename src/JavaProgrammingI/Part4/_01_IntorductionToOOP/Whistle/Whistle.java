package JavaProgrammingI.Part4._01_IntorductionToOOP.Whistle;

public class Whistle {
    private String sound;

    public Whistle(String initialSound) {
        this.sound = initialSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }
}
