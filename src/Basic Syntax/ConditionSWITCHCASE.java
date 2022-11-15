import java.util.Scanner;

public class ConditionSWITCHCASE {
    // Condition SWITCH CASE
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String pilih;

        System.out.println("Masukan salah satu nama bulan seperti berikut ini (sesuaikan dengan tulisan huruf-huruf nya) : "
                + "\n  Januari, Februari, Maret, April, "
                + "\n  Mei, Juni, Juli, Agustus, September, Oktober, "
                + "\n  November, Desember");

        System.out.print("\nBulan ");
        pilih = input.nextLine();
        switch (pilih){
            case "Januari":
                System.out.print("Bulan ke-1");
                break;
            case "Februari":
                System.out.print("Bulan ke-2");
                break;
            case "Maret":
                System.out.print("Bulan ke-3");
                break;
            case "April":
                System.out.print("Bulan ke-4");
                break;
            case "Mei":
                System.out.print("Bulan ke-5");
                break;
            case "Juni":
                System.out.print("Bulan ke-6");
                break;
            case "Juli":
                System.out.print("Bulan ke-7");
                break;
            case "Agustus":
                System.out.print("Bulan ke-8");
                break;
            case "September":
                System.out.print("Bulan ke-9");
                break;
            case "Oktober":
                System.out.print("Bulan ke-10");
                break;
            case "November":
                System.out.print("Bulan ke-11");
                break;
            case "Desember":
                System.out.print("Bulan ke-12");
                break;
            default:
                System.out.print("Tulisan huruf-huruf nya tidak sesuai ketentuan");
                break;
        }
        input.close();
    }
}
