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
    // Empleado
    Empleado[] empleado = new Empleado[5];
    Gerente[] gerente = new Gerente[5];
    Ejecutivo[] ejecutivo = new Ejecutivo[5];

    for (int i=0;i < empleado.length; i++) {
      String nombreEmpleado = JOptionPane.showInputDialog("Ingresa el nombre del empleado" + (i + 1) + ":");    
      int idemplEmpleado = Interger.parseInt(JOptionPane.showInputDialog("Ingresa el idempl del empleado" + (i + 1) + ":"));
      int nssEmpleado = Interger.parseInt(JOptionPane.showInputDialog("Ingresa el nss del empleado" + (i + 1) + ":"));
      double salariominEmpleado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salariomin del empleado" + (i + 1) + ":"));
      double impuestoEmpleado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el impuesto del empleado" + (i + 1) + ":"));
      empleado[i] = new Empleado(nombreEmpleado, idemplEmpleado, nssEmpleado, salariominEmpleado, impuestoEmpleado);
  }
    for (int i = 0; i < gerente.length; i++){
      int numOficinaGerente = Interger.parseInt(JOptionPane.showInputDialog("Ingresa el numero de oficina" + (i + 1) + ":"));
      int numGerentegGerente = Interger.parseInt(JOptionPane.showInputDialog("Ingresa el numero de gerente" + (i+ 1) + ":"));
      float sueldo_gerenteGerente = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el sueldo del gerente" + (i + 1) + ":"));
      int telgerenteGerente = Interger.parseInt(JOptionPane.showInputDialog("Ingresa el telefono" + (i + 1) + ":"));
      gerente[i] = new Gerente(null, numOficinaGerente, numGerentegGerente,sueldo_gerenteGerente,telgerenteGerente, telgerenteGerente, telgerenteGerente, sueldo_gerenteGerente, telgerenteGerente);
    }
    for (int i = 0; i < ejecutivo.length; i++){
      int numOficinaEjecutivo = Interger.parseInt(JOptionPane.showInputDialog("Ingresa el numero de oficina del ejecutivo" + (i + 1) + ":"));
      int numEjecutivoEjecutivo = Interger.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ejecutivo" + (i + 1) + ":"));
      float sueldo_ejecutivoEjecutivo = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el sueldo del ejecutivo" + (i + 1) + ":"));
      ejecutivo[i] = new Ejecutivo(null, numOficinaEjecutivo,numEjecutivoEjecutivo,sueldo_ejecutivoEjecutivo, sueldo_ejecutivoEjecutivo, numEjecutivoEjecutivo, sueldo_ejecutivoEjecutivo, sueldo_ejecutivoEjecutivo);
    String mensaje = "Informacion de los trabajadores:\n";
    mensaje += "Empleado:\n";
    for (Empleado empleados : empleado){
      mensaje += empleado + "\n";
    }
    mensaje += "\nGerentes:\n";
    for (Gerente gerentes : gerente){
      mensaje += gerente + "\n";
    }
    mensaje += "\nEjecutivos:\n";
    for (Ejecutivo ejecutivos : ejecutivo){
      mensaje += ejecutivo + "\n";
    }
    JOptionPane.showMessageDialog(null, mensaje, "Informacion de trabajadores", JOptionPane.INFORMATION_MESSAGE);
  }
}
}
                    break;
                    
                                                                                                                                                            }
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
 int opcion;
        do {
            // Mostrar el menú
            System.out.println("----- Menú del Cajero -----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Depositar Dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Realizar la operación correspondiente
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    retirarDinero();
                    break;
                case 3:
                    depositarDinero();
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
