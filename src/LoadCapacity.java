// Грузоподьемность для грузовиков
public enum LoadCapacity {

        CARGO_TO_SMALL("N1  (с полной массой до 3,5 тонн)"),
        CARGO_TO_AVERAGE("N2  (с полной массой свыше 3,5 до 12 тонн)"),
        CARGO_TO_BIG("N3  (с полной массой свыше 12 тонн)");

        String loadCapacity;
        LoadCapacity(String loadCapacity) {
            this.loadCapacity=loadCapacity;
        }

        public String getloadCapacity() {
            return loadCapacity;
        }

}
