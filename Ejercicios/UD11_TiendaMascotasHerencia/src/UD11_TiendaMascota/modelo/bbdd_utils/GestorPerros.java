package UD11_TiendaMascota.modelo.bbdd_utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import UD11_TiendaMascota.modelo.pojos.Perro;

public class GestorPerros {
	
	
    public ArrayList<Perro> buscarTodosPerros() {
        ArrayList<Perro> perros = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DbUtils.DRIVER);
            conn = DriverManager.getConnection(DbUtils.URL, DbUtils.USER, DbUtils.PASSWORD);
            stmt = conn.prepareStatement(SQLQueries.SELECT_TODOS_PERROS);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Perro perro = new Perro();
                perro.setIdCollar(rs.getInt("id_collar"));
                perro.setNombre(rs.getString("nombre"));
                perro.setRaza(rs.getString("raza"));
                perro.setVacunado(rs.getBoolean("vacunado"));
                perros.add(perro);
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
        return perros;
    }
  
}