/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Datos;
import jakarta.persistence.*;
import java.sql.Date;
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
@Table(name = "conferencias")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConferencia;
    
    @Column(nullable = false)
    private String nombre_conferencia;
    
    @Column (nullable = false)
    private String tema;
    
    @Column (nullable=false)
    private Date fechaInicio;
    
    @Column (nullable=false)
    private Date fechaFin;
    
    @Column (nullable = false)
    private String lugar;
    
    @Column (nullable = false)
    private String organizador;
    
    @Column (nullable = true)
    private String descripcion;
}
