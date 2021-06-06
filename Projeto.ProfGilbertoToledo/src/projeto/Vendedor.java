package projeto;

/**
 * @author Isaac Belo
 */
public class Vendedor extends Funcionario {

    private int quantVendas;
    private Double comissao;

    public Vendedor(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    //Sobrescrita do metodo getsalario do Funcionario
    @Override
    public Double getSalario() {
        return this.salario + (this.quantVendas * this.comissao);

    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

}
