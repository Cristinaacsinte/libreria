package dto;

import dto.archetype.Dto;
import dto.archetype.Model;
import entity.Libri;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibriDTO implements Dto {
    String id;


    String isbn;

    String titolo;
    @Override
    public Model toModel() {
        return Libri
                .builder()
                .id(id)
                .isbn(isbn)
                .titolo(titolo)
                .build();
    }
}
