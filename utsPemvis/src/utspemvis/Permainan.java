/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utspemvis;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author faza
 */
public class Permainan extends javax.swing.JFrame {

    /**
     * Creates new form Permainan
     */
    public Permainan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        batu = new javax.swing.JRadioButton();
        gunting = new javax.swing.JRadioButton();
        kertas = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Permainan Suit");

        jLabel2.setText("Masukkan Pilihan Anda");

        buttonGroup1.add(batu);
        batu.setText("Batu");
        batu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batuActionPerformed(evt);
            }
        });

        buttonGroup1.add(gunting);
        gunting.setText("Gunting");

        buttonGroup1.add(kertas);
        kertas.setText("Kertas");

        jButton1.setText("Mulai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kertas)
                    .addComponent(gunting)
                    .addComponent(batu))
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(batu))
                .addGap(30, 30, 30)
                .addComponent(gunting)
                .addGap(29, 29, 29)
                .addComponent(kertas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(85, 85, 85))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int maxRandom = 3;
        Random r = new Random();
        int kata = 0;
        int skorKomputer = 0;
        int skorAnda = 0;
        
        if(batu.isSelected()){
            kata = r.nextInt(maxRandom);
            if(kata==0){
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Batu\n"+"Seri karena suit sama\n");

            }else if(kata==1){
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Gunting\n"+"Anda Menang\n");
                skorAnda++;

            }else if(kata==2){
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Kertas\n"+"Anda Kalah\n");
                skorKomputer++;
                
            }
        }else if(gunting.isSelected()){
            kata = r.nextInt(maxRandom);
            if(kata==0){
                JOptionPane.showMessageDialog(null,"Suit Anda=Gunting\n"+"Suit Komputer = Batu\n"+"Anda Kalah");
                skorKomputer++;
                
            }else if(kata==1){
                JOptionPane.showMessageDialog(null,"Suit Anda=Gunting\n"+"Suit Komputer = Gunting\n"+"Seri karena suit sama");
                
            }else if(kata==2){
                JOptionPane.showMessageDialog(null,"Suit Anda=Gunting\n"+"Suit Komputer = Kertas\n"+"Anda Menang");
                skorAnda++;
                
            }
        }else if(kertas.isSelected()){
            kata=r.nextInt(maxRandom);
            if(kata==0){
                JOptionPane.showMessageDialog(null,"Suit Anda = Kertas\n"+"Suit Komputer = Batu\n"+"Anda menang");
                skorAnda++;
                
            }else if(kata==1){
                JOptionPane.showMessageDialog(null,"Suit Anda = Kertas\n"+"Suit Komputer = Gunting\n"+"Anda Kalah");
                skorKomputer++;
                
            }else if(kata==2){
                JOptionPane.showMessageDialog(null,"Suit Anda = Kertas\n"+"Suit Komputer = Kertas\n"+"Seri karena suit sama");
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dulu coy");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Permainan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Permainan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Permainan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Permainan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Permainan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton batu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton gunting;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JRadioButton kertas;
    // End of variables declaration//GEN-END:variables
}
