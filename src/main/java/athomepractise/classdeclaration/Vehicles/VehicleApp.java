package athomepractise.classdeclaration.Vehicles;

public class VehicleApp {

    public static void main(String[] args) {
        Truck semi = new Truck(2,200,7,4400);
        //Truck picup = new Truck(3,28,15,2000);
        double gallons;
        int distance = 252;
        gallons = semi.fuelNeeded(distance);
        System.out.printf("Semi can carry %d pounds\n", semi.getCargoCap());
        System.out.printf("To do %d miles semi needs %f gallons\n", distance, gallons);
    }
}
