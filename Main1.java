public class Main1{
  public static void main(String[] args) {
    Gerente gerente1 = new Gerente("Juan Perez", "12345678", 1000, 10, "222-237-7632", 1);
    System.out.println(gerente1);
    System.out.println("El salario de Juan Perez es de" + gerente1.calcularPago());
  }
}
