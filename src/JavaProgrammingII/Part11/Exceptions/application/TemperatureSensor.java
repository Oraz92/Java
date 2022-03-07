package JavaProgrammingII.Part11.Exceptions.application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        if (!this.isOn) this.isOn = true;
    }

    @Override
    public void setOff() {
        if (this.isOn) this.isOn = false;
    }

    @Override
    public int read() {
        if (this.isOn)
            return new Random().nextInt(30);
        else
            throw new IllegalArgumentException("Sensor doesn't reacts...");
    }
}
