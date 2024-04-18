import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HistorialConversiones {
    private static final String ARCHIVO_HISTORIAL = "historial.txt";

    public static void guardarConversion(String conversion) {
        try (FileWriter escritor = new FileWriter(ARCHIVO_HISTORIAL, true)) {
            escritor.write(conversion + "\n"); // Escribir la conversión en una nueva línea
        } catch (IOException e) {
            System.err.println("Error al guardar la conversión en el historial: " + e.getMessage());
        }
    }

    public static void mostrarHistorial() {
        try (BufferedReader lector = new BufferedReader(new FileReader(ARCHIVO_HISTORIAL))) {
            String linea;
            System.out.println("**********************************\n");
            System.out.println("Historial de conversiones:\n");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("**********************************\n");
        } catch (IOException e) {
            System.err.println("Error al leer el historial de conversiones: " + e.getMessage());
        }
    }
}

