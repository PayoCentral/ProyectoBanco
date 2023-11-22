public class Empleado {
    protected String nombre;
    protected int idempl;
    protected int nss;
    public double salariomin;
    public double impuesto;

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

    public double calcularPago(){
        return (salariomin-impuesto)*15;
      }

    public double getSalariomin(){
        return salariomin;
    }
}
