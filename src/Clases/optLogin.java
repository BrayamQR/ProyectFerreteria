package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class optLogin {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean validarLogin(dataLogin login){
        String query = "SELECT Id_Usuario, Tip_Usuario, User_Usuario, Pass_Usuario FROM usuario WHERE User_Usuario = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, login.getUsuario());
            rs = ps.executeQuery();
            if(rs.next()){
                if(login.getPassword().equals(rs.getString("Pass_Usuario"))){
                    login.setId(rs.getInt("Id_Usuario"));
                    login.setTipo(rs.getString("Tip_Usuario"));
                    return true;
                }else{
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        
    }
}
