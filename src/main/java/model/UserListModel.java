/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.UtilisateurDAO;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import view.MainView;

/**
 *
 * @author m.perot
 */
public class UserListModel extends AbstractTableModel {

    //Attributs
    private final String[] nomColumn = {"ID", "Nom", "Prénom", "Mail"};
    private ArrayList<Utilisateur> userList = new ArrayList<>();
    
    private UtilisateurDAO connexionDao = new UtilisateurDAO();
    
    private final Connection connexion;
    private UtilisateurDAO userData = new UtilisateurDAO();
    private TableModelEvent newUtilisateur = new TableModelEvent(this); 
         

    public UserListModel() {      
        this.connexion = MySQLConnection.getConnexion();
        this.userList = this.userData.getAll();
        
        
    }

    public void fireChangements(TableModelEvent e){
        this.fireTableChanged(e);
    }
    
    
    
    public String getColumnName(int column) {
        return this.nomColumn[column];
    }

    public int getRowCount() {
        return this.userList.size();
    }

    public int getColumnCount() {
        return this.nomColumn.length;
    }
    
    public void update(int id, String nom, String prenom, String mail, String identifiant, String password) {
        this.userData.update(new User(id, nom, prenom, mail, identifiant, password));
        this.userList = this.userData.getAll();
        this.fireTableDataChanged();
    }

    public void delete(int id){
        this.userData.delete(this.userList.get(id));
        this.userData.getAll();
        this.fireTableDataChanged();
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        Utilisateur i = userList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return i.getId();
            case 1:
                return i.getNom();
            case 2:
                return i.getPrenom();
            case 3:
                return i.getMail();
            case 4:
                return i.getIdentifiant();
            case 5:
                return i.getPassword();
        }
        return "Non Défini";
    }
}
