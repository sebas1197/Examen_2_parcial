/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.dto;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author Sebastian Landazuri
 */
@Data
@Builder
public class EstudianteDto {
     @Schema(
            description = "Correo del solicitante",
            example = "eslandazuri@espe.edu.ec",
            required = true,
            implementation = String.class
    )
    private String correo_electronico; 

}
