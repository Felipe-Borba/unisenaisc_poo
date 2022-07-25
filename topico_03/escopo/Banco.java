public class Banco {
    public static void main(String[] args) {
	Conta conta = new Conta();

	System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());

	conta.depositar(100.0);

	int meses = 12;
	for (int i = 0; i < meses; i++)
	    conta.render();

	System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
    }
} // fim da classe Banco
