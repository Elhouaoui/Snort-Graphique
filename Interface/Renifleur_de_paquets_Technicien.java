/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author root
 */
public class Renifleur_de_paquets_Technicien extends javax.swing.JFrame {
static String x=""; 
   static boolean etat1,etat2;
    public Renifleur_de_paquets_Technicien() {
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

        jSeparator8 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 750));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(30, 710, 1000, 10);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(1030, 170, 10, 540);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(28, 170, 10, 540);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 300, 900, 370);

        jButton1.setText("commencer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(730, 250, 140, 30);

        jCheckBox1.setText("afficher les données de la couche application");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(190, 230, 370, 23);

        jCheckBox2.setText("afficher les données de la couche  liaision");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(190, 260, 330, 23);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(30, 170, 1000, 10);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Bienvenue dans le mode Renifleur de paquets");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 120, 400, 20);

        jPanel4.setBackground(new java.awt.Color(92, 84, 76));
        jPanel4.setForeground(new java.awt.Color(64, 40, 40));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1050, 10);

        jPanel6.setBackground(new java.awt.Color(152, 137, 123));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setAlignmentY(0.0F);
        jPanel6.setLayout(null);

        jButton7.setText("jButton6");
        jPanel6.add(jButton7);
        jButton7.setBounds(80, 140, 94, 25);

        jButton.setText("retour");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        jPanel6.add(jButton);
        jButton.setBounds(40, 10, 79, 25);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 50, 1050, 40);

        jPanel7.setBackground(new java.awt.Color(92, 84, 76));
        jPanel7.setForeground(new java.awt.Color(64, 40, 40));
        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 40, 1050, 10);

        jPanel8.setBackground(new java.awt.Color(152, 137, 123));
        jPanel8.setAlignmentX(0.0F);
        jPanel8.setAlignmentY(0.0F);
        jPanel8.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(230, 100, 30));
        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 96, 18));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Application de simulation du fonctionnement d'un ");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel8.add(jLabel10);
        jLabel10.setBounds(272, 5, 362, 18);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(245, 243, 243));
        jLabel11.setText(" IDS");
        jPanel8.add(jLabel11);
        jLabel11.setBounds(639, 5, 28, 18);

        jLabel12.setForeground(new java.awt.Color(233, 80, 15));
        jLabel12.setText("_");
        jPanel8.add(jLabel12);
        jLabel12.setBounds(672, 5, 6, 15);

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(249, 247, 247));
        jLabel13.setText(" SNORT");
        jPanel8.add(jLabel13);
        jLabel13.setBounds(684, 5, 54, 18);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(0, 10, 1050, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = null;
        if(etat1==true&&etat2==true){
            x="snort -vde -c /etc/snort/snort.conf";}
        if(etat1==false&&etat2==false){
            x="snort -v -c /etc/snort/snort.conf"; }
        if(etat1==false&&etat2==true){
            x="snort -ve -c /etc/snort/snort.conf"; }
        if(etat1==true&&etat2==false){
            x="snort -vd -c /etc/snort/snort.conf"; }
        try{

            //Run the process
            //Process p= Runtime.getRuntime().exec("cat /home/fich");
            Process p= Runtime.getRuntime().exec(x);
            //Get the input stream
            BufferedReader stdInput = new BufferedReader(new
                InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                InputStreamReader(p.getErrorStream()));

            while ((s = stdInput.readLine()) != null) {

                jTextArea1.update(jTextArea1.getGraphics());
                jTextArea1.append(s+"\n");

                int len = jTextArea1.getDocument().getLength();
                jTextArea1.setCaretPosition(len);
                System.out.println(s);
                /* try {
                    Thread.sleep(100);                 //1000 milliseconds is one second.
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }*/

            }
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

        }
        catch(IOException e){
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            // System.exit(-1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if(jCheckBox1.isSelected())
        etat1=true;
        else
        etat1=false;
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if(jCheckBox2.isSelected())
        etat2=true;
        else
        etat2=false;
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        Technicien l= new Technicien();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Renifleur_de_paquets_Technicien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Renifleur_de_paquets_Technicien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Renifleur_de_paquets_Technicien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Renifleur_de_paquets_Technicien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Renifleur_de_paquets_Technicien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
