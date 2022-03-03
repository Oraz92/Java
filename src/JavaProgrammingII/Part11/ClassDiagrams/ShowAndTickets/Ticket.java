package JavaProgrammingII.Part11.ClassDiagrams.ShowAndTickets;

import java.util.ArrayList;

public class Ticket {

    private int seat;
    private int code;

    public Ticket(int seat, int code) {
        this.seat = seat;
        this.code = code;
    }

    public int getSeat() {
        return this.seat;
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return "Seat: " + this.getSeat() + "\nCode: " + this.getCode();
    }
}
