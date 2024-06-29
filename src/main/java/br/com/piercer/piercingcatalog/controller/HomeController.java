package br.com.piercer.piercingcatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("pageTitle", "Mila Piercing");
    return "index";
  }

  @GetMapping("/galeria")
  public String galeria(Model model) {
    model.addAttribute("pageTitle", "Galeria");
    return "galeria";
  }

  @GetMapping("/sobre")
  public String sobre(Model model) {
    model.addAttribute("pageTitle", "Sobre");
    return "sobre";
  }

  @GetMapping("/agendamento")
  public String agendamento(Model model) {
    model.addAttribute("pageTitle", "Agendar horário");
    return "agendamento";
  }

}
