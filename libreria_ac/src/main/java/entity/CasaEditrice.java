package entity;

import dto.CasaEditriceDTO;
import dto.archetype.Dto;
import dto.archetype.Model;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "casa_editrice")
public class CasaEditrice implements Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "nome")
    String nome;

    @Override
    public Dto toDto() {
        return CasaEditriceDTO
                .builder()
                .id(id)
                .nome(nome)
                .build();
    }
}
