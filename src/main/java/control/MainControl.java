/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;
import model.UserListModel;
import view.MainView;

/**
 *
 * @author m.perot
 */
public class MainControl implements PropertyChangeListener {

    private MainView view;
    private UserListModel userListModel;

    public MainControl(MainView v) {
        this.view = v;
        this.view.addPropertyChangeListener(this);
        this.userListModel = new UserListModel();
        this.view.setTableModel(userListModel);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case "validModifUser":
                JOptionPane.showMessageDialog(this.view, this.view.message("Test Modif User Button"));
                break;
            case "validNouveauUser":
                JOptionPane.showMessageDialog(this.view, this.view.message("Test Nouveau User Button"));
                break;
        }
    }

}
