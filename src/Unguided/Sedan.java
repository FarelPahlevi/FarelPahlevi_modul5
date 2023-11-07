package Unguided;

/**
 *
 * @author FarelPahlevi_2211103008
 */
public class Sedan extends Mobil implements InterfaceSedan{
    protected String FasilitasKemanan;
    protected int KapasitasCC;
    protected String FasilitasKenyamanan;
    protected float TotalPajak;
    
    public Sedan(){
        
    }
    
    @Override
    public float HitungPajakSedan(){
        TotalPajak = (float) (Pajak + (Pajak + (Pajak * KapasitasCC * 0.00005)));
        return TotalPajak;
    }
    
    @Override
    public void tampilInfo(){
        System.out.println("Info Mobil");
        TampilInfo();
    }
    
    @Override
    public void InfoSedan(){
        System.out.println("Fasilitas Keamanan: " + FasilitasKemanan);
        System.out.println("Fasilitas Kenyamanan: " + FasilitasKenyamanan);
        System.out.println("Kapasitas CC: " + KapasitasCC);
        System.out.println("Total Pajak: " + TotalPajak);
    }
}
