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
public class TestaTemperatura {
    public static void main(String[] args){
        Temperatura t1 = new Temperatura();
        System.out.println(t1.converterParaCelsius(45));
        System.out.println(t1.converterParaFarenheit(38));
    }
    
}
