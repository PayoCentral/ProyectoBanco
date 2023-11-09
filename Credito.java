public class Credito extends Servicios{ //Corrección de Variable
    private Interger folio;
    private Float monto;
    private String fecha_pago;
public Credito (Interger folio, Float monto, String fecha_pago){
    this.folio = folio;
    this.monto = monto;
    this.fecha_pago = fecha_pago;
}
public Interger getFolio(){
    return folio;
}
public Float  getMonto(){
    return monto;
}
public String getFecha_pago(){
    return fecha_pago;
}
}
