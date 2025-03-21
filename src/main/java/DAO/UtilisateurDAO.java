package DAO;

import model.MySQLConnection;
import model.Utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UtilisateurDAO {

    private Connection connexion;

    public UtilisateurDAO() throws Exception {
        this.connexion = MySQLConnection.getConnexion();
    }

    public Utilisateur create(Utilisateur utilisateur) {
        try {
            Connection con = this.connexion;
            String sql = "INSERT INTO utilisateur (ID, NOM, PRENOM, ADRESSE_MAIL, IDENTIFIANT, MOT_DE_PASSE,) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, utilisateur.getID());
            ps.setString(2, utilisateur.getNOM());
            ps.setString(3, utilisateur.getPRENOM());
            ps.setString(4, utilisateur.getADRESSE_MAIL());
            ps.setString(5, utilisateur.getIDENTIFIANT());
            ps.setInt(6, utilisateur.getMOT_DE_PASSE());
            ps.executeUpdate();
            return utilisateur;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
            return utilisateur;
        }
    }

    public List<Utilisateur> getAll() {
        List<Utilisateur> utilisateur = new ArrayList<Utilisateur>();
        String query = "SELECT * FROM UTILISATEUR";
        Statement statement;
        try {
            statement = this.connexion.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                int id = Integer.parseInt(result.getString("ID"));
                String nom = result.getString("NOM");
                String prenom = result.getString("PRENOM");
                String adresse_mail = result.getString("ADRESSE_MAIL");
                String identifiant = result.getString("IDENTIFIANT");
                int mot_de_passe = Integer.parseInt(result.getString("MOT_DE_PASSE"));

                Utilisateur utilisateur2 = new Utilisateur(id, nom, prenom, adresse_mail, identifiant, mot_de_passe);
                utilisateur.add(utilisateur2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return utilisateur;
    }

    public static Connection getConnexion() {
        return getConnexion();
    }

    public Utilisateur update(Utilisateur utilisateur) {
        try {
            Connection connection = this.connexion;
            String sql = "UPDATE utilisateur set ID = ?, NOM = ?, PRENOM = ?, ADRESSE_MAIL = ?, IDENTIFIANT = ?, MOT_DE_PASSE = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, utilisateur.getID());
            ps.setString(2, utilisateur.getNOM());
            ps.setString(3, utilisateur.getPRENOM());
            ps.setString(4, utilisateur.getADRESSE_MAIL());
            ps.setString(5, utilisateur.getIDENTIFIANT());
            ps.setInt(6, utilisateur.getMOT_DE_PASSE());
            ps.executeUpdate();
            return utilisateur;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la modification de l'utilisateur");
            return utilisateur;
        }
    }

    public Utilisateur delete(Utilisateur utilisateur) {
        try {
            Connection connection = this.connexion;
            String sql = "DELETE FROM utilisateur ID = ?, NOM = ?, PRENOM = ?, ADRESSE_MAIL = ?, IDENTIFIANT = ?, MOT_DE_PASSE = ?";
            PreparedStatement ps = connection.prepareStatement(sql);;
            ps.setInt(1, utilisateur.getID());
            ps.setString(2, utilisateur.getNOM());
            ps.setString(3, utilisateur.getPRENOM());
            ps.setString(4, utilisateur.getADRESSE_MAIL());
            ps.setString(5, utilisateur.getIDENTIFIANT());
            ps.setInt(6, utilisateur.getMOT_DE_PASSE());
            ps.executeUpdate();
            return utilisateur;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la suppression de l'utilisateur");
            return utilisateur;
        }
    }
}
