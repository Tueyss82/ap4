/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import model.UserListModel;
import view.MainView;
import view.ModifDialog;
import view.AjoutDialog;
import view.DeleteDialog;




/**
 *
 * @author m.perot
 */
public class MainControl implements PropertyChangeListener {

    private MainView view;
    private ModifDialog modifDialog;
    private UserListModel userListModel;
    private AjoutDialog ajoutDialog;
//    private UtilisateurDAO 

    public MainControl(MainView v) {
        this.view = v;
        this.view.addPropertyChangeListener(this);
        this.userListModel = new UserListModel();
        this.view.setTableModel(userListModel);

        this.ajoutDialog=new AjoutDialog(this.view,true);
        this.ajoutDialog.addPropertyChangeListener(this);

        this.modifDialog = new ModifDialog(this.view, true);
        this.modifDialog.addPropertyChangeListener(this);

    }

    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case "ajoutUser":
                this.ajoutDialog.setVisible(true);
                break;
            case "deleteUser":
                int idUser = this.view.getSelectedId();
                this.userListModel.delete(idUser);
                break;
            case "openModifDialog":
                modifDialog.setId(this.view.getSelectedId());
                modifDialog.setNom(this.view.getSelectedNom());
                modifDialog.setPrenom(this.view.getSelectedPrenom());
                modifDialog.setEmail(this.view.getSelectedEmail());
                modifDialog.setIdentifiant(this.view.getSelectedIdentifiant());
                modifDialog.setPassword(this.view.getSelectedPassword());

                modifDialog.setVisible(true);
                break;
            case "updateUser":
                userListModel.update(
                        modifDialog.getId(),
                        modifDialog.getNom(),
                        modifDialog.getPrenom(),
                        modifDialog.getEmail(),
                        modifDialog.getIdentifiant(),
                        modifDialog.getPassword());
                
                modifDialog.setVisible(false);
                break;                        
            }
        }
    }


