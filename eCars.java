public class eCars extends gasCars {
    private String model;
    private String brand;
    public String name;

    public eCars(int fuel, double mileage){
        super(0,275);

    }
    @Override
    public double getMileage() {
        return (double) (100 * 2.75);
    }
    public boolean pollutes(){
        return false;
    }
    @Override
    public String sound() {
        return ("Shhhhhhhhhh... Shhhhhhhhh...");
    }


}

