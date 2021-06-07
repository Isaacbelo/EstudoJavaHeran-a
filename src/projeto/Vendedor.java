package projeto;

/**
 * @author Isaac Belo
 */
public class Vendedor extends Funcionario {

    private Double comissao;
    private int qntVendas;

    public Vendedor(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    @Override
    public Double getSalario() {
        return this.salario + (this.getQntVendas() * this.getComissao());
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

}
