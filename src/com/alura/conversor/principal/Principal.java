package com.alura.conversor.principal;

import com.alura.conversor.modelos.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conversor conversor = new Conversor();

        while (conversor.getEstaEjecutando()) {
            System.out.println("""
                *************************************************
                Bienvenid@ al Conversor de Moneda
                
                0) Historial
                1) Dólar -> Peso mexicano
                2) Peso mexicano -> Dólar
                3) Dólar -> Peso argentino
                4) Peso argentino -> Dólar
                5) Dólar -> Real brasileño
                6) Real brasileño -> Dólar
                7) Dólar -> Peso colombiano
                8) Peso colombiano -> Dólar
                9) Salir
                Elija una opción válida:
                *************************************************
                """);
            int opcion = teclado.nextInt();

            if (opcion == 9) {
                System.out.println("Gracias por usar nuestros servicios. Vuelva pronto.");
                break;
            } else if (opcion == 0) {
                System.out.println("""
                        Historial de conversiones:
                        """);
                System.out.println(conversor.getHistorial());
                continue;
            } else if (opcion < 0 || opcion > 9) {
                System.out.println("""
                        Por favor seleccione una opción valida
                        """);
                continue;
            }


            System.out.println("Ingrese el valor que desea convertir:");
            double cantidad = teclado.nextDouble();

            conversor.convertir(opcion, cantidad);
        }
    }
}
