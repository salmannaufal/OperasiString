
import java.util.Locale;


public class jobsheet11 {
public static void main(String[] args)
{
    
        String identitas = "Salman Naufal Haq / XRPL2 / 31";
        System.out.println("Identitas : "+ identitas);
   
        String x = "Operasi";
        System.out.println("isi variabel  x : " + x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Opersi";
        System.out.println("isi variable z : "+ z);
        System.out.println("isi x sama dengan z (Case Sensitive): " + x.equals(z));
        
        String r = "operasi";
        System.out.println("isi cariable r : "+ r);
        System.out.println("isi variable s sama dengan r (Case Sensitive): " + x.equals(r));
        System.out.println("isi x sama dengan r (Case Sensitive) : " + x.equalsIgnoreCase(r));
        
        System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("perbandingan isi x dengan z (Case Sensitive): " + x.compareTo(z));
        System.out.println("perbandingan isi x dengan r (Case Sensitive): " + x.compareToIgnoreCase(r));
        
        
}
}
