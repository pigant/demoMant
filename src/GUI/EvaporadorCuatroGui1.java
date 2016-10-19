/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Manteciones;
import java.awt.Color;

/**
 *
 * @author CARR
 */
public class EvaporadorCuatroGui1 extends javax.swing.JFrame {
private String equipo;
private BLL.Usuarios user;
    /**
     * Creates new form EvaporadorCuatroGui
     */
    public EvaporadorCuatroGui1(String equipo,BLL.Usuarios user) {
        initComponents();
        this.equipo = equipo;
        this.user = user;
        this.jButtonUno.setText(equipo+"1");
        this.jButtonDos.setText(equipo+"2");
        this.jButtonTres.setText(equipo+"3");
        this.jButtonCuatro.setText(equipo+"4");
        this.colores();
    }
        public void colores(){
        this.jButtonUno.setBackground(this.colorear(jButtonUno.getText()));
        this.jButtonDos.setBackground(this.colorear(jButtonDos.getText()));
        this.jButtonTres.setBackground(this.colorear(jButtonTres.getText()));
        this.jButtonCuatro.setBackground(this.colorear(jButtonCuatro.getText()));
       }
    private Color colorear(String equipo){
        return new Manteciones(equipo).colorear();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonUno = new javax.swing.JButton();
        jButtonDos = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonCuatro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/8259-2558219.jpg"))); // NOI18N
        jButtonUno.setText("T_001");
        jButtonUno.setToolTipText("");
        jButtonUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUno.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnoActionPerformed(evt);
            }
        });

        jButtonDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/8259-2558219.jpg"))); // NOI18N
        jButtonDos.setText("T_001");
        jButtonDos.setToolTipText("");
        jButtonDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDos.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDosActionPerformed(evt);
            }
        });

        jButtonTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/8259-2558219.jpg"))); // NOI18N
        jButtonTres.setText("T_001");
        jButtonTres.setToolTipText("");
        jButtonTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTres.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });

        jButtonCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/8259-2558219.jpg"))); // NOI18N
        jButtonCuatro.setText("T_001");
        jButtonCuatro.setToolTipText("");
        jButtonCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuatro.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButtonUnoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        this.nuevaVentana(this.jButtonUno.getText());
       
    }                                          

    private void jButtonDosActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        this.nuevaVentana(this.jButtonDos.getText());
    }                                          

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        this.nuevaVentana(this.jButtonTres.getText());
    }                                           

    private void jButtonCuatroActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        this.nuevaVentana(this.jButtonCuatro.getText());
    }                                             

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EvaporadorCuatroGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EvaporadorCuatroGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EvaporadorCuatroGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EvaporadorCuatroGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EvaporadorCuatroGui().setVisible(true);
//            }
//        });
//    }
    private void nuevaVentana(String nombre){
        new MantOrAskGUI(nombre, this.user, this.jPanel1).setVisible(true);
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonCuatro;
    private javax.swing.JButton jButtonDos;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUno;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
