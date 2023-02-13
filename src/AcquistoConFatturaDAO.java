import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcquistoConFatturaDAO {

    public List getAcquistoByFornitore(int idFornitore)throws Exception{

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/simulazione", "root","");

        PreparedStatement statement = connection.prepareStatement("select * from fattura as fa" +
                "inner join acquisti as ac " +
                "on fa.acquisti_idacquisti = ac.idAcquisti " +
                "where ac.Fornitori_idFornitore = ?");

        statement.setInt(1, idFornitore);

        ResultSet resultSet = statement.executeQuery();

        List<AcquistoConFattura> acquisti = new ArrayList<>();

        while(resultSet.next()){
            int idFattura = resultSet.getInt("idFattura");
            int numeroDocumento = resultSet.getInt("numeroDocumento");
            int importoFattura = resultSet.getInt("fattura.importo");
            String descrizione = resultSet.getString("descrizione");
            int idAcquisti = resultSet.getInt("idAcquisti");
            Date data = resultSet.getDate("data");
            int importoAcquisti = resultSet.getInt("acquisti.importo");
            int idfornitoreAcquisto = resultSet.getInt("acquisti.Fornitore_idFornitore");
            int idFornitoreFattura = resultSet.getInt("fa.acquisti_idacquisti");


            AcquistoConFattura acquistoConFattura = new AcquistoConFattura();
            acquistoConFattura.setIdFattura(idFattura);
            acquistoConFattura.setNumeroDocumento(numeroDocumento);
            acquistoConFattura.setImportoFattura(importoFattura);
            acquistoConFattura.setDescrizione(descrizione);
            acquistoConFattura.setIdAcquisti(idAcquisti);
            acquistoConFattura.setData(data);
            acquistoConFattura.setImportoAcquisti(importoAcquisti);
            acquistoConFattura.setIdfornitoreAcquisto(idfornitoreAcquisto);
            acquistoConFattura.setIdFornitoreFattura(idFornitoreFattura);

            acquisti.add(acquistoConFattura);

        }

        return acquisti;

    }
}
