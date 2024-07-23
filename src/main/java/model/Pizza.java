package model;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
    private final String cheese;
    private final List<String> toppings;
    private final CrustType crust;
    private final SizeType size;

    private Pizza(String cheese, List<String> toppings, CrustType crust, SizeType size) {
        this.cheese = cheese;
        this.toppings = toppings;
        this.crust = crust;
        this.size = size;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public CrustType getCrust() {
        return crust;
    }

    public SizeType getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                ", crust=" + crust +
                ", size=" + size +
                '}';
    }

    public static class Builder {
        private String cheese;
        private List<String> toppings;
        private CrustType crust;
        private SizeType size;

        public Builder() {
            this.cheese = "Mussarela";
            this.toppings = new ArrayList<String>();
            this.crust = CrustType.THIN;
            this.size = SizeType.DEFAULT;
        }

        public Builder crust(CrustType crust) {
            this.crust = crust;
            return this;
        }

        public Builder size(SizeType size) {
            this.size = size;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(
                    this.cheese,
                    this.toppings,
                    this.crust,
                    this.size
            );
        }
    }
}
