package desafio.alura.api.servicio;

import com.google.gson.Gson;
import desafio.alura.api.modelos.Pelicula;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    Pelicula buscarPelicula(int numeroDePelicula) throws IOException, InterruptedException {

        URI direccion = URI.create("https://swapi.py4e.com/api/films/" + numeroDePelicula + "/");


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Pelicula.class);
    }
}
