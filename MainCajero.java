public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el saldo inicial: ");
    double saldoInicial = scanner.nextDouble();

    Cajero cajero = new Cajero(saldoInicial);

    int opcion;
    do {
        System.out.println("\n*** Menú ***");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Salir");
        System.out.print("Elige una opción (1-4): ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Saldo actual: " + cajero.obtenerSaldo());
                break;
            case 2:
                System.out.print("Ingresa la cantidad a depositar: ");
                double cantidadDeposito = scanner.nextDouble();
                cajero.depositar(cantidadDeposito);
                break;
            case 3:
                System.out.print("Ingresa la cantidad a retirar: ");
                double cantidadRetiro = scanner.nextDouble();
                cajero.retirar(cantidadRetiro);
                break;
            case 4:
                System.out.println("Programa invalida");
                break;
            default:
                System.out.println("Opción invalida, favor de reintentar.");
        }

    } while (opcion != 4);

    scanner.close();
}
