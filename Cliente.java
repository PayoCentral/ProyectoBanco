import javax.Swing.JOptionPane;
public class Cliente{ //Creación de la clase 
private int numcliente;
private String nombre;
private String rfc;
private String tipo_persona;
private String fecha_alta;

public Cliente(int numcliente, String nombre, String rfc, String tipo_persona, String fecha_alta){
this.numcliente=numcliente;
this.nombre=nombre;
this.rfc=rfc;
this.tipo_persona=tipo_persona;
this.fecha_alta=fecha_alta;
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
public static int ingnumCliente(){
  int numCliente=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de cliente"));
  return numCliente;
}
public static String ingnomCliente(){
  String nombre=JOptionPane.showInputDialog("Ingresa el numero de cliente");
  return nombre;
}
public static String ingrfcCliente(){
  String rfc=JOptionPane.showInputDialog("Ingresa el numero de cliente");
  return rfc;
}
public static String ingtipoPersona(){
  String tipo_persona=JOptionPane.showInputDialog("Ingresa el tipo de persona de cliente");
  return tipo_persona;
}
public static String ingfechaAltaCliente(){
  String fecha_alta=JOptionPane.showInputDialog("Ingresa el numero de cliente");
  return fecha_alta;
}
public void ImprimeDatosCliente(){
JOptionPane.showMessageDialog(null, "Nombre del cliente "+getNombre()+"\nNumero de cliente "+getNumcliente()+"\nRfc del cliente"+getRfc()+"\n Tipo de persona "+getTipo_persona()+"\nFecha de alta del Cliente "+getFecha_alta());
}
public static Cliente ingDatosCliente(){
String nombre=Cliente.ingnomCliente();
int numcliente=Cliente.ingnumCliente();
String rfc=Cliente.ingrfcCliente();
String tipo_persona=Cliente.ingtipoPersona();
String fecha_alta=Cliente.ingfechaAltaCliente();
return new Cliente(numcliente, nombre,rfc, tipo_persona ,fecha_alta );
}
}
