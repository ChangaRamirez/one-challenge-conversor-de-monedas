package com.alura.conversor.principal;

import com.alura.conversor.modelos.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conversor conversor = new Conversor();

        while (conversor.getEstaEjecutando()) {
            System.out.println("Eliga la opcion:");
            int opcion = teclado.nextInt();

            conversor.convertir(opcion);
        }
    }
}
