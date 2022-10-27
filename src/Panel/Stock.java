package Panel;

import Clases.dataStock;
import Clases.optStock;
import java.awt.Color;

import static Form.Home.panelContent;
import com.itextpdf.text.BaseColor;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.FileOutputStream;

public class Stock extends javax.swing.JPanel {
    dataStock dstock = new dataStock();
    optStock stoc = new optStock();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Stock() {
        initComponents();
        Mostrar();
    }
    
    public Stock(String login){
        initComponents();
        Mostrar();
        if(!login.equals("Administrador")){
            btnInsert.setVisible(false);
            btnUpdate.setVisible(false);
            btnDelete.setVisible(false);
        }
    }
    
    String getBuscar(){
        return txtBuscar.getText().trim();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelContentProduct = new javax.swing.JPanel();
        panelbtnDelete = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        panelbtnUpdate = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        panelbtnInsert = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        panelSearch = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        panelbtnSearch = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();
        panelbtnExport = new javax.swing.JPanel();
        btnExport = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(810, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Stock");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelContentProduct.setBackground(new java.awt.Color(255, 255, 255));
        panelContentProduct.setPreferredSize(new java.awt.Dimension(970, 500));

        panelbtnDelete.setBackground(new java.awt.Color(0, 51, 102));

        btnDelete.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFocusPainted(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnDeleteLayout = new javax.swing.GroupLayout(panelbtnDelete);
        panelbtnDelete.setLayout(panelbtnDeleteLayout);
        panelbtnDeleteLayout.setHorizontalGroup(
            panelbtnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelbtnDeleteLayout.setVerticalGroup(
            panelbtnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelbtnUpdate.setBackground(new java.awt.Color(0, 51, 102));

        btnUpdate.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/update.png"))); // NOI18N
        btnUpdate.setText("Modificar");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setFocusPainted(false);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnUpdateLayout = new javax.swing.GroupLayout(panelbtnUpdate);
        panelbtnUpdate.setLayout(panelbtnUpdateLayout);
        panelbtnUpdateLayout.setHorizontalGroup(
            panelbtnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelbtnUpdateLayout.setVerticalGroup(
            panelbtnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelbtnInsert.setBackground(new java.awt.Color(0, 51, 102));

        btnInsert.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insert.png"))); // NOI18N
        btnInsert.setText("Insertar");
        btnInsert.setBorder(null);
        btnInsert.setBorderPainted(false);
        btnInsert.setContentAreaFilled(false);
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.setFocusPainted(false);
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertMouseExited(evt);
            }
        });
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnInsertLayout = new javax.swing.GroupLayout(panelbtnInsert);
        panelbtnInsert.setLayout(panelbtnInsertLayout);
        panelbtnInsertLayout.setHorizontalGroup(
            panelbtnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelbtnInsertLayout.setVerticalGroup(
            panelbtnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSearch.setBackground(new java.awt.Color(0, 51, 102));
        panelSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setText("Buscar producto");
        txtBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        panelSearch.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        panelbtnSearch.setBackground(new java.awt.Color(0, 51, 102));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFocusPainted(false);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnSearchLayout = new javax.swing.GroupLayout(panelbtnSearch);
        panelbtnSearch.setLayout(panelbtnSearchLayout);
        panelbtnSearchLayout.setHorizontalGroup(
            panelbtnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelbtnSearchLayout.setVerticalGroup(
            panelbtnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelSearch.add(panelbtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 70, 50));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(452, 370));

        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Id", "Producto", "Cantidad", "Unidad de medida", "Proveedor", "Fecha de compra", "Precio de compra", "Precio de venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListado);
        if (tblListado.getColumnModel().getColumnCount() > 0) {
            tblListado.getColumnModel().getColumn(0).setResizable(false);
            tblListado.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblListado.getColumnModel().getColumn(1).setMinWidth(0);
            tblListado.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblListado.getColumnModel().getColumn(1).setMaxWidth(0);
            tblListado.getColumnModel().getColumn(2).setResizable(false);
            tblListado.getColumnModel().getColumn(3).setResizable(false);
            tblListado.getColumnModel().getColumn(4).setResizable(false);
            tblListado.getColumnModel().getColumn(5).setResizable(false);
            tblListado.getColumnModel().getColumn(6).setResizable(false);
            tblListado.getColumnModel().getColumn(7).setResizable(false);
            tblListado.getColumnModel().getColumn(8).setResizable(false);
        }

        panelbtnExport.setBackground(new java.awt.Color(0, 51, 102));

        btnExport.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/export.png"))); // NOI18N
        btnExport.setText("Exportar");
        btnExport.setBorder(null);
        btnExport.setBorderPainted(false);
        btnExport.setContentAreaFilled(false);
        btnExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExport.setFocusPainted(false);
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExportMouseExited(evt);
            }
        });
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnExportLayout = new javax.swing.GroupLayout(panelbtnExport);
        panelbtnExport.setLayout(panelbtnExportLayout);
        panelbtnExportLayout.setHorizontalGroup(
            panelbtnExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelbtnExportLayout.setVerticalGroup(
            panelbtnExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelContentProductLayout = new javax.swing.GroupLayout(panelContentProduct);
        panelContentProduct.setLayout(panelContentProductLayout);
        panelContentProductLayout.setHorizontalGroup(
            panelContentProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContentProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContentProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                    .addGroup(panelContentProductLayout.createSequentialGroup()
                        .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelbtnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelbtnExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelContentProductLayout.setVerticalGroup(
            panelContentProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentProductLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelContentProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelbtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelbtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelbtnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelbtnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        add(panelContentProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1040, 470));
    }// </editor-fold>//GEN-END:initComponents
    
    private void Mostrar(){
        List<dataStock> listaStock = stoc.mostrarStock();
        modelo = (DefaultTableModel) tblListado.getModel();
        Object[] ob = new Object[9];
        
        for(int i = 0; i < listaStock.size();i++){
            ob[0] = i+1;
            ob[1] = listaStock.get(i).getId();
            ob[2] = listaStock.get(i).getProducto();
            ob[3] = listaStock.get(i).getCantidad();
            ob[4] = listaStock.get(i).getUnidad();
            ob[5] = listaStock.get(i).getProveedor();
            ob[6] = listaStock.get(i).getFecha();
            ob[7] = listaStock.get(i).getCompra();
            ob[8] = listaStock.get(i).getVenta();

            modelo.addRow(ob);
        }
        tblListado.setModel(modelo);
    }
    
     void obtenerDatos(){
        int fila = tblListado.getSelectedRow();
        if(fila <= -1){
            JOptionPane.showMessageDialog(null, "Registro no seleccionado");
        } else{
            int id = (int) tblListado.getValueAt(fila,1);
            String producto = (String) tblListado.getValueAt(fila, 2);
            int cantidad = (int) tblListado.getValueAt(fila, 3);
            String unidad = (String) tblListado.getValueAt(fila, 4);
            String proveedor = (String) tblListado.getValueAt(fila, 5);
            String fecha = (String) tblListado.getValueAt(fila, 6);
            double compra = (double) tblListado.getValueAt(fila, 7);
            double venta = (double) tblListado.getValueAt(fila, 8);
            
            InfoStock instock = new InfoStock(id, producto, cantidad, unidad, proveedor, fecha, compra, venta);
            instock.setSize(1100, 700);
            instock.setLocation(0,0);
            panelContent.removeAll();
            panelContent.add(instock,BorderLayout.CENTER);
            panelContent.revalidate();
            panelContent.repaint();
        }
    }
    
    void Eliminar(){
        int fila = tblListado.getSelectedRow();
        if(fila <= -1){
            JOptionPane.showMessageDialog(null, "Registro no seleccionado");
        }
        else{
            dstock.setId((int) tblListado.getValueAt(fila, 1));
            int r = JOptionPane.showOptionDialog(this, "¿Esta seguro de eliminar el registro?", "Mensaje de alerta", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Si","No"},"Si");
            if (r == 0) {
                stoc.eliminarStock(dstock);
            }
        }
        limpiarTabla();
        Mostrar();
    } 
    
    void Buscar(){
        limpiarTabla();
        List<dataStock> listaStock = stoc.buscarStock(getBuscar());
        Object[] ob = new Object[9];
        
        for(int i = 0; i < listaStock.size();i++){
            ob[0] = i+1;
            ob[1] = listaStock.get(i).getId();
            ob[2] = listaStock.get(i).getProducto();
            ob[3] = listaStock.get(i).getCantidad();
            ob[4] = listaStock.get(i).getUnidad();
            ob[5] = listaStock.get(i).getProveedor();
            ob[6] = listaStock.get(i).getFecha();
            ob[7] = listaStock.get(i).getCompra();
            ob[8] = listaStock.get(i).getVenta();

            modelo.addRow(ob);
        }
        tblListado.setModel(modelo);
    }
    
    void limpiarTabla(){
        modelo = (DefaultTableModel) tblListado.getModel();
        int fila = tblListado.getRowCount();
        for(int i = 0; i< fila; i++){
            modelo.removeRow(0);
        }
    } 
    
    void Exportar(){
        Document doc = new Document();
        List<dataStock> listaStock = stoc.mostrarStock();
        Paragraph titulo = new Paragraph("Reporte del Stock");
        titulo.setAlignment(Element.ALIGN_CENTER);
        Paragraph texto = new Paragraph(" ");
        texto.setAlignment(Element.ALIGN_CENTER);
        try {
            String url = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(url+"/Desktop/Reporte-Stock.pdf"));
            doc.open();
            doc.add(titulo);
            doc.add(texto);
            PdfPCell id = new PdfPCell(new Phrase("Id"));
            id.setBackgroundColor(new BaseColor(153,204,255));
            PdfPCell producto = new PdfPCell(new Phrase("Producto"));
            producto.setBackgroundColor(new BaseColor(153,204,255));
            PdfPCell cantidad = new PdfPCell(new Phrase("Cantidad"));
            cantidad.setBackgroundColor(new BaseColor(153,204,255));
            PdfPCell unidad = new PdfPCell(new Phrase("Unidad"));
            unidad.setBackgroundColor(new BaseColor(153,204,255));
            PdfPCell proveedor = new PdfPCell(new Phrase("Proveedor"));
            proveedor.setBackgroundColor(new BaseColor(153,204,255));
            PdfPCell fecha = new PdfPCell(new Phrase("Fecha"));
            fecha.setBackgroundColor(new BaseColor(153,204,255));
            PdfPCell compra = new PdfPCell(new Phrase("Precio de compra"));
            compra.setBackgroundColor(new BaseColor(153,204,255));
            PdfPCell venta = new PdfPCell(new Phrase("Precio de venta"));
            venta.setBackgroundColor(new BaseColor(153,204,255));
            PdfPTable tabla = new PdfPTable(8);
            tabla.addCell(id);
            tabla.addCell(producto);
            tabla.addCell(cantidad);
            tabla.addCell(unidad);
            tabla.addCell(proveedor);
            tabla.addCell(fecha);
            tabla.addCell(compra);
            tabla.addCell(venta);
            if(listaStock.size()>0){
                for(int i = 0; i < listaStock.size();i++){
                    tabla.addCell(""+i+1);
                    tabla.addCell(listaStock.get(i).getProducto());
                    tabla.addCell(""+listaStock.get(i).getCantidad());
                    tabla.addCell(listaStock.get(i).getUnidad());
                    tabla.addCell(listaStock.get(i).getProveedor());
                    tabla.addCell(listaStock.get(i).getFecha());
                    tabla.addCell(""+listaStock.get(i).getCompra());
                    tabla.addCell(""+listaStock.get(i).getVenta());
                }
                doc.add(tabla);
                doc.close();
                JOptionPane.showMessageDialog(null, "El reporte se a generado en el escritorio","Confirmación",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al general el archivo","Mensaje de alerta",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        panelbtnDelete.setBackground(new Color(1,55,150));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        panelbtnDelete.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Eliminar();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        panelbtnUpdate.setBackground(new Color(1,55,150));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        panelbtnUpdate.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        obtenerDatos();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnInsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseEntered
        panelbtnInsert.setBackground(new Color(1,55,150));
    }//GEN-LAST:event_btnInsertMouseEntered

    private void btnInsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseExited
        panelbtnInsert.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_btnInsertMouseExited

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        InfoStock instock = new InfoStock();
        instock.setSize(1100, 700);
        instock.setLocation(0,0);
        panelContent.removeAll();
        panelContent.add(instock,BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        if(txtBuscar.getText().equals("Buscar producto")){
            txtBuscar.setText("");
            txtBuscar.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtBuscarMousePressed

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        panelbtnSearch.setBackground(new Color(1,55,150));
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        panelbtnSearch.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        txtBuscar.setText("");
        txtBuscar.setForeground(Color.black);
        txtBuscar.requestFocus();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Buscar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnExportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseEntered
        panelbtnExport.setBackground(new Color(1,55,150));
    }//GEN-LAST:event_btnExportMouseEntered

    private void btnExportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseExited
        panelbtnExport.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_btnExportMouseExited

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        Exportar();
    }//GEN-LAST:event_btnExportActionPerformed
    

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelContentProduct;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JPanel panelbtnDelete;
    private javax.swing.JPanel panelbtnExport;
    private javax.swing.JPanel panelbtnInsert;
    private javax.swing.JPanel panelbtnSearch;
    private javax.swing.JPanel panelbtnUpdate;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
