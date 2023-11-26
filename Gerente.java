import javax.swing.JOptionPane;
public class PrincipalEmpleado{
    public static void main(String[] args){
        Trabajador[] trabajador = new Trabajador[5];
        int opc,i,num=0
            int continuar;
        do{
            do{
                String op= JOptionPane.showInputDialog("1: Empleado" + "\n" + "2 :Gerente" + "\n" + "3 :Ejecutivo");
                opc = Interger.parseInt(op)
                    switch(opc){
                    case 1:
                        trabajador [num]= new Empleado(JOptionPane.showInputDialog("Nombre
    
