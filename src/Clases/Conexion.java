package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class Conexion {
    Connection cnx;
    
    public Conexion(){
        try {
            String cnx = "jdbc:mysql://localhost:3306/db_ferreteria?serverTimezone=UTC";
            this.cnx = DriverManager.getConnection(cnx,"root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Connection getConnection(){
        return this.cnx;
    }
}
