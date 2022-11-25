package degree;

public class Kelvin implements Degrees{
    private Double amount;
    private static final Double KELVIN_TO_CELSIUS_CONSTANT = 273.15;
    private static final Double KELVIN_TO_FAHRENHEIT_MULTIPLAYER = 9.0 / 5.0;
    private static final Double KELVIN_TO_FAHRENHEIT_CONSTANT = 32.0;

    public Kelvin(Double amount) {
        this.amount = amount;
    }

    @Override
    public Double getAmount() {
        return amount;
    }
    @Override
    public Degrees calculateOtherSystem(String nameOfSystem) {
        switch (nameOfSystem){
            case "Celsius": return new Celsius(getCelsius());
            case "Fahrenheit": return new Fahrenheit(getFahrenheit());
            default: throw  new RuntimeException(nameOfSystem + " unknown system");
        }
    }

    private double getFahrenheit() {
        return getCelsius() * KELVIN_TO_FAHRENHEIT_MULTIPLAYER + KELVIN_TO_FAHRENHEIT_CONSTANT;
    }

    private double getCelsius() {
        return amount - KELVIN_TO_CELSIUS_CONSTANT;
    }
}
