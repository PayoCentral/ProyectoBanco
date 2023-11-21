import javax.swing.JOptionPane;

public class ManejoCuenta {

    public static void main(String[] args) {
        //Creacion de clientes
      Cliente a= new Cliente(202322522, 2023);
      a.getNumcliente(); 
      a.getContraseña(); 
      if (a.getNumcliente () == 202322522){
        System.out.println("Bienvenido Saúl ");
                if(a.getContraseña()== 2023){
                    System.err.println("Que operación quiere realizar");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                }
      }
      else {
        System.out.println("Usuario no existente");
      }

}
} 
    
