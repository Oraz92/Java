package JavaProgrammingI.Part5._01_LearningOOP.Clock;

public class MainProgram {
    public static void main(String[] args) {
        /*Clock clock = new Clock();
        while (true) {
            clock.advance();
            System.out.println(clock);
        }*/
        Timer timer = new Timer();
        while (true) {
            timer.advance();
            System.out.println(timer);

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }

        }


    }
}
