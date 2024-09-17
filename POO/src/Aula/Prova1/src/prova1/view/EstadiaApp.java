/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prova1.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import prova1.model.Periodo;
import prova1.model.Estadia;

/**
 *
 * @author liandrar
 */
public class EstadiaApp extends javax.swing.JFrame {

    /**
     * Creates new form Estadia
     */
    public EstadiaApp() {
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

        jLabel1 = new javax.swing.JLabel();
        slctPeriodo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        slctQuantidadeDias = new javax.swing.JSpinner();
        btnEnviar = new javax.swing.JButton();
        Output1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informe o período da estadia:");

        slctPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alta temporada", "Media temporada", "Baixa temporada" }));
        slctPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slctPeriodoActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade de diárias que deseja:");

        slctQuantidadeDias.setMinimumSize(new java.awt.Dimension(0, 0));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        Output1.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(slctQuantidadeDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slctPeriodo, 0, 218, Short.MAX_VALUE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Output1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slctPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slctQuantidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEnviar)
                .addGap(32, 32, 32)
                .addComponent(Output1)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slctPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slctPeriodoActionPerformed

    }//GEN-LAST:event_slctPeriodoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // Botao de enviar

        // Create an Estadia object with default values first
        Estadia estadia = new Estadia();

        try {
            // Set periodo based on selected index
            switch (slctPeriodo.getSelectedIndex()) {
                case 1:
                    estadia.setPeriodo(Periodo.ALTA_TEMPORADA);
                    break;
                case 2:
                    estadia.setPeriodo(Periodo.MEDIA_TEMPORADA);
                    break;
                case 3:
                    estadia.setPeriodo(Periodo.BAIXA_TEMPORADA);
                    break;
                default:
                    Output1.setText("Escolha uma opção válida");
                    return; // Exit method if the selection is invalid
            }

            // Set quantidadeDias
            estadia.setQuantidadeDias((int) slctQuantidadeDias.getValue());

        } catch (Exception ex) {
            Logger.getLogger(EstadiaApp.class.getName()).log(Level.SEVERE, null, ex);
            Output1.setText("Ocorreu um erro ao processar a estadia.");
        }


    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(Estadia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Output1;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> slctPeriodo;
    private javax.swing.JSpinner slctQuantidadeDias;
    // End of variables declaration//GEN-END:variables
}
