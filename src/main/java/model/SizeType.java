package model;

public enum SizeType {
    SMALL("Small"),
    DEFAULT("Default"),
    LARGE("Large");

    private String value;

    SizeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
