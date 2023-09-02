package poo1;

import java.util.Scanner;

public class Actividad3e11 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese un número: ");
     
        int numero = scanner.nextInt();
        
        if (numero > 0 && numero % 2 != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
