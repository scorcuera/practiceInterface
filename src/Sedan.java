public class Sedan extends Car {
    public Sedan(int vinNumber, String make, String model, double mileage) {
        super.vinNumber = vinNumber;
        super.make = make;
        super.model = model;
        super.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "vinNumber=" + vinNumber +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                "} " + super.toString();
    }
}
