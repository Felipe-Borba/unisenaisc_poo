public class PeixeAgulhao extends Animal implements Conversacao {
    private static final int VELOCIDADE_KMH = 115;

    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            somaMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);
            System.out.printf("O peixe-agulhao nadou %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }

    @Override
    public void falar() {
	System.out.println("Blup! Blup!");
    }
} // fim da classe PeixeAgulhao
