import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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
            System.out.println("8. Mostrar historial de conversiones");
            System.out.println("**********************************\n");

            System.out.print("Ingrese el número de la opción: ");
            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                System.out.println("**********************************\n");
                scanner.nextLine(); // Limpiar el buffer del scanner
                continue;
            }

            if (opcion == 8) {
                HistorialConversiones.mostrarHistorial();
                continue;
            } else if (opcion == 7) {
                System.out.println("Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto;
            try {
                monto = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido (con coma si el número no es entero)");
                scanner.nextLine(); // Limpiar el buffer del scanner
                continue;
            }

            switch (opcion) {
                case 1:
                    double resultado1 = Conversiones.pesoArgentinoADolar(monto);
                    System.out.println(monto + " pesos argentinos equivalen a " + resultado1 + " dólares.");
                    System.out.println("**********************************\n");
                    HistorialConversiones.guardarConversion(monto + " pesos argentinos equivalen a " + resultado1 + " dólares.");
                    break;
                case 2:
                    double resultado2 = Conversiones.dolarAPesoArgentino(monto);
                    System.out.println(monto + " dólares equivalen a " + resultado2 + " pesos argentinos.");
                    System.out.println("**********************************\n");
                    HistorialConversiones.guardarConversion(monto + " dólares equivalen a " + resultado2 + " pesos argentinos.");
                    break;
                case 3:
                    double resultado3 = Conversiones.realADolar(monto);
                    System.out.println(monto + " reales equivalen a " + resultado3 + " dólares.");
                    System.out.println("**********************************\n");
                    HistorialConversiones.guardarConversion(monto + " reales equivalen a " + resultado3 + " dólares.");
                    break;
                case 4:
                    double resultado4 = Conversiones.dolarAReal(monto);
                    System.out.println(monto + " dólares equivalen a " + resultado4 + " reales.");
                    System.out.println("**********************************\n");
                    HistorialConversiones.guardarConversion(monto + " dólares equivalen a " + resultado4 + " reales.");
                    break;
                case 5:
                    double resultado5 = Conversiones.pesoColombianoADolar(monto);
                    System.out.println(monto + " pesos colombianos equivalen a " + resultado5 + " dólares.");
                    System.out.println("**********************************\n");
                    HistorialConversiones.guardarConversion(monto + " pesos colombianos equivalen a " + resultado5 + " dólares.");
                    break;
                case 6:
                    double resultado6 = Conversiones.dolarAPesoColombiano(monto);
                    System.out.println(monto + " dólares equivalen a " + resultado6 + " pesos colombianos.");
                    System.out.println("**********************************\n");
                    HistorialConversiones.guardarConversion(monto + " dólares equivalen a " + resultado6 + " pesos colombianos.");
                    break;
                default:
                    System.out.println("Por favor, ingrese una opción válida.");
            }

        }
    }
}
