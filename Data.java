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
public class Data {
    
    String dia;
    String mes;
    String ano;
    
    String imprimir(){
        
        String data = this.dia+"/"+ this.mes+"/"+this.ano;
        return data;
    }
    
}
