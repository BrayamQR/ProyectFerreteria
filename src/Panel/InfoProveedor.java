package Panel;

import Clases.Mod;
import Clases.dataProveedor;
import Clases.optProveedor;
import static Form.Home.panelContent;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

public class InfoProveedor extends javax.swing.JPanel {
    optProveedor prov = new optProveedor();
    dataProveedor dprov = new dataProveedor();
    Mod modelo = new Mod();
    public InfoProveedor() {
        initComponents();
        this.btnUpdate.setEnabled(false);
        this.btnUpdate.setContentAreaFilled(false);
        this.btnRegister.setEnabled(true);
        this.btnRegister.setContentAreaFilled(true);
        Form();
    }
    
    public InfoProveedor(int id, String codigo, String nombre, String telefono, String email, String direccion, String contacto, String celular, String cargo){
        initComponents();
        this.btnUpdate.setEnabled(true);
        this.btnUpdate.setContentAreaFilled(true);
        this.btnRegister.setEnabled(false);
        this.btnRegister.setContentAreaFilled(false);
        txtId.setText(""+id);
        txtRUC.setText(codigo);
        txtNombre.setText(nombre);
        txtTelefono.setText(telefono);
        txtEmail.setText(email);
        txtDireccion.setText(direccion);
        txtContacto.setText(contacto);
        txtCelular.setText(celular);
        txtCargo.setText(cargo);
        Form();
    }
    
    private void Form(){
        if(!txtRUC.getText().equals("Ingrese el RUC del proveedor")){
            txtRUC.setForeground(Color.black);
        }
        if(!txtNombre.getText().equals("Ingrese el nombre del proveedor")){
            txtNombre.setForeground(Color.black);
        }
        if(!txtTelefono.getText().equals("Ingrese el teléfono del proveedor")){
            txtTelefono.setForeground(Color.black);
        }
        if(!txtEmail.getText().equals("Ingrese el email del proveedor")){
            txtEmail.setForeground(Color.black);
        }
        if(!txtDireccion.getText().equals("Ingrese la dirección del proveedor")){
            txtDireccion.setForeground(Color.black);
        }
        if(!txtContacto.getText().equals("Ingrese el nombre del contacto")){
            txtContacto.setForeground(Color.black);
        }
        if(!txtCelular.getText().equals("Ingrese el celular del contacto")){
            txtCelular.setForeground(Color.black);
        }
        if(!txtCargo.getText().equals("Ingrese el cargo del contacto")){
            txtCargo.setForeground(Color.black);
        }
    }
    int getId(){
        return Integer.parseInt(txtId.getText().trim());
    }
    
    String getRuc() {
        return txtRUC.getText().trim();
    }
    
    String getNombre() {
        return modelo.modeloTexto(txtNombre.getText().trim());
    }
    
    String getTelefono() {
        return txtTelefono.getText().trim();
    }
    
    String getEmail() {
        return txtEmail.getText().trim();
    }
    
    String getDireccion() {
        return modelo.modeloTexto(txtDireccion.getText().trim());
    }
    
    String getContacto() {
        return modelo.modeloTexto(txtContacto.getText().trim());
    }
    
    String getCelular() {
        return txtCelular.getText().trim();
    }
    
