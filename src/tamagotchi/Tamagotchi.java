package tamagotchi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yirlany
 */

public class Tamagotchi extends javax.swing.JFrame {

        public final int PINA=10;
        public final int PLATEADA=25;
        public final int BAYA=5;
        public final int DORADA=30;
        public final int LATANA=35;
        
        public final int PELEAR=10;
        public final int NADAR=10;
        public final int JUGAR=10;
        public final int CORRER=10;
        public final int BAILAR=10;
        
       
    public Tamagotchi() {   
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

        jLabel2 = new javax.swing.JLabel();
        btnBaya = new javax.swing.JButton();
        btnBanana = new javax.swing.JButton();
        btnPlata = new javax.swing.JButton();
        btnDorada = new javax.swing.JButton();
        btnPina = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("mascota");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 110, 120));

        btnBaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baya.png"))); // NOI18N
        btnBaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 80, 90));

        btnBanana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/latana.png"))); // NOI18N
        btnBanana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBananaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBanana, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 80, 90));

        btnPlata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plateada.png"))); // NOI18N
        getContentPane().add(btnPlata, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 80, 90));

        btnDorada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dorada.png"))); // NOI18N
        btnDorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 90));

        btnPina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pi??a.png"))); // NOI18N
        btnPina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPina, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 90));

        jProgressBar1.setOrientation(1);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jProgressBar2.setOrientation(1);
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jProgressBar3.setOrientation(1);
        getContentPane().add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));
        getContentPane().add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jProgressBar5.setOrientation(1);
        getContentPane().add(jProgressBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBayaActionPerformed

    private void btnDoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoradaActionPerformed

    private void btnBananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBananaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBananaActionPerformed

    private void btnPinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPinaActionPerformed

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
            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tamagotchi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanana;
    private javax.swing.JButton btnBaya;
    private javax.swing.JButton btnDorada;
    private javax.swing.JButton btnPina;
    private javax.swing.JButton btnPlata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    // End of variables declaration//GEN-END:variables
}
