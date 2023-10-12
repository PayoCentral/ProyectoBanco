public class CuentaNomina extends Cuenta{
    private String nombre_trabajo;ç
    private Float monto_salario;
public CuentaNomina(String nombre_trabajo, Float monto_salario){
this.nombre_trabajo = nombre_trabajo;
this.monto_salario = monto_salario;
}
public String getNombre_trabajo(){
    return nombre_trabajo;
}
public Float getMonto_salario(){    
    return monto_salario;
}
}
