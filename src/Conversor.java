import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conversor {
    private static final String API_KEY = "83327bac575b6a31ef3f161f";

    public static double pesoArgentinoADolar(double monto) {
        String baseCode = "ARS";
        String targetCode = "USD";
        double tasaDeConversion = obtenerTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            // Manejar el error de manera apropiada en tu aplicación
            return -1;
        }
    }

    private static double obtenerTasaDeConversion(String baseCode, String targetCode) {
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
            JSONObject jsonResponse = new JSONObject(response.toString());
            double conversionRate = jsonResponse.getDouble("conversion_rate");

            return conversionRate;
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Manejar el error apropiadamente en tu aplicación
        }
    }
}
