public class Ejecutivo extends Empleado{
public Ejecutivo (String nombre, String telefono,int idempl, float sueldo, float salariomin, int nss){
super (nombre, telefono, idempl, 5*salariomin, salariomin, nss);
       //lo de 5 por saliario min seria el sueldo de el ejecutivo
       }
       public float calcularSalarioTotal(){
              return getSueldo();
        }
}
