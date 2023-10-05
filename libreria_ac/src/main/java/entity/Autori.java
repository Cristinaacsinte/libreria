package entity;

import dto.AutoriDTO;
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
@Table(name = "autori")
public class Autori implements Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "cognome")
    String cognome;
    @Column(name = "nome")
    String nome;

    @Override
    public Dto toDto() {
        return AutoriDTO
                .builder()
                .id(id)
                .cognome(cognome)
                .nome(nome)
                .build();
    }
}
