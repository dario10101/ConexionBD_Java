package Presentacion;

import AccesoADatos.Conexion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Negocio.ControladorBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Ruben Dario
 */

public class Principal extends javax.swing.JFrame {
    
    //atributos
    private ControladorBD atrBDatos;
    private Conexion atrConexion;   
    

    public Principal() {
        initComponents();
        atrConexion = new Conexion();
        atrBDatos = new ControladorBD();
        setResizable(false);
        setLocationRelativeTo(null);        
        deshabilitarOpcionesUsuario();
        btnDesconectar.setVisible(false);
        setTitle("Diccionario de Datos");          
        
        DefaultMutableTreeNode raiz= new DefaultMutableTreeNode("Raiz");        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jpanel_editTabla = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnCrearTabla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblresultados = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        txtPuerto = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnDesconectar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        datotabla = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        info = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("SALIR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultas al Diccionario de Datos");
        setBackground(new java.awt.Color(255, 255, 255));

        jpanel_editTabla.setBackground(new java.awt.Color(0, 153, 153));
        jpanel_editTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("   Opciones   "));
        jpanel_editTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpanel_editTabla.setMaximumSize(new java.awt.Dimension(618, 160));
        jpanel_editTabla.setMinimumSize(new java.awt.Dimension(618, 160));
        jpanel_editTabla.setPreferredSize(new java.awt.Dimension(618, 160));

        btnInsertar.setText("Insertar Datos");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnCrearTabla.setText("Crear Tabla");
        btnCrearTabla.setToolTipText("");
        btnCrearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_editTablaLayout = new javax.swing.GroupLayout(jpanel_editTabla);
        jpanel_editTabla.setLayout(jpanel_editTablaLayout);
        jpanel_editTablaLayout.setHorizontalGroup(
            jpanel_editTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_editTablaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnCrearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_editTablaLayout.setVerticalGroup(
            jpanel_editTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_editTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel_editTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearTabla))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        tblresultados.setBackground(new java.awt.Color(102, 255, 204));
        tblresultados.setForeground(new java.awt.Color(51, 153, 0));
        tblresultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblresultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblresultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblresultados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setText("Host:");

        jLabel3.setText("Puerto:");

        jLabel4.setText("Contraseña:");

        txtHost.setBackground(new java.awt.Color(102, 255, 204));
        txtHost.setText("localhost");

