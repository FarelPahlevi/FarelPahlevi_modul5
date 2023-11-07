/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author FarelPahlevi_2211103008
 */
public class Bus extends Mobil implements InterfaceBus{
    protected int KapasitasPenumpang;
    protected int KapasitasBagasi;
    protected float TotalPajak;
    
    public Bus(){
        
    }
    
    @Override
    public float HitungPajakBus(){
        TotalPajak = (float) (Pajak + (Pajak * KapasitasPenumpang * KapasitasBagasi * 0.00005));
        return TotalPajak;
    }
    
    @Override
    public void tampilInfo(){
        TampilInfo();
    }
    
    @Override
    public void InfoBus(){
        System.out.println("Kapasitas penumpang: " + KapasitasPenumpang);
        System.out.println("Kapasitas bagasi: " + KapasitasBagasi);
        System.out.println("Total Pajak: " + TotalPajak);
    }
}
