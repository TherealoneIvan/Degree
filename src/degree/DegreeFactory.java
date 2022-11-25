package degree;

public class DegreeFactory {
    public Degrees createDegree(String typeOfSystem , Double amount){
        switch (typeOfSystem){
            case "Kelvin":
                return new Kelvin(amount);
            case "Celsius":
                return new Celsius(amount);
            case "Fahrenheit":
                return new Fahrenheit(amount);
            default:
                throw new RuntimeException(typeOfSystem + " unknown system");
        }
    }
}
