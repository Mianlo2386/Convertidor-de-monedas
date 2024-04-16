// Conversor.java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Conversor {
    private static final Properties prop = new Properties();

    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static final String API_KEY = prop.getProperty("api.key");

    public static double obtenerTasaDeConversion(String baseCode, String targetCode) {
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + baseCode + "/" + targetCode);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parsear la respuesta JSON
            JSONParser parser = new JSONParser();
            JSONObject jsonResponse = (JSONObject) parser.parse(response.toString());
            double conversionRate = Double.parseDouble(jsonResponse.get("conversion_rate").toString());

            return conversionRate;
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Manejar el error apropiadamente en tu aplicación
        }
    }
}
