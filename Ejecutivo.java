public class Ejecutivo extends Empleado{
private int numOficina;
private int numEjecutivo;
public float sueldo_ejecutivo;
    
public Ejecutivo (String nombre,int idempl,  int nss, float salariomin, float impuesto ,
int numOficina, float numEjecutivo, float sueldo){
super(nombre, idempl, nss, salariomin, impuesto);
this.numOficina=numOficina;
this.numEjecutivo=numEjecutivo;
this.sueldo=sueldo;
}
public int getnumOficina(){
return numOficina;
       }
       public int getnumEjecutivo(){
       return numEjecutivo;
       }
       public float calcularPago(){
              return (sueldo_ejecutivo-impuesto)*15;
       }
}
