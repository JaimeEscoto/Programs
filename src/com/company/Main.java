package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Program miprograma = new Program();

        //miprograma.name="Chrome";
        miprograma.setName("Chrome");
        miprograma.setUser("Developer-user");
        miprograma.setMemorySize(1232.12);


        //System.out.println("El nombre del programa es: "+miprograma.name);
        System.out.println("El nombre del programa es: "+miprograma.getName());
    }
}
