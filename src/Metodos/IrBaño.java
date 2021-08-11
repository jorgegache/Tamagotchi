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
public class IrBaño {
    protected int necesidades;
    protected boolean hacerNecesidad;

    public IrBaño(int necesidades, boolean hacerNecesidad) {
        this.necesidades = necesidades;
        this.hacerNecesidad = hacerNecesidad;
        if (this.hacerNecesidad==true){
            this.necesidades-=20;
        }
    }
    
    
    
}
