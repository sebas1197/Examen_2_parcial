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
public class CursoDto {
    @Schema(
            description = "Area del curso",
            example = "Computacion",
            required = true,
            implementation = String.class
    )
    private String area;
    
    @Schema(
            description = "Nombre del curso",
            example = "Computacion",
            required = true,
            implementation = String.class
    )
    private String nombre;

}
