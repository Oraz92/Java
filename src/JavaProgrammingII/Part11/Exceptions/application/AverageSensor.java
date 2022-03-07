package JavaProgrammingII.Part11.Exceptions.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> listOfAverageTemperature;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.listOfAverageTemperature = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        this.sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
       if (this.sensors.isEmpty() || !this.isOn())
           throw new IllegalArgumentException("AverageSensor if off or there is hadn't been added any sensor.");
       else {
           int averageInt = (int) this.sensors.stream().mapToDouble(Sensor::read).average().orElse(0.0);
           this.listOfAverageTemperature.add(averageInt);
           return averageInt;
       }
    }

    public List<Integer> readings() {
        return this.listOfAverageTemperature;
    }

}
