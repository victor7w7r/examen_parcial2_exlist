package ec.edu.espe.arquitectura.exlist.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document(collection = "courses")
@TypeAlias("courses")
@Data
@Builder
public class Narcotraficantes {

    @Id
    private String id;

    @Indexed(name="idx_narcotraficante", unique=true)
    private String codigoInterno;

    private String sancionado;

}
