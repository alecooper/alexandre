/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofixacao;

/**
 *
 * @author NOTEBOOK
 */
public class TestaPessoa {
    public static void main(String[] args){
        Pessoa me = new Pessoa();
        
        me.nome = "Alexandre Cardoso";
        me.idade = 19;
        
        me.fazAniversario();
        me.fazAniversario();
        me.fazAniversario();
        
        String dados = me.nome +"\n"+ me.idade;
        System.out.println(dados);
        
        
    }
    
}
