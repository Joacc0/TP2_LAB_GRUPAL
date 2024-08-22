package tp2_lab_grupal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class Reloj {

    //Atributos
    private int dia; 
    private LocalTime hora;
    private String modelo;
    private long numSerie; 

    //Constructor vacio
    public Reloj() {
     
    }
    
    //Constructor
    public Reloj(int dia, String modelo, long numSerie) {
        this.dia = dia;
        hora = LocalTime.now().withNano(0); 
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    //Getters
    public int getDia() {
        return dia;
    }
    public LocalTime getHora() {
        return hora;
    }

    //Setters (VER SI PUEDO USAR ESTOS MÉTODOS)
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setHora() {
        this.hora = hora;
    }
    
    //Métodos adicionales
    public void incrementarDia(int dia){
        dia ++; 
    }
    
public void incrementarHora() {
    
    System.out.println("Hora actual: " + hora);    
    
    hora = hora.plusHours(1);
    
    System.out.println("La hora nueva es: " + hora);
        } 
    
    public void limpiarPantalla(){
    System.out.println(" --- Pantalla del Reloj Limpia --- ");
    System.out.println("Modelo: " + modelo);
    System.out.println("Número de Serie: " + numSerie);
    System.out.println("Día: " + dia);
    System.out.println("Hora: " + hora);
    }
    
//    public void horaJava(){
//        
//                Calendar date = Calendar.getInstance();
//                hora = date.get(Calendar.HOUR);
//                dia= date.get(Calendar.DAY_OF_MONTH);
//  //              int minutos = date.get(Calendar.MINUTE);
//                
//    }      
    
     
}
//El local date es para el manejo de tipos fechas