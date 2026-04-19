package UD11_TiendaMascota.modelo.pojos;

public class Gato {
    private int idCollar;
    private String nombre;
    private String raza;
    private String color;

    public Gato() {}

    public Gato(int idCollar, String nombre, String raza, String color) {
        this.idCollar = idCollar;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    // Getters y Setters
    public int getIdCollar() { return idCollar; }
    public void setIdCollar(int idCollar) { this.idCollar = idCollar; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "Gato [idCollar=" + idCollar + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + "]";
    }
}