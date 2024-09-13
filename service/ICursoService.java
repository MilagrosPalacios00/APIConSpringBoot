package com.jpa.prueba.service;

import Dto.CursoTemaDTO;
import com.jpa.prueba.model.Curso;
import java.util.List;


public interface ICursoService {
    
    
    public List<Curso> getCursos();

  
    public void saveCurso(Curso curso);

   
    public void deleteCurso(Long id);

    
    public Curso findCurso(Long id);

       public void editCurso(Curso curso);

    public CursoTemaDTO temasPorCurso(Long id_curso);

    public List<Curso> getCursosJava();
    
    
    
}

