public class TarjetaDeCredito extends Credito{
    protected float rendimiento;
    protected float saldo;
    protected int numero_tarjeta;
    protected int fecha_vencimiento;
    protected int nip;
    protected int cvv;
    
public TarjetaDeCredito (float rendimiento, float saldo, int numero_tarjeta, int fecha_vencimiento, int nip, int cvv) {
        this.rendimiento = rendimiento;
        this.saldo = saldo;
        this.numero_tarjeta = numero_tarjeta;
        this.fecha_vencimiento = fecha_vencimiento;
        this.nip = nip;
        this.cvv = cvv;
    }
public Float getRendimiento(){
    return rendimiento;
}
public Interger getNumero_tarjeta(){
    return numero_tarjeta;
}
public Interger getFecha_vencimiento(){
    return fecha_vencimiento;
}
public Interger getNip(){
    return nip;
}
public Interger getCvv(){
    return cvv;
}
}
