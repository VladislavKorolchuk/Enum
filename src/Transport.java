abstract class Transport {
    private String brand;                        // - Марка
    private String model;                        // - Модель
    private int yearOfRelease;                   //- Год выпуска
    private String countryOfManufacture;         //- Страна производства
    private String bodyColor;                    // - Цвет кузова
    private int maximumMovementSpeed;            //- Максимальная скорость передвижения

    static private final String errInfo = "Информация не указана";


    Transport(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed) {
        setBrand(brand);
        setModel(model);
        this.yearOfRelease = yearOfRelease;
        this.countryOfManufacture = (countryOfManufacture == null || countryOfManufacture.isBlank()) ? errInfo : countryOfManufacture;
        setBodyColor(bodyColor);
        setMaximumMovementSpeed(maximumMovementSpeed);
    }

    Transport(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }


    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = (brand == null || brand.isBlank()) ? errInfo : brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = (model == null || model.isBlank()) ? errInfo : model;
    }

    int getYearOfRelease() {
        return yearOfRelease;
    }

    String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    String getBodyColor() {
        return bodyColor;
    }

    void setBodyColor(String bodyColor) {
        this.bodyColor = (bodyColor == null || bodyColor.isBlank()) ? errInfo : bodyColor;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

    int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
    }


    abstract String refill();
}
