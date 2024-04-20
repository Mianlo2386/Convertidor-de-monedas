import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroConversiones {

    public static String generarRegistro(double monto, double resultado, int monedaOrigen, int monedaDestino) {
        // Obtén la marca de tiempo actual
        LocalDateTime currentTime = LocalDateTime.now();

        // Define el formato de la marca de tiempo que deseas usar
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Convierte la marca de tiempo a una cadena con el formato especificado
        String formattedTime = currentTime.format(formatter);

        // Obtén los nombres de las monedas de origen y destino
        String nombreMonedaOrigen = ListadoDeMonedas.getNombreMoneda(monedaOrigen);
        String nombreMonedaDestino = ListadoDeMonedas.getNombreMoneda(monedaDestino);

        // Construye el mensaje de registro
        String registro = formattedTime + " - Conversión de " + monto + " " + nombreMonedaOrigen + " a " + resultado + " " + nombreMonedaDestino;

        return registro;
    }
}

