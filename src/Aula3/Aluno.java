package Aula3;

public class Aluno {

    private String nome;
    private String matricula;
    private String telefone;

    //Construtor em branco
    public Aluno() {

    }
//Construtor com os parâmetros 

    public Aluno(String nome, String matricula, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDados() {
        return "Nome: " + this.nome + 
                "\nMat.:" + this.matricula + 
                "\nTel.:" + this.telefone +
                "\n";
    }

}
