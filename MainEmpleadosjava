import javax.swing.JOptionPane;
public class PincipalTrabajador{
  public static void main(String[] args){
    Trabajador[] trabajador = new Trabajador [5];
    int opc,i,num=0;
    int continuar;
    do{
      do{
        String op = JOptionPane.showInpuntDialog(" 1:Empleado" + "\n" + " 2:Gerente" + "\n" + " 3:Ejecutivo");
        opc = Interger.parseInt(op)
          switch(opc){
          case 1:
            trabajador [num] = new Empleado(JOptionPane.showInputDialog("Nombre"),Interger.parseInt(JOptionPane.showInputDialog("Idempl"),Interger.parseInt(JOptionPane.showInputDialog("Nss"),Double.parseDouble(JOptionPane.showInputDialog("Salariomin"),Double.parseDouble(JOptionPane.showInputDialog("Impuesto"))))));
             break;
          case 2: 
            trabajador [num] = new Gerente(Interger.parseInt(JOptionPane.showInputDialog("NumOficina"),Interger.parseInt(JOptionPane.showInputDialog("NumGerente"),Double.parseDouble(JOptionPane.showInpuntDialog("SueldoGerente")))));
            break;
            case 3:
            trabajador [num] = new Ejecutivo(Interger.parseInt(JOptionPane.showInpuntDialog("NumOficina"),Interger.parseInt(JOptionPane.showInpuntDialog("NumEjecutivo"),Double.parseDouble(JOptionPane.showInpuntDialog("SueldoEjecutivo")))));
            break;
            default:
            JOptionPane.showMessageDialog(null,"Opcion Incorrecta");
            }
            } while((opc < 1) && (opc < 2) && (opc < 3));
            num = num+1;
            continuar = JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Trabajador?","Recabando informacion",JOptionPane.YES_NO_OPTION);
        } while
        (continuar==JOptionPane.YES_NO_OPTION);
        for (i=0;i<num;i++)
        {
            System.out.print(trabajador[i]);
            System.out.println(trabajador[i].calcularPago());
        }
    }
}
  
  

