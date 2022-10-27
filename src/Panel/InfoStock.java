package Panel;

import Clases.dataProducto;
import Clases.dataProveedor;
import Clases.dataStock;
import Clases.optStock;
import static Form.Home.panelContent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

public class InfoStock extends javax.swing.JPanel {
    dataStock dstock = new dataStock();
    optStock stock = new optStock();
    SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public InfoStock() {
        initComponents();
        VIniciales();
        this.btnUpdate.setEnabled(false);
        this.btnUpdate.setContentAreaFilled(false);
        this.btnRegister.setEnabled(true);
        this.btnRegister.setContentAreaFilled(true); 
        Form();
    }
    
    public InfoStock(int id, String producto, int cantidad, String unidad, String proveedor, String fecha, double compra, double venta) {
        initComponents();
        VIniciales();
        this.btnUpdate.setEnabled(true);
        this.btnUpdate.setContentAreaFilled(true);
        this.btnRegister.setEnabled(false);
        this.btnRegister.setContentAreaFilled(false);
        java.util.Date dfecha;
        try {
            dfecha = (java.util.Date) dFormat.parse(fecha);
            txtId.setText(""+id);
            cbxProducto.setSelectedItem(producto);
            txtCantidad.setText(""+cantidad);
            cbxUnidad.setSelectedItem(unidad);
            cbxProveedor.setSelectedItem(proveedor);
            dtcFecha.setDate(dfecha);
            txtCompra.setText(""+compra);
            txtVenta.setText(""+venta);
            Form();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

    }
    
    private void VIniciales(){
        cbxProveedor.addItem("Seleccionar una opción");
        cbxProducto.addItem("Seleccionar una opción");
        cbxUnidad.addItem("Selecciomar una opción");
        cbxUnidad.addItem("Kilogramos");
        cbxUnidad.addItem("Latas");
        cbxUnidad.addItem("Balde");
        agregarProducto();
        agregarProveedor();
    }
    
    private void Form(){
        if(!txtCantidad.getText().equals("Ingrese la cantidad comprada")){
            txtCantidad.setForeground(Color.black);
        }
        if(!txtCompra.getText().equals("Ingrese el precio de compra")){
            txtCompra.setForeground(Color.black);
        }
        if(!txtVenta.getText().equals("Ingrese el precio de venta")){
            txtVenta.setForeground(Color.black);
        }
    }
    
    void agregarProveedor(){
        List<dataProveedor> listaProveedor = stock.mostrarProveedor();
        for(int i = 0;i < stock.mostrarProveedor().size(); i++){
            cbxProveedor.addItem(listaProveedor.get(i).getNombre());
        }
    }
    
    void agregarProducto(){
        List<dataProducto> listaProducto = stock.mostrarProducto();
        for(int i = 0; i < stock.mostrarProducto().size();i++){
            cbxProducto.addItem(listaProducto.get(i).getNombre());
        }
    }
    
    int getId(){
        return Integer.parseInt(txtId.getText().trim());
    }
    
    int getIdProducto(){
        return stock.idProducto(cbxProducto.getSelectedItem().toString());
    }
    
    int getCantidad(){
        return Integer.parseInt(txtCantidad.getText().trim());
    }
    
    String getUnidad(){
        return cbxUnidad.getSelectedItem().toString();
    }
    
    int getIdProveedor(){
        return stock.idProveedor(cbxProveedor.getSelectedItem().toString());
    }
    
    String getFecha(){
        return dFormat.format(dtcFecha.getDate());
    }
    
    double getCompra(){
        return Double.parseDouble(txtCompra.getText().trim());
    }
    
    double getVenta(){
        return Double.parseDouble(txtVenta.getText().trim());
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
        txtCantidad = new javax.swing.JTextField();
        txtVenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCompra = new javax.swing.JTextField();
        cbxProducto = new javax.swing.JComboBox<>();
        cbxUnidad = new javax.swing.JComboBox<>();
        cbxProveedor = new javax.swing.JComboBox<>();
        dtcFecha = new com.toedter.calendar.JDateChooser();
        panelbtnProducto = new javax.swing.JPanel();
        btnProducto = new javax.swing.JButton();
        panelbtnProveedor = new javax.swing.JPanel();
        btnProveedor = new javax.swing.JButton();
        panelbtnExit = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1040, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Información del stock de productos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Unidad de medida");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Proveedor");

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidad.setText("Ingrese la cantidad comprada");
        txtCantidad.setBorder(null);
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        txtVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtVenta.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtVenta.setForeground(new java.awt.Color(153, 153, 153));
        txtVenta.setText("Ingrese el precio de venta");
        txtVenta.setBorder(null);
        txtVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtVentaMousePressed(evt);
            }
        });
        txtVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVentaActionPerformed(evt);
            }
        });
        txtVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha de compra");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Precio de Compra");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 10));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator7.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator7.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator9.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator9.setForeground(new java.awt.Color(0, 102, 153));

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

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Precio de venta");

        txtCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtCompra.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCompra.setForeground(new java.awt.Color(153, 153, 153));
        txtCompra.setText("Ingrese el precio de compra");
        txtCompra.setBorder(null);
        txtCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCompraMousePressed(evt);
            }
        });
        txtCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompraActionPerformed(evt);
            }
        });
        txtCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCompraKeyTyped(evt);
            }
        });

        cbxProducto.setBackground(new java.awt.Color(255, 255, 255));
        cbxProducto.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        cbxProducto.setForeground(new java.awt.Color(0, 0, 0));
        cbxProducto.setBorder(null);

        cbxUnidad.setBackground(new java.awt.Color(255, 255, 255));
        cbxUnidad.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        cbxUnidad.setForeground(new java.awt.Color(0, 0, 0));
        cbxUnidad.setBorder(null);

        cbxProveedor.setBackground(new java.awt.Color(255, 255, 255));
        cbxProveedor.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        cbxProveedor.setForeground(new java.awt.Color(0, 0, 0));
        cbxProveedor.setBorder(null);

        dtcFecha.setBackground(new java.awt.Color(255, 255, 255));
        dtcFecha.setForeground(new java.awt.Color(0, 0, 0));
        dtcFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtcFechaKeyTyped(evt);
            }
        });

        panelbtnProducto.setBackground(new java.awt.Color(0, 102, 51));

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/addform.png"))); // NOI18N
        btnProducto.setBorder(null);
        btnProducto.setBorderPainted(false);
        btnProducto.setContentAreaFilled(false);
        btnProducto.setFocusPainted(false);
        btnProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductoMouseExited(evt);
            }
        });
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnProductoLayout = new javax.swing.GroupLayout(panelbtnProducto);
        panelbtnProducto.setLayout(panelbtnProductoLayout);
        panelbtnProductoLayout.setHorizontalGroup(
            panelbtnProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbtnProductoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelbtnProductoLayout.setVerticalGroup(
            panelbtnProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelbtnProveedor.setBackground(new java.awt.Color(0, 102, 51));

        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/addform.png"))); // NOI18N
        btnProveedor.setBorder(null);
        btnProveedor.setBorderPainted(false);
        btnProveedor.setContentAreaFilled(false);
        btnProveedor.setFocusPainted(false);
        btnProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedorMouseExited(evt);
            }
        });
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnProveedorLayout = new javax.swing.GroupLayout(panelbtnProveedor);
        panelbtnProveedor.setLayout(panelbtnProveedorLayout);
        panelbtnProveedorLayout.setHorizontalGroup(
            panelbtnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelbtnProveedorLayout.setVerticalGroup(
            panelbtnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCantidad)
                                .addComponent(jSeparator3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbxUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(panelbtnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(dtcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelbtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addGap(80, 80, 80)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVenta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCompra, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(panelbtnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)
                                .addComponent(cbxUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelbtnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)))))
                .addGap(55, 55, 55))
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
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 40, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    void mostrarForm(){
        Stock stock = new Stock();
        stock.setSize(1100, 500);
        stock.setLocation(0,0);
        panelContent.removeAll();
        panelContent.add(stock,BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }
    
    void Insertar(){
        if(cbxProducto.getSelectedIndex() == 0 ||
                txtCantidad.getText().equals("Ingrese la cantidad comprada") ||
                txtCantidad.getText().equals("") ||
                cbxUnidad.getSelectedIndex() == 0 ||
                cbxProveedor.getSelectedIndex() == 0 ||
                getFecha().equals("") ||
                txtCompra.getText().equals("Ingrese el precio de compra") ||
                txtCompra.getText().equals("") ||
                txtVenta.getText().equals("Ingrese el precio de venta") ||
                txtVenta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Existen campos vacíos");
        }
        else{
            dstock.setIdProducto(getIdProducto());
            dstock.setCantidad(getCantidad());
            dstock.setUnidad(getUnidad());
            dstock.setIdProveedor(getIdProveedor());
            dstock.setFecha(getFecha());
            dstock.setCompra(getCompra());
            dstock.setVenta(getVenta());
            stock.insertarStock(dstock);
            mostrarForm(); 
        }
        
    }
    
    void Modificar(){
        if(cbxProducto.getSelectedIndex() == 0 ||
                txtCantidad.getText().equals("Ingrese la cantidad comprada") ||
                txtCantidad.getText().equals("") ||
                cbxUnidad.getSelectedIndex() == 0 ||
                cbxProveedor.getSelectedIndex() == 0 ||
                getFecha().equals("") ||
                txtCompra.getText().equals("Ingrese el precio de compra") ||
                txtCompra.getText().equals("") ||
                txtVenta.getText().equals("Ingrese el precio de venta") ||
                txtVenta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Existen campos vacíos");
        }
        else{
            dstock.setIdProducto(getIdProducto());
            dstock.setCantidad(getCantidad());
            dstock.setUnidad(getUnidad());
            dstock.setIdProveedor(getIdProveedor());
            dstock.setFecha(getFecha());
            dstock.setCompra(getCompra());
            dstock.setVenta(getVenta());
            dstock.setId(getId());
            stock.modificarStock(dstock);
            mostrarForm();
        }
        
    }
    
    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        if(txtCantidad.getText().equals("Ingrese la cantidad comprada")){
            txtCantidad.setText("");
            txtCantidad.setForeground(Color.black);
        }

        if(txtCompra.getText().isEmpty()){
            txtCompra.setText("Ingrese el precio de compra");
            txtCompra.setForeground(new Color(153,153,153));
        }
        if(txtVenta.getText().isEmpty()){
            txtVenta.setText("Ingrese el precio de venta");
            txtVenta.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtCantidadMousePressed

    private void txtVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVentaMousePressed
        if(txtVenta.getText().equals("Ingrese el precio de venta")){
            txtVenta.setText("");
            txtVenta.setForeground(Color.black);
        }
        if(txtCantidad.getText().isEmpty()){
            txtCantidad.setText("Ingrese la cantidad comprada");
            txtCantidad.setForeground(new Color(153,153,153));
        }
        if(txtCompra.getText().isEmpty()){
            txtCompra.setText("Ingrese el precio de compra");
            txtCompra.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtVentaMousePressed

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

    private void txtCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCompraMousePressed
        if(txtCompra.getText().equals("Ingrese el precio de compra")){
            txtCompra.setText("");
            txtCompra.setForeground(Color.black);
        }
        if(txtCantidad.getText().isEmpty()){
            txtCantidad.setText("Ingrese la cantidad comprada");
            txtCantidad.setForeground(new Color(153,153,153));
        }
        if(txtVenta.getText().isEmpty()){
            txtVenta.setText("Ingrese el precio de venta");
            txtVenta.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtCompraMousePressed

    private void txtVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVentaActionPerformed

    private void btnProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductoMouseEntered
        
        panelbtnProducto.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_btnProductoMouseEntered

    private void btnProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedorMouseEntered
        panelbtnProveedor.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_btnProveedorMouseEntered

    private void btnProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedorMouseExited
        panelbtnProveedor.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_btnProveedorMouseExited

    private void btnProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductoMouseExited
        panelbtnProducto.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_btnProductoMouseExited

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        Producto producto = new Producto();
        producto.setSize(1100, 700);
        producto.setLocation(0,0);
        panelContent.removeAll();
        panelContent.add(producto,BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        Proveedor proveedor = new Proveedor();
        proveedor.setSize(1100, 700);
        proveedor.setLocation(0,0);
        panelContent.removeAll();
        panelContent.add(proveedor,BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }//GEN-LAST:event_btnProveedorActionPerformed

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

    private void txtCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompraActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || txtCantidad.getText().length() >=5){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompraKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || txtCompra.getText().length() >=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtCompraKeyTyped

    private void txtVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isSpaceChar(c) || txtVenta.getText().length() >=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtVentaKeyTyped

    private void dtcFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtcFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dtcFechaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxProducto;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JComboBox<String> cbxUnidad;
    private com.toedter.calendar.JDateChooser dtcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panelbtnExit;
    private javax.swing.JPanel panelbtnProducto;
    private javax.swing.JPanel panelbtnProveedor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCompra;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtVenta;
    // End of variables declaration//GEN-END:variables
}
