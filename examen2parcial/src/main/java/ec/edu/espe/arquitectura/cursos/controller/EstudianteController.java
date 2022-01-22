/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.controller;

import ec.edu.espe.arquitectura.cursos.dto.EstudianteDto;
import ec.edu.espe.arquitectura.cursos.dto.EstudianteResponse;
import ec.edu.espe.arquitectura.cursos.service.EstudianteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sebastian Landazuri
 */
@RestController
@RequestMapping("/api/v2/cursos/estudiante")
@Slf4j
@Tag(name = "estudiante", description = "Endpoints para la gestión de estudiantes")

public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;
    
    @PostMapping
    @Operation(
            summary = "Generar estudiante",
            description = "Permite generar un estudiante para matricularse en un curso",
            tags = {"estudiante"},
            responses = {
                    @ApiResponse(
                            description = "Ok - estudiante Generado Exitosamente",
                            responseCode = "200",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = EstudianteResponse.class)
                            )
                    ),
                    @ApiResponse(
                            description = "Internal Server Error - Hubo un problema en el servidor",
                            responseCode = "500",
                            content = @Content
                    )
            }
    )
    public ResponseEntity generarEstudiante(@RequestBody EstudianteDto estudianteDto) throws Exception{
        try {
            boolean estado = estudianteService.generarEstudiante(estudianteDto);
            if(estado){
                EstudianteResponse estudianteResponse = EstudianteResponse.builder().estado(estado).build();
                return ResponseEntity.ok(estudianteResponse);
            }else{
             return  ResponseEntity.badRequest().build();
            }
        } catch (Exception e) {
            log.error("Ocurrio un error al momento de generar el estudiante. {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
    
}
