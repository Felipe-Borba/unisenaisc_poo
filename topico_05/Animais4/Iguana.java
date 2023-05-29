public class Iguana extends Animal {
    private static final int VELOCIDADE_KMH = 20;

    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            somaMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);

            System.out.printf("A iguana correu %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }
}
