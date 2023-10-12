public class Sucursal{
    private int idSucursal; 
    private String direccion; 
    private String nombre; 

    public Sucursal (int is, String d, String n){
        idSucursal= is; 
        direccion=d; 
        nombre=n; 
    }
    public int getidSucursal(){
        return idSucursal;
    }
    public String getDireccion(){
        return direccion; 
    }
    public String getNombre(){
        return nombre; 
    }
}
