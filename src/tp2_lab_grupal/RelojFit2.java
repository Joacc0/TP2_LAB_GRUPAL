/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_lab_grupal;

import java.util.Calendar;

/**
 *
 * @author mgts
 */
public class RelojFit2 extends Reloj2{

    public RelojFit2( String modelo, long numSerie) {
        Calendar date = Calendar.getInstance();
        System.out.println("NACE NEW RELOJ FIT NOW");
        //LLENAMOS FECHA DEL NEW
        
        super(date.get(Calendar.DAY_OF_MONTH), date.get(Calendar.HOUR), date.get(Calendar.MINUTE), modelo, numSerie);
        
         
    }

    @Override
    public void imprimirReloj() {
        super.imprimirReloj(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
   
    
    
}
