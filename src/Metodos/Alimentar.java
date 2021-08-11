/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Yirlany
 */
public class Alimentar {
    public final int PINA=10;
    public final int PLATEADA=25;
    public final int BAYA=5;
    public final int DORADA=30;
    public final int LATANA=35;
    
    private int barraComida;
    
    public int aumentarComida(int comida){
        if (barraComida<100) {
            return barraComida+=comida;
        }
        return 0;
    }
}
