public class Ejecutivo extends Empleado{
private int numOficina;
private int numEjecutivo;
public float sueldo_ejecutivo;
    
    
public Ejecutivo (String nombre,int idempl,  int nss, float salariomin, float impuesto ,
int numOficina, int numEjecutivo, float sueldo_ejecutivo){
super(nombre, idempl, nss, salariomin, impuesto);
this.numOficina=numOficina;
this.numEjecutivo=numEjecutivo;
this.sueldo_ejecutivo=sueldo_ejecutivo;
}
public int getnumOficina(){
return numOficina;
       }
       public int getnumEjecutivo(){
       return numEjecutivo;
       }
}