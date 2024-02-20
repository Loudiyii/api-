package rkube.example.demoexternal.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import rkube.example.demoexternal.service.MyService;
import rkube.example.demoexternal.model.GeneratorJhipster;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MyController {
    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping("/call-external-api")
    public ResponseEntity<byte[]> callExternalAPI(@RequestHeader("Authorization") String authToken) {
        try {
            // Create an instance of GeneratorJhipster and set properties
            GeneratorJhipster generatorJhipster = new GeneratorJhipster();
            generatorJhipster.setApplicationType("monolith");
            generatorJhipster.setBaseName("jhipsterSampleApplication");
            generatorJhipster.setPackageName("com.mycompany.myapp");
            generatorJhipster.setPackageFolder("com/mycompany/myapp");
            generatorJhipster.setServerPort("8080");
            generatorJhipster.setAuthenticationType("jwt");
            generatorJhipster.setCacheProvider("ehcache");
            generatorJhipster.setEnableHibernateCache(true);
            generatorJhipster.setWebsocket(false);
            generatorJhipster.setDatabaseType("sql");
            generatorJhipster.setDevDatabaseType("h2Disk");
            generatorJhipster.setProdDatabaseType("postgresql");
            generatorJhipster.setSearchEngine(false);
            generatorJhipster.setEnableSwaggerCodegen(false);
            generatorJhipster.setMessageBroker(false);
            generatorJhipster.setBuildTool("maven");
            generatorJhipster.setClientFramework("angularX");
            generatorJhipster.setUseSass(true);
            generatorJhipster.setClientPackageManager("npm");
            generatorJhipster.setTestFrameworks(null); // Set as needed
            generatorJhipster.setEnableTranslation(true);
            generatorJhipster.setNativeLanguage("en");
            generatorJhipster.setLanguages(List.of("en")); // Set as needed
            generatorJhipster.setJhiPrefix("jhi");
            generatorJhipster.setServiceDiscoveryType(false);
            generatorJhipster.setWithAdminUi(true);
            generatorJhipster.setBlueprints(null); // Set as needed

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
