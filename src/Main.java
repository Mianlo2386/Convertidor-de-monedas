import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListadoDeMonedas.crearListaMonedas();

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
            System.out.println("9. Conversión de otras monedas");
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

            //Tratamiento de otras conversiones fuera del menú principal
            if (opcion == 9) {
                ListadoDeMonedas.mostrarListado(); // Mostrar listado de códigos de moneda
                System.out.println("**********************************\n");
                System.out.print("Ingrese el número de la moneda de origen: ");
                int monedaOrigen = scanner.nextInt();
                System.out.print("Ingrese el número de la moneda de destino: ");
                int monedaDestino = scanner.nextInt();
                System.out.print("Ingrese el monto a convertir: ");
                double monto = scanner.nextDouble();

                // Obtener los códigos de las monedas
                String codigoMonedaOrigen = ListadoDeMonedas.getCodigoMoneda(monedaOrigen);
                String codigoMonedaDestino = ListadoDeMonedas.getCodigoMoneda(monedaDestino);


                double resultado9 = Conversiones.convertirMoneda(monto, codigoMonedaOrigen, codigoMonedaDestino);
                System.out.println(monto + " " + ListadoDeMonedas.getNombreMoneda(monedaOrigen) + " equivalen a " + resultado9 + " " + ListadoDeMonedas.getNombreMoneda(monedaDestino) + ".");
                System.out.println("**********************************\n");
                String registro9 = RegistroConversiones.generarRegistro(monto, resultado9, monedaOrigen, monedaDestino);
                HistorialConversiones.guardarConversion(registro9);
                continue;
            } else if (opcion == 8) { //Opción para mostrar historial
                HistorialConversiones.mostrarHistorial();
                continue;
            } else if (opcion == 7) { //Opcion para salir
                System.out.println("Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto;
            try {
                monto = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido (con coma si el número no es entero)");
                scanner.nextLine();
                continue;
            }

            //Casos para resolver el menú de opciones
            switch (opcion) {
                case 1:
                    double resultado1 = Conversiones.convertirMoneda(monto, "ARS", "USD");
                    System.out.println(monto + " pesos argentinos equivalen a " + resultado1 + " dólares.");
                    System.out.println("**********************************\n");
                    // Generar y guardar el registro de conversión
                    String registro1 = RegistroConversiones.generarRegistro(monto, resultado1, 7, 146);
                    HistorialConversiones.guardarConversion(registro1);
                    HistorialConversiones.guardarConversion(monto + " pesos argentinos equivalen a " + resultado1 + " dólares.");
                    break;
                case 2:
                    double resultado2 = Conversiones.convertirMoneda(monto, "USD", "ARS");
                    System.out.println(monto + " dólares equivalen a " + resultado2 + " pesos argentinos.");
                    System.out.println("**********************************\n");
                    String registro2 = RegistroConversiones.generarRegistro(monto, resultado2, 146, 7);
                    HistorialConversiones.guardarConversion(registro2);
                    HistorialConversiones.guardarConversion(monto + " dólares equivalen a " + resultado2 + " pesos argentinos.");
                    break;
                case 3:
                    double resultado3 = Conversiones.convertirMoneda(monto, "BRL", "USD");
                    System.out.println(monto + " reales brasileños equivalen a " + resultado3 + " dólares.");
                    System.out.println("**********************************\n");
                    String registro3 = RegistroConversiones.generarRegistro(monto, resultado3, 20, 146);
                    HistorialConversiones.guardarConversion(registro3);
                    HistorialConversiones.guardarConversion(monto + " reales brasileños equivalen a " + resultado3 + " dólares.");
                    break;
                case 4:
                    double resultado4 = Conversiones.convertirMoneda(monto, "USD", "BRL");
                    System.out.println(monto + " dólares equivalen a " + resultado4 + " reales brasileños.");
                    System.out.println("**********************************\n");
                    String registro4 = RegistroConversiones.generarRegistro(monto, resultado4, 146, 20);
                    HistorialConversiones.guardarConversion(registro4);
                    HistorialConversiones.guardarConversion(monto + " dólares equivalen a " + resultado4 + " reales brasileños.");
                    break;
                case 5:
                    double resultado5 = Conversiones.convertirMoneda(monto, "COP", "USD");
                    System.out.println(monto + " pesos colombianos equivalen a " + resultado5 + " dólares.");
                    System.out.println("**********************************\n");
                    String registro5 = RegistroConversiones.generarRegistro(monto, resultado5, 31, 146);
                    HistorialConversiones.guardarConversion(registro5);
                    HistorialConversiones.guardarConversion(monto + " pesos colombianos equivalen a " + resultado5 + " dólares.");
                    break;
                case 6:
                    double resultado6 = Conversiones.convertirMoneda(monto, "USD", "COP");
                    System.out.println(monto + " dólares equivalen a " + resultado6 + " pesos colombianos.");
                    System.out.println("**********************************\n");
                    String registro6 = RegistroConversiones.generarRegistro(monto, resultado6, 146, 31);
                    HistorialConversiones.guardarConversion(registro6);
                    HistorialConversiones.guardarConversion(monto + " dólares equivalen a " + resultado6 + " pesos colombianos.");
                    break;
                default:
                    System.out.println("Por favor, ingrese una opción válida.");
            }

        }
    }
}
