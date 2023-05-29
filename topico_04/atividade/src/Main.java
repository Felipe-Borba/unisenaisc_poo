public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Joao", "101010101");
        Pessoa motorista2 = new Motorista("Joao", "101010101");

        Medico medico1 = new Medico("Chico", "92834234");
        Pessoa medico2 = new Medico("Chico", "92834234");

        System.out.println(motorista1.equals(motorista2));
        System.out.println(medico1.equals(medico2));
    }
}
