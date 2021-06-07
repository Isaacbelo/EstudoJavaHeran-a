package Aula2;

public class Cadeira {

    private Double altura;
    private Double alturaAssento;
    private String cor = "Marrom";

    public Cadeira() {
        cor = "Marrom";
        altura = 0.50;
        alturaAssento = 1.20;

    }

    public void serrar() {
        System.out.println("Serrando a madeira...");
    }

    public void lixar() {
        System.out.println("Lixando a madeira...");
    }

    public void pintar() {
        System.out.println("Pintando a madeira...");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor_) {

        if (cor_.equals("Verde") || cor_.equals("Vermelho")) {
            cor = cor_;
        } else {
            System.out.println("Não há tinta na cor desejada!");
        }
    }
}
