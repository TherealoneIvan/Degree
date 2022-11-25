package degree;

public class Main {
    public static void main(String[] args) {
        DegreeFactory factory = new DegreeFactory();
        Degrees celsius = factory.createDegree("Celsius" , 36.6);
        Degrees faren = celsius.calculateOtherSystem("Fahrenheit");
        System.out.println(faren.getAmount() + " " + celsius.getAmount());
    }
}