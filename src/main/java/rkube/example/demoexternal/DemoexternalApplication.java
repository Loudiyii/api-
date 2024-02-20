package rkube.example.demoexternal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import rkube.model.GeneratorJhipsterInitializer;


@SpringBootApplication

public class DemoexternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoexternalApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    @Bean
    public GeneratorJhipsterInitializer generatorJhipsterInitializer() {
        return new GeneratorJhipsterInitializer();
    }
}
