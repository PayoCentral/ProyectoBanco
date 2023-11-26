import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        int opcion = 0;
        int operacion = 0; 
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción: \n" +
                "1. Sistema para Empleados y Trabajadores \n" +
                "2. Banca en línea (Clientes) \n" +
                "3. Caja Multiusos \n" +
                "4. Salir"
            ));
            switch (opcion) {
                case 1:
                    // Ejecutar la acción de la opción 1
                    System.out.println("Has seleccionado el menú para Empleados y Trabajadores del Banco");
                    break;
                case 2:
                    // Ejecutar la acción de la opción 2
                    System.out.println("Has seleccionado el menú para Clientes");
                    do{
                        operacion=Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción: \n" +
                "1. Consulta de cuenta: \n" +
                "2. Agregar nueva cuenta \n" +
                "3. Salir"
            ));
            switch (operacion) {
                case 1: 
                Cliente a= new Cliente(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu número de cuenta")));
                a.getNumcliente(); 
          
                if (a.getNumcliente () == 202322524){
                        Cliente b= new Cliente(Long.parseLong(JOptionPane.showInputDialog("Introduce tu contraseña"))); 
                b.getContraseña();
                          if(b.getContraseña()== 2023){
                              JOptionPane.showMessageDialog(null, "Ernesto Gonzales Peralta" + "\n" + "Tienes 200 pesos" );
                          }
                          else{
                              JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                          }
                }
                else {
                  JOptionPane.showMessageDialog(null, "Usuario NO existente");
                }
                    
                    break;
            case 2:
        Cuenta[] cuentas = new Cuenta[100];
        int num = 0;
        int continuar;

        do {
            cuentas[num] = Cuenta.ingresarDatosCuenta();
            num++;  

            continuar = JOptionPane.showConfirmDialog(null, "¿Desea añadir otra Cuenta?", "Recabando información", JOptionPane.YES_NO_OPTION);

        } while (continuar == JOptionPane.YES_OPTION);

        
        for (int i = 0; i < num; i++) {
            if (cuentas[i] != null) {
                cuentas[i].imprimeDatosCuenta();
            }
        }    
                    
                    
        break;
                default:
                    break;
            }
            } while (operacion != 3); 
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
