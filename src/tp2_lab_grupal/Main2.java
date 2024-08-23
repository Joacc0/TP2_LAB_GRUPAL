/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_lab_grupal;

/**
 *
 * @author mgts
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona2 tipo=new Persona2();
        tipo.setNombre("maria");
        tipo.setApellido("garcia");
        tipo.setEdad(25);
        tipo.setAltura(176);
        
        RelojFit2 relojito=new RelojFit2("casio",123);
        System.out.println(relojito.toString());
        
        tipo.ponerseReloj(relojito);
        
        tipo.ponerseReloj();
        
        
    }
    
}
