public class Gerente extends Empleado{
private int numOficina;
    private int numGerente;
    private float sueldo_gerente;
    public Gerente(){
    this("", 0, 0, 0f, 0f, 0,0,0f,0);
    }
public Gerente(String nombre,int idempl,  int nss, float salariomin, float impuesto, 
int numOficina, int numGerente, float sueldo_gerente,int telgerente){
    super(nombre, telefono, idempl, nss, salariomin, impuesto); 
this.numOficina=numOficina;
this.numGerente=numGerente;
this.sueldo_gerente=sueldo_gerente;
this.telgerente=telgerente;
}
}   
