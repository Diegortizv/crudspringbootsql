package com.crudspringbootmysql.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.crudspringbootmysql.interfaceService.IPersonaService;
import com.crudspringbootmysql.modelo.Persona;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IPersonaService service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas=service.listar();
        model.addAttribute("personas", personas);
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
