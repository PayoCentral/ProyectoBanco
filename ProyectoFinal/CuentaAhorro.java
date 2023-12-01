public class CuentaAhorro extends Cuenta{
    protected float saldomin;
    
public CuentaAhorro(){
    this("",0f,"","",0f);
}
    
public CuentaAhorro(String numcuenta, float saldo, String historialtrans, String moneda, float saldomin){
    super(numcuenta, saldo, historialtrans, moneda); 
this.saldomin = saldomin;
}
public float getSaldoMin(){    
    return saldomin;
}
}