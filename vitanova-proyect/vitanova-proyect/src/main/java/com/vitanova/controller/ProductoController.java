package com.vitanova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import com.vitanova.model.Producto;
import com.vitanova.repositorio.ProductoRepositorio;

/**
 * @author Nick3030w
 */
@Controller
public class ProductoController {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping("/productos")
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoRepositorio.findAll());
        return "productos";
    }
}
