package cz.czechitas.java2webapps.lekce4.controller;

import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import cz.czechitas.java2webapps.lekce4.entity.Pohlavi;
import cz.czechitas.java2webapps.lekce4.entity.Ucastnik;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující sekci lekcí.
 */
@Controller()
@RequestMapping("/lekce")
public class LekceController {

//  VYTVORIM LIST (seznam(polozky seznamu))
//  Alt+Enter / Initialize in constructor (nastavit v konstruktoru) - aby mi to nepodtrhavalo cervene

    private final List<Lekce> lekce;


//  pridam polozky seznamu / Arrays.asList nebo  List.of s metodou asList a přes Ctrl + P se podívám na nabízené varianty
//  přidám seznam s lektorama (za posledním parametrem nesmí být čárka (,)

    public LekceController() {
        lekce = Arrays.asList(
                new Lekce("Lekce 1", LocalDate.of(2021, 4,21), LocalTime.of(18, 0), LocalTime.of(20, 30), "V mechu"),
                new Lekce("Lekce 2", LocalDate.of(2021, 4, 28),LocalTime.of(18,0), LocalTime.of(20,30), "V kapradí"),
                new Lekce("Lekce 3", LocalDate.of(2021, 5, 5),LocalTime.of(18,0), LocalTime.of(20,30), null)
        );
    }


    /**
     * Metoda kontroleru obsluhující adresu {@code /lekce/}. Používá šablonu {@code /templates/lekce/index.html}.
     *
     * @return
     */
    @GetMapping("/")
    public ModelAndView lekce() {
        ModelAndView modelAndView = new ModelAndView("lekce/index");
        modelAndView.addObject("seznamLekci", lekce);
        return modelAndView;
    }

}
