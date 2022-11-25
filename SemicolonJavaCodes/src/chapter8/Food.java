package chapter8;

public enum Food {
    APPLE("Fruit",52),
    BANANA("Fruit", 89),
    CARROT("Vegetable", 41);

    private final String type;
    private final int NumberOfCalories;

     Food(String type, int numberOfCalories) {
        this.type = type;
        NumberOfCalories = numberOfCalories;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfCalories() {
        return NumberOfCalories;
    }
}
