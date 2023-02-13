import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Start {
    public static void main(String[] args) {

        try {

            FornitoreDAO fornitoreDAO = new FornitoreDAO();
            fornitoreDAO.getFornitorebyPartitaIva("1");

            Fornitore fornitore = fornitoreDAO.getFornitorebyPartitaIva("65564");
            System.out.println(fornitore);

            AcquistoConFatturaDAO acquistoConFatturaDAO = new AcquistoConFatturaDAO();
            System.out.println(acquistoConFatturaDAO.getAcquistoByFornitore(1));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
