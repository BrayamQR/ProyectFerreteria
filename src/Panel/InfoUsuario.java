package Panel;

import Clases.Mod;
import Clases.dataUsuario;
import Clases.encrypt;
import Clases.optUsuario;
import static Form.Home.panelContent;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

public class InfoUsuario extends javax.swing.JPanel {
    optUsuario usu= new optUsuario();
    dataUsuario dusu = new dataUsuario();
    Mod modelo = new Mod();
    
    public InfoUsuario() {
        initComponents();
        VIniciales();
        this.btnUpdate.setEnabled(false);
        this.btnUpdate.setContentAreaFilled(false);
        this.btnRegister.setEnabled(true);
        this.btnRegister.setContentAreaFilled(true); 
        Form();
    }
    
    public InfoUsuario(int id, String dni, String nombre, String telefono, String email, String direccion, String usuario, String password, String confpassword,String tipo){
        initComponents();
        VIniciales();
        this.btnUpdate.setEnabled(true);
        this.btnUpdate.setContentAreaFilled(true);
        this.btnRegister.setEnabled(false);
        this.btnRegister.setContentAreaFilled(false);
        txtId.setText(""+id);
        txtDNI.setText(dni);
        txtNombre.setText(nombre);
        txtTelefono.setText(telefono);
        txtEmail.setText(email);
        txtDireccion.setText(direccion);
        txtUsuario.setText(usuario);
        txtPassword.setText(password);
        txtConfigPassword.setText(confpassword);
        cbxTipo.setSelectedItem(tipo);
        Form();
    }
    
    private void VIniciales(){
        cbxTipo.addItem("Elegir una opción");
        cbxTipo.addItem("Administrador");
        cbxTipo.addItem("Vendedor");
    }
    
    private void Form(){
        if(!txtDNI.getText().equals("Ingrese el DNI del usuario")){
            txtDNI.setForeground(Color.black);
        }
        if(!txtNombre.getText().equals("Ingrese el nombre del usuario")){
            txtNombre.setForeground(Color.black);
        }
        if(!txtTelefono.getText().equals("Ingrese el teléfono del usuario")){
            txtTelefono.setForeground(Color.black);
        }
        if(!txtEmail.getText().equals("Ingrese el email del usuario")){
            txtEmail.setForeground(Color.black);
        }
        if(!txtDireccion.getText().equals("Ingrese la dirección del usuario")){
            txtDireccion.setForeground(Color.black);
        }
        if(!txtUsuario.getText().equals("Ingrese el usuario de acceso")){
            txtUsuario.setForeground(Color.black);
        }
        if(!String.valueOf(txtPassword.getPassword()).equals("*********")){
            txtPassword.setForeground(Color.black);
        }
        if(!String.valueOf(txtConfigPassword.getPassword()).equals("*********")){
            txtConfigPassword.setForeground(Color.black);
        }
    }
    
    int getId(){
        return Integer.parseInt(txtId.getText().trim());
    }
    
    String getDNI(){
        return txtDNI.getText().trim();
    }
    
    String getNombre(){
        return modelo.modeloTexto(txtNombre.getText().trim());
    }
    
    String getDireccion(){
        return modelo.modeloTexto(txtDireccion.getText().trim());
    }
    
    String getTelefono(){
        return txtTelefono.getText().trim();
    }
    
    String getEmail(){
        return txtEmail.getText().trim();
    }
    
    String getUsuario(){
        return txtUsuario.getText().trim();
    }
    
    String getPassword(){
        return new String(txtPassword.getPassword());
    }
    String getConfPassword(){
        return new String(txtConfigPassword.getPassword());
    }
    
