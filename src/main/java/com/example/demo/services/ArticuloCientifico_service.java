package com.example.demo.services;

import com.example.demo.Datos.ArticuloCientifico;
import com.example.demo.repositories.ArticuloCientifico_interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloCientifico_service {

    @Autowired
    private ArticuloCientifico_interface articuloCientificoRepository;

    public ArticuloCientifico crearArticuloCientifico(ArticuloCientifico articulo) {
        return articuloCientificoRepository.save(articulo);
    }

    public List<ArticuloCientifico> listarArticulosCientificos() {
        return articuloCientificoRepository.findAll();
    }

    public Optional<ArticuloCientifico> obtenerArticuloCientificoPorId(Long idArticuloCientifico) {
        return articuloCientificoRepository.findById(idArticuloCientifico);
    }

    public void eliminarArticuloCientifico(Long idArticuloCientifico) {
        articuloCientificoRepository.deleteById(idArticuloCientifico);
    }

    public ArticuloCientifico actualizarArticuloCientifico(Long idArticuloCientifico, ArticuloCientifico articulo) {
        // Implementa la lógica de actualización aquí
        // Puedes utilizar findById para obtener el artículo existente por su ID
        Optional<ArticuloCientifico> articuloExistente = articuloCientificoRepository.findById(idArticuloCientifico);
        if (articuloExistente.isPresent()) {
            // Realiza la actualización de los campos del artículo existente con los valores de 'articulo'
            ArticuloCientifico articuloActualizado = articuloExistente.get();
            // Aquí puedes actualizar los campos que desees del artículo actualizado
            // Por ejemplo: articuloActualizado.setTitulo(articulo.getTitulo());
            // Luego, guarda el artículo actualizado
            return articuloCientificoRepository.save(articuloActualizado);
        } else {
            // Maneja el caso en el que no se encuentra el artículo
            return null; // o lanza una excepción, según tus necesidades
        }
    }
}
