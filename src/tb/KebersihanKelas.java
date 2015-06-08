package tb;
import java.io.FileWriter;
import java.util.Scanner;

public class KebersihanKelas extends KelasUtama {
    Scanner input = new Scanner(System.in);    
    private String SirkulasiUdara;
    private int Pencahayaan;
    private int Kelembapan;
    private int SuhuCel;

    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getPencahayaan() {
        return Pencahayaan;
    }

    public void setPencahayaan(int Pencahayaan) {
        this.Pencahayaan = Pencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhuCel() {
        return SuhuCel;
    }

    public void setSuhuCel(int SuhuCel) {
        this.SuhuCel = SuhuCel;
    }
    

    @Override
    public void Input() {
/*        System.out.println("Sirkulasi Udara : ");
        setSirkulasiUdara(input.next());
        System.out.println("Pencahayaan : ");
        setPencahayaan(input.nextInt());
        System.out.println("Kelembapan : ");
        setKelembapan(input.nextInt());
        System.out.println("Suhu(Celcius) : ");
        setSuhuCel(input.nextInt());    
*/    
    }

    @Override
    public void View() {
        System.out.println("Sirkulasi Udara : "+getSirkulasiUdara());
        System.out.println("Pencahayaan : "+getPencahayaan());
        System.out.println("Kelembapan : "+getKelembapan());
        System.out.println("Suhu(Celcius) : "+getSuhuCel());
    }

    @Override
    public void Analisa() {
        if(getSirkulasiUdara().equals("Lancar")){
            System.out.print("SESUAI!");
	}
	else{
            System.out.println("TIDAK SESUAI!");
	}
	if(getPencahayaan() >= 250 && getPencahayaan() <= 300 ){
            System.out.print("SESUAI!");
	}
	else{
            System.out.print("TIDAK SESUAI!");
	}
	if(getKelembapan() >=70 && getKelembapan() <=80){
            System.out.print("SESUAI!");
	}
	else{
            System.out.print("TIDAK SESUAI!");
	}
	if(getSuhuCel() >=25 && getSuhuCel() <= 35){
            System.out.print("SESUAI!");
	}
	else{
            System.out.print("TIDAK SESUAI!");
	}
    }
    
    public void Save(){
    try {
        FileWriter set = new FileWriter("Kebersihan.txt");
            set.write("Sirkulasi Udara : "+getSirkulasiUdara());
            set.write("Pencahayaan : "+getPencahayaan());
            set.write("Kelembapan : "+getKelembapan());
            set.write("SuhuCel : "+getSuhuCel());
            set.close();
    }
    catch (Exception a){
        a.printStackTrace();
    }    
}
}