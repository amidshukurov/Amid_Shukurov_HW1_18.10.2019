package athomepractise.classdeclaration.Vehicles;

public class Truck extends Vehicle{
    private int cargoCap;

    public Truck(int passangers, int fuelcap, int mpg, int cargoCap) {
        super(passangers, fuelcap, mpg);
        this.cargoCap = cargoCap;
    }

    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }

    public int getCargoCap() {
        return cargoCap;
    }
}
