public class Cuenta {
    private String numcuenta;
    private float saldo;
    private String historialtrans;
    private String moneda;

public Cuenta(String numcuenta,float saldo, String historialtrans, String moneda) {
this.numcuenta = numcuenta;
this.saldo = saldo;
this.historialtrans = historialtrans;
this.moneda = moneda;
}
public String getNumcuenta(){
    return numcuenta;
}
public float getSaldo(){
    return saldo;
}
public String getHistorialtrans(){
    return historialtrans;
}
public String getMoneda(){
    return moneda;
}
} 
