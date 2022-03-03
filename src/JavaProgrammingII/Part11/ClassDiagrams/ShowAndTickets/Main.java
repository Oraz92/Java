package JavaProgrammingII.Part11.ClassDiagrams.ShowAndTickets;

public class Main {

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(12, 1111);
        Ticket ticket2 = new Ticket(13, 1112);
        Ticket ticket3 = new Ticket(14, 1113);

        Show show = new Show("Titatic", "21:00");
        show.addTicket(ticket1);
        show.addTicket(ticket2);
        show.addTicket(ticket3);
        System.out.println(show);
    }
}
