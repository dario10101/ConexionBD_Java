package Presentacion;

import Negocio.ControladorBD;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben Dario
 */
public class AgregarTabla extends javax.swing.JFrame {
    
    private Principal atrFrmP;
    private Vector<String> atrColumnas;
    private ControladorBD atrBDatos;
    private int atrNumCol = 1;
    
    public AgregarTabla(Principal frmP, ControladorBD bDatos) {
        atrBDatos = bDatos;
        atrColumnas = new Vector<String>();
        atrFrmP = frmP;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarTabla = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreTabla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipoDato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdbtnNulleable = new javax.swing.JRadioButton();
        btnAgregarCol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Tabla");

        btnAgregarTabla.setText(" Agregar Tabla");
        btnAgregarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTablaActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Nombre de la tabla:");

        jLabel2.setText("Agregar Columna 1:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Tipo de dato:");

        jLabel5.setText("Puede ser Null:");

        rdbtnNulleable.setText("No");

        btnAgregarCol.setText("Agregar columna");
        btnAgregarCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarColActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCol, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdbtnNulleable)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnAgregarCol, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipoDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdbtnNulleable))
                .addGap(34, 34, 34)
                .addComponent(btnAgregarCol)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Configurar la tabla", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnAgregarTabla)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("ConfigurarTabla");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTablaActionPerformed
        String nombreTabla = txtNombreTabla.getText();
        if(!nombreTabla.equals("")){
            if(atrColumnas.size() > 0){             
                atrBDatos.crearTabla(atrColumnas,nombreTabla);
                
                atrFrmP.mostrarListaTablas();
                this.dispose();
                
                
            }else{
                JOptionPane.showMessageDialog(this, "Datos insuficientes");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe asignar nombre a la tabla");
        }
        
        
    }//GEN-LAST:event_btnAgregarTablaActionPerformed

    private void btnAgregarColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarColActionPerformed
        String nombreC = txtNombreCol.getText();
        String tipoDato = txtTipoDato.getText();
        if(!nombreC.equals("") && !tipoDato.equals("")){
            String columna = "";
            columna += nombreC + " ";
            columna += tipoDato;
            if (rdbtnNulleable.isSelected()){
                columna+= " NOT NULL";
            }
            atrColumnas.add(columna);
            txtNombreCol.setText("");
            
            atrNumCol++;
            jLabel2.setText("Agregar Columna " + atrNumCol + ":");
            
            //txtTipoDato.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Llene los campos vacios");
        }
    }//GEN-LAST:event_btnAgregarColActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCol;
    private javax.swing.JButton btnAgregarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdbtnNulleable;
    private javax.swing.JTextField txtNombreCol;
    private javax.swing.JTextField txtNombreTabla;
    private javax.swing.JTextField txtTipoDato;
    // End of variables declaration//GEN-END:variables
}
