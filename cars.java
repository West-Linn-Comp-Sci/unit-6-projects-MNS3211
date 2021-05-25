public class cars {
    private int wheels;
    private int doors;
    public double mileage;//gas powered for example what it uses to run

    public cars(int wheels, int doors,  double mileage) {
        this.wheels = wheels;
        this.doors = doors;
        this.mileage = mileage;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean drives(){
        return true;
    }
    public double getMileage() {
            return (double) (100 * 3);

        }
    public String sound() {
        return ("What noise does your car make?");
    }

        public String toString(){
        return "the average car has  "+ wheels+"wheels,"+doors+"doors and a mileage of"+mileage;
        }
}


