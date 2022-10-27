package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class optProducto {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List mostrarProducto(){
        List<dataProducto> listaProducto = new ArrayList();
        String query = "SELECT * FROM producto";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                dataProducto producto = new dataProducto();
                producto.setId(rs.getInt("Id_Producto"));
                producto.setCodigo(rs.getString("Cod_Producto"));
                producto.setNombre(rs.getString("Nom_Producto"));
                producto.setCategoria(rs.getString("Cat_Producto"));
                producto.setMarca(rs.getString("Mar_Producto"));
                
                listaProducto.add(producto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaProducto;
    }
    public void insertarProducto(dataProducto product){
        String query = "INSERT INTO producto(Cod_Producto, Nom_Producto, Cat_Producto, Mar_Producto) VALUES (?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, product.getCodigo());
            ps.setString(2, product.getNombre());
            ps.setString(3, product.getCategoria());
            ps.setString(4, product.getMarca());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarProducto(dataProducto product){
        String query = "UPDATE producto SET Cod_Producto = ?, Nom_Producto = ?, Cat_Producto = ?,Mar_Producto = ? WHERE Id_Producto = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, product.getCodigo());
            ps.setString(2, product.getNombre());
            ps.setString(3, product.getCategoria());
            ps.setString(4,product.getMarca());
            ps.setInt(5, product.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarProducto(dataProducto product){
        String query = "DELETE FROM producto WHERE Id_Producto = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, product.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public List buscarProducto(String buscar){
        List<dataProducto> listaProducto = new ArrayList();
        String query = "SELECT * FROM producto WHERE Nom_Producto LIKE '%"+buscar+"%' OR Cod_Producto LIKE'%"+buscar+"%' OR Cat_Producto LIKE '%"+buscar+"%' OR Mar_Producto LIKE '&"+buscar+"&'";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                dataProducto producto = new dataProducto();
                producto.setId(rs.getInt("Id_Producto"));
                producto.setCodigo(rs.getString("Cod_Producto"));
                producto.setNombre(rs.getString("Nom_Producto"));
                producto.setCategoria(rs.getString("Cat_Producto"));
                producto.setMarca(rs.getString("Mar_Producto"));
                
                listaProducto.add(producto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaProducto;
    }
    public int existCode(String codigo){
        String query = "SELECT COUNT(Id_Producto) FROM producto WHERE Cod_Producto = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, codigo);
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
    public int existProduct(String producto, String marca){
        String query = "SELECT COUNT(Id_Producto) FROM producto WHERE Nom_Producto = ? AND Mar_Producto = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1,producto);
            ps.setString(2, marca);
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
    
    public String buscarCodigo(int id){
        String codigo = "";
        String query = "SELECT Cod_Producto FROM producto WHERE Id_Producto = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                codigo = rs.getString("Cod_Producto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return codigo;
    }
    
    public String buscarNombre(int id){
        String nombre = "";
        String query = "SELECT Nom_Producto FROM producto WHERE Id_Producto = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                nombre = rs.getString("Nom_Producto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return nombre;
    }
    
    public String buscarMarca(int id){
        String marca = "";
        String query = "SELECT Mar_Producto FROM producto WHERE Id_Producto = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                marca = rs.getString("Mar_Producto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return marca;
    }
}
