
package projeto;

/**
 * @author Isaac Belo
 */
public class Projeto {
    
    public static void main(String[] args) {
        
        Motorista m1 = new Motorista("Geraldo", "000.000.000-00", "(31)9999-9999");
        m1.setSalario(800.00);
        System.out.println(m1.getDados());
        
        System.out.println("\n|-------------------------------------------------|\n");
        
        Vendedor v1 = new Vendedor("João", "111.111.111-11", "(31)5555-5555");
        v1.setSalario(800.00);
        v1.setQntVendas(10);
        v1.setComissao(10.00);
        System.out.println(v1.getDados());
        
    }
    
}
