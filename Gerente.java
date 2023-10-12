public class Gerente extends Empleado {
    private int numOficina;
    private int numGerente;
    private double sueldo; 
    private double impuesto; 

public Gerente(String nombre, long telefono, int n, int nn,
 double sueldo, double impuesto){
    super(nombre,telefono); //llamada al constructor de la clase madre 
numOficina= n; 
numGerente= nn; 
this.sueldo=sueldo; 
this.impuesto=sueldo*0.1; 

}

public int getnumOficina(){
    return numOficina;
}
public int getnumGerente(){
    return numGerente; 
}
//calcula pago 
public double calcularPago(){
    return (sueldo-impuesto)*19;
}
}
