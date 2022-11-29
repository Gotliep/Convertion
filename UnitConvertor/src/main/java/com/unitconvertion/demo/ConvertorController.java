package com.unitconvertion.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConvertorController {
	
  @GetMapping("/convertion")
  public String convertionForm(Model model) {
    model.addAttribute("convertion", new Convertor());
    return "convertion";
  }

  @PostMapping("/convertion")
  public String convertionSubmit(@ModelAttribute Convertor convertion, Model model) {
    model.addAttribute("convertion", convertion);
    return "convertion-result";
  }


}