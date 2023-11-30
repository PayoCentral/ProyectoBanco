import java.util.Scanner;

public class Cajero {
    protected double saldo;

    public Cajero(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("No puedes retirar esa cantidad. Verifica tu saldo o la cantidad ingresada.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        Cajero cajero = new Cajero(saldoInicial);
   }
}
