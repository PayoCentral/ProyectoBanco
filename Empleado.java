public class Empleado {
    private String nombre;
    private String telefono;
    private int idempl;
    private float sueldo;
    private float salariomin;
    private int nss;

    public Empleado(String nombre, String telefono,int idempl, float sueldo, float salariomin, int nss) {
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
    public int getIdempl(){
        return idempl; 
    }

    public float getSueldo(){
        return sueldo;
    }

    public float getSalariomin(){
        return salariomin;
    }
}
