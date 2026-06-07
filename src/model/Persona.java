package model;

public class Persona {

    /**
     * Atributos
     */

    private String rut;
    private String nombre;
    private String telefono;
    private Direccion direccion;

    /**
     * Constructor
     * @param rut
     * @param nombre
     * @param telefono
     * @param direccion
     */

    public Persona(String rut, String nombre, String telefono, Direccion direccion){
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    /**
     * Getters y Setters
     * @return
     */

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * toString()
     * @return
     */

    @Override
    public String toString() {
        return "Rut: " + rut +
                "\nNombre: " + nombre +
                "\nTeléfono: +56 " + telefono +
                "\nDirección:\n" + direccion;
    }
}

