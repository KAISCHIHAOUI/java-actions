package com.standard.developper.ks;

import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.io.IOException;
import java.net.URI;

public class HttpClientSynchronous {

	private static final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1)
			.connectTimeout(Duration.ofSeconds(5)).build();

	public static void main(String[] args) throws IOException, InterruptedException {

		HttpRequest demoRequest = HttpRequest.newBuilder()
				.GET().uri(URI.create("https://www.facebook.tn/get"))
				.setHeader("User-Agent", "Java 11 HTTPClient new feature ").build();

		HttpResponse<String> response = httpClient.send(demoRequest,HttpResponse.BodyHandlers.ofString());
		
		   // print response headers
        HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

        // print status code
        System.out.println(response.statusCode());

        // print response body
        System.out.println(response.body());

		
		
		
		
	}
}
