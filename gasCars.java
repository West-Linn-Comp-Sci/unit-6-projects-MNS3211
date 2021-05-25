public class gasCars extends cars {
    public int fuel;

    public gasCars(int fuel, double mileage){
        super(4,4,325);
        this.fuel = fuel;
        this.mileage = mileage;
    }
    public int fuel(){
        return fuel;
    }

@Override
    public double getMileage() {
        return (double) (100 * 3.25);

    }
    @override
    public String sound(){
        return("Vrooooooom! Vroooooom!");
    }
    public boolean pollutes(){
        return true;
    }
    public String toString(){
        return "the average gas car has  "+ wheels+"wheels,"+doors+"doors and a mileage of"+mileage;
    }
}
