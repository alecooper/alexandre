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
public class Temperatura {
    
    
    double converterParaCelsius(double tempFerenheit){
        double celsius = (tempFerenheit - 32) / 1.8;
        return celsius;
    }
    
    double converterParaFarenheit(double tempCelsius){
        double farenheit = tempCelsius * 1.8 + 32;
        return farenheit;
    }
    
}
