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
public class TestaCasa {
    public static void main(String[] args){
        Casa c1 = new Casa();
        
        c1.cor = "verde";
        
        Porta p1 = new Porta();
        p1.fecha();
        Porta p2 = new Porta();
        p2.fecha();
        Porta p3 = new Porta();
        p3.abre();
        
        c1.porta1 = p1;
        c1.porta2 = p2;
        c1.porta3 = p3;
        
        System.out.println(c1.quantasPortasEstaoAbertas());
        
        
        
    }
    
}
