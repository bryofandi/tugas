package tb;
import java.util.Scanner;

public class TesKelas {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        IdentitasKelas kelas = new IdentitasKelas();
        IdentitasKelas id = new IdentitasKelas();
        KeamananKelas aman = new KeamananKelas();
        KebersihanKelas bersih = new KebersihanKelas();
        KenyamananKelas nyaman = new KenyamananKelas();
        LingkunganKelas lingkung = new LingkunganKelas();
        
    /*    id.IdentitasRuangKelas();
        id.KondisiKelas();
        id.Luas();
        id.RasioLuas();
        id.cetakData();
        id.Save();
        aman.Input();
        aman.Save();
        aman.View();
        lingkung.Input();
        lingkung.Save();
        lingkung.View();
        bersih.Input();
        bersih.Save();
        bersih.View();
        aman.KeamananKelas();
        bersih.KebersihanRuangKelas();
        nyaman.KenyamananKelas();
        lingkung.LingkunganRuangKelas();
    */
        
        System.out.println("Hasil  : ");
        String Pilihan = input.next();
    }
}
