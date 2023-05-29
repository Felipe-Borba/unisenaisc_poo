public class Medico extends Pessoa {
    private String crm;

    public Medico(String nome, String crm) {
        super(nome);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
