public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada", "Granta", 1.5, BodyType.SEDAN);
        System.out.println(ladaGranta.toString());
        Car chevroletEpica = new Car("Chevrolet Epica", "V250", 1.8, null);
        Car lada = new Car("Lada", "2107", 1.3, BodyType.CUPE);
        Car hyundai = new Car("Hyundai", "Staria", 1.9, BodyType.CUPE);
        System.out.println("ladaGranta.DetermineTypeCar(CUPE) = " + ladaGranta.DetermineTypeCar(BodyType.CUPE));

        Truck kamaz = new Truck("КамАЗ", "5490", 6);
        Truck gaz = new Truck("ГАЗ", "22107", 4);
        Truck chana = new Truck("Chana", "SC1022DBN", 4);
        Truck fan = new Truck("FAW", "1031", 3);

        Bus gazel = new Bus("ГАЗЕЛЬ", "CITY", 7);
        Bus kavz = new Bus("КАВЗ", "4238", 6);
        Bus liaz = new Bus("ЛИАЗ", "5292", 6);
        Bus paz = new Bus("ВЕКТОР", "NEXT", 7.6);

    }
}