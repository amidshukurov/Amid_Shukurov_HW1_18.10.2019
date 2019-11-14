package athomepractise.classdeclaration.Vehicles;
/*
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
}*/
class Vehicle {
   private int passangers;
   private int fuelcap;
   private int mpg;

    public Vehicle(int passangers, int fuelcap, int mpg) {
        this.passangers = passangers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    public int getPassangers() {
        return passangers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
    int range(){
       return mpg*fuelcap;
    }
    double fuelNeeded(int miles){
        return (double)miles/mpg;
    }
}