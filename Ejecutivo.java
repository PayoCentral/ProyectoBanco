public class Ejecutivo extends Empleado{
private int numOficina;
private int numEjecutivo;
public double sueldo;
public double impuesto;
public Ejecutivo (String nombre, long telefono,int nO, float nE, double sueldo, double impuesto){
numOficina=nO;
numEjecutivo=nE;
this.sueldo=sueldo;
this.impuesto=sueldo*0.1;
}
       public int getnumOficina(){
       return numOficina;
       }
       public int getnumEjecutivo(){
       return numEjecutivo;
       }
       public double calcularPago(){
              return (sueldo-impuesto)*14;
       }
}
