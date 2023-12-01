public class Cajero {
    protected double saldo;

    public Cajero(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

      public double getSaldo() {
        return saldo;
    } 

    @Override
    public String toString(){
        return "Tu saldo es: " + saldo; 
    }
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("No puedes retirar esa cantidad. Verifica tu saldo o la cantidad ingresada.");
        }
    }

  
}