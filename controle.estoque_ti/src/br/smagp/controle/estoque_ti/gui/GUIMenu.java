/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.smagp.controle.estoque_ti.gui;

import java.net.URL;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AllexOnRails
 */
public class GUIMenu extends javax.swing.JFrame {

    private GUIEquipamento guiEquipamento = null;
    
    
    private JButton createImageButton(String texto, String uriAbsoluta) {
        URL uri = getClass().getResource(uriAbsoluta);
        JButton button = new JButton(texto, new ImageIcon(uri));
        button.setVerticalTextPosition(AbstractButton.BOTTOM);
        button.setHorizontalTextPosition(AbstractButton.CENTER);

        return button;
    }
    
    
    /**
     * Creates new form GUIMenu
     */
    public GUIMenu() {
        dispose();
        this.setUndecorated(true);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbControle1 = new javax.swing.JButton();
        jbControle = new javax.swing.JButton();
        jbControle3 = new javax.swing.JButton();
        jbControle4 = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbControle6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jbControle7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbControle1.setBackground(new java.awt.Color(255, 255, 255));
        jbControle1.setForeground(new java.awt.Color(204, 204, 204));
        jbControle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-plano.png"))); // NOI18N
        jbControle1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbControle1.setBorderPainted(false);
        jbControle1.setFocusCycleRoot(true);
        jbControle1.setFocusable(false);
        jbControle1.setOpaque(false);
        jbControle1.setRequestFocusEnabled(false);
        jbControle1.setRolloverEnabled(false);
        jbControle1.setVerifyInputWhenFocusTarget(false);

        jbControle.setBackground(new java.awt.Color(255, 255, 255));
        jbControle.setForeground(new java.awt.Color(204, 204, 204));
        jbControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-plano.png"))); // NOI18N
        jbControle.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbControle.setBorderPainted(false);
        jbControle.setFocusCycleRoot(true);
        jbControle.setFocusable(false);
        jbControle.setOpaque(false);
        jbControle.setRequestFocusEnabled(false);
        jbControle.setRolloverEnabled(false);
        jbControle.setVerifyInputWhenFocusTarget(false);
        jbControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbControleActionPerformed(evt);
            }
        });

        jbControle3.setBackground(new java.awt.Color(255, 255, 255));
        jbControle3.setForeground(new java.awt.Color(204, 204, 204));
        jbControle3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-plano.png"))); // NOI18N
        jbControle3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbControle3.setBorderPainted(false);
        jbControle3.setFocusCycleRoot(true);
        jbControle3.setFocusable(false);
        jbControle3.setOpaque(false);
        jbControle3.setRequestFocusEnabled(false);
        jbControle3.setRolloverEnabled(false);
        jbControle3.setVerifyInputWhenFocusTarget(false);

        jbControle4.setBackground(new java.awt.Color(255, 255, 255));
        jbControle4.setForeground(new java.awt.Color(204, 204, 204));
        jbControle4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-plano.png"))); // NOI18N
        jbControle4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbControle4.setBorderPainted(false);
        jbControle4.setFocusCycleRoot(true);
        jbControle4.setFocusable(false);
        jbControle4.setOpaque(false);
        jbControle4.setRequestFocusEnabled(false);
        jbControle4.setRolloverEnabled(false);
        jbControle4.setVerifyInputWhenFocusTarget(false);

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setForeground(new java.awt.Color(204, 204, 204));
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/exit2.jpg"))); // NOI18N
        btSair.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btSair.setBorderPainted(false);
        btSair.setFocusCycleRoot(true);
        btSair.setFocusable(false);
        btSair.setOpaque(false);
        btSair.setRequestFocusEnabled(false);
        btSair.setRolloverEnabled(false);
        btSair.setVerifyInputWhenFocusTarget(false);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/logoSuporteTI2.png"))); // NOI18N

        jbControle6.setBackground(new java.awt.Color(255, 255, 255));
        jbControle6.setForeground(new java.awt.Color(204, 204, 204));
        jbControle6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-plano.png"))); // NOI18N
        jbControle6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbControle6.setBorderPainted(false);
        jbControle6.setFocusCycleRoot(true);
        jbControle6.setFocusable(false);
        jbControle6.setOpaque(false);
        jbControle6.setRequestFocusEnabled(false);
        jbControle6.setRolloverEnabled(false);
        jbControle6.setVerifyInputWhenFocusTarget(false);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jbControle7.setBackground(new java.awt.Color(255, 255, 255));
        jbControle7.setForeground(new java.awt.Color(204, 204, 204));
        jbControle7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-relatorio.png"))); // NOI18N
        jbControle7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbControle7.setBorderPainted(false);
        jbControle7.setFocusCycleRoot(true);
        jbControle7.setFocusable(false);
        jbControle7.setOpaque(false);
        jbControle7.setRequestFocusEnabled(false);
        jbControle7.setRolloverEnabled(false);
        jbControle7.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jbControle1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbControle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbControle3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbControle4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbControle6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jbControle7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbControle4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbControle3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbControle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbControle1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbControle6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbControle7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(null,"Sistema Encerrado.\nVolte Sempre");
       dispose();
       System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void jbControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbControleActionPerformed
//        if(this.guiEquipamento != null){
//            JOptionPane.showMessageDialog(null,"Já se encontra um processo em execução", "Erro", JOptionPane.ERROR_MESSAGE);
//        }
            this.guiEquipamento = new GUIEquipamento();
            this.guiEquipamento.setVisible(true);
        
    }//GEN-LAST:event_jbControleActionPerformed

    	
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
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbControle;
    private javax.swing.JButton jbControle1;
    private javax.swing.JButton jbControle3;
    private javax.swing.JButton jbControle4;
    private javax.swing.JButton jbControle6;
    private javax.swing.JButton jbControle7;
    // End of variables declaration//GEN-END:variables
}
