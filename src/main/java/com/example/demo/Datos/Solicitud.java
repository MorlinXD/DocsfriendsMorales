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
@Table(name = "solicitudes")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSolicitud;

    @ManyToOne
    @JoinColumn(nullable = false)
    Usuario id_usuario;/*clave foranea*/

    @Column(nullable = true, length = 200)
    private String sdescripcion;

    @Column(nullable = false)
    private Date fecha_solitud;/*Datetime*/

    @Column(nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(nullable = false)
    Documento idDocumento;/*clave foranea*/
}
