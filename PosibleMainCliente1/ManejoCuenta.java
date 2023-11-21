import javax.swing.JOptionPane;

public class ManejoCuenta{

    public static void main(String[] args) {
        //Creacion de clientes
      Cliente a= new Cliente(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu número de cuenta")));
      a.getNumcliente(); 

      if (a.getNumcliente () == 202322522){
              Cliente b= new Cliente(Long.parseLong(JOptionPane.showInputDialog("Introduce tu contraseña"))); 
      b.getContraseña();
                if(b.getContraseña()== 2023){
                    System.out.println("Que operación quiere realizar");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                }
      }
      else {
        JOptionPane.showMessageDialog(null, "Usuario NO existente");
      }
}
} 
    
