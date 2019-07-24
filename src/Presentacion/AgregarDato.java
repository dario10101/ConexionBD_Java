package Presentacion;

import Negocio.ControladorBD;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruben Dario
 */
public class AgregarDato extends javax.swing.JFrame {
    
    private String atrTabla;
    private Principal atrFrmPrincipal;
    private ControladorBD atrBDatos;
    
    public AgregarDato(Principal frmPrincipal,ControladorBD bDatos,String tabla) {        
        atrFrmPrincipal = frmPrincipal;
        atrBDatos = bDatos;
        atrTabla = tabla;
        initComponents();
        
        prepararTabla();       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        datotabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insertar dato a la tabla");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(204, 255, 255));

        datotabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        datotabla.setSelectionBackground(new java.awt.Color(255, 255, 255));
        datotabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(datotabla);

        jLabel1.setText("Inserte los datos:");

        jLabel2.setText("Presione enter al finalizar de escribir los datos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(btnAgregar)
                .addGap(34, 34, 34)
                .addComponent(btnFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnFinalizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        atrFrmPrincipal.mostrarDatosTabla(atrTabla);        
        try{
            boolean res = insertarDato();
            if(res){
                JOptionPane.showMessageDialog(this, "Dato agregado correctamente");
                atrFrmPrincipal.mostrarDatosTabla(atrTabla);
            }else{
                JOptionPane.showMessageDialog(this, "Datos incorrectos");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al insertar: " + e.getMessage());
        }  
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed
    
    private void prepararTabla(){
        try{            
            datotabla.setModel(datosTabla(atrBDatos.datosTabla(atrTabla)));                                     
           }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private boolean insertarDato(){
        Vector<String> datos = new Vector<String>();
        int numCol = datotabla.getColumnCount();
        
        for(int i = 0; i < numCol; i++){
            datos.add(String.valueOf(datotabla.getValueAt(0, i)));
        }        
        
        return atrBDatos.insertarDato(datos, atrTabla);
    }
    private void limpiarTabla(){
        //TODO
    }
    
    private DefaultTableModel datosTabla(ResultSet rs) throws SQLException{
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        
        Vector<String>columnNames = nombresColumnas(rs);
        
        Vector<Vector<Object>>data = new Vector<Vector<Object>>();
        
        Vector<Object> vector = new Vector<Object>();
        for(int columnIndex = 1; columnIndex<=columnCount; columnIndex++){
            vector.add("");
        }
        data.add(vector);
        
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
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JTable datotabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
