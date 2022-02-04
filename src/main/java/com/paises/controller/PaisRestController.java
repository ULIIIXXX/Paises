package com.paises.controller;

import java.util.List;

import com.paises.models.ServiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.paises.models.Pais;
import com.paises.services.PaisesServiceImpl;

@RestController
@RequestMapping(value="/pais")
public class PaisRestController {
  
  @Autowired
  PaisesServiceImpl paisesS;

  @Autowired
  ServiceStatus serviceStatus;

  
  @GetMapping(value = "/listar",produces=MediaType.APPLICATION_JSON_VALUE)
  public List<Pais> listar(){
    return paisesS.obtenerPais();
  }
  
  @GetMapping(value = "/buscar/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
  public List<Pais> busca(@PathVariable("nombre")String nombre){
    return paisesS.buscarPais(nombre);
  }

  @GetMapping(value = "/test")
  public ResponseEntity<ServiceStatus> testService(){
    serviceStatus.setName("Microservicio de Paises");
    serviceStatus.setStatus("RUNING...");
    serviceStatus.setHttpStatus(HttpStatus.OK);
    return new ResponseEntity<>(serviceStatus, HttpStatus.OK);
  }
  
}
