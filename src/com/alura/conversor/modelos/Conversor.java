package com.alura.conversor.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversor {
    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    HistorialDeConversiones historial = new HistorialDeConversiones();

    public HistorialDeConversiones getHistorial() {
        return historial;
    }

    private String origen;
    private String destino;

    public void convertir(int opcionMonedas, double cantidad) {
        switch(opcionMonedas) {
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
        }

        String direccion = "https://v6.exchangerate-api.com/v6/1969f4de54b3d48ac80f6ac3/pair/"+ origen +"/" + destino;

        try {
            HttpClient client = java.net.http.HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            TasaDeConversion miTasa = gson.fromJson(json, TasaDeConversion.class);
            double conversion = cantidad * miTasa.conversionRate();
            BigDecimal resultado = BigDecimal.valueOf(conversion).setScale(2, RoundingMode.HALF_UP);

            System.out.println("El valor $" + cantidad + " [" + origen + "] corresponde al valor final de >>> $" + resultado + " [" + destino + "]");
            System.out.println("""
                        
                        """);

            LocalDateTime ahora = LocalDateTime.now();
            DateTimeFormatter formatoBonito = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            historial.agregaEntrada(origen, destino, cantidad, resultado, ahora.format(formatoBonito));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