    String getTipo(){
        return cbxTipo.getSelectedItem().toString();
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
        txtDNI = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        txtConfigPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        panelbtnExit = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1040, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Información del Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(153, 153, 153));
        txtDNI.setText("Ingrese el DNI del usuario");
        txtDNI.setBorder(null);
        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDNIMousePressed(evt);
            }
        });
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Ingrese el email del usuario");
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
        txtNombre.setText("Ingrese el nombre del usuario");
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
        txtTelefono.setText("Ingrese el teléfono del usuario");
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

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Ingrese el usuario de acceso");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccion.setText("Ingrese la dirección del usuario");
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
        jLabel7.setText("Usuario");

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Tipo de usuario");

        cbxTipo.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipo.setBorder(null);

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

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("*********");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator6.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator7.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator7.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator9.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator9.setForeground(new java.awt.Color(0, 102, 153));

        txtConfigPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtConfigPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtConfigPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtConfigPassword.setText("*********");
        txtConfigPassword.setBorder(null);
        txtConfigPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtConfigPasswordMousePressed(evt);
            }
        });
        txtConfigPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfigPasswordActionPerformed(evt);
            }
        });
        txtConfigPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfigPasswordKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Confirmar contraseña");

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
        jLabel8.setText("Contraseña");

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
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addGap(80, 80, 80)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                        .addComponent(jSeparator7)
                        .addComponent(txtPassword)
                        .addComponent(jSeparator9)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConfigPassword)
                        .addComponent(jSeparator10)
                        .addComponent(jLabel9)
                        .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
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
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConfigPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, Short.MAX_VALUE)
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
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 50, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    void mostrarForm(){
        Usuario usuario = new Usuario();
        usuario.setSize(1100, 500);
        usuario.setLocation(0,0);
        panelContent.removeAll();
        panelContent.add(usuario,BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }
    
    void Insertar(){
        if(getDNI().equals(modelo.modeloTexto("Ingrese el DNI del usuario")) ||
                getDNI().equals("") ||
                getNombre().equals(modelo.modeloTexto("Ingrese el nombre del usuario")) ||
                getNombre().equals("") ||
                getTelefono().equals(modelo.modeloTexto("Ingrese el teléfono del usuario")) ||
                getTelefono().equals("") ||
                getEmail().equals(modelo.modeloTexto("Ingrese el email del usuario")) ||
                getEmail().equals("") ||
                getDireccion().equals(modelo.modeloTexto("Ingrese la dirección del usuario")) ||
                getDireccion().equals("") ||
                getUsuario().equals(modelo.modeloTexto("Ingrese el usuario de acceso")) ||
                getUsuario().equals("") ||
                getPassword().equals("*********") || getConfPassword().equals("*********") ||
                getPassword().equals("") || getConfPassword().equals("") ||
                getTipo().equals("Elegir una opción")){
            JOptionPane.showMessageDialog(null, "Existen campos vacíos");
        }
        else if(getDNI().length() != 8){
            JOptionPane.showMessageDialog(null, "DNI debe tener 8 caracteres");
        }
        else if (getTelefono().length() != 9){
            JOptionPane.showMessageDialog(null, "Teléfono debe tener 9 caracteres");
        }
        else if(!getPassword().equals(getConfPassword())){
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }
        else if(usu.existUser(getUsuario()) != 0){
            JOptionPane.showMessageDialog(null, "El usuario "+getUsuario()+" ya esta registrado");
        }
        else if(usu.existDNI(getDNI()) != 0){
            JOptionPane.showMessageDialog(null, "El DNI "+getDNI()+" ya resgistrado");
        }
        else if(modelo.validarEmail(getEmail())){
            String newPassword = encrypt.messageEncrypt(getPassword());
            dusu.setDNI(getDNI());
            dusu.setNombre(getNombre());
            dusu.setDireccion(getDireccion());
            dusu.setTelefono(getTelefono());
            dusu.setEmail(getEmail());
            dusu.setTipo(getTipo());
            dusu.setUsuario(getUsuario());
            dusu.setPassword(newPassword);
            usu.insertarUsuario(dusu);

            mostrarForm();
        }
        else{
            JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
        }
    }
    
    void Modificar(){
        if(getDNI().equals(modelo.modeloTexto("Ingrese el DNI del usuario")) ||
                getDNI().equals("") ||
                getNombre().equals(modelo.modeloTexto("Ingrese el nombre del usuario")) ||
                getNombre().equals("") ||
                getTelefono().equals(modelo.modeloTexto("Ingrese el teléfono del usuario")) ||
                getTelefono().equals("") ||
                getEmail().equals(modelo.modeloTexto("Ingrese el email del usuario")) ||
                getEmail().equals("") ||
                getDireccion().equals(modelo.modeloTexto("Ingrese la dirección del usuario")) ||
                getDireccion().equals("") ||
                getUsuario().equals(modelo.modeloTexto("Ingrese el usuario de acceso")) ||
                getUsuario().equals("") ||
                getPassword().equals("*********") || getConfPassword().equals("*********") ||
                getPassword().equals("") || getConfPassword().equals("") ||
                getTipo().equals("Elegir una opción")){
            JOptionPane.showMessageDialog(null, "Existen campos vacios");
        }
        else if(getDNI().length() != 8){
            JOptionPane.showMessageDialog(null, "DNI debe tener 8 caracteres");
        }
        else if (getTelefono().length() != 9){
            JOptionPane.showMessageDialog(null, "Teléfono debe tener 9 caracteres");
        }
        else if(!getPassword().equals(getConfPassword())){
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }
        else if(usu.buscarDNI(getId()).equals(getDNI())){
            if (usu.buscarUser(getId()).equals(getUsuario())){
                if(modelo.validarEmail(getEmail())){
                    String newPassword = encrypt.messageEncrypt(getPassword());
                    dusu.setId(getId());
                    dusu.setDNI(getDNI());
                    dusu.setNombre(getNombre());
                    dusu.setDireccion(getDireccion());
                    dusu.setTelefono(getTelefono());
                    dusu.setEmail(getEmail());
                    dusu.setTipo(getTipo());
                    dusu.setUsuario(getUsuario());
                    dusu.setPassword(newPassword);
                    usu.modificarUsuario(dusu);

                    mostrarForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
                }
            }
            else if (usu.existUser(getUsuario()) != 0){
                JOptionPane.showMessageDialog(null, "El usuario "+getUsuario()+" ya esta registrado");
            }
            else{
                if(modelo.validarEmail(getEmail())){
                    String newPassword = encrypt.messageEncrypt(getPassword());
                    dusu.setId(getId());
                    dusu.setDNI(getDNI());
                    dusu.setNombre(getNombre());
                    dusu.setDireccion(getDireccion());
                    dusu.setTelefono(getTelefono());
                    dusu.setEmail(getEmail());
                    dusu.setTipo(getTipo());
                    dusu.setUsuario(getUsuario());
                    dusu.setPassword(newPassword);
                    usu.modificarUsuario(dusu);

                    mostrarForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
                }
            }
        }
        else if(usu.existDNI(getDNI()) != 0){
            JOptionPane.showMessageDialog(null, "El DNI "+getDNI()+" ya esta registrado");
        }
        else{
            if (usu.buscarUser(getId()).equals(getUsuario())){
                if(modelo.validarEmail(getEmail())){
                    String newPassword = encrypt.messageEncrypt(getPassword());
                    dusu.setId(getId());
                    dusu.setDNI(getDNI());
                    dusu.setNombre(getNombre());
                    dusu.setDireccion(getDireccion());
                    dusu.setTelefono(getTelefono());
                    dusu.setEmail(getEmail());
                    dusu.setTipo(getTipo());
                    dusu.setUsuario(getUsuario());
                    dusu.setPassword(newPassword);
                    usu.modificarUsuario(dusu);

                    mostrarForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
                }
            }
            else if (usu.existUser(getUsuario()) != 0){
                JOptionPane.showMessageDialog(null, "El usuario "+getUsuario()+" ya esta registrado");
            }
            else{
                if(modelo.validarEmail(getEmail())){
                    String newPassword = encrypt.messageEncrypt(getPassword());
                    dusu.setId(getId());
                    dusu.setDNI(getDNI());
                    dusu.setNombre(getNombre());
                    dusu.setDireccion(getDireccion());
                    dusu.setTelefono(getTelefono());
                    dusu.setEmail(getEmail());
                    dusu.setTipo(getTipo());
                    dusu.setUsuario(getUsuario());
                    dusu.setPassword(newPassword);
                    usu.modificarUsuario(dusu);

                    mostrarForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email no aceptado (Formato: ejemplo@ejemplo.com)");
                }
            }
        }
    }
    
    private void txtConfigPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfigPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfigPasswordActionPerformed

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        btnRegister.setBackground(new Color(1,55,150));
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Modificar();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMousePressed
        if(txtDNI.getText().equals("Ingrese el DNI del usuario")){
            txtDNI.setText("");
            txtDNI.setForeground(Color.black);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del usuario");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del usuario");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del usuario");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del usuario");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese el usuario de acceso");
            txtUsuario.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("*********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtConfigPassword.getPassword()).isEmpty()){
            txtConfigPassword.setText("*********");
            txtConfigPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtDNIMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if(txtNombre.getText().equals("Ingrese el nombre del usuario")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if(txtDNI.getText().isEmpty()){
            txtDNI.setText("Ingrese el DNI del usuario");
            txtDNI.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del usuario");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del usuario");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del usuario");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese el usuario de acceso");
            txtUsuario.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("*********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtConfigPassword.getPassword()).isEmpty()){
            txtConfigPassword.setText("*********");
            txtConfigPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        if(txtTelefono.getText().equals("Ingrese el teléfono del usuario")){
            txtTelefono.setText("");
            txtTelefono.setForeground(Color.black);
        }
        if(txtDNI.getText().isEmpty()){
            txtDNI.setText("Ingrese el DNI del usuario");
            txtDNI.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del usuario");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del usuario");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del usuario");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese el usuario de acceso");
            txtUsuario.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("*********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtConfigPassword.getPassword()).isEmpty()){
            txtConfigPassword.setText("*********");
            txtConfigPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        if(txtEmail.getText().equals("Ingrese el email del usuario")){
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
        }
        if(txtDNI.getText().isEmpty()){
            txtDNI.setText("Ingrese el DNI del usuario");
            txtDNI.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del usuario");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del usuario");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del usuario");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese el usuario de acceso");
            txtUsuario.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("*********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtConfigPassword.getPassword()).isEmpty()){
            txtConfigPassword.setText("*********");
            txtConfigPassword.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_txtEmailMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        if(txtDireccion.getText().equals("Ingrese la dirección del usuario")){
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.black);
        }
        if(txtDNI.getText().isEmpty()){
            txtDNI.setText("Ingrese el DNI del usuario");
            txtDNI.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del usuario");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del usuario");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del usuario");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese el usuario de acceso");
            txtUsuario.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("*********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtConfigPassword.getPassword()).isEmpty()){
            txtConfigPassword.setText("*********");
            txtConfigPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese el usuario de acceso")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if(txtDNI.getText().isEmpty()){
            txtDNI.setText("Ingrese el DNI del usuario");
            txtDNI.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del usuario");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del usuario");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del usuario ");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del usuario");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("*********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtConfigPassword.getPassword()).isEmpty()){
            txtConfigPassword.setText("*********");
            txtConfigPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        if(String.valueOf(txtPassword.getPassword()).equals("*********")){
            txtPassword.setText("");
            txtPassword.setForeground(Color.black);
        }
        if(txtDNI.getText().isEmpty()){
            txtDNI.setText("Ingrese el DNI del usuario");
            txtDNI.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del usuario");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del usuario");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del usuario");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del usuario");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese el usuario de acceso");
            txtUsuario.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtConfigPassword.getPassword()).isEmpty()){
            txtConfigPassword.setText("*********");
            txtConfigPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtPasswordMousePressed

    private void txtConfigPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfigPasswordMousePressed
        if(String.valueOf(txtConfigPassword.getPassword()).equals("*********")){
            txtConfigPassword.setText("");
            txtConfigPassword.setForeground(Color.black);
        }
        if(txtDNI.getText().isEmpty()){
            txtDNI.setText("Ingrese el DNI del usuario");
            txtDNI.setForeground(new Color(153,153,153));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese el nombre del usuario");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().isEmpty()){
            txtEmail.setText("Ingrese el email del usuario");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Ingrese el teléfono del usuario");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese la dirección del usuario");
            txtDireccion.setForeground(new Color(153,153,153));
        }
        if(txtUsuario.getText().isEmpty()){
            txtPassword.setText("Ingrese el usuario de acceso");
            txtPassword.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("*********");
            txtPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtConfigPasswordMousePressed

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

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || txtDNI.getText().length() >=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || txtTelefono.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtConfigPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfigPasswordKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetterOrDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtConfigPasswordKeyTyped

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed

    }//GEN-LAST:event_txtDNIKeyPressed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        char c = evt.getKeyChar();
        if(Character.isSpaceChar(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPasswordField txtConfigPassword;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
