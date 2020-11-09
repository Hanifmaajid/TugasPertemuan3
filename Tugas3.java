package tugas3;

import java.util.Scanner;
import tugas3.bidang.Lingkaran;
import tugas3.bidang.PersegiPanjang;
import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;

public class Tugas3 {
    
    private static Lingkaran lingkaran;
    private static PersegiPanjang persegiPanjang;
    private static Balok balok;
    private static Kerucut kerucut;
    
    public static void main(String[] args) {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--HANIF MAAJID--");
        System.out.println("---124190025---\n");
        do{
            System.out.println("\n\nINPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");
            System.out.print("PILIH : ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1 :
                    double panjangBalok, lebarBalok, tinggiBalok;
                    
                    System.out.print("\nPANJANG = ");
                    panjangBalok = scanner.nextDouble();
                    System.out.print("LEBAR   = ");
                    lebarBalok = scanner.nextDouble();
                    System.out.print("TINGGI  = ");
                    tinggiBalok = scanner.nextDouble();
                    
                    balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    persegiPanjang = new PersegiPanjang(panjangBalok, lebarBalok, tinggiBalok);
                    
                    System.out.println("_________OUTPUT________");
                    System.out.println("LUAS PERSEGI         : " + persegiPanjang.hitungLuas());
                    System.out.println("KELILING PERSEGI     : " + persegiPanjang.hitungKeliling());
                    System.out.println("VOLUME BALOK         : " + balok.hitungVolume());
                    System.out.println("LUAS PERMUKAAN BALOK : " + balok.hitungLuasPermukaan());
                    break;
                case 2 :
                    double jariJariKerucut, tinggiKerucut;
                    
                    System.out.print("\nJARI-JARI = ");
                    jariJariKerucut = scanner.nextDouble();
                    System.out.print("TINGGI    = ");
                    tinggiKerucut = scanner.nextDouble();
                    
                    kerucut = new Kerucut(jariJariKerucut, tinggiKerucut);
                    lingkaran = new Lingkaran(jariJariKerucut, tinggiKerucut);
                    
                    System.out.println("_________OUTPUT________");
                    System.out.println("LUAS LINGKARAN         : " + lingkaran.hitungLuas());
                    System.out.println("KELILING LINGKARAN     : " + lingkaran.hitungKeliling());
                    System.out.println("VOLUME KERUCUT         : " + kerucut.hitungVolume());
                    System.out.println("LUAS PERMUKAAN KERUCUT : " + kerucut.hitungLuasPermukaan());
                    break;
                case 3 :
                    break;
            }
        }while(menu != 3);
    }
}
