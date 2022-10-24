final class Truck extends Transport implements Competing {

    private double engineCapacity; // Обьем двигателя

    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void finishMovement() {
        System.out.println("Закончить движение");
    }

    @Override
    String refill() {
        return null;
    }

    @Override
    public void pitStop() {
        System.out.println("Класс Грузовые авто Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Класс Грузовые авто  Лучшее время круга");
    }

    @Override
    public void voidmaximumSpeed() {
        System.out.println("Класс Грузовые авто Максимальная скорость");
    }

}
