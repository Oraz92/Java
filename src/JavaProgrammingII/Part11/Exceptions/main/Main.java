package JavaProgrammingII.Part11.Exceptions.main;

import JavaProgrammingII.Part11.Exceptions.application.AverageSensor;
import JavaProgrammingII.Part11.Exceptions.application.Sensor;
import JavaProgrammingII.Part11.Exceptions.application.StandardSensor;
import JavaProgrammingII.Part11.Exceptions.application.TemperatureSensor;

public class Main {

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }
}
