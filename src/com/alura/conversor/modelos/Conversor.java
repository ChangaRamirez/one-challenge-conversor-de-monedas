package com.alura.conversor.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpClient;

public class Conversor {
    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    private boolean estaEjecutando = true;

    private String origen;
    private String destino;

    public void convertir(int opcion) {
        switch(opcion) {
            case 1:
                origen = "USD";
                destino = "MXN";
                break;
            case 2:
                origen = "MXN";
                destino = "USD";
                break;
            case 3:
                origen = "USD";
                destino = "ARS";
                break;
            case 4:
                origen = "ARS";
                destino = "USD";
                break;
            case 5:
                origen = "USD";
                destino = "BRL";
                break;
            case 6:
                origen = "BRL";
                destino = "USD";
                break;
            case 7:
                origen = "USD";
                destino = "COP";
                break;
            case 8:
                origen = "COP";
                destino = "USD";
                break;
            case 9:
                System.out.println("Gracias por usar nuestros servicios. Vuelva pronto.");
                estaEjecutando = false;
                break;
            default:
                System.out.println("Seleccione opcion valida");
        }

        String direccion = "https://v6.exchangerate-api.com/v6/1969f4de54b3d48ac80f6ac3/pair/"+ origen +"/" + destino;

        try {
            HttpClient client = java.net.http.HttpClient.newHttpClient();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean getEstaEjecutando() {
        return estaEjecutando;
    }
}
