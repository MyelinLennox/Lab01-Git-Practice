public class Main() {
    public static void Main() {
        TemperatureModel model = new TemperatureModel(5);
        System.out.println("Created model with temp 5");

        System.out.println("Celsius temp is: " + model.getCelsiusTemp());
        System.out.println("Fahrenheit temp is: " + model.getTempInFahrenheit());

        model.setCelsiusTemp(32);
        System.out.println("Setting Celsius temp to 32");

        System.out.println("Celsius temp is: " + model.getCelsiusTemp());
        System.out.println("Fahrenheit temp is: " + model.getTempInFahrenheit());
    }
}
