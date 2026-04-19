package UD11_TiendaMascota.modelo.bbdd_utils;

import java.sql.*;
import java.util.ArrayList;
import UD11_TiendaMascota.modelo.pojos.Cocodrilo;

public class GestorCocodrilos implements GestorInterfaz<Cocodrilo> {

    @Override
    public ArrayList<Cocodrilo> obtenerTodos() {
        ArrayList<Cocodrilo> cocodrilos = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DbUtils.DRIVER);
            conn = DriverManager.getConnection(DbUtils.URL, DbUtils.USER, DbUtils.PASSWORD);
            stmt = conn.prepareStatement(SQLQueries.SELECT_TODOS_COCODRILOS);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cocodrilo cocodrilo = new Cocodrilo();
                cocodrilo.setIdCollar(rs.getInt("id_collar"));
                cocodrilo.setEspecie(rs.getString("especie"));
                cocodrilo.setAguaDulce(rs.getBoolean("agua_dulce"));
                cocodrilo.setNumDientes(rs.getInt("num_dientes"));
                cocodrilos.add(cocodrilo);
            }
        } catch(SQLException sql) {
            System.out.println("Error con BBDD "+sql.getMessage());
        } catch (Exception e) {
            System.out.println("Error generico "+e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
        return cocodrilos;
    }

    @Override
    public Cocodrilo obtenerPorId(int id) {
        Cocodrilo cocodrilo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DbUtils.DRIVER);
            conn = DriverManager.getConnection(DbUtils.URL, DbUtils.USER, DbUtils.PASSWORD);
            stmt = conn.prepareStatement(SQLQueries.SELECT_COCODRILO_POR_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                cocodrilo = new Cocodrilo();
                cocodrilo.setIdCollar(rs.getInt("id_collar"));
                cocodrilo.setEspecie(rs.getString("especie"));
                cocodrilo.setAguaDulce(rs.getBoolean("agua_dulce"));
                cocodrilo.setNumDientes(rs.getInt("num_dientes"));
            }
        } catch(SQLException sql) {
            System.out.println("Error con BBDD "+sql.getMessage());
        } catch (Exception e) {
            System.out.println("Error generico "+e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
        return cocodrilo;
    }

   
}