        txtPuerto.setBackground(new java.awt.Color(102, 255, 204));
        txtPuerto.setText("1521");

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(102, 255, 204));
        txtUsuario.setText("userDC");

        jLabel6.setText("Usuario:");

        txtContraseña.setBackground(new java.awt.Color(102, 255, 204));
        txtContraseña.setText("oracle");

        btnDesconectar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDesconectar.setText("Desconectar");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPuerto)
                        .addComponent(txtHost, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addComponent(txtContraseña))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informacion de la base de datos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(204, 255, 255));

        datotabla.setBackground(new java.awt.Color(102, 255, 204));
        datotabla.setForeground(new java.awt.Color(51, 153, 0));
        datotabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(datotabla);

        info.setBackground(new java.awt.Color(102, 255, 204));
        info.setForeground(new java.awt.Color(51, 153, 0));
        info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(info);

        jLabel5.setText("Datos acerca de la tabla:");

        jLabel1.setText("Registros de la tabla:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleName("datos tabla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanel_editTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jpanel_editTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpanel_editTabla.getAccessibleContext().setAccessibleName("OpcionesTabla  ");
        jTabbedPane1.getAccessibleContext().setAccessibleName("conectar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        
        try {
            atrBDatos.cerrarConexion();
            atrBDatos = new ControladorBD();
            habilitarPanelPrincipal();            
            deshabilitarOpcionesUsuario();       
           
        } catch (Exception e) {
            Logger.getLogger("Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        atrConexion.setUsuario(this.txtUsuario.getText());
        atrConexion.setHost(this.txtHost.getText());
        atrConexion.setPuerto(Integer.parseInt(this.txtPuerto.getText()));
        atrConexion.setPassword(this.txtContraseña.getText());
        if (atrBDatos.nuevaConexion(atrConexion))
        {
            try {
                deshabilitarPanelPrincipal();
                habilitarOpcionesUsuario();
                atrConexion = new Conexion();
                mostrarListaTablas();               
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error al crear conexión!");
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void tblresultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblresultadosMouseClicked
        int seleccion = tblresultados.getSelectedRow();
        
        String tabla= String.valueOf(tblresultados.getValueAt(seleccion, 0));
        
        mostrarDatosTabla(tabla);
        mostrarInfoTabla(atrBDatos.metadatosTabla(tabla));       
    }//GEN-LAST:event_tblresultadosMouseClicked

    private void btnCrearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTablaActionPerformed
        Principal p = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTabla(p,atrBDatos).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnCrearTablaActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        int itemTabla = tblresultados.getSelectedRow();
        if(itemTabla >= 0){
            int seleccion = tblresultados.getSelectedRow();
            String tabla= String.valueOf(tblresultados.getValueAt(seleccion, 0));
            
            Principal p = this;
            
            ResultSet rs;
            rs = atrBDatos.metadatosTabla(tabla);
                          
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new AgregarDato(p,atrBDatos,tabla).setVisible(true);
                }
            });
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una tabla primero");
        }

    }//GEN-LAST:event_btnInsertarActionPerformed
    
    public void mostrarDatosTabla(String tabla){
        try{            
            datotabla.setModel(datosTabla(atrBDatos.datosTabla(tabla)));                                     
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }  
    private void mostrarInfoTabla(ResultSet resulSet){
        try{            
            info.setModel(datosTabla(resulSet));                                     
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    public void mostrarListaTablas(){
        try{            
            tblresultados.setModel(datosTabla(atrBDatos.tablasExistentes()));                                     
           }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    private DefaultTableModel datosTabla(ResultSet rs) throws SQLException{
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        
        Vector<String>columnNames = nombresColumnas(rs);
        
        Vector<Vector<Object>>data = new Vector<Vector<Object>>();
        while(rs.next())
        {
            Vector<Object> vector = new Vector<Object>();
            for(int columnIndex = 1; columnIndex<=columnCount; columnIndex++)
            {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data,columnNames);
    }
    private Vector<String> nombresColumnas(ResultSet rs) throws SQLException{
        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String>columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        
        for(int column = 1; column <=columnCount; column++)
        {
           columnNames.add(metaData.getColumnName(column));
        }
        
        return columnNames;
    }
        
    private void habilitarOpcionesUsuario(){
        btnCrearTabla.setVisible(true);
        btnDesconectar.setVisible(true);
        tblresultados.setVisible(true);        
        jpanel_editTabla.setVisible(true);
        datotabla.setVisible(true);
        info.setVisible(true);
        jPanel4.setVisible(true);
        jPanel2.setVisible(true);        
    }    
    private void deshabilitarOpcionesUsuario(){
        jpanel_editTabla.setVisible(false);
        btnCrearTabla.setVisible(false);         
        tblresultados.setVisible(false);
        datotabla.setVisible(false);
        info.setVisible(false);
        btnDesconectar.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
    }    
    private void habilitarPanelPrincipal(){
        btnConectar.setVisible(true);
        txtUsuario.enable(true);
        txtHost.enable(true);
        txtPuerto.enable(true);
        txtContraseña.enable(true);
    }    
    private void deshabilitarPanelPrincipal(){
        btnConectar.setVisible(false);
        txtUsuario.enable(false);
        txtHost.enable(false);
        txtPuerto.enable(false);
        txtContraseña.enable(false);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnCrearTabla;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JTable datotabla;
    private javax.swing.JTable info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpanel_editTabla;
    private javax.swing.JTable tblresultados;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtPuerto;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
