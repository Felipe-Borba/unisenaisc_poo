public abstract class Animal {
    private double metrosPercorridos;

    public Animal() {
        metrosPercorridos = 0;
    }

    public void somaMetrosPercorridos(double metrosPercorridos) {
        this.metrosPercorridos += metrosPercorridos;
    }

    public double getMetrosPercorridos() {
        return this.metrosPercorridos;
    }

    public abstract void mover(int segundos);
} // fim da classe Animal
