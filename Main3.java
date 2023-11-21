public class Main3{
  public static void main( String[] args) {
    // Crear objetos de la clase Ejecutivo
  Ejecutivo ejecutivo1 = new Ejecutivo(" Juan Perez", "12345678",1000, 10,"222-234-5467", 1, 101, 12345);
    // Imprimir los datos del ejecutivo
  System.out.println(ejecutivo1);
    // Calcular el salario del ejecutivo
    System.out.println("El salario de Juan Perez" + ejecutivo1.calcularPago());
  }
}
  
