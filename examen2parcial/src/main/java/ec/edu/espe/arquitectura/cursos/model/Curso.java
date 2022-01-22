/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.model;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Sebastian Landazuri
 */
@Data
@NoArgsConstructor
public class Curso {
    @Id private String id;
    private String codigo;
    private String area;
    private String nombre;
    private Integer duracion_horas;
    private Date fecha_inicio;
    private Float costo;
}
