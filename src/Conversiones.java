// Conversiones.java
public class Conversiones {
    public static double pesoArgentinoADolar(double monto) {
        String baseCode = "ARS";
        String targetCode = "USD";
        double tasaDeConversion = Conversor.obtenerTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            // Manejar el error de manera apropiada en tu aplicación
            return -1;
        }
    }

    public static double dolarAPesoArgentino(double monto) {
        String baseCode = "USD";
        String targetCode = "ARS";
        double tasaDeConversion = Conversor.obtenerTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            // Manejar el error de manera apropiada en tu aplicación
            return -1;
        }
    }

    public static double realADolar(double monto) {
        String baseCode = "BRL";
        String targetCode = "USD";
        double tasaDeConversion = Conversor.obtenerTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            // Manejar el error de manera apropiada en tu aplicación
            return -1;
        }
    }

    public static double dolarAReal(double monto) {
        String baseCode = "USD";
        String targetCode = "BRL";
        double tasaDeConversion = Conversor.obtenerTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            // Manejar el error de manera apropiada en tu aplicación
            return -1;
        }
    }

    public static double pesoColombianoADolar(double monto) {
        String baseCode = "COP";
        String targetCode = "USD";
        double tasaDeConversion = Conversor.obtenerTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            // Manejar el error de manera apropiada en tu aplicación
            return -1;
        }
    }

    public static double dolarAPesoColombiano(double monto) {
        String baseCode = "USD";
        String targetCode = "COP";
        double tasaDeConversion = Conversor.obtenerTasaDeConversion(baseCode, targetCode);
        if (tasaDeConversion != -1) {
            return monto * tasaDeConversion;
        } else {
            // Manejar el error de manera apropiada en tu aplicación
            return -1;
        }
    }
}
