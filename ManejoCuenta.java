import javax.swing.JOptionPane;

public class ManejoCuenta {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];
        Cuenta[] cuentas = new Cuenta[10];
        int opc, i, num = 0;
        int continuar;

        do {
            do {
                String op = JOptionPane.showInputDialog(" 1 :Cliente" + "\n" + " 2 :Cuenta");
                opc = Integer.parseInt(op);
                switch (opc) {
                    case 1:
                        clientes[num] = Cliente.ingDatosCliente();
                        break;
                    case 2:
                        cuentas[num] = Cuenta.ingresarDatosCuenta();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                }

            } while (!(opc == 1 || opc == 2));

            num = num + 1;

            continuar = JOptionPane.showConfirmDialog(null, "¿Desea añadir otro Cliente o Cuenta?", "Recabando información", JOptionPane.YES_NO_OPTION);

        } while (continuar == JOptionPane.YES_OPTION);


        if (num > 0) {
            for (i = 0; i < num; i++) {
                if (clientes[i] != null) {
                    clientes[i].ImprimeDatosCliente();
                }
                if (cuentas[i] != null) {
                    cuentas[i].imprimeDatosCuenta();
                }
            }
        } else {
           JOptionPane.showMessageDialog(null,"No se detectaron clientes ni cuentas.");
        }
    }
}
