public class mainCar {
    public static void main(String[] args)  throws Exception {
        CarFactory a = new CarFactory();

        Drivable f = a.getCar("Fiat");
        f.drive();
        Drivable b = a.getCar("BMW");
        b.drive();
        Drivable p = a.getCar("Porsche");
        p.drive();
        Drivable l = a.getCar("lamborghini");
        l.drive();

    }

}
