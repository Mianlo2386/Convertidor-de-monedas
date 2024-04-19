public class OtrasConversiones {
    public static double otrasConversiones(int monedaOrigen, int monedaDestino, double monto) {
        String baseCode = ListaMonedas.getCodigoMoneda(monedaOrigen);
        String targetCode = ListaMonedas.getCodigoMoneda(monedaDestino);
        double tasaDeConversion = Conversor.getTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            System.err.println("No se pudo obtener la tasa de conversión para convertir de " + baseCode + " a " + targetCode);
            return -1;
        }
    }
}
