package model;

public class Direccion {

    /**
     * Atributos
     */

    private String calle;
    private String ciudad;
    private String region;

    /**
     * Contructor
     * @param calle
     * @param ciudad
     * @param region
     */

    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;

    }

    /**
     * Getters y Setters
     * @return
     */

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * toString()
     * @return
     */

    @Override
    public String toString() {
        return "Calle: " + calle +
                "\nCiudad: " + ciudad +
                "\nRegión: " + region;
    }
}
