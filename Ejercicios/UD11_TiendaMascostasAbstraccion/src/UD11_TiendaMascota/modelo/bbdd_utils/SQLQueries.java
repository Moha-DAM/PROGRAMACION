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
    public static final String SELECT_TORTUGA_POR_ID = "SELECT * FROM tortugas WHERE id_collar = ?";
    public static final String INSERT_TORTUGA = "INSERT INTO tortugas (id_collar, especie, agua_dulce) VALUES (?, ?, ?)";

    // Tabla Crocodilo
    public static final String SELECT_TODOS_COCODRILOS = "SELECT * FROM cocodrilos";
    public static final String SELECT_COCODRILO_POR_ID = "SELECT * FROM cocodrilos WHERE id_collar = ?";
    public static final String INSERT_COCODRILO = "INSERT INTO cocodrilos (id_collar, especie, agua_dulce, num_dientes) VALUES (?, ?, ?, ?)";
}