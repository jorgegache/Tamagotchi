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
public class RealizarActividad {
     
     
     //pelear
     //nadar
     //jugar
     //correr 
     //bailar
     // disminuye aburrimeinto y energía
    //problema: repetir constantes 
     public final int PELEAR=10;
     public final int NADAR=10;
     public final int JUGAR=10;
     public final int CORRER=10;
     public final int BAILAR=10;
     private int aburrimiento;
     
     private void actividad(int aburrimiento, Dormir energia, int valor){
         this.aburrimiento-= valor;
         energia.energia-=valor+15;
     }
}
