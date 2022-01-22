/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.controller;

import ec.edu.espe.arquitectura.cursos.dto.CursoDto;
import ec.edu.espe.arquitectura.cursos.dto.CursoResponse;
import ec.edu.espe.arquitectura.cursos.dto.EstudianteResponse;
import ec.edu.espe.arquitectura.cursos.service.CursoService;
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
public class CursoController {
    @Autowired
    private CursoService cursoService;
    
    @PostMapping
    @Operation(
            summary = "Generar curso",
            description = "Permite generar un curso",
            tags = {"curso"},
            responses = {
                    @ApiResponse(
                            description = "Ok - curso Generado Exitosamente",
                            responseCode = "200",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = CursoResponse.class)
                            )
                    ),
                    @ApiResponse(
                            description = "Internal Server Error - Hubo un problema en el servidor",
                            responseCode = "500",
                            content = @Content
                    )
            }
    )
    public ResponseEntity generarCurso(@RequestBody CursoDto cursoDto) throws Exception{
        try {
            CursoResponse cursoResponse = CursoResponse.builder().area("computacion").build();
            return ResponseEntity.ok(cursoResponse);
        } catch (Exception e) {
            log.error("Ocurrio un error al momento de generar el curso. {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    } 
    
    public ResponseEntity buscarPorArea(@RequestBody CursoDto cursoDto) throws Exception{
        try {
            CursoResponse cursoResponse = CursoResponse.builder().area("computacion").build();
        } catch (Exception e) {
            log.error("Ocurrio un error al momento de buscar cursos por area. {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
    
}
