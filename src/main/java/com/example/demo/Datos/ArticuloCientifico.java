/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Datos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author MorlinXD
 */
@Entity
@Table(name = "articulos_cientificos")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloCientifico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idArticuloCientifico;
    
    @Column(nullable = false)
    private long idConferencia;
    
    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;
    
    
    @Column(nullable = true)
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    Usuario idusuario; /*clave foranea*/
    
    @Column(name = "imagen1")
    private String ruta1;
    
    @Column(name = "pdf")
    private String pdf;
}
