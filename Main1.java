public class Main1{
  public static void main(String[] args) {
    Gerente gerente1 = new Gerente("Juan Perez", 0001, 502000458, 207.57, 0.17, 0156,015,408.66,222456868);
    System.out.println(gerente1);
    System.out.println("El salario de Juan Perez es de " + gerente1.calcularPago());
  }
public static void main(String[] args) {
// Crear objetos de la clase Empleado
Empleado empleado1 = new Empleado("Juan Perez", "123456789", 1000, 10);
 // Imprimir los datos de los empleados
  System.out.println(empleado1);
  // Calcular el salario de los empleados
  System.out.println("El salario de Juan Perez es de" + empleado1.calcularPago());
}
  public static void main( String[] args) {
    // Crear objetos de la clase Ejecutivo
  Ejecutivo ejecutivo1 = new Ejecutivo(" Juan Perez", "12345678",1000, 10,"222-234-5467", 1, 101, 12345);
    // Imprimir los datos del ejecutivo
  System.out.println(ejecutivo1);
    // Calcular el salario del ejecutivo
    System.out.println("El salario de Juan Perez" + ejecutivo1.calcularPago());
  }
}
 
  

