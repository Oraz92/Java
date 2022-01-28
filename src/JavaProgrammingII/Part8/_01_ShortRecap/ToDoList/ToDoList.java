package JavaProgrammingII.Part8._01_ShortRecap.ToDoList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> list;
    private int number;

    public ToDoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int number = 1;
        for (String task: this.list) {
            System.out.println(number + ": " + task);
            number++;
        }
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
