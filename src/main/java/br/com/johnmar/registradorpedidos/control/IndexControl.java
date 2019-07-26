package br.com.johnmar.registradorpedidos.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControl {

    @GetMapping("/")
    public String inicio() {
        return "paginas/index";
    }
}

