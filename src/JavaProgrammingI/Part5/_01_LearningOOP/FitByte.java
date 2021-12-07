package JavaProgrammingI.Part5._01_LearningOOP;

public class FitByte {
    private int age;
    private int restingHeartRate;

    public FitByte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }

    public static void main(String[] args) {
        FitByte assistant = new FitByte(30, 60);
        double percentage = 0.5;
        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }
}
