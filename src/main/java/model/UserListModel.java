/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author m.perot
 */
public class UserListModel extends AbstractTableModel {

    //Attributs
    private final String[] nomColumn = {"ID", "Nom", "Prénom", "Mail"};
    private ArrayList<User> userList = new ArrayList<User>();

    public UserListModel() {
        this.userList.add(new User(1, "SAGE", "Matéo", "mateo.sage@gmail.com"));
        this.userList.add(new User(2, "XIONG", "Teddy", "teddy.xiong@gmail.com"));
        this.userList.add(new User(3, "ZIMMERMANN", "Ethane", "ethane.zimmermann@gmail.com"));
        this.userList.add(new User(4, "MARQUEZ", "Paul", "paul.marquez@gmail.com"));
        this.userList.add(new User(5, "PINA", "Ronald", "ronald.pina@gmail.com"));
        this.userList.add(new User(6, "TALSEUM", "Eliaz", "eliaz.talseum@gmail.com"));
        this.userList.add(new User(7, "BASCK", "Emmanuel", "emmanuel.basck@gmail.com"));
        this.userList.add(new User(8, "CRANE", "Lewis", "lewis.crane@gmail.com"));
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

    public Object getValueAt(int rowIndex, int columnIndex) {
        User i = userList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return i.getId();
            case 1:
                return i.getName();
            case 2:
                return i.getPrenom();
            case 3:
                return i.getMail();
        }
        return "Non Défini";
    }
}
