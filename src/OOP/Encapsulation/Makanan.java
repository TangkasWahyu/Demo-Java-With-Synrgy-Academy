package OOP.Encapsulation;

public class Makanan {
    public static void main(String[] args){
        //Membuat Instence/Objek dari Class restoran
        Restoran data = new Restoran();

        //Memasukan Data pada Variable
        data.setMenu("Nasi Babi Guling");
        data.setharga(17000.44f);

        //Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("Menu Makanan: "+data.getMenu());
        System.out.println("Harga Makanan: Rp."+data.getHarga());
    }
}
