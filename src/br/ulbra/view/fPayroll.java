/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import java.text.DecimalFormat;

/**
 *
 * @author s.lucas
 */
public class fPayroll extends javax.swing.JFrame {

    /**
     * Creates new form fPayroll
     */
    public fPayroll() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNomeFuncionario = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbQtdHoras = new javax.swing.JLabel();
        txtQuantHoras = new javax.swing.JTextField();
        lbValorHora = new javax.swing.JLabel();
        txtValorHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantFilhos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHorasExt = new javax.swing.JTextField();
        btnGerarFolha = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lbResult = new javax.swing.JLabel();
        lbResult1 = new javax.swing.JLabel();
        lbResult2 = new javax.swing.JLabel();
        lbResult3 = new javax.swing.JLabel();
        lbResult4 = new javax.swing.JLabel();
        lbResult5 = new javax.swing.JLabel();
        lbResult6 = new javax.swing.JLabel();
        lbResult7 = new javax.swing.JLabel();
        lbResult8 = new javax.swing.JLabel();
        lbResult9 = new javax.swing.JLabel();
        txtQuantHorExtR = new javax.swing.JLabel();
        txtVlHorExtR = new javax.swing.JLabel();
        txtVlSalFamR = new javax.swing.JLabel();
        txtSalLiqR = new javax.swing.JLabel();
        txtNomeR = new javax.swing.JLabel();
        txtQuantHorR = new javax.swing.JLabel();
        txtSalBrutR = new javax.swing.JLabel();
        txtDescINSSR = new javax.swing.JLabel();
        txtDescIRR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 222, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FOLHA DE PAGAMENTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lbNomeFuncionario.setText("Funcionário nome:");
        jPanel1.add(lbNomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 430, -1));

        lbQtdHoras.setText("Quant. Horas:");
        jPanel1.add(lbQtdHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, -1));
        jPanel1.add(txtQuantHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, -1));

        lbValorHora.setText("Valor Hora:");
        jPanel1.add(lbValorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        txtValorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorHoraActionPerformed(evt);
            }
        });
        jPanel1.add(txtValorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 70, -1));

        jLabel5.setText("Quant. Filhos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, -1));
        jPanel1.add(txtQuantFilhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 70, -1));

        jLabel6.setText("Quant. Horas Extras:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        txtHorasExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasExtActionPerformed(evt);
            }
        });
        jPanel1.add(txtHorasExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 70, -1));

        btnGerarFolha.setBackground(new java.awt.Color(255, 255, 255));
        btnGerarFolha.setText("Gerar Folha");
        btnGerarFolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarFolhaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGerarFolha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        lbResult.setText("Holerite - Maio/2023");
        lbResult.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lbResult1.setText("Funcionário: ");
        lbResult1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lbResult2.setText("Quant. Horas:");
        lbResult2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lbResult3.setText("Desconto INSS:");
        lbResult3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        lbResult4.setText("Salário Bruto:");
        lbResult4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        lbResult5.setText("Desconto IR:");
        lbResult5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        lbResult6.setText("Quant. Horas Extras:  ");
        lbResult6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        lbResult7.setText("Valor Horas Extras: ");
        lbResult7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        lbResult8.setText("Valor Sal. Família:");
        lbResult8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        lbResult9.setText("Salario líquido: ");
        lbResult9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbResult9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        txtQuantHorExtR.setText("????");
        txtQuantHorExtR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtQuantHorExtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        txtVlHorExtR.setText("????");
        txtVlHorExtR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtVlHorExtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        txtVlSalFamR.setText("????");
        txtVlSalFamR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtVlSalFamR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        txtSalLiqR.setText("????");
        txtSalLiqR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtSalLiqR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        txtNomeR.setText("????");
        txtNomeR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtNomeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        txtQuantHorR.setText("????");
        txtQuantHorR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtQuantHorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        txtSalBrutR.setText("????");
        txtSalBrutR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtSalBrutR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        txtDescINSSR.setText("????");
        txtDescINSSR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtDescINSSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        txtDescIRR.setText("????");
        txtDescIRR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtDescIRR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarFolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarFolhaActionPerformed
        String nome;
        double valorHora;
        int quantFilhos, hora, quantHorasExt, salFamilia;
        Double salarioBruto, horasExtras, descontoINSS = 0.0, descontoIR = 0.0, salarioLiquido;
        DecimalFormat f = new DecimalFormat("R$ #,###,###,##0.00");
        DecimalFormat n = new DecimalFormat("#,###,###,###,##0");
        
        
        nome = txtNome.getText();
        hora = Integer.parseInt(txtQuantHoras.getText());
        valorHora = Double.parseDouble(txtValorHora.getText());
        quantFilhos = Integer.parseInt(txtQuantFilhos.getText());
        quantHorasExt = Integer.parseInt(txtHorasExt.getText());

        salarioBruto = hora * valorHora;
        horasExtras = quantHorasExt * valorHora * 1.5;
        salFamilia = quantFilhos * 15;

        if (salarioBruto <= 1320.00){
            descontoINSS = salarioBruto * 0.075;
        } else if (salarioBruto > 1320.00 && salarioBruto <= 2571.29){
            descontoINSS = salarioBruto * 0.09;
        } else if (salarioBruto > 2571.29 && salarioBruto <= 3856.94){
            descontoINSS = salarioBruto * 0.12;
        } else if (salarioBruto > 3856.94){
            descontoINSS = salarioBruto * 0.14;
        }

        if (salarioBruto < 1903.09){
            descontoIR = 0.0;
        } else if (salarioBruto >= 1903.09 && salarioBruto <= 2826.65){
            descontoIR = salarioBruto * 0.075;
        } else if (salarioBruto > 2826.65 && salarioBruto <= 3751.05){
            descontoIR = salarioBruto * 0.15;
        } else if (salarioBruto > 3751.05 && salarioBruto <= 4664.68){
            descontoIR = salarioBruto * 0.225;
        } else if (salarioBruto > 4664.68){
            descontoIR = salarioBruto * 0.275;
        }

        salarioLiquido = salarioBruto + salFamilia + horasExtras - descontoINSS - descontoIR;

        txtNomeR.setText(nome);
        txtQuantHorR.setText(String.valueOf(n.format(hora)));
        txtSalBrutR.setText(String.valueOf(f.format(salarioBruto)));
        txtDescINSSR.setText(String.valueOf(f.format(descontoINSS)));
        txtDescIRR.setText(String.valueOf(f.format(descontoIR)));
        txtQuantHorExtR.setText(String.valueOf(n.format(quantHorasExt)));
        txtVlHorExtR.setText(String.valueOf(f.format(horasExtras)));
        txtVlSalFamR.setText(String.valueOf(f.format(salFamilia)));
        txtSalLiqR.setText(String.valueOf(f.format(salarioLiquido)));
        
        txtNome.setText("");
        txtQuantHoras.setText("");
        txtValorHora.setText("");
        txtQuantFilhos.setText("");
        txtHorasExt.setText("");

    }//GEN-LAST:event_btnGerarFolhaActionPerformed

    private void txtValorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorHoraActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNomeR.setText("");
        txtQuantHorR.setText("");
        txtSalBrutR.setText("");
        txtDescINSSR.setText("");
        txtDescIRR.setText("");
        txtQuantHorExtR.setText("");
        txtVlHorExtR.setText("");
        txtVlSalFamR.setText("");
        txtSalLiqR.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtHorasExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasExtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasExtActionPerformed

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
            java.util.logging.Logger.getLogger(fPayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fPayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fPayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fPayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fPayroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarFolha;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNomeFuncionario;
    private javax.swing.JLabel lbQtdHoras;
    private javax.swing.JLabel lbResult;
    private javax.swing.JLabel lbResult1;
    private javax.swing.JLabel lbResult2;
    private javax.swing.JLabel lbResult3;
    private javax.swing.JLabel lbResult4;
    private javax.swing.JLabel lbResult5;
    private javax.swing.JLabel lbResult6;
    private javax.swing.JLabel lbResult7;
    private javax.swing.JLabel lbResult8;
    private javax.swing.JLabel lbResult9;
    private javax.swing.JLabel lbValorHora;
    private javax.swing.JLabel txtDescINSSR;
    private javax.swing.JLabel txtDescIRR;
    private javax.swing.JTextField txtHorasExt;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtNomeR;
    private javax.swing.JTextField txtQuantFilhos;
    private javax.swing.JLabel txtQuantHorExtR;
    private javax.swing.JLabel txtQuantHorR;
    private javax.swing.JTextField txtQuantHoras;
    private javax.swing.JLabel txtSalBrutR;
    private javax.swing.JLabel txtSalLiqR;
    private javax.swing.JTextField txtValorHora;
    private javax.swing.JLabel txtVlHorExtR;
    private javax.swing.JLabel txtVlSalFamR;
    // End of variables declaration//GEN-END:variables
}
