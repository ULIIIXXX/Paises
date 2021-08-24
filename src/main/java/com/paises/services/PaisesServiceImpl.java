package com.paises.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.paises.models.Pais;

public class PaisesServiceImpl implements PaisesService {

  final String URL = "https://restcountries.eu/rest/v2/all";

  @Autowired
  RestTemplate template;

  @Override
  public List<Pais> obtenerPais() {
    String resultado = template.getForObject(URL, String.class);
    ObjectMapper mapper = new ObjectMapper();
    List<Pais> paises = new ArrayList<>();
    ArrayNode array;
    try {
      array = (ArrayNode) mapper.readTree(resultado);
      for (Object ob : array) {
        ObjectNode json = (ObjectNode) ob;
        paises.add(new Pais(json.get("name").asText(), json.get("capital").asText(),
            json.get("population").asLong(), json.get("flag").asText()));
      }
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return paises;
  }

  @Override
  public List<Pais> buscarPais(String pais) {
    return obtenerPais().stream().filter(p -> p.getName().contains(pais))
        .collect(Collectors.toList());
  }

}
