package JavaProgrammingI.Part6._01_ObjectsOnAList.CargoHold;

public class Main {
    public static void main(String[] args) {

        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        Item watches = new Item("wathes", 2);

        Suitcase suitcase = new Suitcase(9);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);

        suitcase.addItem(watches);
        System.out.println(suitcase);

        /*Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);*/
    }
}
