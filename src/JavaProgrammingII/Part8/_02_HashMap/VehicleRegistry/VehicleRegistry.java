package JavaProgrammingII.Part8._02_HashMap.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registry.containsValue(owner)) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
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
