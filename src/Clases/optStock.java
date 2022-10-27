package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class optStock {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public int idProveedor(String supplier){
        int id = 0;
        String query = "SELECT Id_Proveedor FROM proveedor WHERE Nom_Proveedor = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, supplier);
            rs = ps.executeQuery();
            
            if(rs.next()){
                id = rs.getInt("Id_Proveedor");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return id;
    }
    
    public int idProducto(String product){
        int id = 0;
        String query = "SELECT Id_Producto FROM producto WHERE Nom_Producto = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, product);
            rs = ps.executeQuery();
            
            if(rs.next()){
                id = rs.getInt("Id_Producto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return id;
    }
    
    public List mostrarProveedor(){
        List<dataProveedor> listaProveedor = new ArrayList();
        String query = "SELECT Nom_Proveedor FROM proveedor GROUP BY (Nom_Proveedor)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                dataProveedor proveedor = new dataProveedor();
                proveedor.setNombre(rs.getString("Nom_Proveedor"));
                listaProveedor.add(proveedor);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return listaProveedor;
    }
    
    public List mostrarProducto(){
        List<dataProducto> listaProducto = new ArrayList();
        String query = "SELECT Nom_Producto FROM producto GROUP BY(Nom_Producto)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                dataProducto producto = new dataProducto();
                producto.setNombre(rs.getString("Nom_Producto"));
                listaProducto.add(producto);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return listaProducto;
    }
    
    public void insertarStock(dataStock stock){
        String query = "INSERT INTO stock(Uni_Almacen, Can_Stock, Fech_Compra, Pre_Compra, Pre_Venta, Id_Proveedor, Id_Producto) VALUES (?,?,?,?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, stock.getUnidad());
            ps.setInt(2, stock.getCantidad());
            ps.setString(3, stock.getFecha());
            ps.setDouble(4, stock.getCompra());
            ps.setDouble(5, stock.getVenta());
            ps.setInt(6, stock.getIdProveedor());
            ps.setInt(7, stock.getIdProducto());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarStock(dataStock stock){
        String query = "UPDATE stock SET Uni_Almacen = ?, Can_Stock = ?, Fech_Compra = ?, Pre_Compra = ?, Pre_Venta = ?, Id_Proveedor = ?, Id_Producto  = ? WHERE Id_Stock = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, stock.getUnidad());
            ps.setInt(2, stock.getCantidad());
            ps.setString(3, stock.getFecha());
            ps.setDouble(4, stock.getCompra());
            ps.setDouble(5, stock.getVenta());
            ps.setInt(6, stock.getIdProveedor());
            ps.setInt(7, stock.getIdProducto());
            ps.setInt(8, stock.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void eliminarStock(dataStock stock){
        String query = "DELETE FROM stock WHERE Id_Stock = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, stock.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public List mostrarStock(){
        List<dataStock> listaStock = new ArrayList();
        String query = "SELECT stock.Id_Stock, stock.Uni_Almacen, stock.Can_Stock, stock.Fech_Compra, stock.Pre_Compra, stock.Pre_Venta, proveedor.Nom_Proveedor, producto.Nom_Producto FROM stock INNER JOIN proveedor ON stock.Id_Proveedor = proveedor.Id_Proveedor INNER JOIN producto ON stock.Id_Producto = producto.Id_Producto";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                dataStock stock = new dataStock();
                stock.setId(rs.getInt("Id_Stock"));
                stock.setUnidad(rs.getString("Uni_Almacen"));
                stock.setCantidad(rs.getInt("Can_Stock"));
                stock.setFecha(rs.getString("Fech_Compra"));
                stock.setCompra(rs.getDouble("Pre_Compra"));
                stock.setVenta(rs.getDouble("Pre_Venta"));
                stock.setProveedor(rs.getString("Nom_Proveedor"));
                stock.setProducto(rs.getString("Nom_Producto"));
                
                listaStock.add(stock);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaStock;
    }
    
    public List buscarStock(String buscar){
        List<dataStock> listaStock = new ArrayList();
        String query = "SELECT * FROM stock INNER JOIN proveedor ON stock.Id_Proveedor = proveedor.Id_Proveedor INNER JOIN producto ON stock.Id_Producto = producto.Id_Producto WHERE proveedor.Nom_Proveedor LIKE '%"+buscar+"%' OR producto.Nom_Producto LIKE '%"+buscar+"%'";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                dataStock stock = new dataStock();
                stock.setId(rs.getInt("Id_Stock"));
                stock.setUnidad(rs.getString("Uni_Almacen"));
                stock.setCantidad(rs.getInt("Can_Stock"));
                stock.setFecha(rs.getString("Fech_Compra"));
                stock.setCompra(rs.getDouble("Pre_Compra"));
                stock.setVenta(rs.getDouble("Pre_Venta"));
                stock.setProveedor(rs.getString("Nom_Proveedor"));
                stock.setProducto(rs.getString("Nom_Producto"));
                
                listaStock.add(stock);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaStock;
    }
}
