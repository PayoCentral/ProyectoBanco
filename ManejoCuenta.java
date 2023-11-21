import javax.swing.JOptionPane;
public class ManejoCuenta {

    public static void main(String[] args) {
        //Creacion de clientes
        int numClientes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos clientes desea registrar?"));
        for (int i = 1; i <= numClientes; i++) {
            Cliente cliente = Cliente.ingDatosCliente();
            JOptionPane.showMessageDialog(null,"Detalles del Cliente " + i + ":");
            cliente.ImprimeDatosCliente();
          //Creacion de cuentas
        int numCuentas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos clientes desea registrar?"));
        for (int i2 = 1; i <= numCuentas; i++) {
            Cuenta cuenta = Cuenta.ingresarDatosCuenta();
            JOptionPane.showMessageDialog(null,"Detalles de la Cuenta " + i2 + ":");
            cuenta.imprimeDatosCuenta();
  
    }
}
}
}
