
package tp2_lab_grupal;


public class Persona {

    //Atributos            PERSONA TIENE UN RELOJ 
    private String nombre;
    private String apellido; 
    private int edad; 
    private int altura; 
    private Reloj reloj1; 
    
    //Constructor
    public Persona(String nombre, String apellido, int edad, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj1 = new Reloj(); 
    }

    //Getter and setter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    } //Ver si los podemos usar

    public int getAltura() {
        return altura;
    } //Ver si los podemos usar

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //Ver si los podemos usar

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } //Ver si los podemos usar

    public void setAltura(int altura) {
        this.altura = altura;
    } //Ver si los podemos usar
    
    //Métodos adicionales 
    
    public void comer() {
    
}
    public void hablar(){
        System.out.println("Hola, mi nombre es: " + nombre + " " + apellido + " y tengo " + edad);
    }

    //ToString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + '}';
    }
    
    
    
    
    
    
    
    
}
