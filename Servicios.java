public class Servicios {
    private Interger numero_servicio;
    private String nombre_servicio;
    private Interger folio_transaccion;
public Servicios (Interger numero_servicio, String nombre_servicio, Interger folio_transaccion){
    this.numero_servicio = numero_servicio;
    this.nombre_servicio = nombre_servicio;
    this.folio_transaccion = folio_transaccion;
}
public Interger getNumero_servicio (){
    return numero_servicio;
}
public String getNombre_servicio(){
    return nombre_servicio;
}
public Interger getFolio_transaccion(){
    return folio_transaccion;
}
}
