public class Conversiones {
    public static double pesoArgentinoADolar(double monto) {
        String baseCode = "ARS";
        String targetCode = "USD";
        double tasaDeConversion = Conversor.getTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            System.err.println("No se pudo obtener la tasa de conversión para convertir de " + baseCode + " a " + targetCode);
            return -1;
        }
    }

    public static double dolarAPesoArgentino(double monto) {
        String baseCode = "USD";
        String targetCode = "ARS";
        double tasaDeConversion = Conversor.getTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            System.err.println("No se pudo obtener la tasa de conversión para convertir de " + baseCode + " a " + targetCode);
            return -1;
        }
    }

    public static double realADolar(double monto) {
        String baseCode = "BRL";
        String targetCode = "USD";
        double tasaDeConversion = Conversor.getTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            System.err.println("No se pudo obtener la tasa de conversión para convertir de " + baseCode + " a " + targetCode);
            return -1;
        }
    }

    public static double dolarAReal(double monto) {
        String baseCode = "USD";
        String targetCode = "BRL";
        double tasaDeConversion = Conversor.getTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            System.err.println("No se pudo obtener la tasa de conversión para convertir de " + baseCode + " a " + targetCode);
            return -1;
        }
    }

    public static double pesoColombianoADolar(double monto) {
        String baseCode = "COP";
        String targetCode = "USD";
        double tasaDeConversion = Conversor.getTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            System.err.println("No se pudo obtener la tasa de conversión para convertir de " + baseCode + " a " + targetCode);
            return -1;
        }
    }

    public static double dolarAPesoColombiano(double monto) {
        String baseCode = "USD";
        String targetCode = "COP";
        double tasaDeConversion = Conversor.getTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            System.err.println("No se pudo obtener la tasa de conversión para convertir de " + baseCode + " a " + targetCode);
            return -1;
        }
    }
}
