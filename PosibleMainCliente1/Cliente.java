
public class Cliente{ //Creación de la clase 
private int numcliente;
private String nombre;
private String rfc;
private String tipo_persona;
private String fecha_alta;
private long contraseña; 

public Cliente(int numcliente, String nombre, String rfc, String tipo_persona, String fecha_alta, long contraseña){
this.numcliente=numcliente;
this.nombre=nombre;
this.rfc=rfc;
this.tipo_persona=tipo_persona;
this.fecha_alta=fecha_alta;
this.contraseña=contraseña; 
}

public Cliente(int numcliente, long contraseña){
    this.numcliente=numcliente; 
    this.contraseña=contraseña; 
}

public Cliente (int numcliente){
    this.numcliente=numcliente;
}

public Cliente (long contraseña){
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
public long getContraseña(){
    return contraseña; 
}
}