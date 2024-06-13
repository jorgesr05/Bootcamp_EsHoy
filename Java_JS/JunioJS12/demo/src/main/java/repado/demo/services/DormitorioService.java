package repado.demo.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import repado.demo.models.Dormitorios;
import repado.demo.repositories.DormitorioRepository;

@Service
@AllArgsConstructor
public class DormitorioService {
    private final DormitorioRepository dormitorioRepository;

    // Buscar todos los dormitorios
    public List<Dormitorio> buscarTodos(){
        return dormitorioRepository.findAll();
    }

    public Dormitorios buscarPorId(Long id){
        return dormitorioRepository.findById(id).orElse(null);
    }

    public Dormitorio crearDormitorio(Dormitorio dormitorio){
        return dormitorioRepository.findById(id).orElse(null);
    }
    
}
