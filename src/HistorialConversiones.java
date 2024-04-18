import java.io.FileWriter;
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
}
