package DAO;

import model.MySQLConnection;
import model.Client;
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
            ps.setInt(2, client.getRAISON_SOCIAL());
            ps.setString(3, client.getNOM());
            ps.setString(4, client.getPRENOM());
            ps.setString(5, client.getEMAIL());
            ps.setInt(6, client.getTELEPHONE());
            ps.setString(7, client.getADRESSE());
            ps.setInt(8, client.getCODE_POSTAL());
            ps.setString(9, client.getVILLE());
            ps.executeUpdate();
            return client;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création du client");
            return client;
        }
    }

    public List<Client> getAll() {
        List<Client> client = new ArrayList<Client>();
        String query = "SELECT * FROM CLIENT";
        Statement statement;
        try {
            statement = this.connexion.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                int id = Integer.parseInt(result.getString("ID_CLIENT"));
                int raison_sociale = Integer.parseInt(result.getString("RAISON_SOCIAL"));
                String nom = result.getString("NOM");
                String prenom = result.getString("PRENOM");
                String email = result.getString("EMAIL");
                int telephone = Integer.parseInt(result.getString("TELEPHONE"));
                String adresse = result.getString("ADRESSE");
                int code_postal = Integer.parseInt(result.getString("CODE_POSTAL"));
                String ville = result.getString("VILLE");
          
            Client client2 = new Client(id, raison_sociale, nom, prenom, email, telephone, adresse, code_postal, ville);
            client.add(client2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return client;
    }

    public static Connection getConnexion() {
        return getConnexion();
    }

    public Client update(Client client) {
        try {
            Connection connection = this.connexion;
            String sql = "UPDATE client set ID_CLIENT = ?, RAISON_SOCIAL = ?, NOM = ?, PRENOM = ?, EMAIL = ?, TELEPHONE = ?, ADRESSE = ?, CODE_POSTAL = ?, CODE_POSTAL = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getID_CLIENT());
            ps.setInt(2, client.getRAISON_SOCIAL());
            ps.setString(3, client.getNOM());
            ps.setString(4, client.getPRENOM());
            ps.setString(5, client.getEMAIL());
            ps.setInt(6, client.getTELEPHONE());
            ps.setString(7, client.getADRESSE());
            ps.setInt(8, client.getCODE_POSTAL());
            ps.setString(9, client.getVILLE());
            ps.executeUpdate();
            return client;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la modification de l'utilisateur");
            return client;
        }
    }

    public Client delete(Client client) {
        try {
            Connection connection = this.connexion;
            String sql = "DELETE FROM client ID_CLIENT = ?, RAISON_SOCIAL = ?, NOM = ?, PRENOM = ?, EMAIL = ?, TELEPHONE = ?, ADRESSE = ?, CODE_POSTAL = ?, VILLE = ?";
            PreparedStatement ps = connection.prepareStatement(sql);;
           ps.setInt(1, client.getID_CLIENT());
            ps.setInt(2, client.getRAISON_SOCIAL());
            ps.setString(3, client.getNOM());
            ps.setString(4, client.getPRENOM());
            ps.setString(5, client.getEMAIL());
            ps.setInt(6, client.getTELEPHONE());
            ps.setString(7, client.getADRESSE());
            ps.setInt(8, client.getCODE_POSTAL());
            ps.setString(9, client.getVILLE());
            ps.executeUpdate();
            return client;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la suppression de l'utilisateur");
            return client;
        }
    }
}
