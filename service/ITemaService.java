package com.jpa.prueba.service;
import com.jpa.prueba.model.Tema;
import java.util.List;

public interface ITemaService {
    
    
    public List<Tema> getTemas();

  
    public void saveTema(Tema tema);

   
    public void deleteTema(Long id);

    
    public Tema findTema(Long id);

       public void editTema(Tema tema);
    
    
}
