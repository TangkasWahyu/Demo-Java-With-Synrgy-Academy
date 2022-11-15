//public class Operation {
//    public static void main (String[] args){
//        int a = 10, b = 5;
//
//        int penjumlahan = a+b;
//        int pengurangan = a-b;
//        int pembagian = a/b;
//        int perkalian = a*b;
//
//        System.out.println("penjumlahan: "+penjumlahan);
//        System.out.println("pengurangan: "+pengurangan);
//        System.out.println("penjumlahan: "+pembagian);
//        System.out.println("perkalian: "+perkalian);
//    }
//}

//public class Operation {
//    public static void main (String[] args){
//        int a = 10, b = 5;
//        System.out.println(penjumlahan(a,b));
//    }
//    public static int penjumlahan (int a, int b){
//        int total1 = a + b;
//        return total1;
//    }
//}

public class Operation {
    public static void main (String[] args){
        int a = 10, b = 5;
        penjumlahan(a,b);
    }
    public static int penjumlahan (int a, int b){
        int jumlah = a+b;
        System.out.println("penjumlahan dari " +a+ " ditambah " +b+ " = " +jumlah);
        return jumlah;
    }
}