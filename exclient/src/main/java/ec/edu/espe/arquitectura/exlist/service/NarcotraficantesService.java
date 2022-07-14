package ec.edu.espe.arquitectura.exlist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.exlist.dao.NarcotraficantesRepository;
import ec.edu.espe.arquitectura.exlist.model.Narcotraficantes;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NarcotraficantesService {
    private final NarcotraficantesRepository narcotraficantesRepository;

    public List<Narcotraficantes> consultaListaObservados() {
        return narcotraficantesRepository.findAll();
    }

    public void guardar() {
        Narcotraficantes narcotraficantes = Narcotraficantes.builder()
                .codigoInterno("12345")
                .sancionado("Sancionado")
                .build();
        narcotraficantesRepository.save(narcotraficantes);
    }
}
