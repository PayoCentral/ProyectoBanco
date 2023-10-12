public class Empleado {
    private String nombre;
    private long telefono;
    private int idempl;
    private int nss;

    public Empleado(String nombre, String telefono,int idempl,  int nss) {
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

    public float calcularPago(){
        return 00; //Para calcular pagos
    }

    public float getSalariomin(){
        return salariomin;
    }
}
