package com.alura.conversor.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;

public class HistorialDeConversiones {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ArrayList<String> historial = new ArrayList<>();
    private int entrada = 1;

    public void agregaEntrada(String origen, String destino, double cantidad, BigDecimal resultado, String fecha) {
        historial.add("#" + entrada +" ...... $" + cantidad + " " + origen + " CONVERTIDO A $" + resultado + " " + destino + " ...... FECHA " + fecha);
        entrada++;
    }

    @Override
    public String toString() {
        return String.valueOf(gson.toJson(historial));
    }
}
