final class Bus extends Transport implements Cloneable {

    private double engineCapacity; // Обьем двигателя

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    @Override
    String refill() {
        return null;
    }

}
