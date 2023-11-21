public class Cliente{ //Creación de la clase 
private int numcliente;
private String nombre;
private String rfc;
private String tipo_persona;
private String fecha_alta;
private int contraseña; 

public Cliente(int numcliente, String nombre, String rfc, String tipo_persona, String fecha_alta){
this.numcliente=numcliente;
this.nombre=nombre;
this.rfc=rfc;
this.tipo_persona=tipo_persona;
this.fecha_alta=fecha_alta;
}
public Cliente(int numcliente, int contraseña){
this.numcliente=numcliente;
this.contraseña=contraseña; 
}
public int getNumcliente(){
return numcliente;
}

public String getNombre(){
return nombre;
}

public String getRfc(){
return rfc;
}

public String getTipo_persona(){
return tipo_persona;
}

public String getFecha_alta(){
return fecha_alta;
}
public int getContraseña(){
    return contraseña; 
}
}
