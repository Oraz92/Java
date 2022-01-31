package JavaProgrammingII.Part8._02_HashMap.VehicleRegistry;

import java.util.Objects;

public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.country = country;
        this.liNumber = liNumber;
    }

    @Override
    public String toString() {
        return this.country + " " + this.liNumber;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof LicensePlate comparedLicensePlate)) {
            return false;
        }

        return this.country.equals(comparedLicensePlate.country)
                && this.liNumber.equals(comparedLicensePlate.liNumber);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(this.country);
        result = 31 * result + Objects.hash(this.liNumber);
        return result;
    }

}
