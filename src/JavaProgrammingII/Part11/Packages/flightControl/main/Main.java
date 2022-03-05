package JavaProgrammingII.Part11.Packages.flightControl.main;

import JavaProgrammingII.Part11.Packages.flightControl.logic.FlightControl;
import JavaProgrammingII.Part11.Packages.flightControl.ui.TextUI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUI textUI = new TextUI(flightControl, scanner);
        textUI.start();
    }
}
