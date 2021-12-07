package JavaProgrammingI.Part5._01_LearningOOP.Clock;

public class Timer {
    private ClockHand hundredsOfSecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(100);
    }

    public void advance() {
        hundredsOfSecond.advance();

        if (hundredsOfSecond.value() == 0) {
            seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredsOfSecond;
    }
}
