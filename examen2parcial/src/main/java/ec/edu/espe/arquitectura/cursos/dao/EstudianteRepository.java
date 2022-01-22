/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.dao;

import ec.edu.espe.arquitectura.cursos.model.Estudiante;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sebastian Landazuri
 */
public interface EstudianteRepository extends CrudRepository<Estudiante, String>{
    
}
