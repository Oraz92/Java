package JavaProgrammingI.Part6._01_ObjectsOnAList.SantasWorkshop;

public class MainProgram {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift carToy = new Gift("Car", 7);

        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(carToy);
        System.out.println(gifts.totalWeight());
    }
}
