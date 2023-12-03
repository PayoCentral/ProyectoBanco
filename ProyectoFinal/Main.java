import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main{
    public static void main(String[] args) {
        int opcion = 0;
        int control = 0; 
        int operacion = 0; 
        double deuda = 0;
            Cuenta[] cuentas = new Cuenta[100];
        int num = 0;
        int continuar;
            Empleado[] trabajador = new Empleado[5];
        int opc, i, trabs = 0;
        int siguiente;
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

        do {
            do {
                String op = JOptionPane.showInputDialog(" 1:Empleado" + "\n" + " 2:Gerente" + "\n" + " 3:Ejecutivo");
                opc = Integer.parseInt(op);
                switch (opc) {
                    case 1:
                        trabajador[trabs] = new Empleado(
                                JOptionPane.showInputDialog("Nombre"),
                                Integer.parseInt(JOptionPane.showInputDialog("IdEmpleado")),
                                Integer.parseInt(JOptionPane.showInputDialog("Nss")),
                                Double.parseDouble(JOptionPane.showInputDialog("SalarioMin")
                                ), Double.parseDouble(JOptionPane.showInputDialog("Impuesto")));
                        break;
                    case 2:
                        trabajador[trabs] = new Gerente(
                                JOptionPane.showInputDialog("Nombre"),
                                Integer.parseInt(JOptionPane.showInputDialog("IdEmpleado")),
                                Integer.parseInt(JOptionPane.showInputDialog("Nss")),
                                (float) Double.parseDouble(JOptionPane.showInputDialog("SalarioMin")
                                ), (float) Double.parseDouble(JOptionPane.showInputDialog("Impuesto")),
                                Integer.parseInt(JOptionPane.showInputDialog("NumOficina")),
                                Integer.parseInt(JOptionPane.showInputDialog("NumGerente")),
                                Float.parseFloat(JOptionPane.showInputDialog("SueldoGerente")),
                                Integer.parseInt(JOptionPane.showInputDialog("telgerente")));
                        break;
                    case 3:
                        trabajador[trabs] = new Ejecutivo(JOptionPane.showInputDialog("Nombre"),
                                Integer.parseInt(JOptionPane.showInputDialog("IdEmpleado")),
                                Integer.parseInt(JOptionPane.showInputDialog("Nss")),
                                (float) Double.parseDouble(JOptionPane.showInputDialog("SalarioMin")
                                ), (float) Double.parseDouble(JOptionPane.showInputDialog("Impuesto")),
                                Integer.parseInt(JOptionPane.showInputDialog("NumOficina")),
                                Integer.parseInt(JOptionPane.showInputDialog("NumEjecutivo")),
                                Float.parseFloat(JOptionPane.showInputDialog("SueldoEjecutivo")));

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            } while (opc < 1 || opc > 3);

            trabs = trabs + 1;
            siguiente = JOptionPane.showConfirmDialog(null, "¿Desea añadir otro Trabajador?", "Recabando informacion",
                    JOptionPane.YES_NO_OPTION);
        } while (siguiente == JOptionPane.YES_OPTION);

        for (i = 0; i < trabs; i++) {
            System.out.print(trabajador[i]);
            System.out.println(trabajador[i].calcularPago());
        }
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
                Random aleatorio = new Random();
                double numeroAleatorio = aleatorio.nextDouble() * 250750.50 + 1000;
                double pagoDeuda = 0;
                JOptionPane.showMessageDialog(null, "Ingresa tu tarjeta");
                System.out.println("Has seleccionado el menú para uso del Cajero, Caja Multiusos y Pago de Servicios"); 
                   do {
                    control = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una operación de Cajero" + "\n" + "1. Retirar Dinero: " + "\n" + "2.Depositar Dinero" + "\n" + "3.Transferir dinero: " + "\n" + "4. Solicitar crédito" + "\n" + "5. Pagar crédito" + "\n" + "6. Salir"));  
                       // Realizar la operación correspondiente
                       switch (control) {
                           case 1:
                           System.out.println("Haz seleccionado la operación de retirar dinero");
                            Cajero f= new Cajero(1500.00);
                            System.out.println(f.toString());
                            Retiro g=new Retiro(0.0); 
                            Retiro.RetDinero(f, g);
                               break;
                           case 2:
                               //retirarDinero();
                               System.out.println("Haz seleccionado depositar dinero");
                               Cajero ab=new Cajero(1500.00);
                               System.out.println(ab.toString());
                               Retiro ac=new Retiro(0.0); 
                               Retiro.DepDinero(ab, ac);
                               break;
                           case 3:
                               //depositarDinero();
                               System.out.println("Transferir dinero");
                               Cajero ad= new Cajero(1500.00); 
                               System.out.println(ad.toString());
                               Cajero ae=new Cajero(3000.00); 
                               System.out.println(ae.toString());
                               Retiro af=new Retiro(0.0); 
                               Retiro.TransDinero(ad, ae, af);
                               break;
                            case 4:
                                //solicitarCredito();
                                JOptionPane.showInputDialog("Ingresa tu CURP");
                                int aceptar = JOptionPane.showConfirmDialog(null, "Te ofrecemos un crédito de " + "$" + numeroAleatorio,"Hemos checado tu historial.", JOptionPane.YES_NO_OPTION);
                                if(aceptar == JOptionPane.YES_OPTION){
                                    deuda = numeroAleatorio; }
                                    else {
                                        break;
                                    }
                                    break;
                                    
                            case 5:
                            pagoDeuda = Float.parseFloat(JOptionPane.showInputDialog(null, "¿Cuánto desea pagar?"));
                            int eleccionpago = Integer.parseInt(JOptionPane.showInputDialog("Desea pagar con..." + "\n" + "Efectivo" + "\n" + "Saldo de cuenta" + "\n" + "Seleccione 1 para efectivo o cualquier otro número para saldo"));
                            if (eleccionpago==1) {
                                JOptionPane.showMessageDialog(null, "Deposite efectivo");
                                deuda=deuda-pagoDeuda;
                                JOptionPane.showMessageDialog(null, "Su deuda actual es de: " + deuda);
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Su deuda actual es de: " + deuda);
                            }
                            break;
                            
                           default:
                               System.out.println("Opción no válida. Inténtelo de nuevo.");
                               break;
                       }
                   } while (control != 5);
                    break;
                default:
                if (opcion==4){
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro sistema bancario");
                    System.out.println("Hasta luego!!!");
                }
                else
                    JOptionPane.showMessageDialog(null, "Opción no válida");
        } 
         } while (opcion != 4);
}
}

