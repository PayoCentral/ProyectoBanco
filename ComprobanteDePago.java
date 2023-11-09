public class ComprobanteDePago {
    private int numero;
    private String cliente;
    private double monto;
    private Date fecha;

    public ComprobanteDePago(int numero, String cliente, double monto, Date fecha) {
        this.numero = numero;
        this.cliente = cliente;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Comprobante de Pago #" + numero +
               "\nCliente: " + cliente +
               "\nMonto: $" + monto +
               "\nFecha: " + fecha;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Date fechaActual = new Date();
        ComprobanteDePago comprobante = new ComprobanteDePago(1, "Cliente Ejemplo", 100.0, fechaActual);
        System.out.println(comprobante);
    }
}
