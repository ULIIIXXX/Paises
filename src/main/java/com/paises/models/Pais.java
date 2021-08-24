package com.paises.models;

public class Pais {

  String name;
  String capital;
  Long population;
  String flag;

  public Pais() {}

  public Pais(String name, String capital, Long population, String flag) {
    this.name = name;
    this.capital = capital;
    this.population = population;
    this.flag = flag;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public Long getPopulation() {
    return population;
  }

  public void setPopulation(Long population) {
    this.population = population;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }



}
