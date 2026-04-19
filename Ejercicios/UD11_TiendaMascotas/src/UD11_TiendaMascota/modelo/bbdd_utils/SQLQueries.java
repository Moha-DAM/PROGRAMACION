package UD11_TiendaMascota.modelo.bbdd_utils;

public class SQLQueries {
    // Tabla gatos
    public static final String SELECT_TODOS_GATOS = "SELECT * FROM gatos";
    public static final String INSERT_GATO = "INSERT INTO gatos (id_collar, nombre, raza, color) VALUES (?, ?, ?, ?)";

    // Tabla perros
    public static final String SELECT_TODOS_PERROS = "SELECT * FROM perros";
    public static final String INSERT_PERRO = "INSERT INTO perros (id_collar, nombre, raza, vacunado) VALUES (?, ?, ?, ?)";

    // Tabla tortugas
    public static final String SELECT_TODOS_TORTUGAS = "SELECT * FROM tortugas";
    public static final String INSERT_TORTUGA = "INSERT INTO tortugas (id_collar, especie, agua_dulce) VALUES (?, ?, ?)";
}