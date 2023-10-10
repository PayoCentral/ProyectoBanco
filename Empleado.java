public class Empleado {
    private String nombre;
    private String telefono;
    private int idempl;
    private Float sueldo;
    private Float salariomin;
    private int nss;

    public Trabajador(String nombre, String telefono,int idempl, Float sueldo, Float salariomin, int nss) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.idempl = idempl;
        this.sueldo = sueldo;
        this.salariomin = salariomin;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public int getNss() {
        return nss;
    }
}
