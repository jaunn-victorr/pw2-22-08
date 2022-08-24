package pw2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "ap leva benga de opala");
        return "index";
    }

    @RquestMapping("/tabuada")
    public String tabuada (Mode model){
        int[] resultado = new int[10]{
            resultado[num - 1] = num *2;
        }
        model.addAttribute("resultado", resultado);
        return "/tabuada";
    }
        
}
