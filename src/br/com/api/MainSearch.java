package br.com.api;

import br.com.models.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome de um filme para a busca");
		var search = input.nextLine();
		String address = "https://www.omdbapi.com/?t=" + search + "&apikey=c981cb6e";
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(address))
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String json = response.body();
		System.out.println(json);
		Gson gson = new Gson();
		Title title = gson.fromJson(json, Title.class);
		System.out.println("Título: " + title.getName());
		input.close();
	}

}
