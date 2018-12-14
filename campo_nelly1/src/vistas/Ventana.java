/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Campo;
import modelo.HibernateUtil;
import modelo.Lote;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author salazarwalter
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
    private DefaultTableModel modelo;
    public Ventana() {
        initComponents();
        crearModelo();
        limpiarTodo();
        tabla.setModel(modelo);
        habilitar(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLoteSuper = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        cboTipoSuelo = new javax.swing.JComboBox<>();
        lblErrorLote = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        txtCampoSup = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblErrorCampo = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jLabel7.setText("LOTES");

        jLabel8.setText("<html>Tenga en cuanta que debe ingresar al menos <br>1 lote</html>");

        jLabel9.setText("Nro");

        jLabel10.setText("Superficie");

        txtLoteSuper.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLoteSuperKeyTyped(evt);
            }
        });

        jLabel11.setText("Tipo Suelo");

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        cboTipoSuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V" }));

        lblErrorLote.setForeground(java.awt.Color.red);
        lblErrorLote.setText("jLabel6");

        btnAdd.setText("Agregar Lote");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");

        btnDel.setText("Quitar");

        jLabel6.setText("has");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorLote)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtLoteSuper)
                            .addComponent(cboTipoSuelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addGap(32, 32, 32)
                .addComponent(btnDel)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtLoteSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cboTipoSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblErrorLote)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDel)
                        .addComponent(btnEdit)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setText("hernandezn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(216, 216, 216))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel3.setText("Nombre");

        jLabel4.setText("Superficie");

        txtCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCampoFocusLost(evt);
            }
        });
        txtCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoKeyTyped(evt);
            }
        });

        txtCampoSup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoSupKeyTyped(evt);
            }
        });

        jLabel5.setText("has");

        lblErrorCampo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblErrorCampo.setForeground(java.awt.Color.red);
        lblErrorCampo.setText("jLabel6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblErrorCampo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCampoSup, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorCampo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCampoSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar Registro");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar Registro");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnIniciar)
                    .addComponent(btnFinalizar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        agregarLote();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        habilitar(true);
        txtCampo.requestFocus();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       habilitar(false);
       limpiarTodo();
       crearModelo();
       tabla.setModel(modelo);
       campo.getLotes().clear();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try{
            
        String nombreCampo=txtCampo.getText();
        double superficieCampo=Double.parseDouble(txtCampoSup.getText().trim());
        if(nombreCampo.isEmpty()) JOptionPane.showMessageDialog(rootPane, "Debe Ingresar el Nombre del Campo");
        else if(superficieCampo<=0) JOptionPane.showMessageDialog(rootPane, "La superficie del Campo debe ser mayor que cero");
        else if(campoYaIngresado(nombreCampo)) lblErrorCampo.setText("Nombre de Campo ya ingresado");
        else if(tabla.getRowCount()==0) JOptionPane.showMessageDialog(rootPane, "Debe agregar al menos un Lote al campo");
        else if(hayLugar(superficieCampo)) JOptionPane.showMessageDialog(rootPane, "La superficie de los terrenos no coicide con la superficie total del Campo");
        else { 
            campo.setNombrecampo(nombreCampo);
            campo.setSuperficiecampo(superficieCampo);
            campo.setEstadocampo("Creado");
            registrarCampo();
            VentanaVisializarCampo vista=new VentanaVisializarCampo(this, true);
            vista.setTabla(modelo);
            String texto="El Campo \""+campo.getNombrecampo()+"\" de "+txtCampoSup.getText()+"ha sido registrado";
            vista.setTexto(texto);
            btnCancelActionPerformed(evt);
            vista.setVisible(true);
        }
        }catch(NumberFormatException g){
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar la Superficie del Campo");
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoKeyTyped
        if(txtCampo.getText().length()>44) evt.consume();
    }//GEN-LAST:event_txtCampoKeyTyped

    private void txtCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCampoFocusLost
        if(campoYaIngresado(txtCampo.getText())) lblErrorCampo.setText("Nombre de Campo ya Ingresado");
        else lblErrorCampo.setText("");
    }//GEN-LAST:event_txtCampoFocusLost

    private void txtCampoSupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoSupKeyTyped
       int tecla=evt.getKeyChar();
        if(txtCampoSup.getText().length()>5) evt.consume();
        else if(!(tecla>='0' && tecla<='9' || tecla=='.')) evt.consume();
    }//GEN-LAST:event_txtCampoSupKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
       int tecla=evt.getKeyChar();
        if(txtNumero.getText().length()>5) evt.consume();
        else if(!(tecla>='0' && tecla<='9' )) evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtLoteSuperKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoteSuperKeyTyped
       int tecla=evt.getKeyChar();
        if(txtLoteSuper.getText().length()>5) evt.consume();
        else if(!(tecla>='0' && tecla<='9' || tecla=='.')) evt.consume();

    }//GEN-LAST:event_txtLoteSuperKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cboTipoSuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorCampo;
    private javax.swing.JLabel lblErrorLote;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtCampoSup;
    private javax.swing.JTextField txtLoteSuper;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    private Campo campo=new Campo();
    
    private void crearModelo() {
        modelo=new DefaultTableModel(new Object[]{"NRO","Superficie","Tipo de Suelo"}, 0);
    }

    private void limpiarTodo() {
        txtCampo.setText("");
        txtCampoSup.setText("");
        limpiarLote();
        limpiarError();
    }

    private void limpiarError() {
        lblErrorCampo.setText("");
        lblErrorLote.setText("");
    }

    private void agregarLote() {
        try{
            int numero=Integer.parseInt(txtNumero.getText().trim());
            double superficieLote=Double.parseDouble(txtLoteSuper.getText().trim());
            String tipoSuelo=cboTipoSuelo.getSelectedItem().toString();
            double superficieCampo=Double.parseDouble(txtCampoSup.getText().trim());
            if(numero<=0) JOptionPane.showMessageDialog(rootPane, "El Numero de Lote debe ser Mayor que cero");
            else if(superficieLote<=0) JOptionPane.showMessageDialog(rootPane, "La superficie del Lote debe ser Mayor que cero");
            else            
            if(existeNumeroLote(numero)){
                lblErrorLote.setText("Numero de Lote ya Ingresado");
            }else{
                lblErrorLote.setText("");
                if(noHayLugar(superficieLote,superficieCampo)){
                    JOptionPane.showMessageDialog(rootPane, "Agregar este lote excede la superficie del Campo");
                }else{
                    Lote lote=new Lote();
                    lote.setCampo(campo);
                    lote.setNumerolote(numero);
                    lote.setSuperficielote(superficieLote);
                    lote.setTiposuelo(tipoSuelo);
                    campo.agregarLote(lote);
                    modelo.addRow(new Object[]{numero,superficieLote,tipoSuelo});
                    limpiarLote();
                    
                }
            }
        }catch(NumberFormatException g){
            JOptionPane.showMessageDialog(rootPane, "La Superficie del terreno, Numero de Campo,Superficie del Lote\n DEBEN SER NUMERICOS");
        }
    }

    private boolean existeNumeroLote(int numero) {
        //aplicar metodo lotes.contains(Obj)
        Set lotes=campo.getLotes();
         for (Iterator iterator = lotes.iterator(); iterator.hasNext();) {
            Lote next = (Lote)iterator.next();
            if(next.getNumerolote()==numero)
                return true;
        }
        return false;
    }

    private boolean noHayLugar(double sup_lote,double sup_campo) {
        double s=0;
         Set lotes=campo.getLotes();
         for (Iterator iterator = lotes.iterator(); iterator.hasNext();) {
            Lote next = (Lote)iterator.next();
            s=s+next.getSuperficielote();
        }
//         System.out.println("SUMATORIA="+s);
//         System.out.println("SUP LOTE="+sup_lote);
//         System.out.println("SUP CAMPO="+sup_campo+"  -> "+(s+sup_lote>sup_campo));
        return s+sup_lote>sup_campo;
    }

    private void limpiarLote() {
        txtLoteSuper.setText("");
        txtNumero.setText("");
    }
    private void habilitar(boolean estado){
        txtCampo.setEnabled(estado);
        txtCampoSup.setEnabled(estado);
        txtLoteSuper.setEnabled(estado);
        txtNumero.setEnabled(estado);
        cboTipoSuelo.setEnabled(estado);
        btnAdd.setEnabled(estado);
        btnCancel.setEnabled(estado);
        btnDel.setEnabled(estado);
        btnEdit.setEnabled(estado);
        btnFinalizar.setEnabled(estado);
        btnIniciar.setEnabled(!estado);
    }

  

    private boolean hayLugar(double superficieCampo) {
        double s=0;
         Set lotes=campo.getLotes();
         for (Iterator iterator = lotes.iterator(); iterator.hasNext();) {
            Lote next = (Lote)iterator.next();
            s=s+next.getSuperficielote();
        }
        return s<superficieCampo;
    }

    private void registrarCampo() {
       int resp=JOptionPane.showConfirmDialog(rootPane, "Desea Registrar este campo?","Confirme por favor",JOptionPane.YES_NO_OPTION);
       if(resp==JOptionPane.YES_OPTION){
       try {
        Session session = HibernateUtil.  getSessionFactory().getCurrentSession();
        session.beginTransaction();
           System.out.println(campo);
        session.persist(campo);
        session.getTransaction().commit();
           System.out.println(campo);
        //session.close(); 
        //System.exit(0);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
       
    }
    
    public boolean  campoYaIngresado(String campoNombre) {
    ArrayList<Campo> lista;
    lista = null;
    try {
        Session session = HibernateUtil.  getSessionFactory().getCurrentSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Campo as campo where campo.nombrecampo='"+campoNombre+"'");
        lista =  (ArrayList<Campo>) q.list();
        session.close(); 
    } catch (Exception e) {
        e.printStackTrace();
    }
    return !lista.isEmpty();
}    
}
