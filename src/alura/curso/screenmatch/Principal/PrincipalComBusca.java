package alura.curso.screenmatch.Principal;

import alura.curso.screenmatch.modelo.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual Título você quer pesquisar?");
        var entrada = input.next();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t="+ entrada + "&apikey=5350923a"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();

        Titulo meuTitulo =  gson.fromJson(json, Titulo.class);
        System.out.println("Título: " + meuTitulo);




    }
}
