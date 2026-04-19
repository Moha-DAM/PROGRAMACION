package UD11_TiendaMascota.modelo.bbdd_utils;



import java.sql.*;
import java.util.ArrayList;

import UD11_TiendaMascota.modelo.pojos.Gato;

public class GestorGatos {

    public ArrayList<Gato> buscarTodosGatos() {
        ArrayList<Gato> gatos = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DbUtils.DRIVER);
            conn = DriverManager.getConnection(DbUtils.URL, DbUtils.USER, DbUtils.PASSWORD);
            stmt = conn.prepareStatement(SQLQueries.SELECT_TODOS_GATOS);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Gato gato = new Gato();
                gato.setIdCollar(rs.getInt("id_collar"));
                gato.setNombre(rs.getString("nombre"));
                gato.setRaza(rs.getString("raza"));
                gato.setColor(rs.getString("color"));
                gatos.add(gato);
            }
        }catch(SQLException sql)  {
        	System.out.println("Error con BBDD "+sql.getMessage());
        } catch (Exception e) {
        	System.out.println("Error generico "+e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
        return gatos;
    }
}