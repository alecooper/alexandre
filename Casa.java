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
public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    
    void pinta(String s){
        this.cor = s;
    }
    int quantasPortasEstaoAbertas(){
        int cont = 0;
        if(this.porta1.estaAberta() == true)
            cont = 1; 
        if(this.porta2.estaAberta() == true)
            cont += 1;
        if(this.porta3.estaAberta() == true)
            cont +=1;
        
     return cont;   
    }
    
}
