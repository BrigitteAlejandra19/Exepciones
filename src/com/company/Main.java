package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Usuarios usuario1 = new Usuarios("Bri","D123");
        Usuarios usuario2 = new Usuarios("Kel","A123");
        System.out.println("El legajo de " +usuario1.getNombre() +" es: " +usuario1.getLegajo());
        System.out.println("El legajo de " +usuario2.getNombre() +" es: " +usuario2.getLegajo());
    }
}
