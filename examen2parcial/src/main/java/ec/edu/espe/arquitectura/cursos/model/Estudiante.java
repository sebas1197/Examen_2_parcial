/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.model;

import java.util.Date;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Sebastian Landazuri
 */
@Data
@NoArgsConstructor
public class Estudiante {
    
    @Id private String id;
    private String nombre;
    private String correoElectronico;
    private String pais;
    private Date fechaNacimiento;
    private Date fechaCreacion;
    private boolean estado;
    
}
