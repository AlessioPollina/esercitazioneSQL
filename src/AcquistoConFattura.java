import java.util.Date;

public class AcquistoConFattura {

    private int idFattura;
    private int numeroDocumento;

    private int importoFattura;
    private String descrizione;

    private int idAcquisti;

    private Date data;

    private int importoAcquisti;

    private int idfornitoreAcquisto;

    private int idFornitoreFattura;


    public int getIdFattura() {
        return idFattura;
    }



    public void setIdFattura(int idFattura) {
        this.idFattura = idFattura;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getImportoFattura() {
        return importoFattura;
    }

    public void setImportoFattura(int importoFattura) {
        this.importoFattura = importoFattura;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getIdAcquisti() {
        return idAcquisti;
    }

    public void setIdAcquisti(int idAcquisti) {
        this.idAcquisti = idAcquisti;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getImportoAcquisti() {
        return importoAcquisti;
    }

    public void setImportoAcquisti(int importoAcquisti) {
        this.importoAcquisti = importoAcquisti;
    }

    public int getIdfornitoreAcquisto() {
        return idfornitoreAcquisto;
    }

    public void setIdfornitoreAcquisto(int idfornitoreAcquisto) {
        this.idfornitoreAcquisto = idfornitoreAcquisto;
    }

    public int getIdFornitoreFattura() {
        return idFornitoreFattura;
    }

    public void setIdFornitoreFattura(int idFornitoreFattura) {
        this.idFornitoreFattura = idFornitoreFattura;
    }

    @Override
    public String toString() {
        return "AcquistoConFattura{" +
                "idFattura=" + idFattura +
                ", numeroDocumento=" + numeroDocumento +
                ", importoFattura=" + importoFattura +
                ", descrizione='" + descrizione + '\'' +
                ", idAcquisti=" + idAcquisti +
                ", data=" + data +
                ", importoAcquisti=" + importoAcquisti +
                ", idfornitoreAcquisto=" + idfornitoreAcquisto +
                ", idFornitoreFattura=" + idFornitoreFattura +
                '}';
    }
}
