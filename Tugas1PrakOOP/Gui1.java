/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas1PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class Gui1 extends javax.swing.JFrame {

    /**
     * Creates new form Gui1
     */
    public Gui1() {
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

        btngrup1 = new javax.swing.ButtonGroup();
        btngrup2 = new javax.swing.ButtonGroup();
        btngrup3 = new javax.swing.ButtonGroup();
        btngrup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        txtprosesor = new javax.swing.JTextField();
        btngtx = new javax.swing.JRadioButton();
        btnrtx = new javax.swing.JRadioButton();
        btn16 = new javax.swing.JRadioButton();
        btn32 = new javax.swing.JRadioButton();
        btnhdd = new javax.swing.JRadioButton();
        btnssd = new javax.swing.JRadioButton();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        txtharga = new javax.swing.JTextField();
        btncetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Prosesor");

        jLabel2.setText("VGA");

        jLabel3.setText("RAM");

        jLabel4.setText("Jenis Penyimpanan");

        jLabel5.setText("Besar Penyimpanan");

        jLabel6.setText("Harga");

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        txtprosesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprosesorActionPerformed(evt);
            }
        });

        btngtx.setText("GTX");
        btngtx.setActionCommand("");

        btnrtx.setText("RTX");

        btn16.setText("16 GB");

        btn32.setText("32 GB");

        btnhdd.setText("HDD");

        btnssd.setText("SSD");
        btnssd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnssdActionPerformed(evt);
            }
        });

        btn1.setText("1 TB");

        btn2.setText("2 TB");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btncetak.setText("Cetak");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1)
                            .addComponent(btnhdd)
                            .addComponent(btnrtx)
                            .addComponent(btngtx)
                            .addComponent(btn16)
                            .addComponent(btn32)
                            .addComponent(btnssd)
                            .addComponent(btn2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtprosesor)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncetak))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtprosesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btngtx))
                        .addGap(2, 2, 2)
                        .addComponent(btnrtx)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btn16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnhdd)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnssd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btn1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncetak))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnssdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnssdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnssdActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        // TODO add your handling code here:
        txtarea.setText("");
        Class1 pc = new Class1();
        
        pc.dataProsesor(txtprosesor.getText());
        
        //menentukan jenis vga
        String VGA = "";
        if(btngtx.isSelected()){
            VGA = "GTX";
        } else {
            VGA = "RTX";
        }
        
        //menentukan besar ram
        String RAM = "";
        if(btngtx.isSelected()){
            RAM = "16";
        } else {
            RAM = "32";
        }
        
        //menentukan jenis penyimpanan
        String JP = "";
        if(btngtx.isSelected()){
            JP = "HDD";
        } else {
            JP = "SSD";
        }
        
        //menentukan besar penyimpanan
        String BP = "";
        if(btngtx.isSelected()){
            BP = "1TB";
        } else {
            BP = "2TB";
        }
        
        //menentukan harga
        int harga;
        harga = Integer.parseInt(txtharga.getText());
        
        //tampilan hasil
        txtarea.append("=============\n");
        txtarea.append("PENJUALAN PC\n");
        txtarea.append("=============\n");
        txtarea.append("Prosesor : " + pc.getProsesor()+"\n");
        txtarea.append("VGA : " + VGA + "\n");
        txtarea.append("RAM : " + RAM + "\n");
        txtarea.append("JENIS PENYIMPANAN : " + JP + "\n");
        txtarea.append("BESAR PENYIMPANAN : " + BP + "\n");
        txtarea.append("HARGA : " + pc.getHarga() + "\n");
        
    }//GEN-LAST:event_btncetakActionPerformed

    private void txtprosesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprosesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprosesorActionPerformed

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
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn16;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn32;
    private javax.swing.JButton btncetak;
    private javax.swing.ButtonGroup btngrup1;
    private javax.swing.ButtonGroup btngrup2;
    private javax.swing.ButtonGroup btngrup3;
    private javax.swing.ButtonGroup btngrup4;
    private javax.swing.JRadioButton btngtx;
    private javax.swing.JRadioButton btnhdd;
    private javax.swing.JRadioButton btnrtx;
    private javax.swing.JRadioButton btnssd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtprosesor;
    // End of variables declaration//GEN-END:variables
}
