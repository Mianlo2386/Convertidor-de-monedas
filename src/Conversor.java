import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

import com.google.gson.Gson;

public class Conversor {
    private static final Properties prop = new Properties();

    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            System.err.println("Hubo un problema al cargar las propiedades desde el archivo: " + ex.getMessage());
            ex.printStackTrace(); // Imprimir la pila de llamadas
        }
    }

    private static final String API_KEY = prop.getProperty("api.key");

    public static double getTasaDeConversion(String baseCode, String targetCode) {
        return obtenerTasaDeConversion(baseCode, targetCode);
    }

    private static double obtenerTasaDeConversion(String baseCode, String targetCode) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + baseCode + "/" + targetCode))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Utilizando Gson para parsear la respuesta JSON
            Gson gson = new Gson();
            JsonResponse jsonResponse = gson.fromJson(response.body(), JsonResponse.class);

            // Obtener la tasa de conversión del objeto JsonResponse
            double conversionRate = jsonResponse.conversion_rate;

            return conversionRate;
        } catch (IOException e) {
            System.err.println("Hubo un problema al conectarse con el servidor: " + e.getMessage());
            e.printStackTrace(); // Imprimir la pila de llamadas
        } catch (Exception e) {
            System.err.println("Se produjo un error inesperado: " + e.getMessage());
            e.printStackTrace(); // Imprimir la pila de llamadas
        }
        return -1;
    }
}
