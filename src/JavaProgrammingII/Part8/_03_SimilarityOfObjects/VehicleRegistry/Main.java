package JavaProgrammingII.Part8._03_SimilarityOfObjects.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));

        VehicleRegistry turkmenistan = new VehicleRegistry();
        LicensePlate lilb1 = new LicensePlate("TM", "LB-5578");
        LicensePlate lilb2 = new LicensePlate("TM", "LB-5588");
        LicensePlate lilb3 = new LicensePlate("TM", "AG-5588");
        LicensePlate lilb4 = new LicensePlate("TM", "DG-5488");

        turkmenistan.add(lilb1, "Oraz");
        turkmenistan.add(lilb2, "Sapar");
        turkmenistan.add(lilb3, "Bahram");
        turkmenistan.add(lilb4, "Merdan");

        turkmenistan.remove(lilb4);
        System.out.println(turkmenistan.get(lilb1));
        turkmenistan.printLicencePlates();
        turkmenistan.printOwners();

    }
}
