package com.paises.services;

import java.util.List;
import com.paises.models.Pais;

public interface PaisesService {

  List<Pais> obtenerPais();

  List<Pais> buscarPais(String pais);



}
