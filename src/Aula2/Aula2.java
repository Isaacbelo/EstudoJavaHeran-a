
package Aula2;

public class Aula2 {
    
    public static void main(String[] args) {
        
        /*Cadeira c1 = new Cadeira();
        c1.serrar();
        c1.lixar();
        c1.pintar();
        c1.setCor("Azul");
        System.out.println("Cor atual: " + c1.getCor());
        */
        
        Aluno a1 = new Aluno("Isaac");
        a1.setTelefone("1111111111");
        a1.setMatricula("0000000");
        
        Aluno a2 = new Aluno("João");
        a2.setTelefone("222222222");
        a2.setMatricula("111111111");
        
       /* System.out.println("Nome:      " + a1.getNome());
        System.out.println("Telefone:  " + a1.getTelefone());
        System.out.println("Matricula: " + a1.getMatricula());*/
        
        a1.imprimeDados();
        System.out.println("\n");
        a2.imprimeDados();
        
        double media = Aluno.media(10, 15);
        
        System.out.println("Média: " + media);
                
    }
   
    
}
