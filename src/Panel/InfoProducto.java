package Panel;

import Clases.Mod;
import Clases.dataProducto;
import Clases.optProducto;
import java.awt.Color;
import static Form.Home.panelContent;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class InfoProducto extends javax.swing.JPanel {
    dataProducto dprod = new dataProducto();
    optProducto prod = new optProducto();
    Mod modelo = new Mod();
    
    public InfoProducto() {
        initComponents();
        VIniciales();
        this.btnUpdate.setEnabled(false);
        this.btnUpdate.setContentAreaFilled(false);
        this.btnRegister.setEnabled(true);
        this.btnRegister.setContentAreaFilled(true);  
        Form();
    }
    
    public InfoProducto(int id,String codigo, String producto, String categoria, String marca){
        initComponents();
        VIniciales();
        this.btnUpdate.setEnabled(true);
        this.btnUpdate.setContentAreaFilled(true);
        this.btnRegister.setEnabled(false);
        this.btnRegister.setContentAreaFilled(false);
        txtId.setText(""+id);
        txtCodigo.setText(codigo);
        txtNombre.setText(producto);
        cbxCategoria.setSelectedItem(categoria);
        txtMarca.setText(marca);
        Form();
    }
    
    private void Form(){
        if(!txtCodigo.getText().equals("Ingrese el código del producto")){
            txtCodigo.setForeground(Color.black);
        }
        if(!txtNombre.getText().equals("Ingrese el nombre del producto")){
            txtNombre.setForeground(Color.black);
        }
        if(!txtMarca.getText().equals("Ingrese la marca del producto")){
            txtMarca.setForeground(Color.black);
        }
    }
    
    private void VIniciales(){
        cbxCategoria.addItem("Elegir una opción");
        cbxCategoria.addItem("Clavos");
        cbxCategoria.addItem("Herramientas");      
        cbxCategoria.addItem("Pegamentos");
        cbxCategoria.addItem("Pinturas");
        cbxCategoria.addItem("Tornillos");
        cbxCategoria.addItem("Tuberias");
        
    }
    int getId(){
        return Integer.parseInt(txtId.getText().trim());
    }
    
    String getCodigo(){
        return modelo.modeloTexto(txtCodigo.getText().trim());
    }
    
    String getNombre(){
        return modelo.modeloTexto(txtNombre.getText().trim());
    }
    
    String getCategoria(){
        return cbxCategoria.getSelectedItem().toString();
    }
    
    String getMarca(){
        return modelo.modeloTexto(txtMarca.getText().trim());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        panelbtnExit = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1040, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Información del Producto");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Producto");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Categoría");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Marca");

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        txtCodigo.setText("Ingrese el código del producto");
        txtCodigo.setBorder(null);
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoMousePressed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(153, 153, 153));
        txtMarca.setText("Ingrese la marca del producto");
        txtMarca.setBorder(null);
        txtMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMarcaMousePressed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese el nombre del producto");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 10));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator5.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 153));

        btnRegister.setBackground(new java.awt.Color(0, 51, 102));
        btnRegister.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        btnRegister.setText("Registrar");
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.setEnabled(false);
        btnRegister.setFocusPainted(false);
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 102, 51));
        btnUpdate.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boomup.png"))); // NOI18N
        btnUpdate.setText("Modificar");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setEnabled(false);
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

        cbxCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cbxCategoria.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        cbxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cbxCategoria.setBorder(null);
        cbxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxCategoria.setFocusable(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/img.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addGap(80, 80, 80)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel6)))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1020, 460));

        panelbtnExit.setBackground(new java.awt.Color(255, 255, 255));

        btnReturn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(0, 0, 0));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/return.png"))); // NOI18N
        btnReturn.setBorder(null);
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.setFocusPainted(false);
        btnReturn.setPreferredSize(new java.awt.Dimension(40, 40));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReturnMouseExited(evt);
            }
        });
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnExitLayout = new javax.swing.GroupLayout(panelbtnExit);
        panelbtnExit.setLayout(panelbtnExitLayout);
        panelbtnExitLayout.setHorizontalGroup(
            panelbtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbtnExitLayout.createSequentialGroup()
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelbtnExitLayout.setVerticalGroup(
            panelbtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panelbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 40, -1));

        txtId.setForeground(new java.awt.Color(255, 255, 255));
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 60, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    void Insertar(){
        if(getCodigo().equals(modelo.modeloTexto("Ingrese el código del producto")) ||
                getCodigo().equals("") ||
                getNombre().equals(modelo.modeloTexto("Ingrese el nombre del producto")) ||
                getNombre().equals("") ||
                getCategoria().equals("Elegir una opción") ||
                getMarca().equals(modelo.modeloTexto("Ingrese la marca del producto")) ||
                getMarca().equals("")){
            JOptionPane.showMessageDialog(null, "Existen campos vacíos");
        }
        else if(getCodigo().length() != 6){
            JOptionPane.showMessageDialog(null, "El Código debe tener 6 caracteres");
        }
        else if(prod.existCode(getCodigo()) != 0){
            JOptionPane.showMessageDialog(null, "El codigo "+getCodigo()+" ya esta registrado");
        }    
        else if(prod.existProduct(getNombre(), getMarca()) != 0){
            JOptionPane.showMessageDialog(null, "El producto "+getNombre()+ "en la marca "+getMarca()+" ya esta registrado");
        }
        else{
            dprod.setCodigo(getCodigo());
            dprod.setNombre(getNombre());
            dprod.setCategoria(getCategoria());
            dprod.setMarca(getMarca());
            prod.insertarProducto(dprod);
                
            mostrarForm();
        }
    }
    
    void Modificar(){
        if(getCodigo().equals("Ingrese el código del producto") ||
                getCodigo().equals("") ||
                getNombre().equals("Ingrese el nombre del producto") ||
                getNombre().equals("") ||
                getCategoria().equals("Elegir una opción") ||
                getMarca().equals("Ingrese la marca del producto") ||
                getMarca().equals("")){
            JOptionPane.showMessageDialog(null, "Existen campos vacíos");
        }
        else if(getCodigo().length() != 6){
            JOptionPane.showMessageDialog(null, "El Codigo debe tener 6 caracteres");
        }
        else if(prod.buscarCodigo(getId()).equals(getCodigo())){
            if(prod.buscarNombre(getId()).equals(getNombre()) && prod.buscarMarca(getId()).equals(getMarca())){
                dprod.setId(getId());
                dprod.setCodigo(getCodigo());
                dprod.setNombre(getNombre());
                dprod.setCategoria(getCategoria());
                dprod.setMarca(getMarca());
                prod.modificarProducto(dprod);

                mostrarForm();
            }
            else if(prod.existProduct(getNombre(), getMarca()) != 0){
                JOptionPane.showMessageDialog(null, "El producto "+getNombre()+" en la marca "+getMarca()+" ya esta registrado");
            }
            else{
                dprod.setId(getId());
                dprod.setCodigo(getCodigo());
                dprod.setNombre(getNombre());
                dprod.setCategoria(getCategoria());
                dprod.setMarca(getMarca());
                prod.modificarProducto(dprod);

                mostrarForm();
            }
        }
        else if(prod.existCode(getCodigo()) != 0){
            JOptionPane.showMessageDialog(null, "El código "+getCodigo()+" ya esta registrado");
        }
        else if(prod.buscarNombre(getId()).equals(getNombre()) && prod.buscarMarca(getId()).equals(getMarca())){
            dprod.setId(getId());
            dprod.setCodigo(getCodigo());
            dprod.setNombre(getNombre());
            dprod.setCategoria(getCategoria());
            dprod.setMarca(getMarca());
            prod.modificarProducto(dprod);

            mostrarForm();
        }
        else if(prod.existProduct(getNombre(), getMarca()) != 0){
            JOptionPane.showMessageDialog(null, "El producto "+getNombre()+" en la marca "+getMarca()+" ya esta registrado");
        }
        else{
            dprod.setId(getId());
            dprod.setCodigo(getCodigo());
            dprod.setNombre(getNombre());
            dprod.setCategoria(getCategoria());
            dprod.setMarca(getMarca());
            prod.modificarProducto(dprod);

            mostrarForm();
        }
    
    }
    
    void mostrarForm(){
        Producto producto = new Producto();
        producto.setSize(1100, 500);
        producto.setLocation(0,0);
        panelContent.removeAll();
        panelContent.add(producto,BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }
    private void txtCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMousePressed
        if(txtCodigo.getText().equals("Ingrese el código del producto")){
            txtCodigo.setText("");
            txtCodigo.setForeground(Color.black);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del producto");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtMarca.getText().isEmpty()){
            txtMarca.setText("Ingrese la marca del producto");
            txtMarca.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtCodigoMousePressed

    private void txtMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaMousePressed
        if(txtMarca.getText().equals("Ingrese la marca del producto")){
            txtMarca.setText("");
            txtMarca.setForeground(Color.black);
        }
        if(txtCodigo.getText().isEmpty()){
            txtCodigo.setText("Ingrese el código del producto");
            txtCodigo.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del producto");
            txtNombre.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtMarcaMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if(txtNombre.getText().equals("Ingrese el nombre del producto")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if(txtCodigo.getText().isEmpty()){
            txtCodigo.setText("Ingrese el código del producto");
            txtCodigo.setForeground(new Color(153,153,153));
        }      
        if(txtMarca.getText().isEmpty()){
            txtMarca.setText("Ingrese la marca del producto");
            txtMarca.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_txtNombreMousePressed

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        btnRegister.setBackground(new Color(1,55,150));
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Modificar();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Insertar();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseEntered
        panelbtnExit.setBackground(new Color(204,255,204));
        
    }//GEN-LAST:event_btnReturnMouseEntered

    private void btnReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseExited
        panelbtnExit.setBackground(Color.white);

    }//GEN-LAST:event_btnReturnMouseExited

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        mostrarForm();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c) || txtCodigo.getText().length()>=6){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtMarcaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel panelbtnExit;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
