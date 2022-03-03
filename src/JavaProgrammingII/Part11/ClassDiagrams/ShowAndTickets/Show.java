package JavaProgrammingII.Part11.ClassDiagrams.ShowAndTickets;

import java.util.ArrayList;

public class Show {

    private String name;
    private String time;
    private ArrayList<Ticket> tickets;

    public Show(String name, String time) {
        this.name = name;
        this.time = time;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public String getShow() {
        return this.name;
    }

    public String getTime() {
        return this.time;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        for (Ticket ticket : this.tickets) {
            stringBuilder.append("#").append(i).append(". \n").append(ticket).append("\n");
            i++;
        }
        return "Movie: " + this.getShow() + "\nTime: " + this.getTime() + "\n\nBought tickets:\n" + stringBuilder;
    }

}
