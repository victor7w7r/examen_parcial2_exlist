package ec.edu.espe.arquitectura.exlist.resource;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.exlist.model.Narcotraficantes;
import ec.edu.espe.arquitectura.exlist.service.NarcotraficantesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/narcos")
@RequiredArgsConstructor
public class NarcotraficantesResource {

    private final NarcotraficantesService narcotraficantesService;

    @GetMapping
    public ResponseEntity<List<Narcotraficantes>> findAll(){
        try {
            return ResponseEntity.ok(this.narcotraficantesService.consultaListaObservados());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<List<Narcotraficantes>> guardar(){
        try {
            this.narcotraficantesService.guardar();
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }


}
