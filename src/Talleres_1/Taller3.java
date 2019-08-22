package Talleres_1;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Taller3 {

    public static void main(String[] args) throws IOException {
        Scanner tem = new Scanner(System.in);

        String nomb,ape;

        System.out.println(" Ingrese su nombre ");
        nomb= tem.nextLine();



        BufferedReader h=new BufferedReader (new InputStreamReader(System.in));
        System.out.println(" Ingrese su año de nacimiento  ");
        int nac=Integer.parseInt(h.readLine());

        System.out.println(" Ingrese su año actual ");
        int act=Integer.parseInt(h.readLine());



        int edad=act-nac;

        System.out.println("Su edad actual es:" +"ano"+edad);



    }


}


