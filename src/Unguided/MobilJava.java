package Unguided;

/**
 *
 * @author FarelPahlevi_2211103008
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MobilJava {

    public static void main(String[] args) {
        Bus b = new Bus();
        Sedan s = new Sedan();
        MiniBus mb = new MiniBus();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("1. Sedan");
            System.out.print("Nomor Plat: ");
            s.NoPlat = br.readLine();
            System.out.print("Merk: ");
            s.Merk = br.readLine();
            System.out.print("Pajak: ");
            s.Pajak = Integer.parseInt(br.readLine());
            System.out.print("Fasilitas Keamanan: ");
            s.FasilitasKemanan = br.readLine();
            System.out.print("Fasilitas Kenyamanan: ");
            s.FasilitasKenyamanan = br.readLine();
            System.out.print("Kapasitas cc: ");
            s.KapasitasCC = Integer.parseInt(br.readLine());
            System.out.println();
            s.HitungPajakSedan();
            s.TampilInfo();
            s.InfoSedan();
            System.out.println("");

            System.out.println("2. Bus");
            System.out.print("Nomor Plat: ");
            b.NoPlat = br.readLine();
            System.out.print("Merk: ");
            b.Merk = br.readLine();
            System.out.print("Pajak: ");
            b.Pajak = Integer.parseInt(br.readLine());
            System.out.print("Kapasitas Penumpang: ");
            b.KapasitasPenumpang = Integer.parseInt(br.readLine());
            System.out.print("Kapasitas Bagasi: ");
            b.KapasitasBagasi = Integer.parseInt(br.readLine());
            System.out.println();
            b.HitungPajakBus();
            b.TampilInfo();
            b.InfoBus();
            System.out.println("");
            
            System.out.println("3. MiniBus");
            System.out.print("Nomor Plat: ");
            mb.NoPlat = br.readLine();
            System.out.print("Merk: ");
            mb.Merk = br.readLine();
            System.out.print("Pajak: ");
            mb.Pajak = Integer.parseInt(br.readLine());
            System.out.print("Tipe (1: Pribadi/2: Wagon): ");
            mb.tipe = Integer.parseInt(br.readLine());
            System.out.print("Kapasitas Penumpang: ");
            mb.KapasitasPenumpang = Integer.parseInt(br.readLine());
            System.out.print("Kapasitas Bagasi: ");
            mb.KapasitasBagasi = Integer.parseInt(br.readLine());
            System.out.print("Kapasitas CC: ");
            mb.KapasitasCC = Integer.parseInt(br.readLine());
            System.out.println();
            mb.hitungPajakMiniBus();
            mb.TampilInfo();
            mb.InfoBus();
            mb.InfoMiniBus();
            System.out.println("");
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
