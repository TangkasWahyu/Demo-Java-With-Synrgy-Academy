import java.util.Scanner;

public class InputScanner {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextByte();
        System.out.println(("You entered " +number));

        input.close();
    }
}


