package rkube.example.demoexternal.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import rkube.example.demoexternal.service.MyService;
import rkube.model.GeneratorJhipster;
import rkube.model.GeneratorJhipsterInitializer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MyController {
    private final MyService myService;
    private final GeneratorJhipsterInitializer generatorJhipsterInitializer;

    @Autowired
    public MyController(MyService myService, GeneratorJhipsterInitializer generatorJhipsterInitializer) {
        this.myService = myService;
        this.generatorJhipsterInitializer = generatorJhipsterInitializer;
    }

    @PostMapping("/call-external-api")
    public ResponseEntity<byte[]> callExternalAPI(@RequestHeader("Authorization") String authToken) {
        try {
            // Initialize GeneratorJhipster
            GeneratorJhipster generatorJhipster = generatorJhipsterInitializer.initializeGeneratorJhipster();

            // Create a map to hold the GeneratorJhipster properties under "generator-jhipster" key
            Map<String, GeneratorJhipster> jsonMap = new HashMap<>();
            jsonMap.put("generator-jhipster", generatorJhipster);

            // Create ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Convert map to JSON string
            String jsonBody = objectMapper.writeValueAsString(jsonMap);

            byte[] responseData = myService.callExternalPostAPI(authToken, jsonBody);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment", "application.zip");
            return new ResponseEntity<>(responseData, headers, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid request parameters".getBytes());
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to call external API".getBytes());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
