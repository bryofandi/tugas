package tb;
import java.util.Scanner;
import java.io.FileWriter;

public class KeamananKelas extends KelasUtama {
    Scanner input = new Scanner(System.in);
    private String Kekokohan;
    private String KunciPintuJendela;
    private String Bahaya;

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKunciPintuJendela() {
        return KunciPintuJendela;
    }

    public void setKunciPintuJendela(String KunciPintuJendela) {
        this.KunciPintuJendela = KunciPintuJendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }
    
    
    @Override
    public void Input() {        
/*        System.out.println("Kekokohan : ");
        setKekokohan(input.next());
        System.out.println("Kunci Pintu dan Jendela : ");
        setKunciPintuJendela(input.next());
        System.out.println("Bahaya : ");
        setBahaya(input.next());
*/        
    }

    @Override
    public void View() {
        System.out.println("Kekokohan : "+getKekokohan());
        System.out.println("Kunci Pintu dan Jendela : "+getKunciPintuJendela());
        System.out.println("Bahaya : "+getBahaya());
    }

    @Override
    public void Analisa() {
            if(getKekokohan().equals("Kokohan")){
        	System.out.println("SESUAI!");
        }
            else{
            	System.out.println("TIDAK SESUAI!");
    	}
            if(getKunciPintuJendela().equals("Ada Kunci Pintu dan Jendela")){
		System.out.println("SESUAI!");
	}
            else{
		System.out.println("TIDAK SESUAI!");
	}
            if(getBahaya().equals("TIdak Bahaya")){
		System.out.println("SESUAI!");
	}	
            else{
		System.out.println("TIDAK SESUAI!");
		
	} 
    }
    
    public void Save(){
        try {
            FileWriter set = new FileWriter("Keamanan.txt");
            set.write("Kekokohan : "+getKekokohan());
            set.write("Kunci Pintu Jendela : "+getKunciPintuJendela());
            set.write("Bahaya : "+getBahaya());
            set.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
        
}
