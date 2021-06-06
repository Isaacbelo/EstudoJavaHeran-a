/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;

/**
 *
 * @author Isaac Belo
 */
public class Projeto {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Isaac", "0000000", "8888888");
        v1.setSalario(800.00);
        v1.setComissao(10.00);
        v1.setQuantVendas(10);
        //System.out.println(v1.getDados());

        Motorista m1 = new Motorista("Lucas", "1111111", "999999999");
        m1.setSalario(800.00);
       // System.out.println(m1.getDados());

        ArrayList<Funcionario> Funcs = new ArrayList();
        Funcs.add(v1);
        Funcs.add(m1);

        for (int i = 0; i < Funcs.size(); i++) {
            System.out.println(Funcs.get(i).getDados());
        }
    }
}
