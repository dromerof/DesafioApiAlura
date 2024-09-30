package desafio.alura.api.servicio;

import desafio.alura.api.modelos.Pelicula;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsultaPelicula {
    Pelicula buscarPelicula(int numeroDePelicula) {
        URI.create("https://swapi.py4e.com/api/films/"+numeroDePelicula+"/");


        HttpClient cleint =  HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder();

        .uri()

    }
}
