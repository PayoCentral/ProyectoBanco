public class Empleado {
    protected String nombre;
    protected int idempl;
    protected int nss;
    public float salariomin;
    public float impuesto;

    public Empleado(String nombre,int idempl,  int nss, float salariomin, float impuesto) {
        this.nombre = nombre;
        this.idempl = idempl;
        this.nss = nss;
        this.salariomin = salariomin;
        this.impuesto = salariomin*.19;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getNss() {
        return nss;
    }
    public int getIdempl(){
        return idempl; 
    }

    public float calcularPago(){
        return (salariomin-impuesto)*15;
      }

    public float getSalariomin(){
        return salariomin;
    }
}
