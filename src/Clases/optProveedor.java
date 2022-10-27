package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class optProveedor {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List mostrarProveedor(){
        List<dataProveedor> listaProveedor = new ArrayList();
        String query = "SELECT * FROM proveedor";
        
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                dataProveedor proveedor = new dataProveedor();
                proveedor.setId(rs.getInt("Id_Proveedor"));
                proveedor.setRuc(rs.getString("Ruc_Proveedor"));
                proveedor.setNombre(rs.getString("Nom_Proveedor"));
                proveedor.setContacto(rs.getString("Con_Proveedor"));
                proveedor.setCargo(rs.getString("Carg_Contacto"));
                proveedor.setTelefono(rs.getString("Tel_Proveedor"));
                proveedor.setCelular(rs.getString("Tel_Contacto"));
                proveedor.setDireccion(rs.getString("Dir_Proveedor"));
                proveedor.setEmail(rs.getString("Email_Proveedor"));
                
                listaProveedor.add(proveedor);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaProveedor;
    }
    
    public void insertarProveedor(dataProveedor proveedor){
        String query = "INSERT INTO proveedor (Ruc_Proveedor, Nom_Proveedor, Con_Proveedor, Carg_Contacto, Tel_Contacto, Dir_Proveedor, Email_Proveedor, Tel_Proveedor) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,proveedor.getRuc());
            ps.setString(2,proveedor.getNombre());
            ps.setString(3, proveedor.getContacto());
            ps.setString(4,proveedor.getCargo());
            ps.setString(5, proveedor.getCelular());
            ps.setString(6, proveedor.getDireccion());
            ps.setString(7,proveedor.getEmail());
            ps.setString(8,proveedor.getTelefono());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarProveedor(dataProveedor proveedor){
        String query = "UPDATE proveedor SET Ruc_Proveedor = ?, Nom_Proveedor = ?, Con_Proveedor = ?, Carg_Contacto = ?, Tel_Contacto = ?, Dir_Proveedor = ?, Email_Proveedor = ?, Tel_Proveedor = ? WHERE Id_Proveedor = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,proveedor.getRuc());
            ps.setString(2,proveedor.getNombre());
            ps.setString(3, proveedor.getContacto());
            ps.setString(4,proveedor.getCargo());
            ps.setString(5, proveedor.getCelular());
            ps.setString(6, proveedor.getDireccion());
            ps.setString(7,proveedor.getEmail());
            ps.setString(8,proveedor.getTelefono());
            ps.setInt(9,proveedor.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarProveedor(dataProveedor proveedor){
        String query = "DELETE FROM proveedor WHERE Id_Proveedor = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, proveedor.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public List buscarProveedor(String buscar){
        List<dataProveedor> listaProveedor = new ArrayList();
        String query = "SELECT * FROM proveedor WHERE Ruc_Proveedor LIKE '%"+buscar+"%' OR Nom_Proveedor LIKE '%"+buscar+"%'";
        
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                dataProveedor proveedor = new dataProveedor();
                proveedor.setId(rs.getInt("Id_Proveedor"));
                proveedor.setRuc(rs.getString("Ruc_Proveedor"));
                proveedor.setNombre(rs.getString("Nom_Proveedor"));
                proveedor.setContacto(rs.getString("Con_Proveedor"));
                proveedor.setCargo(rs.getString("Carg_Contacto"));
                proveedor.setTelefono(rs.getString("Tel_Proveedor"));
                proveedor.setCelular(rs.getString("Tel_Contacto"));
                proveedor.setDireccion(rs.getString("Dir_Proveedor"));
                proveedor.setEmail(rs.getString("Email_Proveedor"));
                
                listaProveedor.add(proveedor);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaProveedor;
    }
    
    public int existSupplier(String nombre){
        String query = "SELECT COUNT(Id_Proveedor) FROM proveedor WHERE Nom_Proveedor = ?";
        
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,nombre);
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
    
    public int existRUC(String ruc){
        String query = "SELECT COUNT(Id_Proveedor) FROM proveedor WHERE Ruc_Proveedor = ?";
        
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,ruc);
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
    
    public String buscarRUC(int id){
        String ruc ="";
        String query = "SELECT Ruc_Proveedor FROM proveedor WHERE Id_Proveedor = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                ruc = rs.getString("Ruc_Proveedor");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ruc;
    }
    
    public String buscarNombre(int id){
        String nombre ="";
        String query = "SELECT Nom_Proveedor FROM proveedor WHERE Id_Proveedor = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                nombre = rs.getString("Nom_Proveedor");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return nombre;
    }
}
