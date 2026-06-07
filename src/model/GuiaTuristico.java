package model;

public class GuiaTuristico extends Persona {

    /**
     * Atributos
     */

    private String especialidad;

    /**
     * Constructor
     * @param rut
     * @param nombre
     * @param telefono
     * @param direccion
     * @param especialidad
     */

    public GuiaTuristico(String rut, String nombre, String telefono, Direccion direccion, String especialidad){
        super(rut, nombre, telefono, direccion);
        this.especialidad = especialidad;

    }

    /**
     * Getters y Setters
     * @return
     */

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * toString()
     * @return
     */

    @Override
    public String toString() {
        return "Rut: " + getRut() +
                "\nNombre: " + getNombre() +
                "\nTeléfono: +56 " + getTelefono() +
                "\nEspecialidad: " + especialidad +
                "\nDirección de Guia:\n" + getDireccion();
    }
}