    String getCargo(){
        return modelo.modeloTexto(txtCargo.getText().trim());
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
        txtRUC = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        panelbtnExit = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1040, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Información del Proveedor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("RUC");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");

        txtRUC.setBackground(new java.awt.Color(255, 255, 255));
        txtRUC.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtRUC.setForeground(new java.awt.Color(153, 153, 153));
        txtRUC.setText("Ingrese el RUC del proveedor");
        txtRUC.setBorder(null);
        txtRUC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRUCMousePressed(evt);
            }
        });
        txtRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRUCKeyTyped(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Ingrese el email del proveedor");
        txtEmail.setBorder(null);
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailMousePressed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese el nombre del proveedor");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Ingrese el teléfono del proveedor");
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(153, 153, 153));
        txtCelular.setText("Ingrese el celular del contacto");
        txtCelular.setBorder(null);
        txtCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCelularMousePressed(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccion.setText("Ingrese la dirección del proveedor");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Contacto");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 10));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator4.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator5.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator6.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator6.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator7.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator7.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator9.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator9.setForeground(new java.awt.Color(0, 102, 153));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Cargo del contacto");

        jSeparator10.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator10.setForeground(new java.awt.Color(0, 102, 153));

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
        jLabel8.setText("Celular del contacto");

        txtContacto.setBackground(new java.awt.Color(255, 255, 255));
        txtContacto.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtContacto.setForeground(new java.awt.Color(153, 153, 153));
        txtContacto.setText("Ingrese el nombre del contacto");
        txtContacto.setBorder(null);
        txtContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContactoMousePressed(evt);
            }
        });
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });

        txtCargo.setBackground(new java.awt.Color(255, 255, 255));
        txtCargo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCargo.setForeground(new java.awt.Color(153, 153, 153));
        txtCargo.setText("Ingrese el cargo del contacto");
        txtCargo.setBorder(null);
        txtCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCargoMousePressed(evt);
            }
        });
        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addGap(80, 80, 80)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContacto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCargo))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))))
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
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 50, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    void Insertar(){
        if(getRuc().equals(modelo.modeloTexto("Ingrese el RUC del proveedor")) ||
                getRuc().equals("") ||
                getNombre().equals(modelo.modeloTexto("Ingrese el nombre del proveedor")) ||
                getNombre().equals("") ||
                getTelefono().equals(modelo.modeloTexto("Ingrese el teléfono del proveedor")) ||
                getTelefono().equals("") ||
                getEmail().equals(modelo.modeloTexto("Ingrese el email del proveedor")) ||
                getEmail().equals("") ||
                getDireccion().equals(modelo.modeloTexto("Ingrese la dirección del proveedor")) ||
                getDireccion().equals("") ||
                getContacto().equals(modelo.modeloTexto("Ingrese el nombre del contacto")) ||
                getContacto().equals("") ||
                getCelular().equals(modelo.modeloTexto("Ingrese el celular del contacto")) ||
                getCelular().equals("") ||
                getCargo().equals(modelo.modeloTexto("Ingrese el cargo del contacto")) ||
                getCargo().equals("")){
            JOptionPane.showMessageDialog(null, "Existen campos vacíos");
        }
        else if(getRuc().length() != 11){
            JOptionPane.showMessageDialog(null, "El RUC debe tener 11 caracteres");
        }
        else if(getTelefono().length() < 6){
            JOptionPane.showMessageDialog(null, "El teléfono debe tener al menos 6 caracteres");
        } 
        else if(getCelular().length() != 9){
            JOptionPane.showMessageDialog(null, "El celular debe tener 9 caracteres");
        }
        else if(prov.existRUC(getRuc()) != 0) {
            JOptionPane.showMessageDialog(null, "El RUC "+getRuc()+" ya esta registrado");
        }
        else if(prov.existSupplier(getNombre()) != 0){
            JOptionPane.showMessageDialog(null, "El proveedor "+getNombre()+" ya esta registrado");
        }
        else if(modelo.validarEmail(getEmail())){
            dprov.setRuc(getRuc());
            dprov.setNombre(getNombre());
            dprov.setContacto(getContacto());
            dprov.setCargo(getCargo());
            dprov.setCelular(getCelular());
            dprov.setDireccion(getDireccion());
            dprov.setEmail(getEmail());
            dprov.setTelefono(getTelefono());
            prov.insertarProveedor(dprov);
            mostrarForm();
        }
        else{
            JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
        }
        
    }
    
    void Modificar(){
        if(getRuc().equalsIgnoreCase(modelo.modeloTexto("Ingrese el RUC del proveedor")) ||
                getRuc().equals("") ||
                getNombre().equals(modelo.modeloTexto("Ingrese el nombre del proveedor")) ||
                getNombre().equals("") ||
                getTelefono().equals(modelo.modeloTexto("Ingrese el teléfono del proveedor")) ||
                getTelefono().equals("") ||
                getEmail().equals(modelo.modeloTexto("Ingrese el email del proveedor")) ||
                getEmail().equals("") ||
                getDireccion().equals(modelo.modeloTexto("Ingrese la dirección del proveedor")) ||
                getDireccion().equals("") ||
                getContacto().equals(modelo.modeloTexto("Ingrese el nombre del contacto")) ||
                getContacto().equals("") ||
                getCelular().equals(modelo.modeloTexto("Ingrese el celular del contacto")) ||
                getCelular().equals("") ||
                getCargo().equals(modelo.modeloTexto("Ingrese el cargo del contacto")) ||
                getCargo().equals("")){
            JOptionPane.showMessageDialog(null, "Existen campos vacíos");
        }
        else if(getRuc().length() != 11){
            JOptionPane.showMessageDialog(null, "El RUC debe tener 11 caracteres");
        }
        else if(getTelefono().length() < 6){
            JOptionPane.showMessageDialog(null, "El teléfono debe tener al menos 6 caracteres");
        } 
        else if(getCelular().length() != 9){
            JOptionPane.showMessageDialog(null, "El celular debe tener 9 caracteres");
        }
        else if (prov.buscarRUC(getId()).equals(getRuc())){
            if(prov.buscarNombre(getId()).equals(getNombre())){
                if(modelo.validarEmail(getEmail())){
                    dprov.setId(getId());
                    dprov.setRuc(getRuc());
                    dprov.setNombre(getNombre());
                    dprov.setContacto(getContacto());
                    dprov.setCargo(getCargo());
                    dprov.setCelular(getCelular());
                    dprov.setDireccion(getDireccion());
                    dprov.setEmail(getEmail());
                    dprov.setTelefono(getTelefono());

                    prov.modificarProveedor(dprov);
                    mostrarForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
                }
            }
            else if(prov.existSupplier(getNombre()) != 0){
                JOptionPane.showMessageDialog(null, "El proveedor "+getNombre()+" ya esta registrado");
            }
            else if(modelo.validarEmail(getEmail())){
                dprov.setId(getId());
                dprov.setRuc(getRuc());
                dprov.setNombre(getNombre());
                dprov.setContacto(getContacto());
                dprov.setCargo(getCargo());
                dprov.setCelular(getCelular());
                dprov.setDireccion(getDireccion());
                dprov.setEmail(getEmail());
                dprov.setTelefono(getTelefono());

                prov.modificarProveedor(dprov);
                mostrarForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
            }
        }
        else if (prov.existRUC(getRuc()) != 0 ){
            JOptionPane.showMessageDialog(null, "El RUC "+getRuc()+" ya esta registrado");
        }
        else{
            if(prov.buscarNombre(getId()).equals(getNombre())){
                if(modelo.validarEmail(getEmail())){
                    dprov.setId(getId());
                    dprov.setRuc(getRuc());
                    dprov.setNombre(getNombre());
                    dprov.setContacto(getContacto());
                    dprov.setCargo(getCargo());
                    dprov.setCelular(getCelular());
                    dprov.setDireccion(getDireccion());
                    dprov.setEmail(getEmail());
                    dprov.setTelefono(getTelefono());

                    prov.modificarProveedor(dprov);
                    mostrarForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
                }
            }
            else if(prov.existSupplier(getNombre()) != 0){
                JOptionPane.showMessageDialog(null, "El proveedor "+getNombre()+" ya esta registrado");
            }
            else if(modelo.validarEmail(getEmail())){
                dprov.setId(getId());
                dprov.setRuc(getRuc());
                dprov.setNombre(getNombre());
                dprov.setContacto(getContacto());
                dprov.setCargo(getCargo());
                dprov.setCelular(getCelular());
                dprov.setDireccion(getDireccion());
                dprov.setEmail(getEmail());
                dprov.setTelefono(getTelefono());

                prov.modificarProveedor(dprov);
                mostrarForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
            }
        }
    }
    
    void mostrarForm(){
        Proveedor proveedor = new Proveedor();
        proveedor.setSize(1100, 500);
        proveedor.setLocation(0,0);
        panelContent.removeAll();
        panelContent.add(proveedor,BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }
    private void txtRUCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRUCMousePressed
        if(txtRUC.getText().equals("Ingrese el RUC del proveedor")){
            txtRUC.setText("");
            txtRUC.setForeground(Color.black);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del proveedor");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del proveedor");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del proveedor");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del proveedor");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtContacto.getText().isEmpty()){
            txtContacto.setText("Ingrese el nombre del contacto");
            txtContacto.setForeground(new Color(153,153,153));
        }
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Ingrese el celular del contacto");
            txtCelular.setForeground(new Color(153,153,153));
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del contacto");
            txtCargo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtRUCMousePressed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        if(txtEmail.getText().equals("Ingrese el email del proveedor")){
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
        }
        if(txtRUC.getText().isEmpty()){
            txtRUC.setText("Ingrese el RUC del proveedor");
            txtRUC.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del proveedor");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del proveedor");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del proveedor");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtContacto.getText().isEmpty()){
            txtContacto.setText("Ingrese el nombre del contacto");
            txtContacto.setForeground(new Color(153,153,153));
        }
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Ingrese el celular del contacto");
            txtCelular.setForeground(new Color(153,153,153));
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del contacto");
            txtCargo.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtEmailMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if(txtNombre.getText().equals("Ingrese el nombre del proveedor")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if(txtRUC.getText().isEmpty()){
            txtRUC.setText("Ingrese el RUC del proveedor");
            txtRUC.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del proveedor");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del proveedor");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del proveedor");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtContacto.getText().isEmpty()){
            txtContacto.setText("Ingrese el nombre del contacto");
            txtContacto.setForeground(new Color(153,153,153));
        }
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Ingrese el celular del contacto");
            txtCelular.setForeground(new Color(153,153,153));
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del contacto");
            txtCargo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        if(txtTelefono.getText().equals("Ingrese el teléfono del proveedor")){
            txtTelefono.setText("");
            txtTelefono.setForeground(Color.black);
        }
        if(txtRUC.getText().isEmpty()){
            txtRUC.setText("Ingrese el RUC del proveedor");
            txtRUC.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del proveedor");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del proveedor");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del proveedor");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtContacto.getText().isEmpty()){
            txtContacto.setText("Ingrese el nombre del contacto");
            txtContacto.setForeground(new Color(153,153,153));
        }
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Ingrese el celular del contacto");
            txtCelular.setForeground(new Color(153,153,153));
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del contacto");
            txtCargo.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtCelularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCelularMousePressed
        if(txtCelular.getText().equals("Ingrese el celular del contacto")){
            txtCelular.setText("");
            txtCelular.setForeground(Color.black);
        }
        if(txtRUC.getText().isEmpty()){
            txtRUC.setText("Ingrese el RUC del proveedor");
            txtRUC.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del proveedor");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del proveedor");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del proveedor");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del proveedor");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtContacto.getText().isEmpty()){
            txtContacto.setText("Ingrese el nombre del contacto");
            txtContacto.setForeground(new Color(153,153,153));
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del contacto");
            txtCargo.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtCelularMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        if(txtDireccion.getText().equals("Ingrese la dirección del proveedor")){
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.black);
        }
        if(txtRUC.getText().isEmpty()){
            txtRUC.setText("Ingrese el RUC del proveedor");
            txtRUC.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del proveedor");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del proveedor");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del proveedor");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtContacto.getText().isEmpty()){
            txtContacto.setText("Ingrese el nombre del contacto");
            txtContacto.setForeground(new Color(153,153,153));
        }
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Ingrese el celular del contacto");
            txtCelular.setForeground(new Color(153,153,153));
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del contacto");
            txtCargo.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtDireccionMousePressed

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

    private void txtContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactoMousePressed
        if(txtContacto.getText().equals("Ingrese el nombre del contacto")){
            txtContacto.setText("");
            txtContacto.setForeground(Color.black);
        }
        if(txtRUC.getText().isEmpty()){
            txtRUC.setText("Ingrese el RUC del proveedor");
            txtRUC.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del proveedor");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del proveedor");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del proveedor");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del proveedor");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Ingrese el celular del contacto");
            txtCelular.setForeground(new Color(153,153,153));
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del contacto");
            txtCargo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtContactoMousePressed

    private void txtCargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCargoMousePressed
        if(txtCargo.getText().equals("Ingrese el cargo del contacto")){
            txtCargo.setText("");
            txtCargo.setForeground(Color.black);
        }
        if(txtRUC.getText().isEmpty()){
            txtRUC.setText("Ingrese el RUC del proveedor");
            txtRUC.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del proveedor");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del proveedor");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del proveedor");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del proveedor");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtContacto.getText().isEmpty()){
            txtContacto.setText("Ingrese el nombre del contacto");
            txtContacto.setForeground(new Color(153,153,153));
        }
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Ingrese el celular del contacto");
            txtCelular.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtCargoMousePressed

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

    private void txtRUCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || txtRUC.getText().length() >=11){
            evt.consume();
        }
    }//GEN-LAST:event_txtRUCKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || txtTelefono.getText().length() >=9){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        char c = evt.getKeyChar();
        if(Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || txtCelular.getText().length() >=9){
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCargoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panelbtnExit;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
