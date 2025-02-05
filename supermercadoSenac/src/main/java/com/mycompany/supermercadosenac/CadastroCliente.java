/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercadosenac;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import com.mycompany.supermercadosenac.dao.ClienteDAO;
import com.mycompany.supermercadosenac.model.Cliente;

/**
 *
 * @author Bihli
 */
public class CadastroCliente extends javax.swing.JFrame {
    
    Cliente objCliente = new Cliente();

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        
        initComponents();
        setLocationRelativeTo(null);
        

        
    }
    
    public CadastroCliente(Cliente obj){
        this.objCliente = obj;
        initComponents();
        this.lblID.setText(String.valueOf(objCliente.getIdCliente()));
        this.txtCPFCliente.setText(String.valueOf(objCliente.getCPFCliente()));
        this.txtNascimentoCliente.setDate(Date.valueOf(objCliente.getDataNascimento()));
        this.txtCPFCliente.setText(String.valueOf(objCliente.getCPFCliente()));
        this.txtNomeCliente.setText(String.valueOf(objCliente.getNomeCliente()));
        this.txtEnderecoCliente.setText(String.valueOf(objCliente.getEnderecoCliente()));
        this.txtEmailCliente.setText(String.valueOf(objCliente.getEmailCliente()));
        this.cboSexoCliente.setSelectedItem(String.valueOf(objCliente.getSexoCliente()));
        this.cboEstadoCivilCliente.setSelectedItem(String.valueOf(objCliente.getEstadoCivil()));
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
        btnSalvarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        JLabel4 = new javax.swing.JLabel();
        JLabel5 = new javax.swing.JLabel();
        JLabel6 = new javax.swing.JLabel();
        JLabel7 = new javax.swing.JLabel();
        txtCPFCliente = new javax.swing.JFormattedTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtNascimentoCliente = new com.toedter.calendar.JDateChooser();
        cboSexoCliente = new javax.swing.JComboBox<>();
        cboEstadoCivilCliente = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");

        btnSalvarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome:");

        JLabel3.setText("Nascimento:");

        JLabel4.setText("Endereço:");

        JLabel5.setText("Email:");

        JLabel6.setText("Sexo:");

        JLabel7.setText("Estado Civil:");

        try {
            txtCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFClienteActionPerformed(evt);
            }
        });

        txtNascimentoCliente.setDateFormatString("dd '/' MM '/' y");
        txtNascimentoCliente.setMinimumSize(new java.awt.Dimension(80, 22));

        cboSexoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um gênero", "Masculino", "Feminino" }));

        cboEstadoCivilCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)", "Separado(a)" }));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        lblID.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(JLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLabel5)
                            .addComponent(JLabel4)
                            .addComponent(JLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEnderecoCliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboEstadoCivilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(JLabel3))
                    .addComponent(txtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(JLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel6)
                    .addComponent(cboSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel7)
                    .addComponent(cboEstadoCivilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
         if (txtCPFCliente.getValue() == null) {
            //evt.consume();
            JOptionPane.showMessageDialog(this,"Digite o CPF do cliente!");
        }
        else if (txtNomeCliente.getText().length() == 0) {
            //evt.consume();
            JOptionPane.showMessageDialog(this,"Digite o Nome do cliente!");
        }
        else if (txtNascimentoCliente.getDate() == null) {
            //evt.consume();
            JOptionPane.showMessageDialog(this,"Digite a data de nascimento do cliente!");
        }
        else if (txtEnderecoCliente.getText().length() == 0) {
            //evt.consume();
            JOptionPane.showMessageDialog(this,"Digite o endereço do cliente!");
        }
         else if (txtEmailCliente.getText().length() == 0) {
            //evt.consume();
            JOptionPane.showMessageDialog(this,"Digite o  email do cliente!");
        }
         else if (cboSexoCliente.getSelectedItem().equals("Selecione um gênero")) {
            //evt.consume();
            JOptionPane.showMessageDialog(this,"Selecione o  sexo do cliente!");
        }
         else if (cboEstadoCivilCliente.getSelectedItem().equals(" ")) {
            //evt.consume();
            JOptionPane.showMessageDialog(this,"Selecione o  estado civil do cliente!");
        }else{
             
                String pattern  = "yyyy-MM-dd";
                DateFormat formatter = new SimpleDateFormat(pattern);
             
             
             String cpfCliente = txtCPFCliente.getText();
             String nomeCliente = txtNomeCliente.getText();
             String dataNascimento = formatter.format(txtNascimentoCliente.getDate());
             String enderecoCliente = txtEnderecoCliente.getText();
             String emailCliente = txtEmailCliente.getText();
             String EstadoCivilCliente = cboEstadoCivilCliente.getSelectedItem().toString();
             String sexoCliente = cboSexoCliente.getSelectedItem().toString();
             int id = Integer.parseInt(lblID.getText());
             
             
             String[] opcoes={"Sim, confirmar", "Não, cancelar"};
            int confirmar = JOptionPane.showOptionDialog(this,"Confirmar?"
                    + "\nCPF do Cliente: " + cpfCliente + "\nNome do cliente: " + nomeCliente +
                    "\nData de Nascimento: " + dataNascimento + "\nEndereço: " + enderecoCliente + "\ne-mail: " + emailCliente + 
                    "\nEstado Civil: " + EstadoCivilCliente + "\nSexo: " + sexoCliente
                    ,"Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);
             if(confirmar==0){
                 
                 if(id==0){
                     
                 Cliente objCliente = new Cliente(nomeCliente, cpfCliente, id, enderecoCliente, dataNascimento, emailCliente, sexoCliente, EstadoCivilCliente);
                boolean retorno = ClienteDAO.cadastrar(objCliente);
                
                if (retorno) {
                    JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao cadastrar cliente!");
                }
                 }else{
                     Cliente objCliente = new Cliente(nomeCliente, cpfCliente, id, enderecoCliente, dataNascimento, emailCliente, sexoCliente, EstadoCivilCliente);
                    boolean retorno = ClienteDAO.alterar(objCliente);
                    
                if (retorno) {
                    JOptionPane.showMessageDialog(this, "Alterado com sucesso!!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao alterar cliente!");
                }
                 }
                 
             }
         }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            String[] opcoes={"Sim, cancelar", "Não, continuar"};
            int confirmar = JOptionPane.showOptionDialog(this,"Deseja cancelar o cadastro?","Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);
             if(confirmar==0){
                 dispose();
             }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JLabel JLabel7;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JComboBox<String> cboEstadoCivilCliente;
    private javax.swing.JComboBox<String> cboSexoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JFormattedTextField txtCPFCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private com.toedter.calendar.JDateChooser txtNascimentoCliente;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
