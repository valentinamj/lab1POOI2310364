package poo1;

import java.util.Scanner;

public class Actividad3e12 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese numA: ");
        int numA = scanner.nextInt();

        System.out.print("Por favor, ingrese numB: ");
        int numB = scanner.nextInt();
        
        if (numA > 0 && numB > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}

