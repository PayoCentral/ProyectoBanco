import javax.swing.JOptionPane;


public class Main{
    public static void main(String[] args) {
        int opcion = 0;
        int control = 0; 
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
                     // Empleado
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

        
        for (int z = 0; z < num; z++) {
            if (cuentas[z] != null) {
                cuentas[z].imprimeDatosCuenta();
            }
        }    
                    
                    
        break;
                default:
                    break;
            }
            } while (operacion != 3); 
                case 3:
                System.out.println("Has seleccionado el menú para uso del Cajero, Caja Multiusos y Pago de Servicios"); 
                   do {
                    control = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una operación de Cajero" + "\n" + "1. Consultar Saldo: " +
                     "\n" + "2. Retirar Dinero: " + "\n" + "3.Depositar Dinero" + "\n" + "4.Salir"));  
                       // Realizar la operación correspondiente
                       switch (control) {

                               //////////////////////////// Realizar los métodos de los case 
                           case 1:
                               //consultarSaldo(); 
                               System.out.println("Hola");
                               break;
                           case 2:
                               //retirarDinero();
                               System.out.println("XD");
                               break;
                           case 3:
                               //depositarDinero();
                               System.out.println("Holy");
                               break;
                           case 4:
                               System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                               break;
                           default:
                               System.out.println("Opción no válida. Inténtelo de nuevo.");
                               break;
                       }
                   } while (control != 4);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
        } 
         } while (opcion != 4);
}
}
