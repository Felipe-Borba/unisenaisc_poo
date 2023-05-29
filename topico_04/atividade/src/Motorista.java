import java.util.Objects;

public class Motorista extends Pessoa {
    private String cnh;

    public Motorista(String nome, String cnh) {
        super(nome);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorista motorista = (Motorista) o;
        return Objects.equals(cnh, motorista.cnh);
    }
}
