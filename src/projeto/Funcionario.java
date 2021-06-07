package projeto;

/**
 * @author Isaac Belo
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private String telefone;
    protected Double salario;//Protected para extender acesso e conseguir fazer @override.

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
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //Metodos para acoplar dados
    public String getDados() {
        return "Nome: " + this.getNome()
                + "\nCPF: " + this.getCpf()
                + "\nTelefone: " + this.getTelefone()
                + "\nSalario: " + this.getSalario();

    }

}
