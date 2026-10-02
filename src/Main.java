public class Main {
    public static void main(String[] args) {
        TemperatureModel model = new TemperatureModel(15);
        System.out.println("Created model with temp 15");

        System.out.println("Celsius temp is: " + model.getCelsiusTemp());
        System.out.println("Fahrenheit temp is: " + model.getTempInFahrenheit());

        model.setCelsiusTemp(0);
        System.out.println("Setting Celsius temp to 0");

        System.out.println("Celsius temp is: " + model.getCelsiusTemp());
        System.out.println("Fahrenheit temp is: " + model.getTempInFahrenheit());
    }
}