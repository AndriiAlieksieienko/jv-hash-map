package core.basesyntax;

import java.util.Objects;

public class Car {

    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass().equals(Car.class)) {
            Car car = (Car) o;
            return Objects.equals(this.model, car.model)
                    && Objects.equals(this.color, car.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (model == null ? 0 : model.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());

        return result;
    }
}
