package demoPaket;

class DemoPaket
{
    public static void main(String args[])
    {
        Paket a=new Paket("Pemrograman Berorientasi Objek",
                "Benyamin Langgu Sinaga",60000,"700 MB",50000);
        a.hitungHargaPaket();
        a.cetakPaket();
    }
}