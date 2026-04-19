package UD11_TiendaMascota.modelo.pojos;

public class Perro {
    private int idCollar;
    private String nombre;
    private String raza;
    private boolean vacunado;

    public Perro() {}

    public Perro(int idCollar, String nombre, String raza, boolean vacunado) {
        this.idCollar = idCollar;
        this.nombre = nombre;
        this.raza = raza;
        this.vacunado = vacunado;
    }

    // Getters y Setters
    public int getIdCollar() { return idCollar; }
    public void setIdCollar(int idCollar) { this.idCollar = idCollar; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public boolean isVacunado() { return vacunado; }
    public void setVacunado(boolean vacunado) { this.vacunado = vacunado; }

    @Override
    public String toString() {
        return "Perro [idCollar=" + idCollar + ", nombre=" + nombre + ", raza=" + raza + ", vacunado=" + vacunado + "]";
    }
}