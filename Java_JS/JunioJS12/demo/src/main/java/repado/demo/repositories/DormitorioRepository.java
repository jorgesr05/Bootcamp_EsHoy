package repado.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import repado.demo.models.Dormitorios;

@Repository

public interface DormitorioRepository extends CrudRepository<Dormitorios,Long>{

    // BUSCAR TODOS LOS DORMITORIOS
    List<Dormitorios> findAll();

    Optional<Dormitorios> findById(Long id);
} 
