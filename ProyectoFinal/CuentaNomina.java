public class CuentaNomina extends Cuenta{
    private String nombre_trabajo;
    private float monto_nomina;
    
public CuentaNomina(){
    this("", 0f, "", "", "",0f);
}
    
public CuentaNomina(String numcuenta, float saldo, String historialtrans, String moneda, String nombre_trabajo, float monto_nomina){
    super(numcuenta, saldo, historialtrans, moneda); 
this.nombre_trabajo = nombre_trabajo;
this.monto_nomina= monto_nomina; 
}
public String getNombre_trabajo(){
    return nombre_trabajo;
}
public float getMonto_nomina(){    
    return monto_nomina;
}
}