/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import utils.*;
import entite.*;
import Idao.*;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import dao.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.text.FontBuilder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mohamed
 */
public class JFrameAuthentification extends javax.swing.JFrame {

    /**
     * Creates new form JFrameAuthentification
     */
    //private static final String VOICENAME = "kevin16";

    public JFrameAuthentification() {
        initComponents();
//        Voice voice;
//        VoiceManager vm = VoiceManager.getInstance();
//        voice = vm.getVoice(VOICENAME);
//        voice.allocate();
//        try {
//            voice.speak("Welcome to TunisiaMall");
//        } catch (Exception e) {
//        }
        String ch = "Welcome to TunisiaMall";
        Speak welcome = new Speak();
        welcome.talk(ch);
        Enregistrement.setVisible(false);
        this.setDefaultCloseOperation(JFrameAuthentification.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(new East());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jDialog1 = new javax.swing.JDialog();
        list1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ((javax.persistence.Query)null).getResultList();
        Enregistrement = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_username1 = new javax.swing.JTextField();
        jButtonenregistrement = new javax.swing.JButton();
        txt_password1 = new javax.swing.JPasswordField();
        txt_password2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Authentification = new javax.swing.JPanel();
        txt_username2 = new javax.swing.JTextField();
        txt_password4 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonlogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenu chez TunisaMall");
        setBounds(new java.awt.Rectangle(1, 0, 0, 0));
        setLocationByPlatform(true);

        Enregistrement.setVisible(false);
        Enregistrement.setToolTipText("");
        Enregistrement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Username");
        Enregistrement.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jLabel7.setText("Password");
        Enregistrement.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, -1, -1));

        txt_username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_username1ActionPerformed(evt);
            }
        });
        Enregistrement.add(txt_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 63, 111, -1));

        jButtonenregistrement.setText("Sign In");
        jButtonenregistrement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonenregistrementActionPerformed(evt);
            }
        });
        Enregistrement.add(jButtonenregistrement, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));
        Enregistrement.add(txt_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 123, 111, -1));

        txt_password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_password2ActionPerformed(evt);
            }
        });
        Enregistrement.add(txt_password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 113, -1));

        jLabel8.setText("Confirm Password");
        Enregistrement.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, -1, -1));

        jLabel9.setText("Email");
        Enregistrement.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, -1));

        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });
        Enregistrement.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 94, 111, -1));

        jLabel2.setText("Become Member");
        Enregistrement.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Enregistrement.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txt_username2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_username2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Username");

        jLabel12.setText("Password");

        jButtonlogin.setText("Login");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });

        jLabel1.setText("Login");

        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AuthentificationLayout = new javax.swing.GroupLayout(Authentification);
        Authentification.setLayout(AuthentificationLayout);
        AuthentificationLayout.setHorizontalGroup(
            AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthentificationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AuthentificationLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AuthentificationLayout.createSequentialGroup()
                        .addGroup(AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AuthentificationLayout.createSequentialGroup()
                                .addGroup(AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 66, Short.MAX_VALUE))
                            .addGroup(AuthentificationLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(Register)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_username2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txt_password4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AuthentificationLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonlogin)
                                .addGap(17, 17, 17)))))
                .addContainerGap())
        );
        AuthentificationLayout.setVerticalGroup(
            AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthentificationLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(AuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register)
                    .addComponent(jButtonlogin))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(Authentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Enregistrement, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Authentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enregistrement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_username1ActionPerformed

    private void txt_password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_password2ActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_username2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_username2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_username2ActionPerformed

    public JTextField getTxt_username2() {
        return txt_username2;
    }

    private void jButtonenregistrementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonenregistrementActionPerformed

        User U = new User();
        String pwd;
        String pwd1;
        pwd = txt_password1.getText();
        pwd1 = txt_password2.getText();
        if (pwd.equals(pwd1)) {
            try {
                U.setEmail(txt_Email.getText());
                U.setUsername(txt_username1.getText());
                U.setRoles("Client");
                U.setPassword(txt_password1.getText());
                UserDao UserDao1 = new UserDao();
                if (UserDao1.add(U)) {
                    JOptionPane.showMessageDialog(this, "User Added");
                } else {
                    JOptionPane.showMessageDialog(this, "User Exist");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Entreé non valide ou utilisateur existe");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Mot de passe non compatible");

        }
    }//GEN-LAST:event_jButtonenregistrementActionPerformed

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        UserDao u = new UserDao();
        u.login(txt_username2.getText(), txt_password4.getText());
        // String ch = jComboBoxRole1.getSelectedItem().toString().toLowerCase();
        //  String ch = (u.getrole(txt_username2.getText().toString());
        float x = u.getrole(txt_username2.getText());
        System.out.println(x);

        if (x == 0) {
            JFrameAdmin J = new JFrameAdmin();
            J.setVisible(true);
        } else if (x == 1) {
            JOptionPane.showMessageDialog(this, "responsable");
        } else if (x == 2) {
            JOptionPane.showMessageDialog(this, "client");
        } else {
            JOptionPane.showMessageDialog(this, "ssssssssssss");
        }

    }//GEN-LAST:event_jButtonloginActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        Enregistrement.setVisible(true);
        Authentification.setVisible(false);
    }//GEN-LAST:event_RegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Authentification.setVisible(true);
       Enregistrement.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    public void paint(Graphics g) {
        int x = 0;
        int y = 100;
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("tahoma", Font.BOLD + Font.PLAIN, 40);
        g2.setFont(font);
        g2.setColor(Color.red);
        g2.drawString("", x, y);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        x += 10;
        if (x > this.getWidth()) {
            x = 0;
        }
        repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Authentification;
    private javax.swing.JPanel Enregistrement;
    private javax.swing.JButton Register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonenregistrement;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private java.util.List list1;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JPasswordField txt_password1;
    private javax.swing.JPasswordField txt_password2;
    private javax.swing.JPasswordField txt_password4;
    private javax.swing.JTextField txt_username1;
    private javax.swing.JTextField txt_username2;
    // End of variables declaration//GEN-END:variables
}
