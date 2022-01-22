/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.service;

import ec.edu.espe.arquitectura.cursos.dao.EstudianteRepository;
import ec.edu.espe.arquitectura.cursos.dto.EstudianteDto;
import ec.edu.espe.arquitectura.cursos.model.Estudiante;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sebastian Landazuri
 */
@Service
@Slf4j
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public boolean generarEstudiante(EstudianteDto estudianteDto) throws Exception {
        try {
            String url = "http://localhost/api/v2/estudiante";
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre("sebastian");
            estudiante.setCorreoElectronico("eslandazuri@espe.edu.ec");
            if(this.estudianteRepository.findById(estudiante.getCorreoElectronico()) == null){
                Random rand = new Random();
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
                Calendar cal = Calendar.getInstance();
                cal.set(1900, 0, 1);
                long start = cal.getTimeInMillis();
                cal.set(2005, 10, 1);
                long end = cal.getTimeInMillis();
                Date fechaNacimiento = new Date(start + (long) (rand.nextDouble() * (end - start)));
                estudiante.setPais("593");
                estudiante.setFechaNacimiento(fechaNacimiento);
                Date fechaCreacion = cal.getTime();
                estudiante.setFechaCreacion(fechaCreacion);
                estudiante.setEstado(true);
                return true;
            }else{
                estudiante.setEstado(false);
                return false;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
