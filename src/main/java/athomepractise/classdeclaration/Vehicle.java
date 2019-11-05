package athomepractise.classdeclaration;

class Vehicle {
    int x;

    int passangers;
    int fuelcap;
    int mpg;

    Vehicle(int i) {
        x=i;
    }
    protected void finalize(){
        System.out.println("Finalizing" + x);
    }
    void generator(int i){
        Vehicle o = new Vehicle(i);
    }
}
class VehicleDemo {

    public static void main(String[] args) {
        int count;


        Vehicle o = new Vehicle(0);
        for (int i =0; i<200000;i++){
            o.generator(i);
        }
    }

}
