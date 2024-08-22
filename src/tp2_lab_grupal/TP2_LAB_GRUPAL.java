package tp2_lab_grupal;

public class TP2_LAB_GRUPAL {


    public static void main(String[] args) {
        
        Persona per1=new Persona("alberto","garcia",22,174);
       
        per1.comer();
        
        Reloj reloj1 = new Reloj(23, "Casio", 4567); 
        
        System.out.println(reloj1.getHora());
       
        reloj1.incrementarHora();
        
    }
    
}
