package exercise5;

public class ConverterTemperature extends Converter {
    public static void main(String[] args) {
        double celsG = 50;

         Converter second = new ConverterTemperature();

         second.convertKalv(celsG);
         second.convertFahr(celsG);
    }
}
abstract class Converter {
    void convertKalv(double celsG) {
        System.out.println("Kalvin = " + (celsG + 273.15));
    }

    void convertFahr(double celsG) {
        System.out.println("Fahrenheit = " + (celsG * 9 / 5 + 32));
    }
}