package JavaProgrammingII.Part8._02_HashMap;

import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> lenders;

    public IOU() {
        this.lenders = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.lenders.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.lenders.getOrDefault(toWhom, 0.00);
        /*for (String key: this.lenders.keySet()) {
            if (key.equals(toWhom)) {
                return this.lenders.get(key);
            }
        }
        return 0.00;*/
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        double lend = mattsIOU.howMuchDoIOweTo("Arthur");

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Oraz"));
    }
}
