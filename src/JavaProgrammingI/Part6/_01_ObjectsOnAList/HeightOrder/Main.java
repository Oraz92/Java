package JavaProgrammingI.Part6._01_ObjectsOnAList.HeightOrder;

public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        room.add(new Persone("Lea", 183));
        room.add(new Persone("Kenya", 182));
        room.add(new Persone("Auli", 186));
        room.add(new Persone("Nina", 172));
        room.add(new Persone("Terhi", 185));

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
