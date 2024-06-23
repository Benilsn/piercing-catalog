package br.com.piercer.piercingcatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("pageTitle", "Home | Piercer");
    return "index";
  }

  @GetMapping("/about")
  public String about(Model model) {
    model.addAttribute("pageTitle", "About | Piercer");
    return "about";
  }

  @GetMapping("/contact")
  public String contact(Model model) {
    model.addAttribute("pageTitle", "Contact | Piercer");
    return "contact";
  }

  @GetMapping("/pricing")
  public String pricing(Model model) {
    model.addAttribute("pageTitle", "Pricing | Piercer");
    return "pricing";
  }

  @GetMapping("/we-do")
  public String wedo(Model model) {
    model.addAttribute("pageTitle", "We do | Piercer");
    return "we-do";
  }
}
