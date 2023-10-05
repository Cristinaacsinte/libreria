package dto;

import dto.archetype.Dto;
import dto.archetype.Model;
import entity.CasaEditrice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CasaEditriceDTO implements Dto {
    Long id;
    String nome;
    @Override
    public Model toModel() {
        return CasaEditrice
                .builder()
                .id(id).nome(nome)
                .build();
    }
}
