package ec.edu.espe.arquitectura.exlist.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.exlist.model.Narcotraficantes;

public interface NarcotraficantesRepository extends MongoRepository<Narcotraficantes, String> {
    Optional<Narcotraficantes> findByCodigoInterno(String email);
    Optional<Narcotraficantes> findBySancionado(String findByInternald);
}
