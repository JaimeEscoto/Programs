package com.company;
import java.util.Scanner;
public class Main {

    public static void printProgramas(Program[] programs)
    {
        int counter=0;
        while (counter < programs.length)
        {
            if(programs[counter]!=null)
            {
                System.out.println("Nombre "+programs[counter].getName());
                System.out.println("Usuario "+programs[counter].getUser());
                System.out.println("Size "+programs[counter].getMemorySize());
            }

            counter++;
        }

    }

    public static void main(String[] args) {

        Program miprograma = new Program();
        miprograma.setName("Chrome");
        miprograma.setUser("Jaime-usr");
        miprograma.setMemorySize(20000);

        TaskManager mitaskManager = new TaskManager();

        mitaskManager.createProgram(miprograma);

        mitaskManager.createProgram("MS Word","Jaime-usr",29100);

        printProgramas(mitaskManager.getPrograms());
        mitaskManager.quitProgram("chrome");
        System.out.println("---------------");
        printProgramas(mitaskManager.getPrograms());
        mitaskManager.cloneProgram("MS Word");
        System.out.println("---------------");
        printProgramas(mitaskManager.getPrograms());





    }
}
