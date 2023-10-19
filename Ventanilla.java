public class Ventanilla extends Empleado{
protected int idventanilla;
protected float sueldo_ventanilla;

public Ventanilla(){
  this("",0,0,0f,0f,0,0f);
}
public Ventanilla (String nombre,int idempl,  int nss, float salariomin, float impuesto, 
int idventanilla, float sueldo_ventanilla){
  super (nombre, idempl, nss, salariomin, impuesto);
this.idventanilla=idventanilla;
this.sueldo_ventanilla=salariomin;
}
 
public float calcularPago(){
  return (sueldo_ventanilla-impuesto)*15;
}
}
