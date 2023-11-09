public class TarjetaDeCredito extends Credito{
    private Float cat_interes;
    private Interger numero_tarjeta;
    private Interger fecha_vencimiento;
    private Interger nip;
    private Interger cvv;
public TarjetaDeCredito (Float cat_interes, Interger numero_tarjeta, Interger fecha_vencimiento, Interger nip, Interger cvv) {
        this.cat_interes = cat_interes;
        this.numero_tarjeta = numero_tarjeta;
        this.fecha_vencimiento = fecha_vencimiento;
        this.nip = nip;
        this.cvv = cvv;
    }
public Float getCat_interes(){
    return cat_interes;
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
