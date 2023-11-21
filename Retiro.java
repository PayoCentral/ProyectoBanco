public class Retiro {
    public static void main(String[] args) {
        CajeroConRetiros cajeroConRetiros = new CajeroConRetiros("Cajero2", 1500.0);

        cajeroConRetiros.realizarRetiro(100);
        cajeroConRetiros.realizarRetiro(50);

        int[] retiros = cajeroConRetiros.obtenerRetiros();
        System.out.println("Retiros:");
        for (int retiro : retiros) {
            if (retiro != 0) {
                System.out.println("$" + retiro);
            }
        }
    }
}
