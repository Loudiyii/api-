package rkube.example.demoexternal.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {
    private final RestTemplate restTemplate;

    public MyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public byte[] callExternalPostAPI(String authToken, String jsonBody) {
        // Check authentication token is provided
        if(authToken == null || authToken.isEmpty()) {
            throw new IllegalArgumentException("Authentication token is required");
        }

        // Define the API URL
        String apiUrl = "http://localhost:8080/api/download-application";

        // Set request headers with authentication token
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + authToken);

        // Create request entity with JSON body and headers
        HttpEntity<String> requestEntity = new HttpEntity<>(jsonBody, headers);

        // Send request and handle response
        ResponseEntity<byte[]> responseEntity = restTemplate.exchange(
            apiUrl,
            HttpMethod.POST,
            requestEntity,
            byte[].class
        );

        // Check if response is successful
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            // Return the response body
            return responseEntity.getBody();
        } else {
            // Handle unsuccessful response
            throw new RuntimeException("Failed to call external POST API: " + responseEntity.getStatusCode());
        }
    }
}
