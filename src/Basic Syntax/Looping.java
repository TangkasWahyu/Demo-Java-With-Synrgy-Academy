public class Looping {
    // For Looping
    public static void main (String args[]){
        int i, j, k, rows = 10;
        for (i = 0; i <= rows; i++){
            for (j = 9; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++){
                System.out.print(k +"");
            }
            System.out.println("");
        }
    }
}
