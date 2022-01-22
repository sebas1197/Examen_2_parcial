/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.cursos.service;

import ec.edu.espe.arquitectura.cursos.dao.CursoRepository;
import ec.edu.espe.arquitectura.cursos.dto.CursoDto;
import ec.edu.espe.arquitectura.cursos.model.Curso;
import ec.edu.espe.arquitectura.cursos.model.Estudiante;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public void crearCurso() {
        Curso curso = new Curso();
        curso.setArea("Computacion");
        curso.setCodigo("456");
        curso.setCosto(300.25f);
        curso.setDuracion_horas(40);
        Random rand = new Random();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
        Calendar cal = Calendar.getInstance();
        cal.set(1900, 0, 1);
        long start = cal.getTimeInMillis();
        cal.set(2005, 10, 1);
        long end = cal.getTimeInMillis();
        Date fecha_inicio = new Date(start + (long) (rand.nextDouble() * (end - start)));
        curso.setFecha_inicio(fecha_inicio);
    }

    public List<Estudiante> buscarPorArea(CursoDto cursoDto) throws Exception {
        try {
            String url = "http://localhost/api/v2/cursoarea";
            return this.cursoRepository.findByArea("computacion");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
