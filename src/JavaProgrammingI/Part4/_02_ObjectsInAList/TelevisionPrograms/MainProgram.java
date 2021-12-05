package JavaProgrammingI.Part4._02_ObjectsInAList.TelevisionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        while (true) {
            System.out.print("Name: ");
            String nameOfProgram = scanner.nextLine();
            if (nameOfProgram.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            TelevisionProgram televisionProgram = new TelevisionProgram(nameOfProgram, duration);
            programs.add(televisionProgram);
        }

        System.out.print("Program's maximum duration? ");
        int duration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= duration) {
                System.out.println(program);
            }
        }

    }
}
