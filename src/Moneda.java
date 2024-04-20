public class Moneda {
    private int opcion;
    private String codigo;
    private String nombre;

    public Moneda(int opcion, String codigo, String nombre) {
        this.opcion = opcion;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters y setters
    public int getOpcion() {
        return opcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }


}
