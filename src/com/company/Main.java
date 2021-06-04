package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    // Menu.
        int menuControl=0;
        Scanner scan= new Scanner(System.in);
        Program[] programas;
        int tempProgramQty;
        while (menuControl!=7) {
            System.out.println("Menu");
            System.out.println("1. Ingresar cantidad de Programas");
            System.out.println("2. Crear Programa");
            System.out.println("7. Salir");
            menuControl= scan.nextInt();

            if (menuControl==1)
            {
                System.out.println("Ingrese la cantidad de prgramas");
                tempProgramQty= scan.nextInt();
                programas =  new Program[tempProgramQty];
                //System.out.println(programas.length);
            }
        }



    }
}
