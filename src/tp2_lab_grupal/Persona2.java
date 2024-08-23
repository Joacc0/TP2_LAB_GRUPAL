/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_lab_grupal;

/**
 *
 * @author mgts
 */
public class Persona2 {
    //Atributos 
    private String nombre;
    private String apellido; 
    private int edad; 
    private int altura; 

    public Persona2() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void ponerseReloj(RelojFit2 miReloj){
        
        System.out.println("me puse el reloj que me diste");
        System.out.println("");
        
    }
    
    public void ponerseReloj(){
        
        System.out.println("te hago un reloj nuevo");
        
        RelojFit2 nuevoReloj= new RelojFit2("ceroKM",999);
        nuevoReloj.imprimirReloj();
        System.out.println("");
        
    }
    
    
    
    
    public void comer() {
        System.out.println(nombre + " esta comiendo " );
}
    public void hablar(){
        System.out.println("Hola, mi nombre es: " + nombre + " " + apellido + " y tengo " + edad);
    }
}
