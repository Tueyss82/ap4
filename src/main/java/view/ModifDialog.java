





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import DAO.UtilisateurDAO;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.sql.Connection;
import model.UserListModel;
=======
=======
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author m.perot
 */
public class ModifDialog extends javax.swing.JDialog {
    
    private int id;
    /**
     * Creates new form ModifDialog
     */
    private PropertyChangeSupport listeners = new PropertyChangeSupport(this);


































        textFieldId = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
=======
=======
        textFieldPassword = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        passwordLabel1 = new javax.swing.JLabel();
        comboBoxRole = new javax.swing.JComboBox<>();
        updateButton1 = new javax.swing.JButton();
   





        updateButton1.setText("Modifier");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        cancelButton = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        textFieldPassword = new javax.swing.JPasswordField();
                .addContainerGap(130, Short.MAX_VALUE)
=======
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)































    private javax.swing.JLabel idLabel;
=======
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifDialog dialog = new ModifDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelButton;




































































































































    private javax.swing.JLabel idLabel;
=======

    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JLabel passwordLabel;






















    private javax.swing.JLabel idLabel;
=======

    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JLabel passwordLabel;

    private javax.swing.JLabel prenomLabel;
    private javax.swing.JTextField textFieldIdentifiant;
    private javax.swing.JTextField textFieldMail;
    private javax.swing.JTextField textFieldName;
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prenomLabel)
                            .addComponent(mailLabel)
                            .addComponent(nomLabel)
                            .addComponent(identifiantLabel)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldName)
                            .addComponent(textFieldPrenom)
                            .addComponent(textFieldMail)
                            .addComponent(textFieldIdentifiant)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(updateButton1)
                        .addGap(93, 93, 93)
                        .addComponent(cancelButton)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    private javax.swing.JTextField textFieldPrenom;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables

    public void setId(Object id) {
        this.id = (int)id;
    }

    public int getId() {
        return this.id;
    }

    public void setNom(String selectedNom) {
        this.textFieldName.setText(selectedNom);
    }

    public String getNom() {
        return this.textFieldName.getText();
    }

    public void setPrenom(String selectedPrenom) {
        this.textFieldPrenom.setText(selectedPrenom);
    }

    public String getPrenom() {
        return this.textFieldPrenom.getText();
    }

    public void setEmail(String selectedMail) {
        this.textFieldMail.setText(selectedMail);
    }

    public String getEmail() {
        return this.textFieldMail.getText();
    }

    public void setIdentifiant(String selectedIdentifiant) {
        this.textFieldIdentifiant.setText(selectedIdentifiant);
    }

    public String getIdentifiant() {
        return this.textFieldIdentifiant.getText();
    }

    public void setPassword(String selectedPassword) {
        this.textFieldPassword.setText(selectedPassword);
    }

    public String getPassword() {
        return this.textFieldPassword.getText();
    }
}
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel1)
                    .addComponent(prenomLabel)
                    .addComponent(mailLabel)
                    .addComponent(nomLabel)
                    .addComponent(identifiantLabel)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(comboBoxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(360, 360, 360))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton1)
                .addGap(84, 84, 84)
                .addComponent(cancelButton)
                .addGap(447, 447, 447))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
