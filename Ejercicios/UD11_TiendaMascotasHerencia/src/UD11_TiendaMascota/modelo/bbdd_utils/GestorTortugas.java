package UD11_TiendaMascota.modelo.bbdd_utils;

import java.sql.*;
import java.util.ArrayList;

import UD11_TiendaMascota.modelo.pojos.Tortuga;

public class GestorTortugas {

    public ArrayList<Tortuga> buscarTodosTortugas() {
        ArrayList<Tortuga> tortugas = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DbUtils.DRIVER);
            conn = DriverManager.getConnection(DbUtils.URL, DbUtils.USER, DbUtils.PASSWORD);
            stmt = conn.prepareStatement(SQLQueries.SELECT_TODOS_TORTUGAS);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Tortuga tortuga = new Tortuga();
                tortuga.setIdCollar(rs.getInt("id_collar"));
                tortuga.setEspecie(rs.getString("especie"));
                tortuga.setAguaDulce(rs.getBoolean("agua_dulce"));
                tortugas.add(tortuga);
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
        return tortugas;
    }
}