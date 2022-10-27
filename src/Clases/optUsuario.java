package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class optUsuario {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public List mostrarUsuario(){
        List<dataUsuario> listaUsuario = new ArrayList();
        String query = "SELECT * FROM usuario";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                dataUsuario user = new dataUsuario();
                user.setId(rs.getInt("Id_Usuario"));
                user.setDNI(rs.getString("Dni_Usuario"));
                user.setNombre(rs.getString("Nom_Usuario"));
                user.setDireccion(rs.getString("Dir_Usuario"));
                user.setTelefono(rs.getString("Tel_Usuario"));
                user.setEmail(rs.getString("Email_Usuario"));
                user.setUsuario(rs.getString("User_Usuario"));
                user.setPassword(rs.getString("Pass_Usuario"));
                user.setTipo(rs.getString("Tip_Usuario"));
                
                listaUsuario.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaUsuario;
    }
    
    public void insertarUsuario(dataUsuario user){
        String query = "INSERT INTO usuario (Dni_Usuario, Nom_Usuario, Tel_Usuario, Email_Usuario, Dir_Usuario, Tip_Usuario, User_Usuario, Pass_Usuario) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,user.getDNI());
            ps.setString(2,user.getNombre());
            ps.setString(3, user.getTelefono());
            ps.setString(4, user.getEmail());
            ps.setString(5,user.getDireccion());
            ps.setString(6, user.getTipo());
            ps.setString(7, user.getUsuario());
            ps.setString(8,user.getPassword());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void modificarUsuario(dataUsuario user){
        String query = "UPDATE usuario SET Dni_Usuario = ?,Nom_Usuario = ?,Tel_Usuario = ?,Email_Usuario = ?,Dir_Usuario = ?,Tip_Usuario = ?, User_Usuario = ?,Pass_Usuario = ? WHERE Id_Usuario= ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,user.getDNI());
            ps.setString(2,user.getNombre());
            ps.setString(3, user.getTelefono());
            ps.setString(4, user.getEmail());
            ps.setString(5,user.getDireccion());
            ps.setString(6, user.getTipo());
            ps.setString(7, user.getUsuario());
            ps.setString(8,user.getPassword());
            ps.setInt(9,user.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarUsuario(dataUsuario user){
        String query = "DELETE FROM usuario WHERE Id_Usuario = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1,user.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public List buscarUsuario(String buscar){
        List<dataUsuario> listaUsuario = new ArrayList();
        String query = "SELECT * FROM usuario WHERE Nom_Usuario LIKE '%"+buscar+"%' OR Dni_Usuario LIKE '%"+buscar+"%' OR User_Usuario LIKE '%"+buscar+"%' OR Tip_Usuario LIKE '%"+buscar+"%'";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                dataUsuario user = new dataUsuario();
                user.setId(rs.getInt("Id_Usuario"));
                user.setDNI(rs.getString("Dni_Usuario"));
                user.setNombre(rs.getString("Nom_Usuario"));
                user.setDireccion(rs.getString("Dir_Usuario"));
                user.setTelefono(rs.getString("Tel_Usuario"));
                user.setEmail(rs.getString("Email_Usuario"));
                user.setUsuario(rs.getString("User_Usuario"));
                user.setPassword(rs.getString("Pass_Usuario"));
                user.setTipo(rs.getString("Tip_Usuario"));
                
                listaUsuario.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaUsuario;
    }
    
    public int existUser(String usuario){
        String query ="SELECT count(Id_Usuario) FROM usuario WHERE User_Usuario = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 1;
        }
    }
    public int existDNI(String dni){
         String query ="SELECT count(Id_Usuario) FROM usuario WHERE Dni_Usuario = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,dni);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 1;
        }
    }
    
    public String buscarDNI(int id){
        String dni = "";
        String query = "SELECT Dni_Usuario FROM usuario WHERE Id_Usuario = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                dni = rs.getString("Dni_Usuario");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dni;
    }
    
    public String buscarUser(int id){
        String user = "";
        String query = "SELECT User_Usuario FROM usuario WHERE Id_Usuario = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                user = rs.getString("User_Usuario");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
}
