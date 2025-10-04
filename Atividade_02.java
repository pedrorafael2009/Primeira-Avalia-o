import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em °C: ");
        double tempC = entrada.nextDouble();
        double tempF = (tempC * 9/5) + 32;
        double tempK = tempC + 273.15;

        System.out.println("Temperatura em Celcius: " + tempC + "°C");
        System.out.println("Temperatura em Fahrenheit: " + tempF + "°F");
        System.out.println("Temperatura em Kelvin: " + tempK + "°K");


    }
}
