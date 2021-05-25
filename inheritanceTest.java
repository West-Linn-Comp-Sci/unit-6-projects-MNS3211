public class inheritanceTest {
    public static void main (String[] args) {
        cars car1 = new cars(4,3,325);
        gasCars car2 = new gasCars(10,325);
        eCars car3 = new eCars(0,275);

        System.out.println("Testing methods");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println("-----------------------------------------");
        System.out.println("");

        System.out.println("what sound does each car make??");
        System.out.println(car1.sound());
        System.out.println(car2.sound());
        System.out.println(car3.sound());
        System.out.println("-----------------------------------------");
        System.out.println("");

        System.out.println("what is the average mileage");
        System.out.println(car1.getMileage());
        System.out.println(car2.getMileage());
        System.out.println(car3.getMileage());
        System.out.println("-----------------------------------------");
        System.out.println("");

        System.out.println("does the car pollute");
        System.out.println(car2.pollutes());
        System.out.println(car3.pollutes());
        System.out.println("-----------------------------------------");
    }
}

