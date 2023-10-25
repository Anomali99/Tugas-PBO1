package kingdom;

/**
 *
 * @author fatiq
 */
public class MakhlukHidup {
    private String nama;
    private String namaLatin;
    private String ciriKhas;
    
    protected boolean Bernafas(){
        return true;
    }
    
    protected boolean Tumbuh(){
        return true;
    }
    
    protected boolean Bergerak(){
        return true;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the namaLatin
     */
    public String getNamaLatin() {
        return namaLatin;
    }

    /**
     * @param namaLatin the namaLatin to set
     */
    public void setNamaLatin(String namaLatin) {
        this.namaLatin = namaLatin;
    }

    /**
     * @return the ciriKhas
     */
    public String getCiriKhas() {
        return ciriKhas;
    }

    /**
     * @param ciriKhas the ciriKhas to set
     */
    public void setCiriKhas(String ciriKhas) {
        this.ciriKhas = ciriKhas;
    }
}
