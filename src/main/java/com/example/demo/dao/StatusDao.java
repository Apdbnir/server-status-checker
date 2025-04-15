package com.example.demo.dao;

import com.example.demo.dto.StatusResponse;
import org.springframework.stereotype.Repository;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Repository
public class StatusDao {
    public StatusResponse checkServerStatus(String serverUrl) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(serverUrl))
                .timeout(Duration.ofSeconds(5))
                .method("HEAD", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
            boolean isAvailable = (response.statusCode() >= 200 && response.statusCode() < 400);
            
            return new StatusResponse(
                serverUrl,
                isAvailable ? "AVAILABLE" : "UNAVAILABLE",
                System.currentTimeMillis(),
                response.statusCode()
            );
        } catch (Exception e) {
            return new StatusResponse(
                serverUrl,
                "UNAVAILABLE",
                System.currentTimeMillis(),
                0
            );
        }
    }
}