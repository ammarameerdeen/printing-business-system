/*
 * copyright Ammar Bin Ameerdeen
 * All rights reserved
 */
package printare_system;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


/**
 *
 * @author Ammar Bin Ameerdeen
 */
public class SendEmailFrame extends IMSFrame {
    
    IMSFrame main ;
    
    
    
    /**
     * Creates new form Template_printare
     */
    public SendEmailFrame(IMSFrame parent,String to, String subject, String cc, String message) {
        super();
        database = new Database();
        main = parent ;
        initComponents();
        Theme theme = new Theme();
        theme.setTheme(this);
         this.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        super.windowClosing(e);
                        main.setVisible(true);                        
                        dispose();
                    }
                });
         
         // whatever code must come after this
        this.to.setText(to);
        this.cc.setText(cc);
        this.messageContent.setText(message);
        this.subject.setText(subject);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = getBackgroundPanel();
        title = getFrameTitle();
        centerPanel = getCenterPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        cc = new javax.swing.JTextField();
        subject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messagePrefix = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        additionalInformation = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageContent = new javax.swing.JTextPane();
        sendEmail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        backgroundPanel.setBackground(Theme.BACKGROUND_COLOR);
        backgroundPanel.setName("backgroundPanel"); // NOI18N
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(Theme.TITLE_FONT_COLOR);
        title.setText("Send Email");
        title.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        title.setName("title"); // NOI18N
        backgroundPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        centerPanel.setBackground(new java.awt.Color(236, 198, 161));
        centerPanel.setName("centerPanel"); // NOI18N
        centerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(Theme.FONT_COLOR);
        jLabel1.setText("To:");
        jLabel1.setName("jLabel1"); // NOI18N
        centerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 18, -1, -1));

        jLabel2.setForeground(Theme.FONT_COLOR);
        jLabel2.setText("Cc:");
        jLabel2.setName("jLabel2"); // NOI18N
        centerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 51, -1, -1));

        jLabel3.setForeground(Theme.FONT_COLOR);
        jLabel3.setText("Subject:");
        jLabel3.setName("jLabel3"); // NOI18N
        centerPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 82, -1, -1));

        jLabel4.setForeground(Theme.FONT_COLOR);
        jLabel4.setText("Message Prefix:");
        jLabel4.setName("jLabel4"); // NOI18N
        centerPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 110, -1, -1));

        jLabel5.setForeground(Theme.FONT_COLOR);
        jLabel5.setText("Message:");
        jLabel5.setName("jLabel5"); // NOI18N
        centerPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 167, -1, -1));

        jLabel6.setForeground(Theme.FONT_COLOR);
        jLabel6.setText("Additional Information:");
        jLabel6.setName("jLabel6"); // NOI18N
        centerPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 322, -1, -1));

        to.setBackground(Theme.INACTIVE_TEXT_BOX_COLOR);
        to.setName("to"); // NOI18N
        centerPanel.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 13, 488, -1));

        cc.setEditable(false);
        cc.setBackground(Theme.INACTIVE_TEXT_BOX_COLOR);
        cc.setName("cc"); // NOI18N
        centerPanel.add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 46, 488, -1));

        subject.setEditable(false);
        subject.setBackground(Theme.INACTIVE_TEXT_BOX_COLOR);
        subject.setName("subject"); // NOI18N
        centerPanel.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 77, 907, -1));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        messagePrefix.setColumns(20);
        messagePrefix.setRows(5);
        messagePrefix.setName("messagePrefix"); // NOI18N
        jScrollPane1.setViewportView(messagePrefix);

        centerPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 110, 907, 55));

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        additionalInformation.setColumns(20);
        additionalInformation.setRows(5);
        additionalInformation.setName("additionalInformation"); // NOI18N
        jScrollPane3.setViewportView(additionalInformation);

        centerPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 325, 907, -1));

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        messageContent.setEditable(false);
        messageContent.setBackground(Theme.INACTIVE_TEXT_BOX_COLOR);
        messageContent.setName("messageContent"); // NOI18N
        jScrollPane2.setViewportView(messageContent);

        centerPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 177, 907, 136));

        sendEmail.setText("Send>>");
        sendEmail.setName("sendEmail"); // NOI18N
        sendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailActionPerformed(evt);
            }
        });
        centerPanel.add(sendEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 12, 173, 61));

        backgroundPanel.add(centerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1100, 460));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailActionPerformed
        // send email
    }//GEN-LAST:event_sendEmailActionPerformed

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
            java.util.logging.Logger.getLogger(SendEmailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendEmailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendEmailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendEmailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SendEmailFrame dialog = new SendEmailFrame(new IMSFrame(), "","" ,"","");
                dialog.setVisible(true);
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
    public javax.swing.JTextArea additionalInformation;
    public org.jdesktop.swingx.JXPanel backgroundPanel;
    public javax.swing.JTextField cc;
    public javax.swing.JPanel centerPanel;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextPane messageContent;
    public javax.swing.JTextArea messagePrefix;
    public javax.swing.JButton sendEmail;
    public javax.swing.JTextField subject;
    public org.jdesktop.swingx.JXLabel title;
    public javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
