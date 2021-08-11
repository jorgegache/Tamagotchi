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
public class Dormir {
    protected boolean dormir;
    protected int energia;
    
    public Dormir(boolean dormir) {
        this.dormir = dormir;
        if(dormir==true){
            energia+=15;
        }
    }
    
    
}
