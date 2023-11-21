public class Gerente extends Empleado {
    private int numOficina;
    private int numGerente;
    private float sueldo_gerente;

public Gerente(String nombre,int idempl,  int nss, float salariomin, float impuesto, 
int numOficina, int numGerente, float sueldo_gerente){
    super(nombre, telefono, idempl, nss, salariomin, impuesto); 
this.numOficina=numOficina;
this.numGerente=numGerente;
this.sueldo_gerente=sueldo_gerente;

}

public int getnumOficina(){
    return numOficina;
}
public int getnumGerente(){
    return numGerente; 
}
//calcula pago 
public float calcularPago(){
    return (sueldo_gerente-impuesto)*15;
}
}
