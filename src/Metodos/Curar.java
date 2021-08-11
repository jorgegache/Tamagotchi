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
public class Curar {
    protected int salud;
    protected boolean medicina;

    public Curar(int salud, boolean medicina) {
        this.salud = salud;
        this.medicina = medicina;
       if(this.medicina==true){
           if(this.salud<=20){
               this.salud=100;
           }else{
               this.salud=20;
           }
       }
    }


    
}
