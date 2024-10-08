package com.proyecto.ecommerce.spring_ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.ecommerce.spring_ecommerce.model.Producto;
import com.proyecto.ecommerce.spring_ecommerce.service.IOrdenService;
import com.proyecto.ecommerce.spring_ecommerce.service.IUsuarioService;
import com.proyecto.ecommerce.spring_ecommerce.service.ProductoService;


@Controller
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private IUsuarioService UsuarioService;

    @Autowired
    private IOrdenService ordenService;

    @GetMapping("")
    public String home(Model model){
        
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);

        return "administrador/home";
    }

    @GetMapping("/usuarios")
    public String usuarios(Model model) {
        model.addAttribute("usuarios", UsuarioService.findAll());
        return "administrador/usuarios";
    }

    @GetMapping("/ordenes")
    public String ordenes(Model model) {
        model.addAttribute("ordenes", ordenService.findAll());
        return "administrador/ordenes";
    }
    
}
