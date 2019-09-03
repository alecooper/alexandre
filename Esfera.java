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
public class Esfera {
    double raio;
    
    double volumeEsfera(){
        double volume = (4.0 / 3.0) * 3.14 * (this.raio * this.raio * this.raio);
        return volume;
    }
    
}
