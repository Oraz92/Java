package JavaProgrammingI.Part4._01_IntorductionToOOP.Whistle;

public class Main {
    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
    }
}
