import java.sql.*;

public class FornitoreDAO {



    public Fornitore getFornitorebyPartitaIva(String pIva) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/simulazione", "root","");

        PreparedStatement statement = connection.prepareStatement("Select * from fornitori where `p.Iva` = ?");

        statement.setString(1, pIva);

        ResultSet resultSet = statement.executeQuery("Select * from fornitori where `p.Iva` = '" + pIva + "'");





        if(resultSet.next()){
            int idFornitore = resultSet.getInt("idFornitore");
            String paIva = resultSet.getString("p.Iva");
            String ragioneSociale = resultSet.getString("ragioneSociale");
            String indirizzo = resultSet.getString("indirizzo");

            Fornitore fornitore = new Fornitore();
            fornitore.setpIva(paIva);
            fornitore.setIdFornitore(idFornitore);
            fornitore.setIndirizzo(indirizzo);
            fornitore.setRagioneSociale(ragioneSociale);

            return fornitore;



        }else {
            return null;
        }

    }
}
