package pkg2120180211.pk02.pbo.ti20192020.pkg3.pkg4;
public class PK02PBOTI2019202034 {
    public static void main(String[] args) {
        makanan makanan = new makanan();
        makanan.mieayam=150;        
        makanan.bakso=20;        
        System.out.println(makanan.nama);
        System.out.println("Makanan anda sekarang "+makanan.mieayam);
        System.out.println("Makanan anda sekarang "+makanan.bakso);
        makanan.mie_ayam();
        makanan.bakso();
    }
}
