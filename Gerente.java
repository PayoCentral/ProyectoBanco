public class Gerente extends Empleado {
    private int numOficina;
    private int numGerente;
    private double sueldo_gerente;
    protected int telgerente;
    
    public Gerente(){
    this("", 0, 0, 0f, 0f, 0,0,0f,0);
    }

public Gerente(String nombre,int idempl,  int nss, double salariomin, double impuesto, int numOficina, int numGerente, double sueldo_gerente,int telgerente){
    super(nombre, idempl, nss, salariomin, impuesto); 
this.numOficina=numOficina;
this.numGerente=numGerente;
this.sueldo_gerente=sueldo_gerente;
this.telgerente=telgerente;

}


public int getnumOficina(){
    return numOficina;
}
public int getnumGerente(){
    return numGerente; 
}
//calcula pago 
public double calcularPago(){
    return (sueldo_gerente-impuesto)*15;
}
}
