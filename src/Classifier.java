// класс для автобусов
public enum Classifier {

    ESPECIALLY_SMALL ("особо малая (до 10 мест)"),SMALL ("малая (до 25)"), AVERAGE("средняя (40-50)"), BIG("большая (60-80)"),
    ESPECIALLY_BIG("особо большая (100-120 мест)");

    String classifier;
    Classifier(String classifier) {
        this.classifier=classifier;
    }

    public String getclassifier() {
        return classifier;
    }

}
