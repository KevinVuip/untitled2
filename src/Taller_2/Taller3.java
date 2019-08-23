package Taller_2;
import java.util.Scanner;

public class Taller3 {

    public static void main(String[] args) {

        //variables
        char r;

        System.out.println("Determinar si la letra introducida es vocal o no");
        System.out.println("ingrese una letra: ");


        Scanner sc = new Scanner(System.in);
        r = sc.next().charAt(0);


        if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u' || r == 'A' || r == 'E' || r == 'I' || r == 'O' || r == 'U') {

            System.out.println("la letra ingresada es una vocal");

        } else {

            System.out.println("la letra ingresada es una palabra");

        }

    }




}
