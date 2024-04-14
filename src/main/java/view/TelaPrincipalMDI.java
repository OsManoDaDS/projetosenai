/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.Utilities;

/**
 *
 * @author 232.933573
 */
public class TelaPrincipalMDI extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalMDI
     */
    public TelaPrincipalMDI() {
        initComponents();
        
        SwingUtilities.invokeLater(() -> {
        
            try {
                UIManager.setLookAndFeel(new FlatDarculaLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(GerenciarProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuGerenciar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuGeral = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuFuncionarios = new javax.swing.JMenu();
        MenuAddFuncionario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(537, 390));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        MenuGerenciar.setText("Produtos");
        MenuGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGerenciarActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Gerenciar Produtos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuGerenciar.add(jMenuItem2);

        jMenuBar1.add(MenuGerenciar);

        MenuGeral.setText("Relatórios");

        jMenuItem5.setText("Geral");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuGeral.add(jMenuItem5);

        jMenuBar1.add(MenuGeral);

        MenuFuncionarios.setText("Funcionários");

        MenuAddFuncionario.setText("Gerenciar Funcionários");
        MenuAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddFuncionarioActionPerformed(evt);
            }
        });
        MenuFuncionarios.add(MenuAddFuncionario);

        jMenuBar1.add(MenuFuncionarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

         RelatorioGeral relatoriogeral = new RelatorioGeral();
         jDesktopPane1.add(relatoriogeral);
         relatoriogeral.setVisible(true);
      
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        

       
        GerenciarProdutos telagerenciar = new GerenciarProdutos();
         jDesktopPane1.add(telagerenciar);
         telagerenciar.setVisible(true);
         
         

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MenuGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGerenciarActionPerformed

        
         
    }//GEN-LAST:event_MenuGerenciarActionPerformed

    private void MenuAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddFuncionarioActionPerformed
            
         GerenciarFuncionarios gerenciarfuncionarios = new GerenciarFuncionarios();
         jDesktopPane1.add(gerenciarfuncionarios);
         gerenciarfuncionarios.setVisible(true);


    }//GEN-LAST:event_MenuAddFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAddFuncionario;
    private javax.swing.JMenu MenuFuncionarios;
    private javax.swing.JMenu MenuGeral;
    private javax.swing.JMenu MenuGerenciar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
