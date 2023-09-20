/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repositories;

/**
 *
 * @author MorlinXD
 */

import com.example.demo.Datos.ArticuloCientifico;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*@Repository
public interface ArticuloCientifico_interface extends JpaRepository<ArticuloCientifico, Serializable> {
 
    ArticuloCientifico crearArticuloCientifico(ArticuloCientifico articulo);
    
    List<ArticuloCientifico> listarArticulosCientificos();
    
    Optional<ArticuloCientifico> obtenerArticuloCientificoPorId(Long idArticuloCientifico);
     
    void eliminarArticuloCientifico(Long idArticuloCientifico);
}*/
@Repository
public interface ArticuloCientifico_interface extends JpaRepository<ArticuloCientifico, Serializable> {
    // Spring Data JPA generará automáticamente los métodos CRUD (create, read, update, delete)
    // basados en el tipo de entidad ArticuloCientifico y su clave primaria (Long).

    // No necesitas definir los métodos CRUD aquí manualmente.
}