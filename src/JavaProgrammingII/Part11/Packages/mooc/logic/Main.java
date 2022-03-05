package JavaProgrammingII.Part11.Packages.mooc.logic;

import JavaProgrammingII.Part11.Packages.mooc.ui.TextInterface;
import JavaProgrammingII.Part11.Packages.mooc.ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
