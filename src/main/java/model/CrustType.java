package model;

public enum CrustType {
    THIN("Thin"),
    THICK("Thick"),
    CHEESE_STUFFED("Cheese stuffed"),
    GLUTEN_FREE("Gluten free"),
    WHOLE_WHEAT("Whole wheat");

    private String value;

    CrustType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
