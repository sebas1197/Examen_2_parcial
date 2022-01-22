/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.dao;

import ec.edu.espe.arquitectura.cursos.model.Estudiante;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sebastian Landazuri
 */
public interface CursoRepository extends CrudRepository<Estudiante, String>{
    
    public List<Estudiante> findByArea(String area);
    
}
