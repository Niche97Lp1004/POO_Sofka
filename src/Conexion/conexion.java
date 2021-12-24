
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
     public static Connection getConnection() {
        String conexionURL = "jdbc:sqlserver://DESKTOP-LD1FRCT:1433;"
                + "database=cuest;"
                + "user=User;"
                + "password=;"
                + "loginTimeout=30;";
        try {
            Connection cx = DriverManager.getConnection(conexionURL);
            return cx;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public void desconectar() {
        try {
            getConnection().close();
        } catch (Exception ex) {
        }
    }
    
}
