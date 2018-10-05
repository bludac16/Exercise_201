
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class VelocityDlg extends javax.swing.JDialog {

    /**
     * Creates new form VelocityDlg
     */
    private boolean ok;
    private Measurement measurement;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
    
    public VelocityDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        java.awt.GridBagConstraints gridBagConstraints;

        lbDatum = new javax.swing.JLabel();
        tfDatum = new javax.swing.JTextField();
        lbUhrzeit = new javax.swing.JLabel();
        tfUhrzeit = new javax.swing.JTextField();
        lbKennzeichen = new javax.swing.JLabel();
        tfKennzeichen = new javax.swing.JTextField();
        lbgemV = new javax.swing.JLabel();
        tfgemV = new javax.swing.JTextField();
        lberlV = new javax.swing.JLabel();
        tferlV = new javax.swing.JTextField();
        tfÜbernehmen = new javax.swing.JButton();
        tfAbbrechen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbDatum.setText("Datum:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lbDatum, gridBagConstraints);

        tfDatum.setText("08.10.2013");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(tfDatum, gridBagConstraints);

        lbUhrzeit.setText("Uhrzeit:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lbUhrzeit, gridBagConstraints);

        tfUhrzeit.setText("07:55");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(tfUhrzeit, gridBagConstraints);

        lbKennzeichen.setText("Kennzeichen:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lbKennzeichen, gridBagConstraints);

        tfKennzeichen.setText("GU-RASER1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(tfKennzeichen, gridBagConstraints);

        lbgemV.setText("V-Gemessen:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lbgemV, gridBagConstraints);

        tfgemV.setText("123");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(tfgemV, gridBagConstraints);

        lberlV.setText("V-Erlaubt:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lberlV, gridBagConstraints);

        tferlV.setText("80");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(tferlV, gridBagConstraints);

        tfÜbernehmen.setText("Übernehmen");
        tfÜbernehmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfÜbernehmenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(tfÜbernehmen, gridBagConstraints);

        tfAbbrechen.setText("Abbrechen");
        tfAbbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAbbrechenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(tfAbbrechen, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfÜbernehmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfÜbernehmenActionPerformed
        int gem = Integer.parseInt(tfgemV.getText());
        int erl = Integer.parseInt(tferlV.getText());
        Measurement measurement = new Measurement((LocalDate)dtf.parse(tfDatum.getText()), (LocalTime) dtf.parse(tfUhrzeit.getText()),tfKennzeichen.getText(), gem, erl, (gem-erl));
        ok = true;
        this.dispose();
    }//GEN-LAST:event_tfÜbernehmenActionPerformed

    private void tfAbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAbbrechenActionPerformed
        ok = false;
        this.dispose();
    }//GEN-LAST:event_tfAbbrechenActionPerformed

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
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VelocityDlg dialog = new VelocityDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDatum;
    private javax.swing.JLabel lbKennzeichen;
    private javax.swing.JLabel lbUhrzeit;
    private javax.swing.JLabel lberlV;
    private javax.swing.JLabel lbgemV;
    private javax.swing.JButton tfAbbrechen;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextField tfKennzeichen;
    private javax.swing.JTextField tfUhrzeit;
    private javax.swing.JTextField tferlV;
    private javax.swing.JTextField tfgemV;
    private javax.swing.JButton tfÜbernehmen;
    // End of variables declaration//GEN-END:variables
}
