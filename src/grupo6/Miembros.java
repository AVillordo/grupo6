
package grupo6;

public class Miembros {
    
    private String nombre;
    private int edad;
    private String apellido;

    public Miembros(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void saluDar(){
        System.out.println("Hola"+" " + nombre );
    }
}
