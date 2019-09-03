/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofixacao;

/**
 *s
 * @author NOTEBOOK
 */
public class Aluno {
    
    String nome;
    String cpf;
    Data dataDeNascimento;
    
    String imprimir(){
        String aluno = this.nome +"\n"+ this.cpf +"\n"+ this.dataDeNascimento.imprimir();
        return aluno;
    }   
}
