package OOP.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Viral myViral;
        Viral myJeje;
        Viral myDilan;

        System.out.println("1. Jeje atau 2. Dilan");
        System.out.print("Suara apa yang kamu inginkan ? ");

        int choice = scanner.nextInt();

        if(choice==1){
            System.out.println("");
            myViral = new Viral();
            myViral.speak();
            myJeje = new Jeje();
            myJeje.speak();
        }
        else if(choice==2){
            System.out.println("");
            myViral = new Viral();
            myViral.speak();
            myDilan = new Dilan();
            myDilan.speak();
        }
        else{
            System.out.println("");
            System.out.println("Pilihanmu itu salah !");
        }
    }
}
