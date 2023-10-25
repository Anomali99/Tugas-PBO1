package kingdom;

/**
 *
 * @author fatiq
 */
public class Hewan extends MakhlukHidup {
    private String jenisMakanan;
    private String habitan;
    private String caraReproduksi;
    
    public String Makan(){
        if(jenisMakanan.equalsIgnoreCase("herbivora")){
            return "Makan Tumbuhan";
        } else if (jenisMakanan.equalsIgnoreCase("karnivora")){
            return "Makan Daging";
        } else if (jenisMakanan.equalsIgnoreCase("omnivora")){
            return "Makan Daging dan Tumbuhan";
        } else {
            return null;
        }
    }
    
    public String Reproduksi(){
        if(caraReproduksi.equalsIgnoreCase("vivipar")){
            return "Beranak";
        } else if (caraReproduksi.equalsIgnoreCase("ovipar")){
            return "Beltelur";
        }else if (caraReproduksi.equalsIgnoreCase("ovovivipar")){
            return "Beltelur dan Beranak";
        } else {
            return null;
        }
    }

    /**
     * @return the jenisMakanan
     */
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    /**
     * @param jenisMakanan the jenisMakanan to set
     */
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    /**
     * @return the habitan
     */
    public String getHabitan() {
        return habitan;
    }

    /**
     * @param habitan the habitan to set
     */
    public void setHabitan(String habitan) {
        this.habitan = habitan;
    }

    /**
     * @return the caraReproduksi
     */
    public String getCaraReproduksi() {
        return caraReproduksi;
    }

    /**
     * @param caraReproduksi the caraReproduksi to set
     */
    public void setCaraReproduksi(String caraReproduksi) {
        this.caraReproduksi = caraReproduksi;
    }
    
}
