package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Usuarios  {

    public String nombre;
    public String legajo;

    public Usuarios(String nombre, String legajo) {
        this.nombre = nombre;
        try {
            asignarLegajo(legajo);
        } catch (DatosIncorrectosException e) {
            e.printStackTrace();
            this.legajo = "";
            System.out.println("El legajo ingresado es incorrecto");
            /*System.out.println("Vuelva a ingresarlo: ");
            Scanner sc = new Scanner(System.in);
            legajo = sc.nextLine();*/
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    private void asignarLegajo(String legajo) throws DatosIncorrectosException {
        legajo = legajo.toUpperCase();
        if(legajo.valueOf(legajo).length()!=4 || !(legajo.startsWith("A") || legajo.startsWith("B") ||legajo.startsWith("C"))){
           throw new DatosIncorrectosException("El legajo debe tener 4 digitos y comenzar por A,B,C");
        }else{
            this.legajo = legajo;
       }
    }
}