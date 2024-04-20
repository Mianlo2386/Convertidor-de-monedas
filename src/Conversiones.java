public class Conversiones {
    public static double convertirMoneda(double monto, String monedaOrigen, String monedaDestino) {
        double tasaDeConversion = Conversor.getTasaDeConversion(monedaOrigen, monedaDestino);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            System.err.println("No se pudo obtener la tasa de conversión para convertir de " + monedaOrigen + " a " + monedaDestino);
            return -1;
        }
    }
}
