package br.com.piercer.piercingcatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("pageTitle", "Inicio | M. Piercer");
    return "index";
  }

  @GetMapping("/galeria")
  public String wedo(Model model) {
    model.addAttribute("pageTitle", "Galeria");
    return "galeria";
  }

  @GetMapping("/sobre")
  public String about(Model model) {
    model.addAttribute("pageTitle", "Sobre");
    return "sobre";
  }

  @GetMapping("/contato")
  public String contact(Model model) {
    model.addAttribute("pageTitle", "Contato");
    return "contato";
  }

}
