class CajeroConRetiros extends Cajero {
    private int[] retiros;
    private int contadorRetiros;

         public CajeroConRetiros(double saldo) {
                super(saldo);
                this.retiros = new int[10]; // Por ejemplo, un array de 10 retiros
                this.contadorRetiros = 0;
    }

    public void realizarRetiro(int monto) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            if (contadorRetiros < retiros.length) {
                retiros[contadorRetiros] = monto;
                contadorRetiros++;
            } else {
                System.out.println("No se pueden agregar más retiros. El array está lleno.");
            }
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro de $" + monto);
        }
    }

    public int[] obtenerRetiros() {
        return retiros;
    }
}
