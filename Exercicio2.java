import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Escolha a direção da conversão (1/2): ");
        int escolha = scanner.nextInt();

        double temperaturaCelsius, temperaturaFahrenheit;

        switch (escolha) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                temperaturaCelsius = scanner.nextDouble();
                temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);
                System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperaturaFahrenheit = scanner.nextDouble();
                temperaturaCelsius = fahrenheitParaCelsius(temperaturaFahrenheit);
                System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
                break;
            default:
                System.out.println("Escolha inválida.");
        }
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
