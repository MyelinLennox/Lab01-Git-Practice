public class TemperatureModel {
    private double celsiusTemp

    public TeperatureModel(double celsiusTemp) {
        this.celsiusTemp = celsiusTemp
    }

    public double getCelsiusTemp() {
        return celsiusTemp;
    }

    public void setCelsiusTemp(double celsiusTemp) {
        this.celsiusTemp = celsiusTemp;
    }

    public double getTempInFahrenheit() {
        return celsiusTemp * 9/5 + 32
    }
}