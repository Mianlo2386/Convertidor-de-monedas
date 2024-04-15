import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("Bienvenido al Conversor de Monedas");
        System.out.println("************************************\n");

        while (true) {
            System.out.println("Elija una opción de conversión:");
            System.out.println("1. Peso Argentino a Dólar");
            System.out.println("2. Dólar a Peso Argentino");
            System.out.println("3. Real brasileño a Dólar");
            System.out.println("4. Dólar a Real brasileño");
            System.out.println("5. Peso Colombiano a Dólar");
            System.out.println("6. Dólar a Peso Colombiano");
            System.out.println("7. Salir");
            System.out.println("**********************************\n");

            System.out.print("Ingrese el número de la opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    double resultado = Conversor.pesoArgentinoADolar(monto);
                    System.out.println(monto + " pesos argentinos equivalen a " + resultado + " dólares.");
                    break;
                case 2:
                    // Lógica para convertir Dólar a Peso Argentino
                    break;
                case 3:
                    // Lógica para convertir Real a Dólar
                    break;
                case 4:
                    // Lógica para convertir Dólar a Real
                    break;
                case 5:
                    // Lógica para convertir Peso Colombiano a Dólar
                    break;
                case 6:
                    // Lógica para convertir Dólar a Peso Colombiano
                    break;
                default:
                    System.out.println("Por favor, ingrese una opción válida.");
            }
        }
    }
}
