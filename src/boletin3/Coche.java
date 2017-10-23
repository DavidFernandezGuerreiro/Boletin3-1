/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author dfernandezguerreiro
 */
public class Coche {
    private int velocidade;
    
    public Coche(){
        velocidade=0;
    }
    
    public int getVelocidade(){ //Devolve a velocidade actual
        return velocidade;    
    }
    public void acelerar (int valor){ //Incrementa a velocidade na cantidade valor
        velocidade=velocidade+valor;
    }
    public void frenar (int menos){ //Disminue a velocidade na cantidade menos
        velocidade=velocidade-menos;
    }
}
