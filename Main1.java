public class Main1{
  public static void main(String[] args) {
    Gerente gerente1 = new Gerente("Juan Perez", 0001, 502000458, 207.57, 0.17, 01,01,408.66,222456868);
    System.out.println(gerente1);
    System.out.println("El salario de Juan Perez es de" + gerente1.calcularPago());
  }
}
