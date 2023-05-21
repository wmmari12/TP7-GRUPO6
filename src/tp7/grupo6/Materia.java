
package tp7.grupo6;


public class Materia {
    
    private String nombre;
    private int anio;
    private int id_materia;
    private boolean estado;

    public Materia() {
    }

    public Materia(String nombre, int anio, int id_materia, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.id_materia = id_materia;
        this.estado = estado;
    }

    public Materia(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }
    
    
    
    
}
