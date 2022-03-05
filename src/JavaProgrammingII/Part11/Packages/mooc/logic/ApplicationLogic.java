package JavaProgrammingII.Part11.Packages.mooc.logic;

import JavaProgrammingII.Part11.Packages.mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int time) {
        for (int i = 0; i < time; i++) {
            System.out.println("Application logic is working");
            this.ui.update();
        }
    }
}
