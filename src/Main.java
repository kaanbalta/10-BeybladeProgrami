import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Beyblade üretme programına hoşgeldiniz");
        Scanner scanner = new Scanner(System.in);
        String islemler = "Dragon\n" +
                "Drayga\n" +
                "Dranza\n" +
                "Çıkış için q";
        System.out.println(islemler);
        while(true){

            System.out.print("İŞLEM SEÇİNİZ : ");
            String alınan = scanner.nextLine();

            if(alınan.equals("q")){
                break;
            }
            else if(alınan.equals("Dranza")){
                System.out.println("Bir Dranza ürettiniz");
                BeybladeFabrikasi beybladeFabrikasi  = new BeybladeFabrikasi("Dranza");
            }
            else if(alınan.equals("Drayga")){
                System.out.println("Bir drayga ürettiniz");
                BeybladeFabrikasi beybladeFabrikasi = new BeybladeFabrikasi("Drayga");
            }
            else if(alınan.equals("Dragon")){
                System.out.println("Bir Dragon ürettiniz");
                BeybladeFabrikasi beybladeFabrikasi = new BeybladeFabrikasi("Dragon");
            }
            else{
                System.out.println("Geçersiz beyblade veya komut");
            }

        }
    }
}