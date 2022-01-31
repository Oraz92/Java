package JavaProgrammingII.Part8._02_HashMap.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        for (LicensePlate lp: this.registry.keySet()) {
            if (lp.equals(licensePlate)) {
                return false;
            }
        }
        this.registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicencePlates() {
        for (LicensePlate licensePlate: this.registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        for (String owner: this.registry.values()) {
            System.out.println(owner);
        }
    }
}
