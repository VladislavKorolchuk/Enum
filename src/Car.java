final class Car extends Transport implements Cloneable {

    private double engineCapacity;

    private BodyType bodyType;


    public Car(String brand, String model, double engineCapacity, BodyType bodyType) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
        this.bodyType = bodyType;
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    String refill() {
        return "можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар";
    }

    @Override
    public String toString() {
        String str = bodyType == null ? "тип автомобиля Данных недостаточно" : bodyType.name();
        return super.toString() + ", объем двигателя " + engineCapacity + " " + str;
    }

    // Метод определить тип авто
    boolean DetermineTypeCar(BodyType bodyType) {
        if (bodyType == this.bodyType) {
            return true;
        } else {
            return false;
        }
    }

}
