
package tp7.grupo6;


public class Materia {
    
    private int idMateria;
    private String nombre;
    private int anio;
    private boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.idMateria = idMateria;
        this.estado = estado;
    }

    public Materia(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materia: " + idMateria + ", " + nombre + ", " + anio + ", " + estado;
    }
    
    
    
    
    
}
