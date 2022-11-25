package degree;

public class Celsius implements Degrees{
    private Double amount;

    private static final Double CELSIUS_TO_KELVIN_MULTIPLAYER = 273.15;
    private static final Double CELSIUS_TO_FAHRENHEIT_MULTIPLAYER = 9.0 / 5.0;
    private static final Double CELSIUS_TO_FAHRENHEIT_CONSTANT = 32.0;

    public Celsius(Double amount) {
        this.amount = amount;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public Degrees calculateOtherSystem(String nameOfSystem) {
        switch (nameOfSystem){
            case "Kelvin": return new Kelvin(getKelvin());
            case "Fahrenheit": return new Fahrenheit(getFahrenheit());
            default: throw  new RuntimeException(nameOfSystem + " unknown system");
        }
    }

    private double getFahrenheit() {
        return amount * CELSIUS_TO_FAHRENHEIT_MULTIPLAYER + CELSIUS_TO_FAHRENHEIT_CONSTANT;
    }

    private double getKelvin() {
        return amount + CELSIUS_TO_KELVIN_MULTIPLAYER;
    }
}
