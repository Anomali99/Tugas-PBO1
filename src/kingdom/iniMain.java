package kingdom;

/**
 *
 * @author fatiq
 */
public class iniMain {
    public static void main(String[] args) {
        Mamalia mahasiswa = new Mamalia();
        mahasiswa.setCiriKhas("Berakal");
        mahasiswa.setCaraReproduksi("Vivipar");
        mahasiswa.setHabitan("Kampus");
        mahasiswa.setNama("Budi");
        mahasiswa.setNamaLatin("Homo Sapiens");
        mahasiswa.setJenisMakanan("Omnivora");
        
        System.out.println("Nama saya "+ mahasiswa.getNama());
        System.out.println("Saya termasuk "+ mahasiswa.getNamaLatin());
        System.out.println("Habitan saya di "+ mahasiswa.getHabitan());
        System.out.println("Makanan saya "+ mahasiswa.Makan()+ " atau biasa disebut "+ mahasiswa.getJenisMakanan());
        System.out.println("Saya berkembang biak dengan "+ mahasiswa.Reproduksi()+ " atau biasa disebut "+ mahasiswa.getCaraReproduksi());
        System.out.println("Ciri khas saya adalah "+ mahasiswa.getCiriKhas());
    }
}
