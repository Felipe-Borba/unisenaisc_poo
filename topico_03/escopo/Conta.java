public class Conta {
    private double saldo;

    public double getSaldo() {
	return this.saldo;
    }

    public void depositar(double valor) {
	this.saldo += (valor > 0 ? valor : 0);
    }

    public void render() {
	double juros = 0.01; // 1%
	depositar(getSaldo() * juros);
    }
} // fim da classe Conta
