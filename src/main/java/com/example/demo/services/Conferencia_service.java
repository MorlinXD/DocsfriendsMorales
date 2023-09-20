/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;


import com.example.demo.Datos.Conferencia;
import com.example.demo.repositories.Conferencia_interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 *
 * @author MorlinXD
 */



@Service
public class Conferencia_service {

    @Autowired
    private Conferencia_interface conferenciaRepository;

    public List<Conferencia> listarConferencias() {
        return conferenciaRepository.findAll();
    }

    public Optional<Conferencia> obtenerConferenciaPorId(Long idConferencia) {
        return conferenciaRepository.findById(idConferencia);
    }

    public Conferencia crearConferencia(Conferencia conferencia) {
        return conferenciaRepository.save(conferencia);
    }

    public void eliminarConferencia(Long idConferencia) {
        conferenciaRepository.deleteById(idConferencia);
    }
}

