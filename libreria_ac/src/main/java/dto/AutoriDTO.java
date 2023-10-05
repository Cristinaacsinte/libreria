package dto;

import dto.archetype.Dto;
import dto.archetype.Model;
import entity.Autori;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AutoriDTO implements Dto {
    Long id;

    String cognome;

    String nome;

    @Override
    public Model toModel() {
        return Autori
                .builder()
                .id(id)
                .nome(nome)
                .cognome(cognome)
                .build();
    }
}
