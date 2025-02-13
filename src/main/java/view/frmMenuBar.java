/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Pagos.CtrPagos;
import controller.Telecomunicaciones.CtrTelecomunicaciones;
import controller.Usuarios.CtrUsuario;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.PagoDb;

/**
 *
 * @author RIBZ
 */
public class FrmMenuBar extends javax.swing.JFrame {

     private CardLayout cardLayout;
     private PagoDb pagodb;// Declaración a nivel de clase

    public FrmMenuBar() {
        initComponents();
            this.setSize(1280,720);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializacionItemsMenuBar();
        cardLayout = (CardLayout) PanelPrincipal.getLayout();
        new CtrUsuario(this);
        new CtrTelecomunicaciones(this);
        new CtrPagos(this,pagodb);
    }

    private void inicializacionItemsMenuBar() {
       
        
        jMenuUsuario = new javax.swing.JMenu();        
        jMenuTelecomunicaciones = new javax.swing.JMenu();
        jMenuPagos = new javax.swing.JMenu();
        jMenuInmuebles = new javax.swing.JMenu();
        jMenuEspaciosComunes = new javax.swing.JMenu();
        jMenuCheckIn = new javax.swing.JMenu();
        
        jMenuIUGuardar = new javax.swing.JMenuItem();
        jMenuIUBuscar = new javax.swing.JMenuItem();
        jMenuIUModificar = new javax.swing.JMenuItem();
        jMenuIUEliminar = new javax.swing.JMenuItem();
        
        jMenuITGuardar = new javax.swing.JMenuItem();
        jMenuITBuscar = new javax.swing.JMenuItem();
        jMenuITModificar = new javax.swing.JMenuItem();
        jMenuITEliminar = new javax.swing.JMenuItem();

        jMenuIPGuardar = new javax.swing.JMenuItem();
        jMenuIPBuscar = new javax.swing.JMenuItem();
        jMenuIPModificar = new javax.swing.JMenuItem();
        jMenuIPEliminar = new javax.swing.JMenuItem();

        jMenuIIGuardar = new javax.swing.JMenuItem();
        jMenuIIBuscar = new javax.swing.JMenuItem();
        jMenuIIModificar = new javax.swing.JMenuItem();
        jMenuIIEliminar = new javax.swing.JMenuItem();

        jMenuIECGuardar = new javax.swing.JMenuItem();
        jMenuIECBuscar = new javax.swing.JMenuItem();
        jMenuIECModificar = new javax.swing.JMenuItem();
        jMenuIECEliminar = new javax.swing.JMenuItem();

        jMenuICIGuardar = new javax.swing.JMenuItem();
        jMenuICIBuscar = new javax.swing.JMenuItem();
        jMenuICIModificar = new javax.swing.JMenuItem();
        jMenuICIEliminar = new javax.swing.JMenuItem();

        
        jMenuUsuario.setText("Usuario");
        jMenuUsuario.setIcon(obtenerImagen(logo_Usuario));
        jMenuUsuario.setOpaque(true);
        jMenuUsuario.setBackground(mColorFondoMenu);
        jMenuUsuario.setForeground(Color.WHITE);
        jMenuUsuario.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 50)); 
        //MenuItems     
        jMenuIUGuardar.setText("Guardar");
        jMenuIUBuscar.setText("Buscar");
        jMenuIUModificar.setText("Modificar");
        jMenuIUEliminar.setText("Eliminar");
        
        //MenuTelecomunicaciones
        jMenuTelecomunicaciones.setText("Telecomunicaciones");
        jMenuTelecomunicaciones.setIcon(obtenerImagen(logo_Usuario));
        jMenuTelecomunicaciones.setOpaque(true);
        jMenuTelecomunicaciones.setBackground(mColorFondoMenu);
        jMenuTelecomunicaciones.setForeground(Color.WHITE);
        jMenuTelecomunicaciones.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 50)); 
       
        jMenuITGuardar.setText("Guardar");
        jMenuITBuscar.setText("Buscar");
        jMenuITModificar.setText("Modificar");
        jMenuITEliminar.setText("Eliminar");
        
        //MenuPagos
        jMenuPagos.setText("Pagos");
        jMenuPagos.setIcon(obtenerImagen(logo_Usuario));
        jMenuPagos.setOpaque(true);
        jMenuPagos.setBackground(mColorFondoMenu);
        jMenuPagos.setForeground(Color.WHITE);
        jMenuPagos.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 50)); 
        
        jMenuIPGuardar.setText("Guardar");
        jMenuIPBuscar.setText("Buscar");
        jMenuIPModificar.setText("Modificar");
        jMenuIPEliminar.setText("Eliminar");
        
        //MenuInmuebles
        jMenuInmuebles.setText("Inmuebles");
        jMenuInmuebles.setIcon(obtenerImagen(logo_Usuario));
        jMenuInmuebles.setOpaque(true);
        jMenuInmuebles.setBackground(mColorFondoMenu);
        jMenuInmuebles.setForeground(Color.WHITE);
        jMenuInmuebles.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 50)); 
        
        jMenuIIGuardar.setText("Guardar");
        jMenuIIBuscar.setText("Buscar");
        jMenuIIModificar.setText("Modificar");
        jMenuIIEliminar.setText("Eliminar");
        
        //MenuEspaciosComunes
        jMenuEspaciosComunes.setText("Espacios Comunes");
        jMenuEspaciosComunes.setIcon(obtenerImagen(logo_Usuario));
        jMenuEspaciosComunes.setOpaque(true);
        jMenuEspaciosComunes.setBackground(mColorFondoMenu);
        jMenuEspaciosComunes.setForeground(Color.WHITE);
        jMenuEspaciosComunes.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 50)); 
        
        jMenuIECGuardar.setText("Guardar");
        jMenuIECBuscar.setText("Buscar");
        jMenuIECModificar.setText("Modificar");
        jMenuIECEliminar.setText("Eliminar");
        
        //MenuEspaciosComunes
        jMenuCheckIn.setText("Check-In");
        jMenuCheckIn.setIcon(obtenerImagen(logo_Usuario));
        jMenuCheckIn.setOpaque(true);
        jMenuCheckIn.setBackground(mColorFondoMenu);
        jMenuCheckIn.setForeground(Color.WHITE);
        jMenuCheckIn.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 50)); 
        
        jMenuICIGuardar.setText("Guardar");
        jMenuICIBuscar.setText("Buscar");
        jMenuICIModificar.setText("Modificar");
        jMenuICIEliminar.setText("Eliminar");
        
        //Botones
        
        //Usuarios
        jMenuUsuario.addActionListener((ActionEvent e) -> {
            cambiarPanel("Usuarios");
        });
        
        jMenuUsuario.add(jMenuIUGuardar);
        jMenuUsuario.add(jMenuIUBuscar);
        jMenuUsuario.add(jMenuIUModificar);
        jMenuUsuario.add(jMenuIUEliminar);
        
        //Telecomunicaciones
        jMenuTelecomunicaciones.addActionListener((ActionEvent e) -> {
            cambiarPanel("Telecomunicaciones");
        });
        
        jMenuTelecomunicaciones.add(jMenuITGuardar);
        jMenuTelecomunicaciones.add(jMenuITBuscar);
        jMenuTelecomunicaciones.add(jMenuITModificar);
        jMenuTelecomunicaciones.add(jMenuITEliminar);
        
        //Pagos
        jMenuPagos.addActionListener((ActionEvent e) -> {
            cambiarPanel("Pagos");
        });
        
        jMenuPagos.add(jMenuIPGuardar);
        jMenuPagos.add(jMenuIPBuscar);
        jMenuPagos.add(jMenuIPModificar);
        jMenuPagos.add(jMenuIPEliminar);
        
        //desabilitar paneles
        PanelPagosEfectivo.setVisible(false);
        PanelPagosTarjeta.setVisible(false);
        txtCodigoTransferencia.setVisible(false);
        lblCodigoTransferencia.setVisible(false);
        
        //Inmuebles
        jMenuInmuebles.addActionListener((ActionEvent e) -> {
            cambiarPanel("Inmuebles");
        });
        
        jMenuInmuebles.add(jMenuIIGuardar); 
        jMenuInmuebles.add(jMenuIIBuscar); 
        jMenuInmuebles.add(jMenuIIModificar); 
        jMenuInmuebles.add(jMenuIIEliminar); 
        
        //Espacios Comunes
        jMenuEspaciosComunes.addActionListener((ActionEvent e) -> {
            cambiarPanel("Espacios Comunes");
        });
        
        jMenuEspaciosComunes.add(jMenuIECGuardar); 
        jMenuEspaciosComunes.add(jMenuIECBuscar); 
        jMenuEspaciosComunes.add(jMenuIECModificar); 
        jMenuEspaciosComunes.add(jMenuIECEliminar); 
        
        //Check-In
        jMenuCheckIn.addActionListener((ActionEvent e) -> {
            cambiarPanel("Check In"); 
        });
        
        jMenuCheckIn.add(jMenuICIGuardar); 
        jMenuCheckIn.add(jMenuICIBuscar); 
        jMenuCheckIn.add(jMenuICIModificar); 
        jMenuCheckIn.add(jMenuICIEliminar); 
       
        //Modulos en el Menu Bar
        mbMenuBar.add(jMenuUsuario);
        mbMenuBar.add(jMenuTelecomunicaciones);
        mbMenuBar.add(jMenuPagos);
        mbMenuBar.add(jMenuInmuebles);
        mbMenuBar.add(jMenuEspaciosComunes);
        mbMenuBar.add(jMenuCheckIn);
        
        mbMenuBar.setPreferredSize(new java.awt.Dimension(this.getWidth(), 50)); // Ancho igual al frame y altura 50
        // Crear una nueva fuente
        /*java.awt.Font font = new java.awt.Font("Arial", java.awt.Font.BOLD, 16); // Tamaño de fuente 14 y estilo negrita

        // Establecer la fuente para cada JMenu
        jMenuUsuario.setFont(font);
        java.awt.Font font1 = new java.awt.Font("Arial", java.awt.Font.ROMAN_BASELINE, 16); // Tamaño de fuente 14 y estilo negrita
        jMenuIUGuardar.setFont(font1);
        jMenuIUBuscar.setFont(font1);
        jMenuIUModificar.setFont(font1);
        jMenuIUEliminar.setFont(font1);*/

    }

    private void cambiarPanel(String Panel) {
        cardLayout.show(PanelPrincipal, Panel);
    }

    private Icon obtenerImagen(String ruta){
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(30, 30, 0));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelUsuarios = new javax.swing.JPanel();
        PanelGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanerBuscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelModificar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PanelTelecomunicaciones = new javax.swing.JPanel();
        PanelGuardarT = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        PanelBuscarT = new javax.swing.JPanel();
        PanelModificarT = new javax.swing.JPanel();
        PanelEliminarT = new javax.swing.JPanel();
        PanelPagos = new javax.swing.JPanel();
        PanelGuardarP = new javax.swing.JPanel();
        txtCedulaPG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PanelPagosEfectivo = new javax.swing.JPanel();
        txtMontoPG = new javax.swing.JTextField();
        txtFechaPG = new javax.swing.JTextField();
        comboTipoPG = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDescripcionPG = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buttonCrearPG = new javax.swing.JToggleButton();
        lblCodigoTransferencia = new javax.swing.JLabel();
        txtCodigoTransferencia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cmbMetodoPago = new javax.swing.JComboBox<>();
        PanelPagosTarjeta = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNumeroTarjeta = new javax.swing.JTextField();
        txtFechaCaducidad = new javax.swing.JTextField();
        txtCvv = new javax.swing.JTextField();
        txtTitularTarjeta = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();
        PanelBuscarP = new javax.swing.JPanel();
        txtBuscarP = new javax.swing.JTextField();
        buttonBuscarP = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        PanelModificarP = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCedulaPM = new javax.swing.JTextField();
        txtMontoPM = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFechaPM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboTipoPM = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtDescripcionPM = new javax.swing.JTextField();
        buttonModifiarP = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        txtIdPM = new javax.swing.JTextField();
        buttonBuscarPM = new javax.swing.JToggleButton();
        PanelEliminarP = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtIdPE = new javax.swing.JTextField();
        buttonBuscarPE = new javax.swing.JToggleButton();
        PanelInmuebles = new javax.swing.JPanel();
        PanelGuardarI = new javax.swing.JPanel();
        PanelBuscarI = new javax.swing.JPanel();
        PanelModificarI = new javax.swing.JPanel();
        PanelEliminarI = new javax.swing.JPanel();
        mbMenuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(128, 105, 70));
        PanelPrincipal.setLayout(new java.awt.CardLayout());

        PanelUsuarios.setBackground(new java.awt.Color(80, 200, 120));
        PanelUsuarios.setLayout(null);
        PanelPrincipal.add(PanelUsuarios, "card2");

        PanelGuardar.setBackground(new java.awt.Color(89, 116, 112));
        PanelGuardar.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Source Code Pro Light", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guardar ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelGuardar.add(jLabel1);
        jLabel1.setBounds(440, 270, 390, 80);

        PanelPrincipal.add(PanelGuardar, "card3");

        PanerBuscar.setBackground(new java.awt.Color(85, 107, 47));
        PanerBuscar.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Source Code Pro Light", 0, 48)); // NOI18N
        jLabel2.setText("Buscar");
        PanerBuscar.add(jLabel2);
        jLabel2.setBounds(520, 240, 320, 190);

        PanelPrincipal.add(PanerBuscar, "card2");

        PanelModificar.setBackground(new java.awt.Color(96, 128, 117));
        PanelModificar.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Source Code Pro ExtraLight", 0, 48)); // NOI18N
        jLabel3.setText("Modificar");
        PanelModificar.add(jLabel3);
        jLabel3.setBounds(480, 240, 310, 150);

        PanelPrincipal.add(PanelModificar, "card5");

        PanelEliminar.setBackground(new java.awt.Color(24, 60, 34));
        PanelEliminar.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Source Code Pro ExtraLight", 0, 48)); // NOI18N
        jLabel4.setText("Eliminar");
        PanelEliminar.add(jLabel4);
        jLabel4.setBounds(530, 260, 390, 160);

        PanelPrincipal.add(PanelEliminar, "card6");

        PanelTelecomunicaciones.setBackground(new java.awt.Color(0, 153, 153));
        PanelTelecomunicaciones.setLayout(null);
        PanelPrincipal.add(PanelTelecomunicaciones, "card7");

        PanelGuardarT.setBackground(new java.awt.Color(51, 255, 51));
        PanelGuardarT.setLayout(null);

        btnGuardar.setText("jButton1");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        PanelGuardarT.add(btnGuardar);
        btnGuardar.setBounds(540, 120, 75, 23);

        PanelPrincipal.add(PanelGuardarT, "card8");
        PanelPrincipal.add(PanelBuscarT, "card9");
        PanelPrincipal.add(PanelModificarT, "card10");
        PanelPrincipal.add(PanelEliminarT, "card11");
        PanelPrincipal.add(PanelPagos, "card12");

        jLabel5.setText("Cedula");

        PanelPagosEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro del Pago"));
        PanelPagosEfectivo.setToolTipText("");
        PanelPagosEfectivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelPagosEfectivo.add(txtMontoPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, -1));

        txtFechaPG.setText("AAAA-MM-DD");
        PanelPagosEfectivo.add(txtFechaPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, -1));

        comboTipoPG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pago", "multa" }));
        PanelPagosEfectivo.add(comboTipoPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel6.setText("Monto");
        PanelPagosEfectivo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));

        jLabel7.setText("Fecha");
        PanelPagosEfectivo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));

        jLabel8.setText("Tipo");
        PanelPagosEfectivo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, -1));

        txtDescripcionPG.setText("Ingrese la descripcion");
        PanelPagosEfectivo.add(txtDescripcionPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 440, 90));

        jLabel9.setText("Descripcion");
        PanelPagosEfectivo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, -1));

        buttonCrearPG.setText("Crear pago");
        buttonCrearPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearPGActionPerformed(evt);
            }
        });
        PanelPagosEfectivo.add(buttonCrearPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 200, -1));

        lblCodigoTransferencia.setText("Codito Transferencia");
        PanelPagosEfectivo.add(lblCodigoTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        PanelPagosEfectivo.add(txtCodigoTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, -1));

        jLabel17.setText("Método de Pago");

        cmbMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de crédito", "Transferencia Bancaria", "Efectivo" }));
        cmbMetodoPago.setSelectedIndex(-1);
        cmbMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMetodoPagoActionPerformed(evt);
            }
        });

        PanelPagosTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Validar tarjeta"));
        PanelPagosTarjeta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("FORMULARIO PAGO CON TARJETA");
        PanelPagosTarjeta.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, -1));

        jLabel19.setText("NÚMERO DE LA TARJETA");
        PanelPagosTarjeta.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel20.setText("FECHA DE CADUCIDAD");
        PanelPagosTarjeta.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));

        jLabel21.setText("TITULAR DE LA TARJETA");
        PanelPagosTarjeta.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 30));

        jLabel22.setText("CVV");
        PanelPagosTarjeta.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 30, -1));

        txtNumeroTarjeta.setText("XXXXXXXXXXXXXXXX");
        txtNumeroTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroTarjetaFocusGained(evt);
            }
        });
        PanelPagosTarjeta.add(txtNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 210, -1));

        txtFechaCaducidad.setText("MM/AA");
        txtFechaCaducidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaCaducidadFocusGained(evt);
            }
        });
        PanelPagosTarjeta.add(txtFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 100, -1));

        txtCvv.setText("XXX");
        txtCvv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCvvFocusGained(evt);
            }
        });
        PanelPagosTarjeta.add(txtCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        txtTitularTarjeta.setText("NOMBRE APELLIDO");
        txtTitularTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTitularTarjetaFocusGained(evt);
            }
        });
        PanelPagosTarjeta.add(txtTitularTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, 30));

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        PanelPagosTarjeta.add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, 30));

        javax.swing.GroupLayout PanelGuardarPLayout = new javax.swing.GroupLayout(PanelGuardarP);
        PanelGuardarP.setLayout(PanelGuardarPLayout);
        PanelGuardarPLayout.setHorizontalGroup(
            PanelGuardarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGuardarPLayout.createSequentialGroup()
                .addGroup(PanelGuardarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGuardarPLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(PanelPagosEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelPagosTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelGuardarPLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCedulaPG, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelGuardarPLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cmbMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        PanelGuardarPLayout.setVerticalGroup(
            PanelGuardarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGuardarPLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PanelGuardarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedulaPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelGuardarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(cmbMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelGuardarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGuardarPLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelPagosEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelGuardarPLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PanelPagosTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelGuardarP, "card13");

        PanelBuscarP.setLayout(null);

        txtBuscarP.setText("Ingrese un numero de cedula");
        PanelBuscarP.add(txtBuscarP);
        txtBuscarP.setBounds(270, 50, 290, 22);

        buttonBuscarP.setText("Buscar");
        PanelBuscarP.add(buttonBuscarP);
        buttonBuscarP.setBounds(140, 50, 120, 23);

        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaP);

        PanelBuscarP.add(jScrollPane1);
        jScrollPane1.setBounds(120, 80, 1040, 402);

        PanelPrincipal.add(PanelBuscarP, "card14");

        PanelModificarP.setLayout(null);

        jLabel10.setText("Cedula");
        PanelModificarP.add(jLabel10);
        jLabel10.setBounds(270, 70, 60, 30);
        PanelModificarP.add(txtCedulaPM);
        txtCedulaPM.setBounds(340, 70, 430, 22);
        PanelModificarP.add(txtMontoPM);
        txtMontoPM.setBounds(350, 120, 110, 22);

        jLabel11.setText("Monto");
        PanelModificarP.add(jLabel11);
        jLabel11.setBounds(270, 120, 60, 16);

        jLabel12.setText("Fecha");
        PanelModificarP.add(jLabel12);
        jLabel12.setBounds(270, 170, 60, 16);

        txtFechaPM.setText("AAAA-MM-DD");
        PanelModificarP.add(txtFechaPM);
        txtFechaPM.setBounds(350, 170, 100, 22);

        jLabel13.setText("Tipo");
        PanelModificarP.add(jLabel13);
        jLabel13.setBounds(270, 210, 50, 16);

        comboTipoPM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pago", "multa" }));
        PanelModificarP.add(comboTipoPM);
        comboTipoPM.setBounds(350, 210, 72, 22);

        jLabel14.setText("Descripcion");
        PanelModificarP.add(jLabel14);
        jLabel14.setBounds(260, 290, 70, 16);

        txtDescripcionPM.setText("Ingrese la descripcion");
        PanelModificarP.add(txtDescripcionPM);
        txtDescripcionPM.setBounds(340, 260, 440, 90);

        buttonModifiarP.setText("Guardar cambios");
        PanelModificarP.add(buttonModifiarP);
        buttonModifiarP.setBounds(390, 390, 240, 23);

        jLabel15.setText("Id");
        PanelModificarP.add(jLabel15);
        jLabel15.setBounds(270, 40, 10, 16);

        txtIdPM.setText("Ingrese el id del pago a modificar");
        txtIdPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPMActionPerformed(evt);
            }
        });
        PanelModificarP.add(txtIdPM);
        txtIdPM.setBounds(340, 40, 200, 22);

        buttonBuscarPM.setText("Buscar");
        PanelModificarP.add(buttonBuscarPM);
        buttonBuscarPM.setBounds(570, 40, 200, 23);

        PanelPrincipal.add(PanelModificarP, "card15");

        PanelEliminarP.setLayout(null);

        jLabel16.setText("Ingrese el id del pago a eliminar");
        PanelEliminarP.add(jLabel16);
        jLabel16.setBounds(200, 100, 180, 30);

        txtIdPE.setText("id");
        PanelEliminarP.add(txtIdPE);
        txtIdPE.setBounds(390, 110, 71, 22);

        buttonBuscarPE.setText("Eliminar");
        PanelEliminarP.add(buttonBuscarPE);
        buttonBuscarPE.setBounds(490, 110, 160, 23);

        PanelPrincipal.add(PanelEliminarP, "card16");
        PanelPrincipal.add(PanelInmuebles, "card17");
        PanelPrincipal.add(PanelGuardarI, "card18");
        PanelPrincipal.add(PanelBuscarI, "card19");
        PanelPrincipal.add(PanelModificarI, "card20");
        PanelPrincipal.add(PanelEliminarI, "card21");

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);
        setJMenuBar(mbMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPMActionPerformed

    private void buttonCrearPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearPGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCrearPGActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValidarActionPerformed

    private void cmbMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMetodoPagoActionPerformed

    private void txtNumeroTarjetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroTarjetaFocusGained
        // TODO add your handling code here:
        txtNumeroTarjeta.setText("");
    }//GEN-LAST:event_txtNumeroTarjetaFocusGained

    private void txtFechaCaducidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaCaducidadFocusGained
        // TODO add your handling code here:
        txtFechaCaducidad.setText("");
    }//GEN-LAST:event_txtFechaCaducidadFocusGained

    private void txtCvvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCvvFocusGained
        // TODO add your handling code here:
        txtCvv.setText("");
    }//GEN-LAST:event_txtCvvFocusGained

    private void txtTitularTarjetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitularTarjetaFocusGained
        // TODO add your handling code here:
        txtTitularTarjeta.setText("");
    }//GEN-LAST:event_txtTitularTarjetaFocusGained


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FrmMenuBar().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBuscarI;
    private javax.swing.JPanel PanelBuscarP;
    private javax.swing.JPanel PanelBuscarT;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelEliminarI;
    private javax.swing.JPanel PanelEliminarP;
    private javax.swing.JPanel PanelEliminarT;
    public javax.swing.JPanel PanelGuardar;
    private javax.swing.JPanel PanelGuardarI;
    private javax.swing.JPanel PanelGuardarP;
    private javax.swing.JPanel PanelGuardarT;
    private javax.swing.JPanel PanelInmuebles;
    private javax.swing.JPanel PanelModificar;
    private javax.swing.JPanel PanelModificarI;
    private javax.swing.JPanel PanelModificarP;
    private javax.swing.JPanel PanelModificarT;
    private javax.swing.JPanel PanelPagos;
    public javax.swing.JPanel PanelPagosEfectivo;
    public javax.swing.JPanel PanelPagosTarjeta;
    public javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTelecomunicaciones;
    public javax.swing.JPanel PanelUsuarios;
    private javax.swing.JPanel PanerBuscar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnValidar;
    public javax.swing.JToggleButton buttonBuscarP;
    public javax.swing.JToggleButton buttonBuscarPE;
    public javax.swing.JToggleButton buttonBuscarPM;
    public javax.swing.JToggleButton buttonCrearPG;
    public javax.swing.JToggleButton buttonModifiarP;
    public javax.swing.JComboBox<String> cmbMetodoPago;
    public javax.swing.JComboBox<String> comboTipoPG;
    public javax.swing.JComboBox<String> comboTipoPM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblCodigoTransferencia;
    private javax.swing.JMenuBar mbMenuBar;
    public javax.swing.JTable tablaP;
    public javax.swing.JTextField txtBuscarP;
    public javax.swing.JTextField txtCedulaPG;
    public javax.swing.JTextField txtCedulaPM;
    public javax.swing.JTextField txtCodigoTransferencia;
    public javax.swing.JTextField txtCvv;
    public javax.swing.JTextField txtDescripcionPG;
    public javax.swing.JTextField txtDescripcionPM;
    public javax.swing.JTextField txtFechaCaducidad;
    public javax.swing.JTextField txtFechaPG;
    public javax.swing.JTextField txtFechaPM;
    public javax.swing.JTextField txtIdPE;
    public javax.swing.JTextField txtIdPM;
    public javax.swing.JTextField txtMontoPG;
    public javax.swing.JTextField txtMontoPM;
    public javax.swing.JTextField txtNumeroTarjeta;
    public javax.swing.JTextField txtTitularTarjeta;
    // End of variables declaration//GEN-END:variables
 // Declaración de los menús
    public javax.swing.JMenu jMenuUsuario;
    public javax.swing.JMenuItem jMenuIUGuardar;
    public javax.swing.JMenuItem jMenuIUBuscar;
    public javax.swing.JMenuItem jMenuIUModificar;
    public javax.swing.JMenuItem jMenuIUEliminar;
    
    public javax.swing.JMenu jMenuTelecomunicaciones;
    public javax.swing.JMenuItem jMenuITGuardar;
    public javax.swing.JMenuItem jMenuITEliminar;
    public javax.swing.JMenuItem jMenuITModificar;
    public javax.swing.JMenuItem jMenuITBuscar;
    
    public javax.swing.JMenu jMenuPagos;
    public javax.swing.JMenuItem jMenuIPGuardar;
    public javax.swing.JMenuItem jMenuIPEliminar;
    public javax.swing.JMenuItem jMenuIPModificar;
    public javax.swing.JMenuItem jMenuIPBuscar;
    
    public javax.swing.JMenu jMenuInmuebles;
    public javax.swing.JMenuItem jMenuIIGuardar;
    public javax.swing.JMenuItem jMenuIIBuscar;
    public javax.swing.JMenuItem jMenuIIEliminar;
    public javax.swing.JMenuItem jMenuIIModificar;

   
    public javax.swing.JMenu jMenuEspaciosComunes;
    public javax.swing.JMenuItem jMenuIECGuardar;
    public javax.swing.JMenuItem jMenuIECBuscar;
    public javax.swing.JMenuItem jMenuIECEliminar;
    public javax.swing.JMenuItem jMenuIECModificar;
   
    public javax.swing.JMenu jMenuCheckIn;
    public javax.swing.JMenuItem jMenuICIGuardar;
    public javax.swing.JMenuItem jMenuICIBuscar;
    public javax.swing.JMenuItem jMenuICIEliminar;
    public javax.swing.JMenuItem jMenuICIModificar;
    
    public String logo_Usuario= "/imagenes/clientes.png";

   
    public Color mColorFondoMenu= new Color(47, 79, 79);


    // End of variables declaration         
}