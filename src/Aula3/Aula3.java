package Aula3;

import java.util.ArrayList;
/*@author Is@@c */

public class Aula3 {

    public static void main(String[] args) {
        /*
         int valor = 5;
         double valor_d = 10.5;
         int valores[] = new int[10];

         boolean maior_de_idade = true;

         String nome = "Isaac";

         String nome2 = "Isaac2";

         if (nome.equals(nome2)) {//Comparar a String dentro do objeto. Se usar '==' estará comparando um objeto com outro.
         System.out.println("Nomes iguais.");
         } else {
         System.out.println("Nomes diferentes.");
         }

         ArrayList<String> lista = new ArrayList();
         lista.add("Isaac");
         lista.add("Belo");
         lista.add("Maria");

         for (int i = 0; i < lista.size(); i++) {
         System.out.println(lista.get(i));
         }*/

        //Lista que só recebe Aluno(tipo Aluno)
        ArrayList<Aluno> ListaAlunos = new ArrayList();

        //Instanciação Objeto Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Isaac");
        a1.setMatricula("1234");
        a1.setTelefone("999999999");

        Aluno a2 = new Aluno();
        a2.setNome("João");
        a2.setMatricula("9999");
        a2.setTelefone("99876544");

        //Adiciona aluno à lista
        ListaAlunos.add(a1);
        ListaAlunos.add(a2);

        //USANDO CONSTRUTOR COM PARÂMETROS
        Aluno a3 = new Aluno("José", "6549", "978454");
        ListaAlunos.add(a3);

        ///////////////////////
        ListaAlunos.add(new Aluno("Bruno", "004", "7777777777"));
        
        //Percorrendo a lista, pegando o valor 'i', e usando Metodo getDados() par exibir todos os dados.
        for(int i =0; i < ListaAlunos.size(); i++){
            //Usando variável temporária para guardar o get(i)
            Aluno temp = ListaAlunos.get(i);
            
            System.out.println(ListaAlunos.get(i).getDados());
        }
            

    }
}
