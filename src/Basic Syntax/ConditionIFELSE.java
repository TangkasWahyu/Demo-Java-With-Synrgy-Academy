import java.util.Scanner;

public class ConditionIFELSE {
    // Condition IF ELSE
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int nilai;
        String nama;
        int nim;

        System.out.print("Masukan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukan NIM: ");
        nim = input.nextInt();
        System.out.print("Masukan Nilai: ");
        nilai = input.nextInt();

        if(nilai>=50 && nilai<60){
            System.out.println("Selamat " + nama + " dengan NIM " + nim + " mendapatkan passing grade D");
        }
        else if(nilai>=60 && nilai<70){
            System.out.println("Selamat " + nama + " dengan NIM " + nim + " mendapatkan passing grade C");
        }
        else if(nilai>=70 && nilai<80){
            System.out.println("Selamat " + nama + " dengan NIM " + nim + " mendapatkan passing grade B");
        }
        else if(nilai>=80 && nilai<100){
            System.out.println("Selamat " + nama + " dengan NIM " + nim + " mendapatkan passing grade A");
        }
        else{
            System.out.println(nama + " dengan NIM " + nim + ", anda tidak gagal");
        }

        input.close();
    }
}
