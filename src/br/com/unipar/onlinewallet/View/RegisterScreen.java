/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.onlinewallet.View;



import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Matheus
 */
public class RegisterScreen extends javax.swing.JFrame { 
    
    private Connection Conn;  
        
    /**
     * Creates new form Screen
     */
    public RegisterScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopFrame = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuRegister = new javax.swing.JMenu();
        MenuUser = new javax.swing.JMenuItem();
        MenuVaccine = new javax.swing.JMenuItem();
        MenuDocument = new javax.swing.JMenuItem();
        MenuRelDocument = new javax.swing.JMenu();
        MenuRelVaccine = new javax.swing.JMenuItem();
        MenuRelIndetify = new javax.swing.JMenuItem();
        MenuHelp = new javax.swing.JMenu();
        MenuOption = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carteira Online");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        javax.swing.GroupLayout desktopFrameLayout = new javax.swing.GroupLayout(desktopFrame);
        desktopFrame.setLayout(desktopFrameLayout);
        desktopFrameLayout.setHorizontalGroup(
            desktopFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        desktopFrameLayout.setVerticalGroup(
            desktopFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        MenuRegister.setText("Cadastro");

        MenuUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MenuUser.setText("Usuário");
        MenuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUserActionPerformed(evt);
            }
        });
        MenuRegister.add(MenuUser);

        MenuVaccine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MenuVaccine.setText("Vacina");
        MenuVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVaccineActionPerformed(evt);
            }
        });
        MenuRegister.add(MenuVaccine);

        MenuDocument.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MenuDocument.setText("Documento");
        MenuDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDocumentActionPerformed(evt);
            }
        });
        MenuRegister.add(MenuDocument);

        jMenuBar1.add(MenuRegister);

        MenuRelDocument.setText("Documentos");

        MenuRelVaccine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        MenuRelVaccine.setText("Vacinas");
        MenuRelDocument.add(MenuRelVaccine);

        MenuRelIndetify.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        MenuRelIndetify.setText("Identificação");
        MenuRelDocument.add(MenuRelIndetify);

        jMenuBar1.add(MenuRelDocument);

        MenuHelp.setText("Ajuda");
        jMenuBar1.add(MenuHelp);

        MenuOption.setText("Opções");

        MenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        MenuExit.setText("Sair");
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        MenuOption.add(MenuExit);

        jMenuBar1.add(MenuOption);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopFrame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopFrame)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1077, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void MenuDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuDocumentActionPerformed

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        int Exit = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (Exit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_MenuExitActionPerformed

    private void MenuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUserActionPerformed
        ScreenUser User = new ScreenUser();
        User.setVisible(true);
        desktopFrame.add(User);
    }//GEN-LAST:event_MenuUserActionPerformed

    private void MenuVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVaccineActionPerformed
        // Abrir o cadastro das Vacinas
        ScreenVaccine Vaccines = new ScreenVaccine();
        Vaccines.setVisible(true);
        desktopFrame.add(Vaccines);
    }//GEN-LAST:event_MenuVaccineActionPerformed
    
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
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuDocument;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenu MenuHelp;
    private javax.swing.JMenu MenuOption;
    private javax.swing.JMenu MenuRegister;
    private javax.swing.JMenu MenuRelDocument;
    private javax.swing.JMenuItem MenuRelIndetify;
    private javax.swing.JMenuItem MenuRelVaccine;
    public static javax.swing.JMenuItem MenuUser;
    private javax.swing.JMenuItem MenuVaccine;
    private javax.swing.JDesktopPane desktopFrame;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private static class txtData {

        public txtData() {
        }
    }
}
