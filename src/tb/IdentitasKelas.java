package tb;
import java.io.FileWriter;
import java.util.Scanner;

public class IdentitasKelas {    
    Scanner input = new Scanner(System.in);
    private String NamaRuangan;
    private String LokasiRuangan;
    private String Jurusan;
    private int JumlahPintu;
    private int JumlahKursi;
    private int JumlahJendela;    
    private int Panjang;
    private int Lebar;
    private String BentukRuang;
    private int Luas;
    private int RasioLuas;

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public void setLebar(int Lebar) {
        this.Lebar = Lebar;
    }

    public String getBentukRuang() {
        return BentukRuang;
    }

    public void setBentukRuang(String BentukRuang) {
        this.BentukRuang = BentukRuang;
    }

    public int getLuas() {
        return Luas;
    }

    public void setLuas(int Luas) {
        this.Luas = Luas;
    }

    public int getRasioLuas() {
        return RasioLuas;
    }

    public void setRasioLuas(int RasioLuas) {
        this.RasioLuas = RasioLuas;
    }
   
    public String getNamaRuangan() {
        return NamaRuangan;
    }

    public void setNamaRuangan(String NamaRuangan) {
        this.NamaRuangan = NamaRuangan;
    }

    public String getLokasiRuangan() {
        return LokasiRuangan;
    }

    public void setLokasiRuangan(String LokasiRuangan) {
        this.LokasiRuangan = LokasiRuangan;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }
    
  /*  public void IdentitasRuangKelas() {
        System.out.println("Nama Ruangan : ");
        data.setNamaRuangan(input.next());
        System.out.println("Lokasi : ");
        data.setLokasiRuangan(input.next());
        System.out.println("Jurusan : ");
        data.setJurusan(input.next());
        
    }   
    
    public void KondisiKelas() {
        System.out.println("Masukkan Panjang Ruangan : ");
        data.setPanjang(input.nextInt());
        System.out.println("Masukkan Lebar Ruangan : ");
        data.setLebar(input.nextInt());
        System.out.println("Masukkan Jumlah Pintu : ");
        data.setJumlahPintu(input.nextInt());
        System.out.println("Masukkan Jumlah Kursi : ");
        data.setJumlahKursi(input.nextInt());
        System.out.println("Masukkan Jumlah Jendela : ");
        data.setJumlahJendela(input.nextInt());
        
        }  */ 
    
    public void View(){
        System.out.println("Nama Ruangan : "+getNamaRuangan());
        System.out.println("Lokasi Ruangan : "+getLokasiRuangan());
        System.out.println("Jurusan : "+getJurusan());
    }
    
    float Luas() {
            return getPanjang()*getLebar();
	}
	
    double RasioLuas(){
            return Luas()/getJumlahKursi();
        }    
    public void cetakData() {
            System.out.println("Luas = "+Luas());
            System.out.println("Rasio Luas = "+RasioLuas());
        }   
    
    public void Save(){
	try{
	FileWriter ketik = new FileWriter("Identitas.txt");
	ketik.write("Nama Ruangan : "+getNamaRuangan());
	ketik.write("Lokasi : "+getLokasiRuangan());
	ketik.write("Jurusan : "+getJurusan());
	ketik.write("Panjang : "+getPanjang());
        ketik.write("Lebar : "+getLebar());
        ketik.write("Jumlah Pintu : "+getJumlahPintu());
        ketik.write("Jumlah Kursi : "+getJumlahKursi());
        ketik.write("Jumlah Jendela : "+getJumlahJendela());
        ketik.close();
    }
	catch(Exception e){
            e.printStackTrace();
	}
    }
    
}   
