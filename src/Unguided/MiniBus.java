package Unguided;

/**
 *
 * @author FarelPahlevi_2211103008
 */
public class MiniBus extends Mobil implements InterfaceSedan,InterfaceBus{
    public int tipe;
    public int KapasitasCC;
    public int KapasitasPenumpang;
    public int KapasitasBagasi;
    private float TotalPajak;
    
    public MiniBus(){
        
    }
    
    public void InfoMiniBus(){
        if(tipe==1){
            System.out.println("Tipe: Pribadi, digunakan sebagai kendaraan pribadi");
        }else if(tipe==2){
            System.out.println("Tipe: Wagon, digunakan sebagai kendaraan travel");
        }else{
            System.out.println("Pilihan salah om");
        }
    }
    
    public void tampilInfo(){
        TampilInfo();
        InfoBus();
        InfoSedan();
        System.out.println("Total Pajak: " + TotalPajak);
        InfoMiniBus();
    }
    
    public float hitungPajakMiniBus(){
        if(tipe==1){
            TotalPajak = (float) ((HitungPajakSedan()* 0.05) + (HitungPajakBus()* 0.03));
        }else if(tipe==2){
            TotalPajak = (float) ((HitungPajakSedan() * 0.03) + (HitungPajakBus()* 0.05));
        }else{
            System.out.println("pilihan salah");
        }
        return TotalPajak;
    }

    @Override
    public float HitungPajakSedan() {
        TotalPajak = (float) (Pajak + (Pajak + (Pajak * KapasitasCC * 0.00005)));
        return TotalPajak;
    }

    @Override
    public float HitungPajakBus() {
        TotalPajak = (float) (Pajak + (Pajak * KapasitasPenumpang * KapasitasBagasi * 0.00005));
        return TotalPajak;
    }

    @Override
    public void InfoBus() {
        System.out.println("Kapasitas penumpang: " + KapasitasPenumpang);
        System.out.println("Kapasitas bagasi: " + KapasitasBagasi);
        System.out.println("Total Pajak: " + TotalPajak);
    }

    @Override
    public void InfoSedan() {
        System.out.println("Kapasitas CC: " + KapasitasCC);
    }
}
