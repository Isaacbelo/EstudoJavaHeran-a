package projeto;

/**
 * @author Isaac Belo
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private String telefone;
    protected Double salario;

    public Funcionario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getSalario() {
        return this.salario;

    }

    public String getDados() {
        return "\nNome: " + this.getNome()
                + "\nTelefone: " + this.getTelefone()
                + "\nSalario: " + String.format("%.2f", this.getSalario());
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
