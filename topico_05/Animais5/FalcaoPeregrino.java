public class FalcaoPeregrino extends Animal implements Conversacao {
    private static final int VELOCIDADE_KMH = 390;

    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            somaMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);
            System.out.printf("O falcão peregrino voou %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }

    @Override
    public void falar() {
	System.out.println("Olá! Eu sou um falcão peregrino.");
    }
} // fim da classe FalcaoPeregrino
