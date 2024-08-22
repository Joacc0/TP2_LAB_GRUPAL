package tp2_lab_grupal;

import java.time.LocalDate;

public class Reloj {

    //Atributos
    private int dia; 
    private int hora;
    private String modelo;
    private long numSerie; 

    //Constructor vacio
    public Reloj() {
    }
    
    //Constructor
    public Reloj(int dia, int hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    //Getters
    public LocalDate getDia() {
        return dia;
    }
    public LocalDate getHora() {
        return hora;
    }

    //Setters (VER SI PUEDO USAR ESTOS MÉTODOS)
    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }
    
    //Métodos adicionales
    public void incrementarDia(int dia){
        dia ++; 
    }
    
    public void incrementarHora(double hora){
        hora ++; 
    }
    
    public void limpiarPantalla(){
        
    }
           
    //El local date es para el manejo de tipos fechas 
}
