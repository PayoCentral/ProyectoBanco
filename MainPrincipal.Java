import javax.swing.JOptionPane*;

public class MainPrincipal {

    public static void main(String[] args) {
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción: \n" +
                "1. Sistema para Empleados y Trabajadores \n" +
                "2. Banca en línea (Clientes) \n" +
                "3. Opción 3 \n" +
                "4. Salir"
            ));

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    // Ejecutar la acción de la opción 1
                    System.out.println("Has seleccionado el menú para Empleados y Trabajadores del Banco");
                    break;
                case 2:
                    // Ejecutar la acción de la opción 2
                    System.out.println("Has seleccionado el menú para Clientes");
                    break;
                case 3:
                System.out.println("Has seleccionado el menú para uso del Cajero, Caja Multiusos y Pago de Servicios");
                    break;
                case 4:
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 4);
    }
}
