/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import model.UserListModel;
import view.MainView;
import view.ModifDialog;
import view.AjoutDialog;

/**
 *
 * @author m.perot
 */
public class MainControl implements PropertyChangeListener {

    private MainView view;
    private ModifDialog modifDialog;
    private UserListModel userListModel;
    private AjoutDialog ajoutDialog;
    
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
            case "modifUser":
                this.modifDialog.setVisible(true);
                break;
            case "ajoutuser":
                this.ajoutDialog.setVisible(true);
                break;
        }
    }

}
