import javax.swing.JOptionPane;

public class Retiro {
    private double saldo_retiro; 

    public Retiro(double saldo_retiro){
        this.saldo_retiro=saldo_retiro; 
    }

    public double getSaldo_Retiro(){
        return saldo_retiro; 
    }
    public static void RetDinero(Cajero a, Retiro b){
       Double l=1500.00; 
        Double m= Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a retirar"));
        if(m<=l){
        Double n= l-m; 
        JOptionPane.showMessageDialog(null,"Te queda en cuenta: " + n);
        System.out.println("Te queda en cuenta: " + n);
        }
        else{
        JOptionPane.showMessageDialog(null,"Dinero insuficiente en la cuenta");
        System.out.println("Dinero insuficiente en la cuenta");
        }
    }

    public static void DepDinero(Cajero a, Retiro b){
       Double l=1500.00; 
        Double m= Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a depositar"));
        JOptionPane.showMessageDialog(null,"Introduce un máx. de 45 billetes" + "\n" + "No introduzca monedas");
        Double n= l+m; 
        JOptionPane.showMessageDialog(null,"Tienes: " + n + "pesos mexicanos");
        System.out.println("Tienes: " + n + " pesos mexicanos");
    }

    public static void TransDinero(Cajero a, Cajero c, Retiro b){
       Double l=1500.00; 
       Double p=3000.00; 
       Double m= Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a transferir"));
       if(m<=l){ 
        Double n= l-m;
        Double q= p+m;  
        JOptionPane.showMessageDialog(null,"Tienes en la cuenta principal: " + n + " pesos mexicanos" + "\n" +  "Tienes en la cuenta receptora: " + q + " pesos mexicanos");
        System.out.println("Tienes en la cuenta principal: " + n + " pesos mexicanos" + "\n" +  "Tienes en la cuenta receptora: " + q + " pesos mexicanos");
        }
        else{
        JOptionPane.showMessageDialog(null,"Dinero insuficiente en la cuenta");
        System.out.println("Dinero insuficiente en la cuenta");
        }

    }
}
