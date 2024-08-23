/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_lab_grupal;

/**
 *
 * @author mgts
 */
public abstract class Reloj2 {
    
    //Atributos
    private int dia; 
    private int horas;
    private int minutos;
    private String modelo;
    private long numSerie; 

    public Reloj2(int dia, int horas, int minutos, String modelo, long numSerie) {
        this.dia = dia;
        this.horas = horas;
        this.minutos = minutos;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    
    public void imprimirReloj(){
        
        System.out.println("IMPRIMO DESDE RELOJ2 "+ toString());
    }

    @Override
    public String toString() {
        return "Reloj2{" + "dia=" + dia + ", horas=" + horas + ", minutos=" + minutos + ", modelo=" + modelo + ", numSerie=" + numSerie + '}';
    }
    
    
}
