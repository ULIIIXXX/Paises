package com.paises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientePaisesApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientePaisesApplication.class, args);
  }

  @Bean
  public RestTemplate template() {
    return new RestTemplate();
  }

}
