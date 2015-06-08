package tb;
import java.io.FileWriter;
import java.util.Scanner;

public class LingkunganKelas extends KelasUtama{
    Scanner input = new Scanner(System.in);
    private String Lantai;
    private String Dinding;
    private String Atap;
    private String Pintu;
    private String Jendela;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getLantai() {
        return Lantai;
    }

    public void setLantai(String Lantai) {
        this.Lantai = Lantai;
    }

    public String getDinding() {
        return Dinding;
    }

    public void setDinding(String Dinding) {
        this.Dinding = Dinding;
    }

    public String getAtap() {
        return Atap;
    }

    public void setAtap(String Atap) {
        this.Atap = Atap;
    }

    public String getPintu() {
        return Pintu;
    }

    public void setPintu(String Pintu) {
        this.Pintu = Pintu;
    }

    public String getJendela() {
        return Jendela;
    }

    public void setJendela(String Jendela) {
        this.Jendela = Jendela;
    }
    

    @Override
    public void Input() {
/*      System.out.println("Kondisi Lantai : ");
        setLantai(input.next());
        System.out.println("Kondisi Dinding : ");
        setDinding(input.next());
        System.out.println("Kondisi Atap : ");
        setAtap(input.next());
        System.out.println("Kondisi Pintu : ");
        setPintu(input.next());
        System.out.println("Kondisi Jendela : ");
        setJendela(input.next());
*/    
    }

    @Override
    public void View() {
        System.out.println("Kondisi Lantai : "+getLantai());
        System.out.println("Kondisi Dinding : "+getDinding());
        System.out.println("Kondisi Atap : "+getAtap());
        System.out.println("Kondisi Pintu : "+getPintu());
        System.out.println("Kondisi Jendela : "+getJendela());}

    @Override
    public void Analisa() {
                if(getLantai().equals("Bersih")){
			System.out.println("Kondisi Lantai SESUAI");
		}
		else{
			System.out.println("Kondisi Lantai TIDAK SESUAI");
		}
		if(getDinding().equals("Bersih")){
			System.out.println("kondisi dinding SESUAI");
		}
		else{
			System.out.println("Kondisi Dinding TIDAK SESUAI");
		}
		if(getAtap().equals("Bersih")){
			System.out.println("Kondisi Atap SESUAI");
		}
		else{
			System.out.println("Kondisi Atap TIDAK SESUAI");
		}
		if(getPintu().equals("Bersih")){
			System.out.println("Kondisi Pintu SESUAI");
		}
		else{
			System.out.println("Kondisi Pintu TIDAK SESUAI");
		}
		if(getJendela().equals("Bersih")){
			System.out.println("Kondisi Jendela SESUAI");
		}
		else{
			System.out.println("Kondisi Jendela TIDAK SESUAI");
		}
        
    }
    
    public void Save(){
        try {
            FileWriter set = new FileWriter("Lingkungan.txt");
            set.write("Kondisi Lantai : "+getLantai());
            set.write("Kondisi Dinding : "+getDinding());
            set.write("Kondisi Atap : "+getAtap());
            set.write("Kondisi Pintu : "+getPintu());
            set.write("Kondisi Jendela : "+getJendela());
            set.close();
        }
        catch (Exception b){
            b.printStackTrace();
        }
    }
}