/*⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠖⠒⠢⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⡴⠃⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⣰⠁⠀⠀⠀⠀⠀⠀⠀⠈⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⡰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠂⠀⠤⠤⡀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⢄⠀⠀⠀⠀⠀⠀
⢠⠞⠁⠀⣀⣠⣤⠤⠤⠤⠤⢤⣤⠤⠤⠤⠤⣤⣀⣀⡀⠀⠀⠀⠑⢤⠀⠀⠀⠀
⣣⠔⠚⠻⣄⣡⣞⣄⣠⣆⠀⢼⣼⣄⣀⣀⣠⣆⠜⡘⡻⠟⠙⣲⠦⣈⢳⡀⠀⠀
⡇⠒⢲⡤⡜⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠙⠛⠤⣖⠬⠓⠂⠉⣿⠇⠀⠀
⠙⠲⠦⠬⣧⡀⠀⠀⠀⠀⠀⣠⣿⣿⣷⡄⠀⠀⠀⠀⠀⣞⠀⢀⣲⠖⠋⠀⠀⠀
⠀⠀⠀⠀⠘⣟⢢⠃⠀⠀⠀⠉⠙⠻⠛⠁⠀⠀⠀⢀⡜⠒⢋⡝⠁⢀⣀⣤⠂⠀
⠀⠀⠀⠀⠀⡇⠷⠆⠶⠖⠀⠀⠀⠀⠀⠀⠀⠀⣠⠮⠤⠟⠉⠀⢰⠱⡾⣧⠀⠀
⠀⠀⠀⠀⠀⠹⢄⣀⣀⠀⠀⠀⠀⠀⠀⣀⡤⠚⠁⠀⢠⣤⡀⣼⢾⠀⠀⡟⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠒⡏⠀⡡⠣⢖⣯⠶⢄⣀⣿⡾⠋⢸⢀⡶⠿⠲⡀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⣹⠃⣀⣤⠞⠋⠀⠉⠢⣿⣿⡄⠀⣿⠏⠀⠀⠐⢣
⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⢱⢡⡾⠋⠀⠀⢀⡐⣦⣀⠈⠻⣇⢸⢁⣤⡙⡆⠈⡏
⠀⠀⠀⠀⠀⠀⣠⠎⢁⠔⡳⡟⠀⠐⠒⠒⠋⠀⠠⡯⠙⢧⡈⠻⣮⠯⣥⠧⠞⠁
⠀⠀⠀⣀⠴⠋⠀⢶⠋⢸⡝⠀⠀⠀⠀⠀⠀ ⠀⣸⢦⠀⠙⡆⠘⠦⢄⡀⠀⠀
⠀⠀⣸⠅⢀⡤⢺⢸⠀⢸⡃⠤⠀⠀⠀⠀⣀⡤⢚⣋⣿⢄⡀⢇⡀⠀⠀⣝⡶⠀
⠀⠀⢿⠀⡏⠀⠘⠞⠀⢸⡵⣦⠤⠤⠖⣿⠥⠞⠉⠀⢸⠖⠁⠀⠙⠢⣑⠶⣽⢂
⠀⠀⠸⠤⠃⠀⠀⠀⠀⠀⠉⢳⠂⠈⡽⠁⠀⠀⠀⢀⡼⠒⠓⢤⠀⠀⠀⠙⠚⠛
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠓⡎⠀⠀⠀⠀⢠⠎⣠⠀⠀⠈⢳⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⢸⡶⠗⠋⣱⠄⠀⠀⠀⣧⠀⠀⠀⢀
⠀⠀⠀⠀⠀⠀⠀⣀⠴⠒⠒⠦⣤⣷⠂⢀⡸⠁⠀⡼⠁⠀⠀⠀⠈⢺⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢠⠋⢀⣀⡀⠀⠀⠀⠀⠀⠈⡇⠀⠀⠙⠢⠤⠤⣄⡤⠼⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠑⢦⣄⣉⣑⠢⠄⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   We live, We love, We lie */
