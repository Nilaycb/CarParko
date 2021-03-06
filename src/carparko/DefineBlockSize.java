/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparko;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author nilay
 */
public class DefineBlockSize extends javax.swing.JFrame {

    /**
     * Creates new form DefineBlockSize
     */
    public DefineBlockSize() {
        initComponents();
        super.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/carparko/assests/icons-parking-48.png")).getImage()); // NOI18N
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
        carparko_jLabel1 = new javax.swing.JLabel();
        define_block_jLabel1 = new javax.swing.JLabel();
        block_jPanel1_jLabel1 = new javax.swing.JLabel();
        block_1 = new javax.swing.JTextField();
        block_3 = new javax.swing.JTextField();
        block_jPanel1_jLabel3 = new javax.swing.JLabel();
        block_5 = new javax.swing.JTextField();
        block_jPanel1_jLabel5 = new javax.swing.JLabel();
        block_7 = new javax.swing.JTextField();
        block_jPanel1_jLabel7 = new javax.swing.JLabel();
        block_9 = new javax.swing.JTextField();
        block_jPanel1_jLabel9 = new javax.swing.JLabel();
        block_jPanel1_jLabel10 = new javax.swing.JLabel();
        block_jPanel1_jLabel8 = new javax.swing.JLabel();
        block_jPanel1_jLabel6 = new javax.swing.JLabel();
        block_jPanel1_jLabel4 = new javax.swing.JLabel();
        block_jPanel1_jLabel2 = new javax.swing.JLabel();
        block_2 = new javax.swing.JTextField();
        block_4 = new javax.swing.JTextField();
        block_6 = new javax.swing.JTextField();
        block_8 = new javax.swing.JTextField();
        block_10 = new javax.swing.JTextField();
        block_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CarParko");

        carparko_jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        carparko_jLabel1.setText("CarParko");

        define_block_jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        define_block_jLabel1.setText("Define Parking Block Sizes");

        block_jPanel1_jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel1.setText("Block 1 ");

        block_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_1ActionPerformed(evt);
            }
        });

        block_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_3ActionPerformed(evt);
            }
        });

        block_jPanel1_jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel3.setText("Block 3 ");

        block_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_5ActionPerformed(evt);
            }
        });

        block_jPanel1_jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel5.setText("Block 5 ");

        block_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_7ActionPerformed(evt);
            }
        });

        block_jPanel1_jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel7.setText("Block 7 ");

        block_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_9ActionPerformed(evt);
            }
        });

        block_jPanel1_jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel9.setText("Block 9 ");

        block_jPanel1_jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel10.setText("Block 10 ");

        block_jPanel1_jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel8.setText("Block 8 ");

        block_jPanel1_jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel6.setText("Block 6 ");

        block_jPanel1_jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel4.setText("Block 4");

        block_jPanel1_jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_jPanel1_jLabel2.setText("Block 2 ");

        block_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_2ActionPerformed(evt);
            }
        });

        block_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_4ActionPerformed(evt);
            }
        });

        block_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_6ActionPerformed(evt);
            }
        });

        block_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_8ActionPerformed(evt);
            }
        });

        block_10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_10ActionPerformed(evt);
            }
        });

        block_submit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        block_submit.setText("Submit");
        block_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(block_jPanel1_jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(block_9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(block_jPanel1_jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(block_jPanel1_jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(block_jPanel1_jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(block_jPanel1_jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(block_7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(181, 181, 181)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(block_jPanel1_jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(block_2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(block_jPanel1_jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(block_4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(block_jPanel1_jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(block_6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(block_jPanel1_jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(block_jPanel1_jLabel10)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(block_10, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(block_8))))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(carparko_jLabel1)
                .addGap(275, 275, 275))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(define_block_jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(block_submit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(carparko_jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(define_block_jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(block_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(block_submit)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_jPanel1_jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(109, 109, 109))))
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

    private void block_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_1ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_1ActionPerformed

    private void block_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_3ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_3ActionPerformed

    private void block_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_5ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_5ActionPerformed

    private void block_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_7ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_7ActionPerformed

    private void block_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_9ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_9ActionPerformed

    private void block_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_2ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_2ActionPerformed

    private void block_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_4ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_4ActionPerformed

    private void block_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_6ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_6ActionPerformed

    private void block_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_8ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_8ActionPerformed

    private void block_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_10ActionPerformed
        // TODO add your handling code here:
        block_submitActionPerformed(evt);
    }//GEN-LAST:event_block_10ActionPerformed

    private void block_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_submitActionPerformed
        // TODO add your handling code here:
        if (!isInt(block_1.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel1.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_2.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel2.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_3.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel3.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_4.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel4.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_5.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel5.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_6.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel6.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_7.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel7.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_8.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel8.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_9.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel9.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isInt(block_10.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Size for "+block_jPanel1_jLabel10.getText(), "CarParko", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int[] blocks = new int[10];
            Arrays.fill(blocks, 0);
            
            blocks[0] = Integer.parseInt(block_1.getText());
            blocks[1] = Integer.parseInt(block_2.getText());
            blocks[2] = Integer.parseInt(block_3.getText());
            blocks[3] = Integer.parseInt(block_4.getText());
            blocks[4] = Integer.parseInt(block_5.getText());
            blocks[5] = Integer.parseInt(block_6.getText());
            blocks[6] = Integer.parseInt(block_7.getText());
            blocks[7] = Integer.parseInt(block_8.getText());
            blocks[8] = Integer.parseInt(block_9.getText());
            blocks[9] = Integer.parseInt(block_10.getText());
            
//            JOptionPane.showMessageDialog(this, "Array: "+Arrays.toString(blocks));
            Homepage hm = new Homepage(blocks);
            hm.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_block_submitActionPerformed

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
            java.util.logging.Logger.getLogger(DefineBlockSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefineBlockSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefineBlockSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefineBlockSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefineBlockSize().setVisible(true);
            }
        });
    }
    
    public boolean isInt(String s) {
        boolean isValidInt = false;
        
        try {
            Integer.parseInt(s);
            isValidInt = true;
        }
        catch (NumberFormatException e) {
            // exception code goes here
        }
        
        return isValidInt;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField block_1;
    private javax.swing.JTextField block_10;
    private javax.swing.JTextField block_2;
    private javax.swing.JTextField block_3;
    private javax.swing.JTextField block_4;
    private javax.swing.JTextField block_5;
    private javax.swing.JTextField block_6;
    private javax.swing.JTextField block_7;
    private javax.swing.JTextField block_8;
    private javax.swing.JTextField block_9;
    private javax.swing.JLabel block_jPanel1_jLabel1;
    private javax.swing.JLabel block_jPanel1_jLabel10;
    private javax.swing.JLabel block_jPanel1_jLabel2;
    private javax.swing.JLabel block_jPanel1_jLabel3;
    private javax.swing.JLabel block_jPanel1_jLabel4;
    private javax.swing.JLabel block_jPanel1_jLabel5;
    private javax.swing.JLabel block_jPanel1_jLabel6;
    private javax.swing.JLabel block_jPanel1_jLabel7;
    private javax.swing.JLabel block_jPanel1_jLabel8;
    private javax.swing.JLabel block_jPanel1_jLabel9;
    private javax.swing.JButton block_submit;
    private javax.swing.JLabel carparko_jLabel1;
    private javax.swing.JLabel define_block_jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
