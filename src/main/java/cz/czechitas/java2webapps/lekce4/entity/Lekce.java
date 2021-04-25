package cz.czechitas.java2webapps.lekce4.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Informace o jedné lekci.
 */
public class Lekce {
  private String nazev;
  private LocalDate datum;
  private LocalTime casOd;
  private LocalTime casDo;
  private String misto;


//  VYGENERUJI PRAZDNY CONSTRUKTOR

  public Lekce() {
  }


//  VYGENERUJI KONSTRUKTOR S VYBRANIM VSEHO

  public Lekce(String nazevLekce, LocalDate datum, LocalTime casOd, LocalTime casDo, String misto) {
    this.nazev = nazevLekce;
    this.datum = datum;
    this.casOd = casOd;
    this.casDo = casDo;
    this.misto = misto;
  }


  // VYGENEROVANI GETTERU A SETTERU

  public String getNazev() {
    return nazev;
  }

  public void setNazev(String nazev) {
    this.nazev = nazev;
  }

  public LocalDate getDatum() {
    return datum;
  }

  public void setDatum(LocalDate datum) {
    this.datum = datum;
  }

  public LocalTime getCasOd() {
    return casOd;
  }

  public void setCasOd(LocalTime casOd) {
    this.casOd = casOd;
  }

  public LocalTime getCasDo() {
    return casDo;
  }

  public void setCasDo(LocalTime casDo) {
    this.casDo = casDo;
  }

  public String getMisto() {
    return misto;
  }

  public void setMisto(String misto) {
    this.misto = misto;
  }
}
