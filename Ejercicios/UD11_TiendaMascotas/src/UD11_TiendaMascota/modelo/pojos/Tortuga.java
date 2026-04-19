package UD11_TiendaMascota.modelo.pojos;

public class Tortuga {
    private int idCollar;
    private String especie;
    private boolean aguaDulce;

    public Tortuga() {}

    public Tortuga(int idCollar, String especie, boolean aguaDulce) {
        this.idCollar = idCollar;
        this.especie = especie;
        this.aguaDulce = aguaDulce;
    }

    // Getters y Setters
    public int getIdCollar() { return idCollar; }
    public void setIdCollar(int idCollar) { this.idCollar = idCollar; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public boolean isAguaDulce() { return aguaDulce; }
    public void setAguaDulce(boolean aguaDulce) { this.aguaDulce = aguaDulce; }

    @Override
    public String toString() {
        return "Tortuga [idCollar=" + idCollar + ", especie=" + especie + ", aguaDulce=" + aguaDulce + "]";
    }
}