/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.Datos.ArticuloCientifico;
import com.example.demo.Datos.Conferencia;
import com.example.demo.services.Conferencia_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

/**
 *
 * @author MorlinXD
 */
@Controller

@RequestMapping("/docsfriends")
public class Conferencia_controller {

    @Autowired
    private Conferencia_service conferenciaService;

    @GetMapping("/conferencia/crear")
    public String crearConferencia(Model conferencia) {
        conferencia.addAttribute("conferencia",new Conferencia());
        return "conferencia";
    }

    @GetMapping("/listar_conferencia")
    public String listarConferencias(Model conferencia) {
        List<Conferencia> conferencias = conferenciaService.listarConferencias();
        conferencia.addAttribute("conferencias", conferencias);
        //conferenciaService.listarConferencias();
        return "listar_conferencia";
    }

    @GetMapping("/obtener_conferencia/{id}")
    public Optional<Conferencia> obtenerConferenciaPorId(@PathVariable Long id) {
        return conferenciaService.obtenerConferenciaPorId(id);
        
    }

    @DeleteMapping("/eliminar_conferencia/{id}")
    public void eliminarConferencia(@PathVariable Long id) {
        conferenciaService.eliminarConferencia(id);
    }

    @GetMapping("/detalles/{id}")
    public String mostrarDetallesConferencia(@PathVariable Long id, Model model) {
        Optional<Conferencia> conferenciaOptional = conferenciaService.obtenerConferenciaPorId(id);

        if (conferenciaOptional.isPresent()) {
            Conferencia conferencia = conferenciaOptional.get();
            model.addAttribute("conferencia", conferencia);
            return "conferencia"; // Devuelve el nombre de la plantilla HTML
        } else {
            // Manejar el caso en el que la conferencia no existe
            return "error"; // Puedes crear una plantilla "error.html" para manejar errores
        }
    }
    
    @PostMapping("/conferencia/guardar")
    public String guardarConferencia(@ModelAttribute("conferencia") Conferencia guardar) {
        conferenciaService.crearConferencia(guardar);
        return "redirect:/docsfriends/listar_conferencias";
    }
    
    @GetMapping("/conferencia/art_agregar")
    public String crearArticulo(Model ArticuloCientifico) {
        ArticuloCientifico.addAttribute("articulo",new ArticuloCientifico());
        return "art_agregar";
    }
    
}
