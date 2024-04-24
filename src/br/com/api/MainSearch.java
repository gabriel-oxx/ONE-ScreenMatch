package br.com.api;

import br.com.exception.ConversionYearException;
import br.com.models.OndbTitle;
import br.com.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.CharConversionException;
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
		address = address.replace(" ", "+");
		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(address))
					.build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String json = response.body();
			System.out.println(json);
			Gson gson = new GsonBuilder()
					.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
					.create();
			//Title title = gson.fromJson(json, Title.class);
			OndbTitle ondbTitle = gson.fromJson(json, OndbTitle.class);

			Title title = new Title(ondbTitle);
			System.out.println(title);
		} catch (NumberFormatException error) {
			System.out.println("Ops, algo que nós (nem você, eu acho) gostaríamos que acontecesse aconteceu");
			System.out.println(error.getMessage());
		} catch (IllegalArgumentException error) {
			System.out.println("Há algum erro no texto que você passou para a busca. Por favor, verifique novamente.");
			System.out.println(error.getMessage());
		} catch (ConversionYearException error) {
			System.out.println(error.getMessage());
		}
		input.close();
	}


}

