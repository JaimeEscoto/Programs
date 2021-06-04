package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    // Menu.
        int menuControl=0;
        Scanner scan= new Scanner(System.in);
        Program[] programas =new Program[0];
        int tempProgramQty;
        String tempProgramName;
        String tempProgramUser;
        double tempProgramSize;
        Program tempProgram;
        int programsCreated=0;
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
            if (menuControl==2)
            {
                System.out.println("Ingrese el nombre del programa");
                tempProgramName= scan.next();
                System.out.println("Ingrese el nombre del usuario");
                tempProgramUser= scan.next();
                System.out.println("Ingrese el tamano");
                tempProgramSize= scan.nextDouble();
                tempProgram =  new Program();

                tempProgram.setName(tempProgramName);
                tempProgram.setUser(tempProgramUser);
                tempProgram.setMemorySize(tempProgramSize);

                programas[programsCreated]=tempProgram;
                //programas =  new Program[tempProgramQty];
                //System.out.println(programas.length);
            }
        }



    }
}
