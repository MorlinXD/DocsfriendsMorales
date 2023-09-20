package com.example.demo.controller;

import com.example.demo.Datos.ArticuloCientifico;
import com.example.demo.services.ArticuloCientifico_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/docsfriends")
public class ArticuloCientifico_controller {
    @Autowired
    private ArticuloCientifico_service articuloCientificoService;

    @PostMapping("/articulo/crear")
    public ArticuloCientifico crearArticuloCientifico(@RequestBody ArticuloCientifico articulo) {
        return articuloCientificoService.crearArticuloCientifico(articulo);
    }

    @GetMapping("/listar_articulo")
    public List<ArticuloCientifico> listarArticulosCientificos() {
        return articuloCientificoService.listarArticulosCientificos();
    }

    @GetMapping("/orbtener_articulo/{id}")
    public Optional<ArticuloCientifico> obtenerArticuloCientificoPorId(@PathVariable Long id) {
        return articuloCientificoService.obtenerArticuloCientificoPorId(id);
    }

    @DeleteMapping("/eliminar_articulo/{id}")
    public void eliminarArticuloCientifico(@PathVariable Long id) {
        articuloCientificoService.eliminarArticuloCientifico(id);
    }
}
