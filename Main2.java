public class Main {
public static void main(String[] args) {
// Crear objetos de la clase Empleado
Empleado empleado1 = new Empleado("Juan Perez", "123456789", 1000, 10);
 // Imprimir los datos de los empleados
  System.out.println(empleado1);
  // Calcular el salario de los empleados
  System.out.println("El salario de Juan Perez es de" + empleado1.calcularPago());
}
}
