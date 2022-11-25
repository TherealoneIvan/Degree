package degree;



public class Fahrenheit implements Degrees{
    private Double amount;
    private static final Double FAHRENHEIT_TO_CELSIUS_CONSTANT = 32.0;
    private static final Double FAHRENHEIT_TO_CELSIUS_MULTIPLAYER = 5.0 / 9.0;
    private static final Double FAHRENHEIT_TO_KELVIN_CONSTANT = 273.15;
    public Fahrenheit(Double amount) {
        this.amount = amount;
    }
    public Double getAmount() {
        return amount;
    }
    @Override
    public Degrees calculateOtherSystem(String nameOfSystem) {
        switch (nameOfSystem){
            case "Kelvin": return new Kelvin(getKelvin());
            case "Celsius": return new Fahrenheit(getCelsius());
            default: throw  new RuntimeException(nameOfSystem + " unknown system");
        }
    }

    private double getCelsius() {
        return (amount - FAHRENHEIT_TO_CELSIUS_CONSTANT) * FAHRENHEIT_TO_CELSIUS_MULTIPLAYER;
    }
    private double getKelvin(){
        return getCelsius() + FAHRENHEIT_TO_KELVIN_CONSTANT;
    }
}
